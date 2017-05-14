package HomeWork6Try2;

import HomeWork6Try2.Animals2.Animal2;

import java.util.Scanner;

public class EnteryPoint2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String place1, animal1;

        System.out.println("Животные живут в море(введите sea), на суше(введите land), и высоко в небе(введите air). ");

        place1=sc.nextLine();

        AbsFact2 abs2 = new AbsFact2();
        PlaceOfLiving pl = abs2.getPlaceOfLiving(place1);

        System.out.println("Кого ты хочеш услышать, животное?");
        pl.printList();
        animal1=sc.nextLine();

        Animal2 an = pl.getAnimal(animal1);
        an.makeSound();
        System.out.println("That`s all fools!");
}}
