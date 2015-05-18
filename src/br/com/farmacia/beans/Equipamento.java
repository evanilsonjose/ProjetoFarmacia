package br.com.farmacia.beans;

public class Equipamento extends Produto {

    private String modoOperacao;

    public Equipamento() {
    }

    public Equipamento(int codigo, String nome, double precoCusto, double precoVenda, int qtdEstoque, Fornecedor fornecedor, String modoOperacao) {
        super(codigo, nome, precoCusto, precoVenda, qtdEstoque, fornecedor);
        this.modoOperacao = modoOperacao;
    }

    public String getModoOperacao() {
        return modoOperacao;
    }

    public void setModoOperacao(String modoOperacao) {
        this.modoOperacao = modoOperacao;
    }

}
