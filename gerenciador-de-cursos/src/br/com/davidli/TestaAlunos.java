package br.com.davidli;

import java.util.*;

public class TestaAlunos {

    public static void main(String[] args) {
        Collection<String> alunos = new HashSet<>();
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sergio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Mauricio Aniche");
        alunos.add("Alberto Souza");

        // O Set garante que não existam elementos iguais
        System.out.println("Quantidade de alunos matrículados: " +alunos.size());

        /*for (String aluno: alunos) {
            System.out.println(aluno);
        }*/

        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });

        // Verifica se um aluno está matrículado
        System.out.println("Paulo está matrículado? " +alunos.contains("Paulo Silveira"));

        alunos.remove("Sergio Lopes");
        System.out.println(alunos);

        // Uma ArrayList pode receber uma coleção Set
        List<String> alunosEmLista = new ArrayList<>(alunos);
        System.out.println("");
        System.out.println("Alunos em Lista: ");
        alunosEmLista.forEach(aluno -> {
            System.out.println(aluno);
        });

        // A partir do momento que eu trabalho com ArrayList eu posso acessar um elemento pelo índice
        System.out.println("");
        System.out.println(alunosEmLista.get(3));

    }

}
