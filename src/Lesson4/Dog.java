package Lesson4;

public class Dog {
    String name;
    String breed;
    int age;

    public Dog(String nam, String bree, int ag) {
        this.name = nam;
        this.breed = bree;
        this.age = ag;
    }

    // добавим метод ГОЛОС
    public void voice (String voice){
        System.out.println(voice);
    }

    //не знаю породу собаки, создам еще один конструктор
    //могу делать их столько, сколько мне надо
    //и могу другие варианты... или наоброт определить только так и никак иначе
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;

    }
    //или только имя


    public Dog(String name) {
        this.name = name;
    }

    //сказать методу .toString ЧТО мы хотим распечатать
    //нажать...-Generate-toString... автоматом создаст
    @Override  //служебное слово значит "переопределить"
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }
}