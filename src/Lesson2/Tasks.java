package Lesson2;

public class Tasks {
    public static void main(String[] args) {
        // Объявляем переменные
        int x = 25;
        int y = x/5;
        int result = x + y;

        // Выводим значения
        System.out.println("да = " + result);

        int a = 50;
        int b = 3;
        int z = -5;
        int f = 8;

        System.out.println("result = " + (a+z));
        System.out.println("result = " + (z*f/2));
        System.out.println("result = " + (a/b));
        System.out.println("result = " + (a%b)); //%-остаток от деления

        int sqr = x*x; //задача n в квадрате
        System.out.println("sqr = x*x = " + sqr);

        int sqr2 = x*x*x; //задача n в кубе
        System.out.println(sqr2);

        int y1=x*x;  // = это знак присвоения;
        System.out.println(x+y1);
        System.out.println("-----------------------");

        // задача - сложить 9 значений и разделить на 10
        int a1 = 1;
        int a2 = 2;
        int a3 = 3;
        int a4 = 4;
        int a5 = 5;
        int a6 = 6;
        int a7 = 7;
        int a8 = 8;
        int a9 = 9;
        int w=((a1+a2+a3+a4+a5+a6+a7+a8+a9)/10);
        int d1=(a1+a2+a3+a4+a5+a6+a7+a8+a9);
        double d2=((a1+a2+a3+a4+a5+a6+a7+a8+a9)/10.0);

        System.out.println(w);
        System.out.println(d1/10.0);
        System.out.println(d2);
        System.out.println("-----------------------");


        // задача - 2 товара, 1-1000грн, 2-500грн, при покупке двух скидка 100грн
        int t5=1000;
        int t6=500;
        int t7=t5+t6;
        int t8=100;
        System.out.println("Цена без скидки: "+ t7);
        System.out.println("Скидка: 100грн");
        System.out.println("Цена со скидкой: " + (t7-t8));
        System.out.println("-----------------------");

        // задача - 2 товара, 1-1000грн, 2-500грн, при покупке двух скидка 10%
        int t1=1000;
        int t2=500;
        int t3=t1+t2;
        double t4=t3*0.1;  //или препод сделал discount = sum * (10.0/100.0);
        //double result = sum - discount; и т.д.
        System.out.println("Цена без скидки: "+ t3);
        System.out.println("Скидка: 10% = " + t4);
        System.out.println("Цена со скидкой: " + (t3-t4) + "грн");
        System.out.println("-----------------------");


        /*Преобразование базовых типов. 2 вида явные и неявные.
         byte -> short -> int -> long
         автоматически из малого в большой Джава поймет,
         из малкенького в большой надо делать так:*/

        double f1 = 10.5;
        double f2 = 2.5;
        double resDouble = f1/f2;
        int resInt = (int) (f1/f2);
        System.out.println(resDouble + " преобразовали в " + resInt);

        // Объявить строкову переменную, ввести туда любое значение и  распечаттать его.
        String name1 = "Ivan";
        String name2 = "Petr";
        System.out.println(name1);
        System.out.println("Hi, " + name1 + "! How are you?");
        System.out.println("Hi, " + name2 + "! How are you?");
        //тут показана конкатенация - объединение строк

        String text1 = "Hello";
        String text2 = "World!";
        String text3 = text1 + " " + text2;
        System.out.println(text3);

   }
}
