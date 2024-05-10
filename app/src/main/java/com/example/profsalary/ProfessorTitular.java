package com.example.profsalary;

public class ProfessorTitular extends Professor {
    private int anosInstituicao;
    private double salario;

    public ProfessorTitular() {
    }

    public int getAnosInstituicao() {
        return anosInstituicao;
    }

    public void setAnosInstituicao(int anosInstituicao) {
        this.anosInstituicao = anosInstituicao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void calcularSalario() {
        // Incrementa 5% para cada 5 anos de instituição
        double aumentoPorAno = 0.05;
        double aumentoTotal = (anosInstituicao / 5) * aumentoPorAno;
        salario *= (1 + aumentoTotal);
    }

}
