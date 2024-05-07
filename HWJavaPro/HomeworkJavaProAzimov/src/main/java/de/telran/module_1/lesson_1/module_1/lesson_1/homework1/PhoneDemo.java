package de.telran.module_1.lesson_1.module_1.lesson_1.homework1;

import de.telran.module_1.lesson_1.module_1.lesson_1.homework1.Phone;

public class PhoneDemo {
    public static void main(String[] args) {

        Phone phone1 = new Phone("IPhone: ",15,450.5);
        Phone phone2 = new Phone("Samsung: ",22,500);
        Phone phone3 = new Phone("XiaoMi: ",10,355.6);

        System.out.println(phone1.model + phone1.number + " weight: " + phone1.weight);
        System.out.println(phone2.model + phone2.number + " weight: " + phone2.weight);
        System.out.println(phone3.model + phone3.number + " weight: " + phone3.weight);



        phone1.receiveCall("David");
        System.out.println("Phone number: " + phone1.setNumber(555666777));
    }
}