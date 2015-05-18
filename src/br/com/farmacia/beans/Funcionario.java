package br.com.farmacia.beans;

public class Funcionario extends Pessoa {

    private String RG;
    private String CPF;
    private String dataNasc;
    private String funcao;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(int codigo, String nome, String endereco, String telefone, String RG, String CPF, String dataNasc, String funcao, double salario) {
        super(codigo, nome, endereco, telefone);
        this.RG = RG;
        this.CPF = CPF;
        this.dataNasc = dataNasc;
        this.funcao = funcao;
        this.salario = salario;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

}
