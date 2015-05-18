package br.com.farmacia.beans;

public class Cliente extends Pessoa {

    private String RG;
    private String CPF;
    private String dataNasc;

    public Cliente() {
    }

    public Cliente(int codigo, String nome, String endereco, String telefone, String RG, String CPF, String dataNasc) {
        super(codigo, nome, endereco, telefone);
        this.RG = RG;
        this.CPF = CPF;
        this.dataNasc = dataNasc;
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

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String DataNasc) {
        this.dataNasc = DataNasc;
    }

}
