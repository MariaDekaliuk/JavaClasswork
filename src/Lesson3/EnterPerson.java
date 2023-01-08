package Lesson3;

public class EnterPerson {
    public static void main(String[] args){
        Human person1 = new Human();
        person1.name = "Ivan"; //надо в кавычках т.к. тип String
        person1.age = 47;
        person1.town = "Hamburg"; //надо в кавычках т.к. тип String

        Human person2 = new Human();
        person2.name = "Mary";
        person2.age = 43;
        person2.town = "Hohwacht";

        person2.age=44; //переменная изменилась, у Mary было ДР
        person1.town="Hamburg"; //она переехала в Hamburg
        //у Ivana ничего не поменялось

        System.out.println(person1.name); //печать Ivan
        System.out.println(person1); //Lesson3.Human@378bf509 - напечатает адрес памяти, где хранятся данніе о єтой персоне
        System.out.println(person2); //Lesson3.Human@5fd0d5ae

        person1.greeting();
        person2.greeting();

        person2 = person1;  //объединение объектов, убрать двойника2
        System.out.println(person1);
        System.out.println(person2);

    }
}
