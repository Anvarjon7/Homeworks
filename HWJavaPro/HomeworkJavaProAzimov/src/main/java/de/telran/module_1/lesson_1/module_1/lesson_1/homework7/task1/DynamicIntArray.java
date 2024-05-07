package de.telran.module_1.lesson_1.module_1.lesson_1.homework7.task1;

public class DynamicIntArray {
    private int lenght;
    private int capacity;
    private int[] arr;

    private static final int DEFAULT_CAPACITY = 10;
    private static final int PROCENT_CHANGE = 50;

    public DynamicIntArray() {
        this.lenght = 0;
        this.capacity = DEFAULT_CAPACITY;
        this.arr = new int[DEFAULT_CAPACITY];
    }

    public DynamicIntArray(int capacity) {
        this.lenght = 0;
        this.capacity = capacity;
        this.arr = new int[capacity];
    }
    private void addCapacity(){
        if (lenght == capacity){
            int newCap = capacity + (capacity * PROCENT_CHANGE) / 100;
            int[] arr1 = new int[newCap];
            System.arraycopy(arr,0,arr1,0,lenght);
            arr = arr1;
            capacity = newCap;
        }
    }
    public void add(int elem){
        addCapacity();
        arr[lenght++] = elem;
    }
    public void add(int[] elem){
        for (int i : elem) {
            add(elem);
        }
    }

    public void insert(int index, int element){
        if (index < 0 || index >= lenght){
            System.out.println("Индекс за пределами");
        }

        for (int i = lenght; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = element;
        lenght++;
    }
    public void delete(int index){
        if (index < 0 || index >= lenght){
            System.out.println("Индекс за пределами");
        }

        for (int i = index; i < lenght - 1; i++) {
            arr[i] = arr[i + 1];
        }
        lenght--;
    }
    public int get(int index){
        if (index < 0 || index >= lenght){
            System.out.println("Индекс за пределами");
        }
        return arr[index];
    }
}
//1) У вас есть класс DynamicIntArray. Внутри него есть 3 характеристики:
//        int lenght(реальный размер хранимых данных),
//        int capacity(размер массива),
//        массив int размером capacity (arr[capacity]),
//        константы:
//        начальный размер массива по умолчанию (DEFAULT_CAPACITY),
//        % изменения размера массива при автоматическом увеличению (PROCENT_CHANGE).
//        Реализуйте 2 конструктора:
//        по умолчанию (создается массив arr размером DEFAULT_CAPACITY)
//        с параметром capacity (создается массив arr размер которого передается параметром  capacity).
//        Реализуйте методы:
//        add(int element) - добавление элемента в конец (не забывайте про ограничения размера массива).
//        add(int[] elements) - добавление массива элементов в конец нашего массива(не забывайте про ограничения размера массива).
//        insert (int index, int element) - вставка элемента в место с нужным индексом (не забывайте про ограничения размера массива
//        и смещение элементов вправо)
//        delete (int index) - удаление элемента (не забывайте про смещение элементов влево при операции).
//        get(int index) - вернуть значение элемента по index