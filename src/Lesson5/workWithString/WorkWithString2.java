package Lesson5.workWithString;

public class WorkWithString2 {

   /*
        1.
    */
   public static void main(String[] args) {
       //String text = "Это текст для метод проверки работы методов типа String";
       //String testString = "текст";
       //System.out.println(text.contains(testString)); //навести курсор и узнаешь какого типа данные она возвращает
       //System.out.println(text.contains("Мasha"));

       //boolean resultContains = text.contains("текст"); //вариант как задать переменную
       //System.out.println(resultContains);

       String text = "   Это текст: Маша - программист Java Script. Маша - молодец программист.";

       StringMethodsTest(text);

   }

   //сделаем метод обособленно
   public static void StringMethodsTest(String text){
       String testString = "Маша";
       boolean resultContains = text.contains(testString); //вариант как задать переменную
       System.out.println(resultContains);

       String testString2 = "@?"; //есть ли в тексте эти символы?
       //boolean resultContains2 = text.contains(testString2);
       boolean resultContains2 = text.contains("@");
       System.out.println(text);
       System.out.println(testString2);
       System.out.println(resultContains2);
       System.out.println(testString2 + " - это " + resultContains2);
       System.out.println("Tomas -" + text.contains("Tomas"));
       System.out.println("------------------");

       //метод игнорировать регистр

       String textUpperCase = text.toUpperCase(); //присвоить переменную чтоб дальше с этим могла работать
       System.out.println(textUpperCase); //все большими
       System.out.println(text.toLowerCase()); //все маленькими
       System.out.println("------------------");

       //метод убрать лишние пробелы скраю
       System.out.println("Как ты в это вляпалась?" + text);
       System.out.println(text.trim()); //убрать лишние пробелы скраю
       System.out.println("Дело случая:-) " + text.trim());
       System.out.println("------------------");

       //из Int сделать строковое выражение String
       int catAge = 7;
       System.out.println(catAge);
       String catAgeStringType = String.valueOf(catAge); //первый вариант
       String catAgeStringType2 = ""+catAge; //2 вариант проще, результат сложения СТРОК


       //Mетод parse
       // есть переменная String - это результат ввода с клавы
       String inputFromKeyboard="125"; //ввели как строку ранее, надо перевести в число

       //есть переменная int, но есть и класс Integer, это другое
       //из Int сделать строковое выражение String,... и НАОБОРОТ
       Integer resultInt = Integer.parseInt(inputFromKeyboard);
       Double resultDouble = Double.parseDouble("12.65");
       System.out.println(resultInt+resultDouble);
       System.out.println("------------------");


       /*Определение позиции в строке - метод indexOf
       метод conteins - дает ответ есть или нет
       метод indexOf - определяет индекс, с какого происходит вхождение c НАЧАЛА строки
       метод lastIndexOf - ...считает с конца строки
       */

       System.out.println(text);
       System.out.println(text.indexOf("Маша"));
       System.out.println("Слово 'Маша' ищет с начала строки, индекс с начала строки номер: " + text.indexOf("Маша"));

       System.out.println(text.lastIndexOf("Маша"));
       System.out.println("Слово 'Маша 'смотрит с конца строки, а индекс считает с начала строки: " + text.lastIndexOf("Маша"));
       System.out.println("Cлово 'программист' с конца на " + text.lastIndexOf("программист")); //??? не понимаю

       System.out.println("------------------");


/* Домашнее задание:
   1) посмотреть в инете решение как найти индексы три разных вхождений подстроки.
   напечатать три разные цифры
   2) замена символов replace()
 */

//=============сравнение строк=====================================================
    int a =5;
    int b=10;



   }
   }