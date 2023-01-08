package Lesson4;

import java.util.Scanner;

public class DogDemo {
    public static void main(String[] args) {
       Dog myDog = new Dog("Lassy","Kolli",3);
       //myDog.name = "Lessy";
       //myDog.breed = "Kolli";
       //myDog.age = 3;
        myDog.voice("Gav, Gav!");

        Dog myDog2 = new Dog("Lassy2","Kolli2",5);

        myDog.age= myDog.age+1;

        //System.out.println(myDog.toString());
        System.out.println(myDog);
        System.out.println(myDog2);

        Dog myDog3 = new Dog("Tuzik",5);
        System.out.println(myDog3);

        Dog myDog4 = new Dog("Poli");
        System.out.println(myDog4);

        Scanner scanner = new Scanner(System.in); //создали объект на основании сканера
                                   //мы должны указать откуда сканеру брать данные
                                   //используем метод in - ввод с клавиатуры
        System.out.println("Input your text -");
        String inputText = scanner.nextLine(); //просим вызвать метод next, нам тут Line
                           // который выдаст нам результат String
        System.out.println(inputText);

        System.out.println("Input dog name: ");
        String dogName = scanner.nextLine();

        System.out.println("Input dog's breed: ");
        String dogBreed = scanner.nextLine();

        System.out.println("Input dog's age: ");
        int dogAge = scanner.nextInt();

        Dog myDog5 = new Dog(dogName,dogBreed,dogAge);
        System.out.println(inputText);

    }
}
