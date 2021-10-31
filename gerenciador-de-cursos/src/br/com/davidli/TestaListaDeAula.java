package br.com.davidli;

import java.util.*;

public class TestaListaDeAula {

    public static void main(String[] args) {
        Aula a1 = new Aula("Revisitando as ArrayLists", 21);
        Aula a2 = new Aula("Lista de objetos", 20);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

        List<Aula> aulas = new ArrayList<>();

        // Adicionando aulas a coleção
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);
        System.out.println(aulas);

        // Ordenando a coleção pelo título
        Collections.sort(aulas);
        System.out.println(aulas);

        // Ordenando a coleção pelo tempo
        /*Collections.sort(aulas, Comparator.comparing(Aula::getTempo));*/
        aulas.sort(Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);


    }
}
