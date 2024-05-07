package de.telran.algorithms.lesson9;

public class Wagon {
    int value;
    Wagon next;

    public Wagon(int value) {
        this.value = value;
        this.next = null;
    }
}

class Train {

    Wagon root;

    public Train(int value) {
        this.root = new Wagon(value);
    }

    public void addWagon(int value) {
        Wagon current = this.root;

        while (current.next != null) {
            current = current.next;
        }
        current.next = new Wagon(value);
    }

    public int countWagon() {
        int sum = 1;
        Wagon current = this.root;
        while (current.next != null) {
            current = current.next;
            sum++;
        }
        return sum;
    }

    public boolean hasWagon(int val){
        Wagon current = this.root;
        while (current != null){
            if (val == current.value)
                return true;
                current = current.next;
        }
        return false;
    }

    public String getIndex(int val){
        Wagon current = this.root;
        while (current != null){
            if (val == current.value)
                return "Есть вагон с определенным кол-вом людей, индекс вагона -> " + val;
            current = current.next;
        }
        return "Такого вагона нет!";
    }

    public int wagonIndex(int value) {
        int index=1;
        Wagon current = this.root;
        while (current != null) {
            if (value == current.value) return index;
            current = current.next;
            index++;
        }
        return -1;
    }
}

class Main {
    public static void main(String[] args) {
        Train train = new Train(10);

        System.out.println(train.root.value + " " + train.root.next);

        train.addWagon(20);
        train.addWagon(30);

        System.out.println(train.root.next.next.value);

        System.out.println(train.countWagon());

        System.out.println(train.hasWagon(20));

        System.out.println(train.getIndex(20));

    }
}