package task2;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by miraberkovich on 18.09.15.
 */
public class WorkForResult {
    //создание листа для случая деления на оба числа
    public static ArrayList<String> validListOne(ArrayList<Integer> list) {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            if (list.get(i) % 3 == 0 && list.get(i) % 5 == 0) {
                arrayList.add(Integer.toString(list.get(i)));
            }
        }
        return arrayList;
    }
    //создание листа деления на 3
    public static ArrayList<String> validListTwo(ArrayList<Integer> list){
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            if (list.get(i) % 3 == 0) {
                arrayList.add(Integer.toString(list.get(i)));
            }
        }
        return arrayList;
    }
    //создание листа деления на 5
    public static ArrayList<String> validListThree(ArrayList<Integer> list){
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            if (list.get(i) % 5 == 0) {
                arrayList.add(Integer.toString(list.get(i)));
            }
        }
        return arrayList;
    }
    //создание релугялрного выражения
    public static String addReg(ArrayList<String> list){
        StringBuilder stringBuilder = new StringBuilder();
        for (String test : list) {
            stringBuilder.append(" "+test +" ");
            stringBuilder.append("|");
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        String temp = "("+stringBuilder.toString()+")";
        return temp;
    }
    //заменя чисел делящихся на 3 и 5 одновременно
    public static String replaceOne(String temp, StringBuilder words){
        Pattern pattern = Pattern.compile(temp);
        Matcher matcher = pattern.matcher(words);
        StringBuffer buffer = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(buffer, " FizzBuzz ");
        }
        String nums = matcher.appendTail(buffer).toString();
        return nums;
    }
    //замена чисел делящихся на 3
    public static String replaceTwo(String temp, String words){
        Pattern pattern = Pattern.compile(temp);
        Matcher matcher = pattern.matcher(words);
        StringBuffer buffer = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(buffer, " Fizz ");
        }
        String nums = matcher.appendTail(buffer).toString();
        return nums;
    }
    //замена чисел делящихся на 5
    public static String replaceThree(String temp, String words){
        Pattern pattern = Pattern.compile(temp);
        Matcher matcher = pattern.matcher(words);
        StringBuffer buffer = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(buffer, " Buzz ");
        }
        String nums = matcher.appendTail(buffer).toString();
        return nums;
    }
}
