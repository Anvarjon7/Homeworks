package de.telran.module_1.lesson_1.module_1.lesson_1.homework2.boxExample;

public class Box {

    private double width;
    private double length;
    private double height;

    public Box(double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    // Метод для расчета объема коробки
    public double calculate(){
        return width * length * height;
    }

    public int boxNeeds(double volumeOfGoods,double boxVolume){
        return (int) Math.ceil(volumeOfGoods / boxVolume);
    }


}