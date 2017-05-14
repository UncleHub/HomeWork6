package HomeWork6Try2;

import HomeWork6Try2.Animals2.Animal2;
import HomeWork6Try2.Animals2.Eagle;
import HomeWork6Try2.Animals2.Owl;


public class Air implements PlaceOfLiving {
    @Override
    public Animal2 getAnimal(String animal) {
        if("owl".equals(animal))return new Owl();
        if("eagle".equals(animal))return new Eagle();
        throw new IllegalArgumentException("Придумай что нить сам, мне было лень прописывать "+animal);
    }
    
    @Override
    public void printList() {
        System.out.println("owl, eagle");

    }
}
