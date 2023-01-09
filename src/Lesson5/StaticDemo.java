package Lesson5;

public class StaticDemo {
    public static void main(String[] args) {

            //создали экземпляр класса:
            StaticVarAndMethods firstExample = new StaticVarAndMethods();

            //теперь мы можем обратиться к экземпляру класса к его .переменным
            //и поместить туда значения

            firstExample.normalVariable = "Hello";
            firstExample.staticVariable = "Hello my friend!";

            System.out.println("First example class");
            System.out.println("normalVariable: "+ firstExample.normalVariable);
            System.out.println("staticVariable: "+ firstExample.staticVariable);
            System.out.println("===============");

            //---------------------

            StaticVarAndMethods secondExample = new StaticVarAndMethods();

            secondExample.normalVariable = "Hello again!";
            secondExample.staticVariable = "Hello my friend again and again!";

            System.out.println("Second example class");
            System.out.println("normalVariable: "+ secondExample.normalVariable);
            System.out.println("staticVariable: "+ secondExample.staticVariable);
            System.out.println("===============");


            System.out.println("First example class");
            System.out.println("normalVariable: "+ firstExample.normalVariable);
            System.out.println("staticVariable: "+ firstExample.staticVariable);
            System.out.println("===============");



            /*есть 2 объекта в памяти, созданных.
            В каждом находятся переменные: normal- и staticVariable.
            В одном объекте у нас находится значения "Hello" и "Hello my friend!"
            Во втором объекте - значения "Hello again!" и "Hello my friend again and again!";
            2 разных объекта. Но, 2 разных экземпляра класса созданных и в каждом свем значение.
             */


    }
}
