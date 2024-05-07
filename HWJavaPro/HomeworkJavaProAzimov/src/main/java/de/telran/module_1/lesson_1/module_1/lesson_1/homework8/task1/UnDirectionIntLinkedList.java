package de.telran.module_1.lesson_1.module_1.lesson_1.homework8.task1;

public class UnDirectionIntLinkedList {
    private Node head;
    private int size;

    public UnDirectionIntLinkedList(Node head, int size) {
        this.head = null;
        this.size = 0;
    }


//    ======================================== ADD ==========================================


    public void add(int val){
        addFirst(val);
    }
    public void add(int index, int val){
        if (index < 0 || index > size){
            System.out.println("Индекс за пределами");
        }
        if (index == 0){
            addFirst(val);
        }else{
            Node node = new Node(val);
            Node curr = head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }
            node.next = curr.next;
            size++;
        }
    }

    public void addLast(int elem){
        Node newNode = new Node(elem);
        if (head == null){
            head = newNode;
        }else {
            Node curr = head;
            while (curr.next != null){
                curr = curr.next;
            }
            curr.next = newNode;
        }
        size++;
    }
    public void addFirst(int elem){
        Node newNode = new Node(elem);
        newNode.next = head;
        head = newNode;
        size++;
    }


//    ============================== GET ======================= SET ======================================




    public int get(int index){
        if (index < 0 || index >= size){
            System.out.println("Индекс за пределами");
        }
        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.item;
    }
    public int set(int index,int val) {
        if (index < 0 || index >= size) {
            System.out.println("Индекс за пределами");
        }
        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        int oldElem = curr.item;
        curr.item = val;
        return oldElem;
    }




//    =========================== REMOVE ==========================================




    public int remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Индекс за пределами");
        }
        int removedVal;
        if (index == 0 ){
            removedVal = head.item;
            head = head.next;
        }else {
            Node curr = head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }
            removedVal = curr.next.item;
            curr.next = curr.next.next;
        }
        size--;
        return removedVal;
    }

    public int removeFirst(){
        if (head == null){
            System.out.println("Лист пуст!");
        }
            int val = head.item;
            head = null;
            size--;
            return val;
    }


    public int removeLast(){
        if (head == null){
            System.out.println("Лист пуст!");
        }
        if (size == 1){
            int val = head.item;
            head = null;
            size = 0;
            return val;
        }
        Node curr = head;
        Node prev = null;
        while (curr.next != null){
            prev = curr;
            curr = curr.next;
        }
        int val = curr.item;
        prev.next = null;
        size--;
        return val;
    }



//=====================================

public int indexOf(int val){
        int index = 0;
        Node curr = head;

        while (curr != null){
            if (curr.item == val){
                return index;
            }
            curr = curr.next;
            index++;
        }
        return -1;
}


// ====================================


public boolean contains(int value) {
        return indexOf(value) != -1;
}

//=======================================


public void clear(){
        head = null;
        size = 0;
}


//==========================================

    private static class Node {
        int item;
        Node next;

    public Node(int item) {
        this.item = item;
        this.next = null;
    }
}
}
//    int size; (текущий размер списка)
//        Node (структура для хранения первого элемента списка)
//        В классе Node инкапcулированы характеристики:
//        int item; (для хранения данных)
//        Node next; (для хранения ссылки на следующий объект хранения)
//        В классе UnDirectionIntLinkedList реализовать следующие методы:
//        add(int): этот метод используется для добавления элемента в конец !!! списка.
//        add(index, int): этот метод используется для добавления элемента по определенному индексу !!! в список.
//        addFirst(int значение): добавляет элемент в начало списка.
//        addLast(int значение): добавляет элемент в конец списка.
//        int get(int index): получить элемент по index.
//        int set(int index, int значение): установить значение элемента по index.
//        int remove(int index): удалить элемент со списка, возвратить значение удаленного элемента
//        removeFirst(): удалить элемент с начала списка.
//        removeLast(): удалить элемент с конца списка.
//        int indexOf(int значение): вернуть индекс первого вхождение элемента со значением
//        bool contains(int значение): вернуть true, если значение есть в списке
//        void clear(): очистить список