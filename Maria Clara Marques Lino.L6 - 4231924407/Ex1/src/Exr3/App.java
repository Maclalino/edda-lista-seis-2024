package Exr3;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        
    
    List<Animal> animais = new ArrayList<>();
    animais.add(new Animal("Gato"));
    animais.add(new Animal("Cachorro"));
    animais.add(new Animal("Rato"));
    animais.add(new Animal("Abelha"));


    animais.sort((a1, a2) -> a1.getNome().compareToIgnoreCase(a2.getNome()));

        
        for (Animal animal : animais) {
            System.out.println(animal);
        }
    }
}
