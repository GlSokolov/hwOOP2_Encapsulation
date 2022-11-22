import transport.Car;

import java.time.LocalDate;

public class Main {
    public static void space(){
        System.out.println("___________________________________________________________");
    }
    public static void main(String[] args) {
        Human dude1 = new Human("Максим", "Минск", 1988, "Бренд-менеджер");
        Human dude2 = new Human("Аня", "Москва", 1993, "методист");
        Human dude3 = new Human("Катя", "Калининград", 1992, "Продакт-менеджер");
        Human dude4 = new Human("Артем", "Москва", 1995, "Директор");
        Human dude5 = new Human("Владимир", "Казань", 2001, "");

        System.out.println(dude1);
        System.out.println(dude2);
        System.out.println(dude3);
        System.out.println(dude4);
        System.out.println(dude5);

        space();

        Flower rose = new Flower("Роза обыкновенная", "Голландия", 35.59, 0);
        Flower hrizantema = new Flower("Хризантема", "", 15, 5);
        Flower pion = new Flower("Пион", "Англия", 69.9, 1);
        Flower gipsofila = new Flower("Гипосфила", "Турции", 19.5, 10);

        System.out.println(rose);
        System.out.println(hrizantema);
        System.out.println(pion);
        System.out.println(gipsofila);

        space();

        Car lada = new Car("Лада", "Приора", 1.6, "Моча", 2007, "Россия", "палка", "седан", "х123ху979", 2, "Зима", "Лето");



        System.out.println(lada);
        System.out.println("Дата: "+LocalDate.now() +" "+ lada.wheelSeasonChange());
    }

}