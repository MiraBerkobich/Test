package task2;

import java.util.ArrayList;

/**
 * Created by miraberkovich on 18.09.15.
 */
public class MainTaskTwo {
    public static void main(String[] args) {

        WorkForResult work = new WorkForResult();

        ArrayList<Integer> allNum = new ArrayList<Integer>();

        int num = 1;
        for (int i = 0; i < 100; i++) {
            allNum.add(num);
            num++;
        }
        StringBuilder all = new StringBuilder();
        for (int i=0; i<allNum.size(); i++){
            all.append(allNum.get(i));
            all.append(" ");
        }
        ArrayList<String> threeOrFive = work.validListOne(allNum);
        ArrayList<String> three = work.validListTwo(allNum);
        ArrayList<String> five = work.validListThree(allNum);
        String reg = work.addReg(threeOrFive);
        String temp = work.replaceOne(reg, all);
        reg = work.addReg(three);
        String temp1 = work.replaceTwo(reg,temp);
        reg = work.addReg(five);
        String result = work.replaceThree(reg, temp1);
        System.out.print(result);
    }
}
