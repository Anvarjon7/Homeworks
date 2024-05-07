package de.telran.module_1.lesson_1.module_1.lesson_1.homework16.task1;

public class UtilsOperation <T extends Number,U extends Number> {

    //    T add(T arg1, T arg2) //добавление

    public T add(T arg1,T arg2){
        if (arg1 instanceof Integer){
            return (T) Integer.valueOf(arg1.intValue() + arg2.intValue());
        } else if (arg1 instanceof Double) {
            return (T) Double.valueOf(arg1.doubleValue() + arg2.doubleValue());
        } else if (arg1 instanceof Float) {
            return (T) Float.valueOf(arg1.floatValue() + arg2.floatValue());
        } else if (arg1 instanceof Long) {
            return (T) Long.valueOf(arg1.longValue() + arg2.longValue());
        } else if (arg1 instanceof Short) {
            return (T) Short.valueOf((short) (arg1.shortValue() + arg2.shortValue()));
        }
        throw new IllegalArgumentException("Unsupported number type");
    }

    //    T sub(T arg1, T arg2) //вычитание

    public T sub(T arg1,T arg2){
        if (arg1 instanceof Integer){
            return (T) Integer.valueOf(arg1.intValue() - arg2.intValue());
        } else if (arg1 instanceof Double) {
            return (T) Double.valueOf(arg1.doubleValue() - arg2.doubleValue());
        } else if (arg1 instanceof Float) {
            return (T) Float.valueOf(arg1.floatValue() - arg2.floatValue());
        } else if (arg1 instanceof Long) {
            return (T) Long.valueOf(arg1.longValue() - arg2.longValue());
        } else if (arg1 instanceof Short) {
            return (T) Short.valueOf((short) (arg1.shortValue() - arg2.shortValue()));
        }
        throw new IllegalArgumentException("Unsupported number type");
    }

    //     T mult(T arg1, T arg2) //умножение

    public T mult(T arg1,T arg2){
        if (arg1 instanceof Integer){
            return (T) Integer.valueOf(arg1.intValue() * arg2.intValue());
        } else if (arg1 instanceof Double) {
            return (T) Double.valueOf(arg1.doubleValue() * arg2.doubleValue());
        } else if (arg1 instanceof Float) {
            return (T) Float.valueOf(arg1.floatValue() * arg2.floatValue());
        } else if (arg1 instanceof Long) {
            return (T) Long.valueOf(arg1.longValue() * arg2.longValue());
        } else if (arg1 instanceof Short) {
            return (T) Short.valueOf((short) (arg1.shortValue() * arg2.shortValue()));
        }
        throw new IllegalArgumentException("Unsupported number type");
    }

    //    U div(T arg1, T arg2) //деление

    public U div(U arg1,U arg2){
        if (arg1 instanceof Integer){
            return (U) Integer.valueOf(arg1.intValue() / arg2.intValue());
        } else if (arg1 instanceof Double) {
            return (U) Double.valueOf(arg1.doubleValue() / arg2.doubleValue());
        } else if (arg1 instanceof Float) {
            return (U) Float.valueOf(arg1.floatValue() / arg2.floatValue());
        } else if (arg1 instanceof Long) {
            return (U) Long.valueOf(arg1.longValue() / arg2.longValue());
        } else if (arg1 instanceof Short) {
            return (U) Short.valueOf((short) (arg1.shortValue() / arg2.shortValue()));
        }
        throw new IllegalArgumentException("Unsupported number type");
    }

    //    T sqr(T arg) //получение квадрата

    public T sqr(T arg){
        if (arg instanceof Integer){
            int val = arg.intValue();
            return (T) Integer.valueOf(val * val);
        } else if (arg instanceof Double) {
            double val = arg.doubleValue();
            return (T) Double.valueOf(val * val);
        } else if (arg instanceof Float) {
            float val = arg.floatValue();
            return (T) Float.valueOf(val * val);
        } else if (arg instanceof Long) {
            long val = arg.longValue();
            return (T) Long.valueOf(val * val);
        } else if (arg instanceof Short) {
            short val = arg.shortValue();
            return (T) Short.valueOf((short)(val * val));
        }
        throw new IllegalArgumentException("Unsupported number type");
    }
}

class SimpleUtilsOperations{
    public static void main(String[] args) {
        UtilsOperation<Integer,Double> utilsOperation = new UtilsOperation<>();
        System.out.println("Addition -> " + utilsOperation.add(32,10));
        System.out.println("Subtraction -> "+ utilsOperation.sub(30,3));
        System.out.println("Multiplication -> "  + utilsOperation.mult(34,22));
        System.out.println("Division -> " + utilsOperation.div(20.0,2.0));
        System.out.println("Square of numbers -> " + utilsOperation.sqr(5));
    }
}
