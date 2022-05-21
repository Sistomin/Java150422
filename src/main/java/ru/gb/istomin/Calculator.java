package ru.gb.istomin;
//Переписал код с видео
//Доработал: цвета кнопок и теста, изменил размер дисплея, изменил размер кнопок "операторов" и расположение, размер надписей в кнопках
//Сделал более читаемым "калькулятор"
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {//класс калькулятор наследованый от JFrame
    private Double liftOperand;//объявили переменную "левый оператор"(дробная)
    private String operation;//объявили строковую пременную "оператор"

    public Calculator() {//конструктор
        setTitle("Calculator");//название окна
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//сообщает системе о необходимости завершить работу программы при закрытии формы
        setBounds(300,300,500,500);//устанавливает координаты формы и ее размер в пикселях
        setLayout(new BorderLayout());

        final JLabel display = new JLabel("0");//значение по умолчанию в дисплей
        display.setPreferredSize(new Dimension(0, 70));//доработка высоты дисплея
        display.setHorizontalAlignment(SwingConstants.RIGHT);//расположение текста (с права)
        display.setFont(new Font("Arial",Font.BOLD, 30));//параметры текста выводимые в дисплей
        add(display, BorderLayout.NORTH);//расположение дисплея с верху

        final JPanel numberPanel = new JPanel();
        final GridLayout numberLayout = new GridLayout(4,4,3,3);
        numberPanel.setLayout(numberLayout);

       final ActionListener numberListener = new ActionListener() {//создаем ананимный класс

            @Override
            public void actionPerformed(ActionEvent e) {
                final JButton button = (JButton) e.getSource();
                final String text = button.getText();
                String displayText = display.getText();
                if (".".equals(text) && display.getText().contains(".")) {
                    return;
                }
                if ("0".equals(displayText) && !".".equals(text)){
                    displayText = "";
                }
                displayText += text;
                display.setText(displayText);
            }
        };
         final ActionListener buttonListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                 final JButton source = (JButton) e.getSource();
                 final String action = source.getText();
                 Double rightOperand = Double.parseDouble(display.getText());

                 if ("=".equals(action)){//логика работы после нажатия кнопки "равно"
                     if (liftOperand != null){
                        switch (operation){
                            case "+"://для случая операции сложения
                                display.setText(String.valueOf(liftOperand + rightOperand));
                                break;
                            case "-"://для случая операции вычетания
                                display.setText(String.valueOf(liftOperand - rightOperand));
                                break;
                            case "*"://для случая операции умножения
                                display.setText(String.valueOf(liftOperand * rightOperand));
                                break;
                            case "/"://для случая операции деления
                                display.setText(String.valueOf(liftOperand / rightOperand));
                                break;
                        }
                        liftOperand = Double.parseDouble(display.getText());
                        operation = null;
                     }
                     return;
                 }
                 liftOperand = Double.parseDouble(display.getText());
                 operation = action;
                 display.setText("0");
            }
         };

        //for (int i = 0; i < 10; i++) {  //убрал первоначального кода
        for (char i : "7894561230".toCharArray()){ //доработал клавиатуру чтобы выглядела привычнее
            final JButton button = new JButton(String.valueOf(i));
            Font BigFontButton = new Font("Arial", Font.BOLD, 25);//доработка шрифта в кнопках клавиатуры(задаем параметры шрифта)
            button.setFont(BigFontButton);//применяю шрифт к кнопкам клавиатуры
            button.setBackground(Color.GRAY);//доработка смена цвета фона кнопки
            button.addActionListener(numberListener);
            numberPanel.add(button);

        }
        final JButton pointButton = new JButton(".");//создаем кнопку "точка"
        pointButton.setBackground(Color.DARK_GRAY);//доработка смена цвета фона кнопки
        pointButton.setForeground(Color.WHITE);//доработка смена цвета символа кнопки
        pointButton.addActionListener(numberListener);//добавляем кнопку "точка"
        Font BigFontPoint = new Font("Arial", Font.BOLD, 30);//доработка шрифта к pointButton
        pointButton.setFont(BigFontPoint);//применяю шрифт к pointButton

        final JButton negativeButton = new JButton("+/-");
        negativeButton.setBackground(Color.DARK_GRAY);//доработка смена цвета фона кнопки
        negativeButton.setForeground(Color.WHITE);//доработка смена цвета символа кнопки
        Font BigFontNegative = new Font("Arial", Font.BOLD, 20);//доработка шрифта к negativeButton
        negativeButton.setFont(BigFontNegative);//применяю шрифт к negativeButton

        numberPanel.add(pointButton);
        numberPanel.add(negativeButton);
        final JPanel buttonPanel = new JPanel();
        final GridLayout buttonLayout = new GridLayout(6, 1, 2, 2); //доработал сделал один столбец
        buttonPanel.setLayout(buttonLayout);

        for (char c : "C+-*/=".toCharArray()){//массив "операторов"
           final JButton button = new JButton(String.valueOf(c));//создаем кнопку "операторов"
            Font BigFontTR = new Font("Arial", Font.BOLD, 20);//доработка шрифта в кнопках операторов
            button.setFont(BigFontTR);//применяю шрифт к кнопкам операторов
            button.setPreferredSize(new Dimension(150, 0));//доработка ширины кнопок операций
            button.setBackground(Color.DARK_GRAY);//доработка смена цвета фона кнопки
            button.setForeground(Color.WHITE);//доработка смена цвета символа кнопки
           button.addActionListener(buttonListener);
           buttonPanel.add(button);//добавляем кнопки "операторов"
        }
        add(numberPanel, BorderLayout.CENTER);//цифры расположил в центре
        add(buttonPanel, BorderLayout.EAST);//операции расположил с права
        setVisible(true);//показывает полученную форму на экране

    }

}
