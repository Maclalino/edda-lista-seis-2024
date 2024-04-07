package Exr4;

import java.util.ArrayList;
import java.util.List;



public class App {
    public static void main(String[] args) {
   List<Pais> paises = new ArrayList<>();
   
   paises.add(new Pais("Alemanha"));
   paises.add(new Pais("Albania"));
   paises.add(new Pais("Portugal"));
   paises.add(new Pais("Brasil"));

   paises.sort((a1, a2) -> a1.getNome().compareToIgnoreCase(a2.getNome()));

   for(Pais p : paises){
    System.out.println(p);
   }

    }

}
