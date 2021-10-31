package br.com.davidli;

import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<>();
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public void adiciona(Aula aula){
        this.aulas.add(aula);
    }

    public int getTempoTotal(){
        /*int tempoTotal = 0;
        for (Aula aula : aulas){
            tempoTotal += aula.getTempo();
        }*/
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    @Override
    public String toString(){
        return "[Curso: " +nome+ ", Tempo total: " +this.getTempoTotal()+ ", aulas: " +this.aulas+ "]";
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getMatricula(), aluno);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public Aluno buscaMaticulado(int i) {
        /*for (Aluno aluno : alunos) {
            if(aluno.getMatricula() == i) {
                return aluno;
            }
        }
        throw new NoSuchElementException("Matrícula não encontrada");*/
        if(!matriculaParaAluno.containsKey(i)){
            throw new NoSuchElementException();
        }
        return matriculaParaAluno.get(i);
    }
}
