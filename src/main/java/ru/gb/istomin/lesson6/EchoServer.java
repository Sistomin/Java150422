package ru.gb.istomin.lesson6;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
    //private DataOutputStream out;//к доработке которая не работает

    public static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(8189)){//Блок try-with-resources предназначен для
            //гарантированного закрытия всех сетевых соединений и освобождения ресурсов.
            System.out.println("Ждем подключения клиента...");//вывод информации в консоль
            final Socket socket = serverSocket.accept();//Метод запускает процесс ожидания подключения нового клиента и блокирует текущий поток
            System.out.println("Клиент подключился!");//вывод информации в консоль
            //new EchoServer().start();//доработка не зааработала
            final DataInputStream in = new DataInputStream(socket.getInputStream());//обработчик входящего потока
            final DataOutputStream out = new DataOutputStream(socket.getOutputStream());//обработчик исходящего потока

            while (true){//бесконечный цикл, который прервется в случае получения сообщения "/end"
                final String message = in.readUTF();
                if ("/end".equalsIgnoreCase(message)){//если сообшение игнорируя регистр = "/end", то прекратить
                    out.writeUTF("/end");
                    break;
                }
                System.out.println("Сообщение от клиента: " + message);//выводим в консоль сервера сообщение от клиента
                out.writeUTF("[Echo]" + message);//отправляем ЭХО сообщение клиенту

            }

        } catch (IOException e) {//ловим исключение
            e.printStackTrace();
        }
    }
    //доработка не заработала
    /*private void start() {
            Scanner scanner = new Scanner(System.in);
            sendMessage(scanner.nextLine());
    }

    private void sendMessage(String message) {
        try {
            out.writeUTF(message);
        } catch (IOException e) {//ловим исключение
            e.printStackTrace();
        }
    }*/
}
