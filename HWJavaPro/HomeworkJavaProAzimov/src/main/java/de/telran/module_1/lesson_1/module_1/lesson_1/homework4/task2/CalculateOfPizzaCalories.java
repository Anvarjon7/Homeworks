package de.telran.module_1.lesson_1.module_1.lesson_1.homework4.task2;

public class CalculateOfPizzaCalories {
   int perSmOfPizza = 40;

   public int calculateRadius(int diameter){
       double radius = diameter / 2.0;
       double area = Math.PI * Math.pow(radius,2);
       return (int) (area * perSmOfPizza);
   }
   public int calculateSquare(int square){
       int area = square * square;
       return area * perSmOfPizza;
   }

   public int calculateRectangle(int length, int width){
       int area = length * width;
       return area * perSmOfPizza;
   }


}
