package Test5;

import java.util.ArrayList;

public class Container {
    protected int capacity;
    protected ArrayList<Wealth> wealths = new ArrayList<Wealth>();
    protected int price;

    public Container(int capacity, ArrayList<Wealth> things, int price) {
        this.capacity = capacity;
        this.wealths = things;
        this.price = price;
    }

    public Container(int capacity) {
        this.capacity = capacity;
    }

    public Container() {
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Wealth> getThings() {
        return wealths;
    }

    public void setThings(ArrayList<Wealth> things) {
        this.wealths = things;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
