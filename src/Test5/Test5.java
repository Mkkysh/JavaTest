package Test5;

import java.util.ArrayList;
import java.util.Scanner;

public class Test5 {
    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Вместимость сейфа: ");
        Safe safe = new Safe(scanner.nextInt());
        ArrayList<Wealth> wealths = new ArrayList<Wealth>();
        System.out.print("Количество объектов: ");
        int n = scanner.nextInt();
        System.out.println("Введите объекты (сначала объем, потом цена):");
        for (int i = 0; i < n; i++) {
            wealths.add(new Wealth(scanner.nextInt(), scanner.nextInt()));
        }
        safe.fillThings(wealths);
        safe.print();

    }
}
