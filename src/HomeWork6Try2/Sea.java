package HomeWork6Try2;

import HomeWork6Try2.Animals2.Animal2;
import HomeWork6Try2.Animals2.Shark;
import HomeWork6Try2.Animals2.Wale;

public class Sea implements PlaceOfLiving{
    @Override
    public Animal2 getAnimal(String animal) {
        if("shark".equals(animal))return new Shark();
        if("wale".equals(animal))return new Wale();
        throw new IllegalArgumentException("Придумай что нить сам, мне было лень прописывать "+animal);
    }


    @Override
    public void printList() {
        System.out.println("shark, wale");

    }
}

