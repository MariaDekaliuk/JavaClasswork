package Lesson2;
public class Lesson2DemoClass {
    public static void main(String[] args) {

        Dog myDog = new Dog(); //myDog - название переменной
        // вместо int - dog... та же переменная
        //я создала объект myDog и у меня есть доступ к переменным этого объекта
        //точка после Dog - доступ к переменным из отдельного класса Dog

        myDog.color="black";
        myDog.name="Rada";
        myDog.age=5;

        myDog.age=2;
        myDog.name="Tuzik";
        myDog.color= "grey";

        Dog dog2 = new Dog();
        dog2.name= "Bobik";
        dog2.age=4;
        dog2.color="mix";

        myDog.voiceDog("Gavv!");
        dog2.voiceDog("Gav! Gav! Gav!");

        //мы будем работать с объектами и свойствами
        //класс - myDog (как System), метод - voiceDog (как.out), у которого тоже есть свой метод (println)
        //вызываем класс myDogу которого метод voiceDog и мы туда должны передать сообщение
        //допустим Gav


        Cat caty = new Cat();
        caty.age=5;
        caty.voiceCat();

        //почему не вывело гяв и мяу?((((  не понимаю(((

    }
}