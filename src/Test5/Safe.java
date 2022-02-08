package Test5;

import java.util.ArrayList;

public class Safe extends Container {
    private ArrayList<Wealth> things = new ArrayList<Wealth>();
    private ArrayList<Wealth> tempThings;
    private int price;

    public Safe(int capacity) {
        super(capacity);
    }

    public void fillThings(ArrayList<Wealth> things) {
        this.tempThings = things;
        Container temp = fillSmallerThings(capacity);
        this.things = temp.getThings();
        price = temp.getPrice();
        System.out.println("Ценность набора: " + price);
    }

    public void print() {
        for (Wealth wealth : things) {
            System.out.println("Вместимость: " + wealth.getVolume() + ", Цена: " + wealth.getPrice());
        }
    }

    protected Container fillSmallerThings(int capacity) {
        if (capacity == 0)
            return new Container(0, new ArrayList<Wealth>(), 0);
        int max = 0, maxIndex = 0;
        for (int i = 0; i < tempThings.size(); i++) {
            if (tempThings.get(i).getVolume() <= capacity) {
                int fillValue = tempThings.get(i).getPrice() + fillSmallerThings(capacity - tempThings.get(i).getVolume()).getPrice();
                if (max <= fillValue) {
                    max = fillValue;
                    maxIndex = i;
                }
            }
        }
        Container export = new Container();
        export.setThings(fillSmallerThings(capacity - tempThings.get(maxIndex).getVolume()).getThings());
        export.wealths.add(tempThings.get(maxIndex));
        export.setPrice(max);
        return export;
    }
}
