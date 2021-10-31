package br.com.davidli;

public class Aluno implements Comparable<Aluno>{

    private String nome;
    private int matricula;

    public Aluno(String nome, int matricula) {
        if(nome == null ){
            throw new NullPointerException("O nome não pode ser nulo");
        }
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public String toString(){
        return "[Aluno: " +this.nome+ ", Matrícula: " +this.matricula+ "]";
    }

    @Override
    public boolean equals (Object obj){
        Aluno outro = (Aluno) obj;
        return this.nome.equals(outro.nome);
    }

    @Override
    public int hashCode(){
        return this.nome.hashCode();
    }

    @Override
    public int compareTo(Aluno o) {
        return this.nome.compareTo(o.nome);
    }
}
