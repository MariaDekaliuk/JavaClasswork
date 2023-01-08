package Lesson4;

public class WorkWithString {
    public static void main(String[] args) {

        /*создаем экземпляр класса, значит у него есть много стандартные методы,
        к которым мы можнм обращаться нажав на .точку
         */
        String text = new String("Абракадабра");

        text.length();  //например, длинна lenght
        System.out.println(text);
        System.out.println(text.length());
        System.out.println("в слове Абракадабра " + text.length() + " символов");

        String text1="";

        System.out.println(text1.length()); //0
        //System.out.println(text2.length()); //напишет ошибку, т.к. переменная не иннициализирована

        //text.isEmpty();
        System.out.println(text.isEmpty()); //false
        System.out.println(text1.isEmpty()); //true

        //метод text.charAt() - вывод примитивного значения типа char - символа, буквы

       char simbol = text.charAt(0); //тут просто показали что это только для char
                                     //если написать int выдаст ошибку

        System.out.println(text.charAt(0));
        System.out.println(text.charAt(3));
        System.out.println(text.charAt(5));
        System.out.println(text.charAt(10));

    String sunText = text.substring(0,11); //вывод текста с.. по..
    System.out.println(sunText + " " + sunText.length());

    String sunText2 = text.substring(5); //вывод текста с..
    // System.out.println(sunText2 + " " + sunText2.length());


    }
}
