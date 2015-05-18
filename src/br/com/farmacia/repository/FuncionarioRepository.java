package br.com.farmacia.repository;

import br.com.farmacia.beans.Funcionario;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FuncionarioRepository implements FuncionarioRep{

    // instancia a lista de funcionarios
    List<Funcionario> funcionarios = new ArrayList<>();

    // metodo para cadastrar funcionario
    @Override
    public boolean cadastrar(Funcionario funcionario) {
        if (funcionarios.contains(funcionario)) {
            System.out.println("O Funcionario(a) já existe!");
            return false;
        } else {
            funcionarios.add(funcionario);
            System.out.println("Funcionario(a) cadastrado com sucesso");
            return true;
        }
    }

    // metodo para alterar funcionario
    @Override
    public void alterar(Funcionario funcionario) {
        for (Funcionario funcionarioCadastrado : funcionarios) {
            if (funcionarioCadastrado.getCodigo() == funcionario.getCodigo()) {
                funcionarioCadastrado.setNome(funcionario.getNome());
                funcionarioCadastrado.setRG(funcionario.getRG());
                funcionarioCadastrado.setCPF(funcionario.getCPF());
                funcionarioCadastrado.setDataNasc(funcionario.getDataNasc());
                funcionarioCadastrado.setEndereco(funcionario.getEndereco());
                funcionarioCadastrado.setTelefone(funcionario.getTelefone());
                funcionarioCadastrado.setFuncao(funcionario.getFuncao());
                funcionarioCadastrado.setSalario(funcionario.getSalario());
            }
        }
        System.out.println("Funcionário atualizado com sucesso!");
    }

    // metodo para remover funcionario
    @Override
    public void remover(int codigo) {
        String msg = "Funcionario(a) não encontrada!\n";
        for (Iterator<Funcionario> iteratorFuncionario = funcionarios.iterator(); iteratorFuncionario.hasNext();) {
            Funcionario funcionarioNext = iteratorFuncionario.next();
            if (funcionarioNext.getCodigo() == codigo) {
                iteratorFuncionario.remove();
                msg = "Funcionario(a) removido com sucesso!\n";
            }
        }
        System.out.println(msg);
    }

    // metodo para consultar funcionario
    @Override
    public Funcionario consultar(int codigo) throws Exception {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getCodigo() == codigo) {
                return funcionario;
            }
        }
        throw new Exception("Não existe o Funcionario(a) com o codigo informado!\n");
    }

    // metodo para exibir os dados de 1 funcionario
    @Override
    public void exibeFuncionario(Funcionario funcionario) {
        System.out.println("Nome: " + funcionario.getNome() + ", RG: " + funcionario.getRG()
                + ", CPF: " + funcionario.getCPF() + ", Data de Nasc.:" + funcionario.getDataNasc() + ", \nEndereço: " + funcionario.getEndereco()
                + ", Telefone: " + funcionario.getTelefone() + ", Função: " + funcionario.getFuncao() + "Salário R$ " + funcionario.getSalario() + "\n");
    }

    // metodo para listar(exibir os dados de todos) funcionarios
    @Override
    public void listar() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Código: " + funcionario.getCodigo() + ", Nome: " + funcionario.getNome() + "RG : " + funcionario.getRG()
                    + "CPF : " + funcionario.getCPF() + "Endereço : " + funcionario.getEndereco() + "Telelfone : " + funcionario.getTelefone()
                    + "Função : " + funcionario.getFuncao() + "Salario R$ : " + funcionario.getSalario());
        }
    }

}
