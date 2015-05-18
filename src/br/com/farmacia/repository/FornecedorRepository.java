package br.com.farmacia.repository;

import br.com.farmacia.beans.Fornecedor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FornecedorRepository implements FornecedorRep {

    // instancia a lista de fornecedores
    List<Fornecedor> fornecedores = new ArrayList<>();

    // metodo para cadastrar fornecedor
    @Override
    public boolean cadastrar(Fornecedor fornecedor) {
        if (fornecedores.contains(fornecedor)) {
            System.out.println("O fornecedor já existe!");
            return false;
        } else {
            fornecedores.add(fornecedor);
            System.out.println("Fornecedor cadastrado com sucesso");
            return true;
        }
    }

    // metodo para alterar fornecedor
    @Override
    public void alterar(Fornecedor fornecedor) {
        for (Fornecedor fornecedorCadastrado : fornecedores) {
            if (fornecedorCadastrado.getCodigo() == fornecedor.getCodigo()) {
                fornecedorCadastrado.setNome(fornecedor.getNome());
                fornecedorCadastrado.setCNPJ(fornecedor.getCNPJ());
                fornecedorCadastrado.setEndereco(fornecedor.getEndereco());
                fornecedorCadastrado.setTelefone(fornecedor.getTelefone());
            }
        }
        System.out.println("Fornecedor atualizado com sucesso!");
    }

    // metodo para remover fornecedor
    @Override
    public void remover(int codigo) {
        String msg = "Fornecedor encontrado!\n";
        for (Iterator<Fornecedor> iteratorFornecedor = fornecedores.iterator(); iteratorFornecedor.hasNext();) {
            Fornecedor pessoaNext = iteratorFornecedor.next();
            if (pessoaNext.getCodigo() == codigo) {
                iteratorFornecedor.remove();
                msg = "Fornecedor removido com sucesso!\n";
            }
        }
        System.out.println(msg);

    }

    // metodo para consultar fornecedor
    @Override
    public Fornecedor consultar(int codigo) throws Exception {
        for (Fornecedor fornecedor : fornecedores) {
            if (fornecedor.getCodigo() == codigo) {
                return fornecedor;
            }
        }
        throw new Exception("Não existe o fornecedor com o código informado!");

    }

    // metodo para exibir os dados de 1 fornecedor
    @Override
    public void exibeFornecedor(Fornecedor fornecedor) {
        System.out.println("Nome: " + fornecedor.getNome() + ", CNPJ: " + fornecedor.getCNPJ()
                + ", \nEndereço: " + fornecedor.getEndereco() + ", Telefone: " + fornecedor.getTelefone() + "\n");
    }

    // metodo para listar(exibir os dados de todos) fornecedores
    @Override
    public void listar() {
        for (Fornecedor fornecedor : fornecedores) {
            System.out.println("Código: " + fornecedor.getCodigo() + ", Nome: " + fornecedor.getNome() + ", CNPJ: "
                    + fornecedor.getCNPJ() + ", Endereço: " + fornecedor.getEndereco() + ", Telefone: " + fornecedor.getTelefone());
        }
    }

}
