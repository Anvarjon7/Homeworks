package de.telran.module_1.lesson_1.module_1.lesson_1.homework25;

public final class Singleton {
    private static Singleton instance;
    public String value;

    private Singleton(String value) {
        try{
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value){
        if (instance == null){
            instance = new Singleton(value);
        }
        return instance;
    }
}
class Main{
    public static void main(String[] args) {
        System.out.println("Singleton test:");
        Singleton singleton1 = Singleton.getInstance("Hello");
        Singleton singleton2 = Singleton.getInstance("World!");
        System.out.println(singleton1.value);
        System.out.println(singleton2.value);
    }
}
//Что выведет нижеописанные программы:
//public class Test1 {
//    {
//        System.out.println("2");
//    }
//    static {
//        System.out.println("1");
//    }
//    public Test1() {
//        System.out.println("3");
//    }
//    public static void main(String[] args) {
//        new Test1();
//        new Test1();
//    }
//}

/**
 * 'static' - выполняется при первой загрузке ккласса до создания объекта
 * '{}' - бл.инициализации будет выполняться при создании каждого объекта
 * 'Test1()' - выполняется после блока инициализации при создании каждого объекта
 * вывод:
 * 1
 * 2
 * 3
 * 2
 * 3
* */

//class Test2 {
//    public static void main(String[] args) {
//        final int[] array = {1, 2, 3};
//        new Object() {
//            void add() {
//                for (int i =0; i < array.length; i++) {
//                    array[i] = array[i] * 2;
//                }
//            }
//        }.add();
//        System.out.println(Arrays.toString(array));
//    }
//}
/**
 * Массив array инициализируется значениями {1, 2, 3}.
 * Метод add() анонимного объекта умножает каждый элемент массива на 2.
 * Выводится измененный массив, который теперь имеет значения {2, 4, 6}.
 * */

//class Test3 {
//    private Test3 test3 = new Test3();
//
//
//    public static void main(String[] args) {
//        Test3 test3 = new Test3();
//        test3.test();
//    }
//
//
//    private boolean test() {
//        return true ? null : true;
//    }
//}

/**
 * private Test3 test3 = new Test3();
 * создает экземпляр класса Test3 и инициализирует ее самой собой и это приведело
 * к бесконечной рекурсии и вызовет StackOverflowError.
 * */

//class Test4 {
//    public static void main(String[] args) {
//        try {
//            throw new Exception();
//        } catch (Exception e) {
//            throw new NullPointerException();
//        } finally {
//            throw new RuntimeException("1");
//        }
//    }
//}
/**
 * Программа бросит Exception в блоке try.
 * Затем выполнится блок catch, который бросит NullPointerException.
 * Наконец, выполнится блок finally, который бросит новое исключение RuntimeException.
 * */




















