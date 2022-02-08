package Test5;

public class Wealth {
    private int volume;
    private int value;

    public Wealth(int volume, int price) {
        this.volume = volume;
        this.value = price;
    }

    public int getVolume() {
        return volume;
    }

    public int getPrice() {
        return value;
    }
}
