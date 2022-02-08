package Test4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test4 {

    String [][]s0 = {
            {"*","*","*","*"},
            {"*"," "," ","*"},
            {"*"," "," ","*"},
            {"*"," "," ","*"},
            {"*"," "," ","*"},
            {"*","*","*","*"}
    };

    String [][]s1 = {
            {" "," "," ","*"},
            {" "," ","*","*"},
            {" ","*"," ","*"},
            {" "," "," ","*"},
            {" "," "," ","*"},
            {" "," "," ","*"}
    };

    String [][]s2 = {
            {"*","*","*","*"},
            {"*"," "," ","*"},
            {" "," "," ","*"},
            {" "," ","*"," "},
            {" ","*"," "," "},
            {"*","*","*","*"}
    };

    String [][]s3 = {
            {"*","*","*","*"},
            {" "," "," ","*"},
            {" ","*","*"," "},
            {" ","*","*"," "},
            {" "," "," ","*"},
            {"*","*","*","*"}
    };

    String [][]s4 = {
            {"*"," "," ","*"},
            {"*"," "," ","*"},
            {"*"," "," ","*"},
            {"*","*","*","*"},
            {" "," "," ","*"},
            {" "," "," ","*"}
    };

    String [][]s5 = {
            {"*","*","*","*"},
            {"*"," "," "," "},
            {"*"," "," "," "},
            {"*","*","*","*"},
            {" "," "," ","*"},
            {"*","*","*","*"}
    };

    String [][]s6 = {
            {"*","*","*","*"},
            {"*"," "," "," "},
            {"*"," "," "," "},
            {"*","*","*","*"},
            {"*"," "," ","*"},
            {"*","*","*","*"}
    };

    String [][]s7 = {
            {"*","*","*","*"},
            {" "," "," ","*"},
            {" "," "," ","*"},
            {" "," ","*"," "},
            {" ","*"," "," "},
            {"*"," "," "," "}
    };

    String [][]s8 = {
            {"*","*","*","*"},
            {"*"," "," ","*"},
            {"*","*","*","*"},
            {"*","*","*","*"},
            {"*"," "," ","*"},
            {"*","*","*","*"}
    };

    String [][]s9 = {
            {"*","*","*","*"},
            {"*"," "," ","*"},
            {"*","*","*","*"},
            {" "," "," ","*"},
            {" "," "," ","*"},
            {"*","*","*","*"}
    };

    public void run() {
        String[][] s;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        while(num>0)
        {
            arrayList.add(num%10);
            num/=10;
        }
        Collections.reverse(arrayList);

       for(int i = 0;i<6;i++)
       {
           for(int k=0;k<arrayList.size();k++)
           {
               for(int j = 0;j<4;j++)
               {
                   switch (arrayList.get(k))
                   {
                       case 0:
                           System.out.print(s0[i][j]);
                           break;
                       case 1:
                           System.out.print(s1[i][j]);
                           break;
                       case 2:
                           System.out.print(s2[i][j]);
                           break;
                       case 3:
                           System.out.print(s3[i][j]);
                           break;
                       case 4:
                           System.out.print(s4[i][j]);
                           break;
                       case 5:
                           System.out.print(s5[i][j]);
                           break;
                       case 6:
                           System.out.print(s6[i][j]);
                           break;
                       case 7:
                           System.out.print(s7[i][j]);
                           break;
                       case 8:
                           System.out.print(s8[i][j]);
                           break;
                       case 9:
                           System.out.print(s9[i][j]);
                           break;
                       default:
                           break;
                   }
               }
               System.out.print(" ");
           }
           System.out.println();
       }

    }

}
