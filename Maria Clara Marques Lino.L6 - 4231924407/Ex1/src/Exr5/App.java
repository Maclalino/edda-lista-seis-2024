package Exr5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Pessoa> pessoa= new ArrayList<>();

        pessoa.add(new Pessoa("Bernardo", 18));
        pessoa.add(new Pessoa("Vinicius", 34));
        pessoa.add(new Pessoa("Maria", 98));

        pessoa.sort(Comparator.comparingInt(Pessoa::getIdade));

        // Imprimindo a lista ordenada
        for (Pessoa p : pessoa) {
            System.out.println(p);
        }
    }
}
