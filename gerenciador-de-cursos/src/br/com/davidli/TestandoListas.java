package br.com.davidli;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestandoListas {

    public static void main(String[] args) {
        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe Aula";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();

        // Adicionando aulas a coleção
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        System.out.println(aulas.toString());

        // Removendo aulas da coleção
        /*aulas.remove(aula1);
        System.out.println(aulas);*/

        // Percorrendo a coleção com foreach
        for(String aula: aulas){
            System.out.println("Aula: " +aula);
        }

        // Acessando um elemento da coleção pelo índice
        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é: " +primeiraAula);

        // Foreach pelo índice
        for(int i = 0; i < aulas.size(); i++){
            System.out.println("aula " +i+ ": "  +aulas.get(i));
        }

        // Percorrendo a coleção com lambda
        aulas.forEach(aula -> {
            System.out.println("Percorrendo");
            System.out.println("Aula: " +aula);
        });

        // Ordenando a coleção
        aulas.add("Aumentando o nosso conhecimento");
        Collections.sort(aulas);
        System.out.println("Depois de ordenado: ");
        System.out.println(aulas);
    }

}
