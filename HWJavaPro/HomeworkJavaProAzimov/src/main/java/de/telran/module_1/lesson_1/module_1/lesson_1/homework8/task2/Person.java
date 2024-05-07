package de.telran.module_1.lesson_1.module_1.lesson_1.homework8.task2;

import lombok.Getter;

import java.util.*;

@Getter
public class Person {

    private String name;
    private int age;
    private String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(city, person.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
class PersonDemo{
    public static void main(String[] args) {
        List<Person> arrayList = new ArrayList<>();
        arrayList.add(new Person("Anvar",21,"Uzbekistan"));
        arrayList.add(new Person("Abror",15,"Poland"));
        arrayList.add(new Person("Abror",15,"Poland"));
        arrayList.add(new Person("Davud",25,"England"));
        arrayList.add(new Person("Davud",25,"England"));
        System.out.println(arrayList);

        Iterator<Person> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            String str = String.valueOf(iterator.next());
            System.out.println(str);
        }
        Comparator<Person> comparator = Comparator.comparing(Person::getName);
        arrayList.sort(Comparator.comparing(Person::getAge).thenComparing(Person::getName).thenComparing(Person::getCity));
        System.out.println(arrayList);

        System.out.println();
        System.out.println("Вывести людей старше 20 лет");
        arrayList.stream().filter(person -> person.getAge() > 20).forEach(System.out::println);

        System.out.println();

        List<Person> uniqueList = filterUniqueElem(arrayList);
        for (Person person : uniqueList) {
            System.out.println(person);
        }
    }
    private static List<Person> filterUniqueElem(List<Person>list){
        Set<Person> uniqueSet = new HashSet<>(list);
        return new ArrayList<>(uniqueSet);
    }
}
