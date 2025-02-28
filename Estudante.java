package org.example;

public class Estudante {
    private String nome;
    private double notaFinal;


    public Estudante(String nome, double  notaFinal){
        this.nome = nome;
        this.notaFinal = notaFinal;
    }
    public String getNome() {
        return nome;
    }
    public double getNotaFinal(){
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

}
