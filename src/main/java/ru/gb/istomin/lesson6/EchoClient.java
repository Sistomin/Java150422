package ru.gb.istomin.lesson6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;

    public static void main(String[] args) {
        new EchoClient().start();//вызываем метод старт
    }

    private void start() {//метод старт
        try {
            openConnection();//вызываем метод "открыть соединение"
            Scanner scanner = new Scanner(System.in);//обявляем сканер для захвата сообщений клиента
            while (!socket.isClosed()){//цикл бесконечен пока соединение установлено
                sendMessage(scanner.nextLine());//вызов метода отправить сообщение (передаем в него данные со сканера)
            }
        } catch (IOException e) {//ловим исключение
            e.printStackTrace();
        }
    }

    private void sendMessage(String message) {//метод отправки сообщения
        try {
            out.writeUTF(message);
        } catch (IOException e) {//ловим исключение
            e.printStackTrace();
        }
    }

    private void openConnection() throws IOException {//метод для установки соединения, метод "открыть соединение"
        socket = new Socket("127.0.0.1", 8189);//к какому адресу и порту обращаемся
        in = new DataInputStream(socket.getInputStream());//Класс DataInputStream считывает из потока данные примитивных типов
        out = new DataOutputStream(socket.getOutputStream());//Класс DataOutputStream представляет поток вывода и предназначен для записи данных примитивных типов
        new Thread(() -> {//отдельный поток
            try {
                while (true) {//бесконечный цикл, который прервется в случае получения сообщения "/end"
                    final String message = in.readUTF();
                    if ("/end".equalsIgnoreCase(message)){//если сообшение игнорируя регистр = "/end", то прекратить
                        break;
                    }
                    System.out.println("Сообщение от сервера: " + message);//вывод в консоль
                }
            } catch (IOException e) {//ловим исключение
                e.printStackTrace();
            } finally {//обязательно закрываем соеденеие, чтобы освободить порт
                closeConnection();
            }
        }).start();//запуск Трэда

    }

    private void closeConnection() {//метод закрывает соединение
        if (in != null){
            try {
                in.close();//закрываем входящий поток
            } catch (IOException e) {//ловим исключение
                e.printStackTrace();
            }
        }
        if (out != null){
            try {
                out.close();//закрываем исходящий поток
            } catch (IOException e) {//ловим исключение
                e.printStackTrace();
            }
        }
        if (socket != null){
            try {
                socket.close();//закрываем соеденение(сокет)
            } catch (IOException e) {//ловим исключение
                e.printStackTrace();
            }
        }
    }
}
