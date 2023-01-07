package Lesson2;
public class Dog {
    //у объекта есть свойства, зададим их:
    String name;  // текстовый тип переменной
    String color;
    int age;

    //у объекта также могут быть действия, зададим их:
    public void voiceDog(String say){
        System.out.println("Dog say " + say);
    }
    // действия - это метод
}
