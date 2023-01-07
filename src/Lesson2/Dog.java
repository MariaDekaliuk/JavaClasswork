package Lesson2;
public class Dog {
    //у объекта есть свойства, зададим их:
    public String name;  // текстовый тип переменной
    public String color;
    public int age;

    //у объекта также могут быть действия, зададим их:
    public void voiceDog(String say){
        System.out.println("Dog say " + say);
    }
    // действия - это метод
}
