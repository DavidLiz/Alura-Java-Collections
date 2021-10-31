package br.com.davidli;

import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class TestaCursoComAluno {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com Arraylist", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando coleções", 24));

        Aluno a1 = new Aluno("David Li", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Maricio Aniche", 17645);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        javaColecoes.getAlunos().forEach(a -> {
            System.out.println(a);
        });

        // Verifica se algum aluno está matrículado no curso
        System.out.println("O Aluno A1 está matrículado? " +javaColecoes.estaMatriculado(a1));

        // Procura um determinado aluno na coleção
        Aluno david = new Aluno("David Li", 34672);
        System.out.println("O Aluno A1 é o David Li? " +david.equals(a1));

        // Se o de cima é true, obrigatoriamente o seguinte é true:
        System.out.println(a1.hashCode() == david.hashCode());

        // Percorrendo a lista like a dinossauro
        Set<Aluno> alunos = javaColecoes.getAlunos();
        Iterator<Aluno> iterator = alunos.iterator();
        while(iterator.hasNext()){
            Aluno proximo = iterator.next();
            System.out.println(proximo);
        }

    }

}
