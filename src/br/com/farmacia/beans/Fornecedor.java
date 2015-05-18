package br.com.farmacia.beans;

public class Fornecedor extends Pessoa {

    private String CNPJ;

    public Fornecedor() {
    }

    public Fornecedor(int codigo, String nome, String endereco, String telefone, String CNPJ) {
        super(codigo, nome, endereco, telefone);
        this.CNPJ = CNPJ;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
}
