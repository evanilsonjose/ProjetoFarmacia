package br.com.farmacia.beans;

public class Medicamento extends Produto {

    private String generico;
    private String prescricaoMedica;
    private String categoria;

    public Medicamento() {
    }

    public Medicamento(int codigo, String nome, double precoCusto, double precoVenda, int qtdEstoque, Fornecedor fornecedor, String generico, String prescricaoMedica, String categoria) {
        super(codigo, nome, precoCusto, precoVenda, qtdEstoque, fornecedor);
        this.generico = generico;
        this.prescricaoMedica = prescricaoMedica;
        this.categoria = categoria;
    }

    public String getGenerico() {
        return generico;
    }

    public void setGenerico(String generico) {
        this.generico = generico;
    }

    public String getPrescricaoMedica() {
        return prescricaoMedica;
    }

    public void setPrescricaoMedica(String prescricaoMedica) {
        this.prescricaoMedica = prescricaoMedica;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}
