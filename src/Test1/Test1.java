package Test1;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
    public void run(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                sum += Integer.parseInt(String.valueOf(s.charAt(i)));
            }
        }
        System.out.println(sum);
    }

}
