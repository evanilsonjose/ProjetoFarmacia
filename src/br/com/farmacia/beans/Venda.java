package br.com.farmacia.beans;

public class Venda {

    private int codigo;
    private String notaFiscal;
    private Produto produto;
    private int qtdProd;
    private Funcionario funcionario;
    private Cliente cliente;

    public Venda() {
    }

    public Venda(int codigo, String notaFiscal, Produto produto, int qtdProd, Funcionario funcionario, Cliente cliente) {
        this.codigo = codigo;
        this.notaFiscal = notaFiscal;
        this.produto = produto;
        this.qtdProd = qtdProd;
        this.funcionario = funcionario;
        this.cliente = cliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(String notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQtdProd() {
        return qtdProd;
    }

    public void setQtdProd(int qtdProd) {
        this.qtdProd = qtdProd;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
