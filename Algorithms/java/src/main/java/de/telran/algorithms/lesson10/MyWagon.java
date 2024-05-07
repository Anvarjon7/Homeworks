package de.telran.algorithms.lesson10;

public class MyWagon {
    int value;

    MyWagon next;

    MyWagon(int value) {
        this.value = value;
        this.next = null;
    }

}

class MyTrain {
    MyWagon root;

    MyTrain(int value) {
        this.root = new MyWagon(value);
    }

    public void addWagon(int value) {
        MyWagon current = this.root;
        while (current.next != null) current = current.next;
        current.next = new MyWagon(value);
    }

    public int countWagons() {
        int count = 1;
        MyWagon current = this.root;
        while (current.next != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    public boolean isWagon(int value) {
        MyWagon current = this.root;
        while (current != null) {
            if (current.value == value) return true;
            current = current.next;
        }
        return false;
    }

    public void removeLastWagon() {
        MyWagon curr = this.root;
        if (curr.next == null) throw new Error("You can't remove the wagon from the train that has only one Wagon");
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
    }

    public void addWagonToIndex(int index, int value) {
        MyWagon current = this.root;
        if (index > countWagons()) throw new Error("You can't add new Wagon to this index");
        if (index < 0 ) throw new Error("The index should be positive");
        for (int i = 1; i < index; i++) {
            current = current.next;
        }
        MyWagon wagon = new MyWagon(value);
        wagon.next = current.next;
        current.next = wagon;
    }

    public void removeWagonIndex(int index){
        if (index > countWagons()) throw new Error("You can't add new Wagon to this index");
        if (index < 0 ) throw new Error("The index should be positive");
        MyWagon current = this.root;
        for (int i = 1; i < index - 1; i++) {
            current = current.next;
        }
        current.next = current.next.next;
    }

    public void addWagonAtFirst(int value){
        MyWagon wagon = new MyWagon(value);
        wagon.next = this.root;
        this.root = wagon;
    }
}


class LinkedWagon {
    public static void main(String[] args) {
        MyTrain myTrain = new MyTrain(10);
        myTrain.addWagon(20);
        myTrain.addWagon(30);
        myTrain.addWagon(40);
        System.out.println(myTrain.root.next);
        System.out.println(myTrain.countWagons());
        System.out.println(myTrain.isWagon(30));

        myTrain.removeLastWagon();
        System.out.println(myTrain.countWagons());


        myTrain.addWagonToIndex(3, 35);

        System.out.println(myTrain.root.next.next.next.value);

        System.out.println(myTrain.countWagons());

        myTrain.removeWagonIndex(2);
        System.out.println(myTrain.root.next.value);



        myTrain.addWagonAtFirst(15);
        System.out.println(myTrain.root.value);

    }
}
