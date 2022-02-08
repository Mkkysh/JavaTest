package Test2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test2 {
    public void run(){
        Scanner sdc = new Scanner(System.in);
        int num;
        try {
            num = sdc.nextInt();
        }
        catch (InputMismatchException e)
        {
            System.out.println("Error");
            return;
        }
        ArrayList<Integer> factor;
        factor = factorize(num);
        factor.forEach(System.out::println);

    }

    ArrayList<Integer> factorize(int x){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 2; i <= Math.sqrt(x); i++) {
            while (x % i == 0) {
                arrayList.add(i);
                x /= i;
            }
        }

        if (x != 1) {
            arrayList.add(x);
        }
        return arrayList;
    }

}
