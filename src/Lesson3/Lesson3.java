package Lesson3;

public class Lesson3 {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;
       // int result = a + b;

        int a1 = 100;
        int b1 = 150;

        //int a2 = 1000;
        //int b2 = 1500;

        //int result1 = a1 + b1;
        //int result2 = a2 + b2;

        //System.out.println("result - " + result);
        //System.out.println("result - " + result1);
        //System.out.println("result - " + result2);


        //Как повторить однотипные действия?

        int result = sum(a,b);
        int result1 = sum(a1,b1);
        int result2 = sum(10,25); //или так, тогда вверху можно не указывать их
        printText(1, result1); //вызов метода printText, мы передали параметры
                                  //цифру 1, а вторым параметром вызови и вычисли...
        printText(2,sum(45,35));


        //можно так:
        System.out.println("сумма 13 и 3 = " + sum( 13, 3));
        System.out.println(sum(8, 12));



    }
    //=========================================================
    public static int sum (int x, int y){
        //тут указать тот тип метода, который возвращает результ действий
        //тут int
        //возвращает = отдает после обработки, совершения действия

        int sum = x + y;
        return sum;  //команда вывода данного как результат работы этого метода

        //в методе мы можем указать столько параметров, сколько нам надо
    }

    //=========================================================
    public static void printText (int i, int text){
        System.out.println("Result sum :" + i + " И " + text);
    }
}
//внутри {} = разные методы - там все переменные свои...