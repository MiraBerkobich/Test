package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by miraberkovich on 17.09.15.
 */
public class Main   {
    public static void main (String[] args) throws IOException, NumberFormatException {
       System.out.println("Введите цифры аналогичные примеру 2 + 2");
       String text = input();
       String str =  valid(text);
       String[] test;
       int num_one;
       int num_two;
       char symbol;
       test = str.split(" ");
        try {
            num_one = Integer.parseInt(test[0]);
            num_two = Integer.parseInt(test[2]);
            symbol = test[1].charAt(0);
            result(symbol, num_one, num_two);
        }
        catch (Exception e){
            System.out.println("Вы так и не смогли ввести правильно");
        }

    }
    //метод, отвечающий за ввод с клавиатуры
    public static String input () throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String temp = reader.readLine();
        return temp;
    }
    //метод, отвечающий за проверку ввода
    public static String valid(String text) throws IOException {
        Pattern pattern = Pattern.compile("^[0-9]+\\s(\\+|\\-|\\*|\\/)\\s[0-9]+$");
        Matcher matcher = pattern.matcher(text);
        String str;
        if (matcher.matches())
            str = text;
        else {
           System.out.println("Ошибка");
           str = input();
        }
        return str;
    }
    //метод, ориентирующийся на знак, ссылающий на другие методы и выдающий результат
    public static void result(char symbol, int a, int b){
        switch (symbol) {
            case '+':
                System.out.println("Ответ: " + plus(a, b));
                break;
            case '-':
                System.out.println("Ответ: " + minus(a, b));
                break;
            case '/':
                System.out.println("Ответ: " + devis(a, b));
                break;
            case '*':
                System.out.println("Ответ: " + mult(a, b));
                break;
        }
    }
    //метод плюс
    public static int plus(int a, int b){
        return a + b;
    }
    //метод минус
    public static int minus(int a, int b){
        return a - b;
    }
    //метод деление
    public static int devis(int a, int b){
        return a/b;
    }
    //метод умножение
    public static int mult(int a, int b){
        return a*b;
    }
}
