package HomeWork6Try2;

import HomeWork6Try2.Animals2.Animal2;
import HomeWork6Try2.Animals2.Cat;
import HomeWork6Try2.Animals2.Dog;

public class Land implements PlaceOfLiving {
    @Override
    public Animal2 getAnimal(String animal) {
       if("dog".equals(animal))return new Dog();
       if("cat".equals(animal))return new Cat();
       throw new IllegalArgumentException("Придумай что нить сам, мне было лень прописывать "+animal);
    }

    @Override
    public void printList() {
        System.out.println("dog, cat");

    }
}
