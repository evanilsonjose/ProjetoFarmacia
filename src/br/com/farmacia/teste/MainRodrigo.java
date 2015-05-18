package br.com.farmacia.teste;

import br.com.farmacia.beans.Cliente;
import br.com.farmacia.beans.Fornecedor;
import br.com.farmacia.beans.Funcionario;
import br.com.farmacia.beans.Pessoa;
import br.com.farmacia.repository.ClienteRepository;
import br.com.farmacia.repository.FuncionarioRepository;
import java.util.Scanner;

public class MainRodrigo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // variáveis de apoio
        int menu, submenu, submenu2, submenu3;
        int codigo;
        double salario;
        String nome;
        String endereco, telefone, CNPJ, dataNas, RG, CPF, funcao;
        Pessoa p;

        ClienteRepository funcaoCliente = new ClienteRepository();
        FuncionarioRepository funcaoFuncionario = new FuncionarioRepository();
        // menu do sistema
        do {
            System.out.println("----------ProjetoFarmacia----------");
            System.out.println("\n1-Consulta/Venda, 2-Gerenciamento, 3-Sair");
            menu = in.nextInt();

            switch (menu) {
                case 1:
                    do {
                        System.out.println("\n1-Medicamento, 2-Equipamento, 3-Voltar");
                        submenu = in.nextInt();

                        switch (submenu) {
                            case 1:
                                System.out.println("codigo do medicamento");
                                System.out.println("nome do medicamento");
                                break;
                            case 2:
                                System.out.println("codigo do equipamento");
                                System.out.println("nome do equipamento");
                                break;
                            default:
                                if (submenu < 3 || submenu > 3) {
                                    System.out.println("Opção Inválida");
                                }

                        }

                    } while (submenu != 3);
                    break;
                case 2:
                    do {
                        System.out.println("\n1-Cadastrar, 2-Consultar(listar), 3-Atualizar, 4-Remover, 5-Voltar");
                        submenu = in.nextInt();

                        switch (submenu) {
                            case 1:
                                do {
                                    System.out.println("\n1-Cliente, 2-Fornecedor, 3-Funcionario, 4-Medicamento, 5-Equipamento, 6-Voltar");
                                    submenu2 = in.nextInt();

                                    switch (submenu2) {
                                        case 1:
                                            System.out.println("\ncadastro de cliente");
                                            System.out.println("Digite o código: ");
                                            codigo = in.nextInt();
                                            in.nextLine();
                                            System.out.println("Digite seu nome: ");
                                            nome = in.nextLine();
                                            System.out.println("Digite o RG: ");
                                            RG = in.nextLine();
                                            System.out.println("Digite o CPF: ");
                                            CPF = in.nextLine();
                                            System.out.println("Digite a Data de Nascimento: ");
                                            dataNas = in.nextLine();
                                            System.out.println("Digite o endereço: ");
                                            endereco = in.nextLine();
                                            System.out.println("Digite o telefone: ");
                                            telefone = in.nextLine();

                                            p = new Cliente(codigo, nome, endereco, telefone, RG, CPF, dataNas);
                                            //pessoas.add(p);
                                            //Cliente cliente = new Cliente();
                                            //cliente.setCodigo(codigo);
                                            //cliente.setNome(nome);

                                            funcaoCliente.cadastrar((Cliente) p);
                                            break;
                                        case 2:
                                            System.out.println("cadastro de fornecedor");
                                            break;
                                        case 3:
                                            System.out.println("cadastro de funcionario");
                                            break;
                                        case 4:
                                            System.out.println("cadastro de medicamento");
                                            break;
                                        case 5:
                                            System.out.println("cadastro de equipamento");
                                            break;
                                        default:
                                            if (submenu2 < 6 || submenu2 > 6) {
                                                System.out.println("Opção inválida");
                                            }
                                    }

                                } while (submenu2 != 6);
                                break;
                            case 2:
                                do {
                                    System.out.println("\n1-Cliente, 2-Fornecedor, 3-Funcionario, 4-Medicamento, 5-Equipamento, 6-Voltar");
                                    submenu2 = in.nextInt();

                                    switch (submenu2) {
                                        case 1:
                                            System.out.println("consulta de cliente");
                                            funcaoCliente.listar();
                                            break;
                                        case 2:
                                            System.out.println("consulta de fornecedor");
                                            break;
                                        case 3:
                                            System.out.println("consulta de funcionario");
                                            break;
                                        case 4:
                                            System.out.println("consulta de medicamento");
                                            break;
                                        case 5:
                                            System.out.println("consulta de equipamento");
                                            break;
                                        default:
                                            if (submenu2 < 6 || submenu2 > 6) {
                                                System.out.println("Opção inválida");
                                            }
                                    }

                                } while (submenu2 != 6);
                                break;
                            case 3:
                                do {
                                    System.out.println("\n1-Cliente, 2-Fornecedor, 3-Funcionario, 4-Medicamento, 5-Equipamento, 6-Voltar");
                                    submenu2 = in.nextInt();

                                    switch (submenu2) {
                                        case 1:
                                            System.out.println("atualizar cliente");
                                            break;
                                        case 2:
                                            System.out.println("atualizar fornecedor");

                                            break;
                                        case 3:
                                            System.out.println("atualizar funcionario");

                                            System.out.println("Digite o codigo do Funcionario: ");
                                            codigo = in.nextInt();
                                            in.nextLine();

                                            try {
                                                Funcionario funcionario = funcaoFuncionario.consultar(codigo);
                                                funcaoFuncionario.exibeFuncionario(funcionario);
                                                System.out.println("\nO que deseja alterar?");
                                                do {
                                                    System.out.println("\n1-Nome, 2-RG, 3-CPF, 4-Data de Nascimento, 5-Endereço, 6-Telefone, 7-Função, 8-Salário, 9-Salvar");
                                                    submenu3 = in.nextInt();
                                                    in.nextLine();
                                                    switch (submenu3) {
                                                        case 1:
                                                            System.out.println("Digite seu nome: ");
                                                            nome = in.nextLine();
                                                            funcionario.setNome(nome);
                                                            break;
                                                        case 2:
                                                            System.out.println("Digite o RG: ");
                                                            RG = in.nextLine();
                                                            funcionario.setRG(RG);
                                                            break;
                                                        case 3:
                                                            System.out.println("Digite o CPF: ");
                                                            CPF = in.nextLine();
                                                            funcionario.setCPF(CPF);
                                                            break;
                                                        case 4:
                                                            System.out.println("Digite a Data de Nascimento: ");
                                                            dataNas = in.nextLine();
                                                            funcionario.setDataNasc(dataNas);
                                                            break;
                                                        case 5:
                                                            System.out.println("Digite o Endereço: ");
                                                            endereco = in.nextLine();
                                                            funcionario.setEndereco(endereco);
                                                            break;
                                                        case 6:
                                                            System.out.println("Digite o Telefone: ");
                                                            telefone = in.nextLine();
                                                            funcionario.setTelefone(telefone);
                                                            break;
                                                        case 7:
                                                            System.out.println("Digite a Função: ");
                                                            funcao = in.nextLine();
                                                            funcionario.setFuncao(funcao);
                                                            break;
                                                        case 8:
                                                            System.out.println("Digite o Salario: ");
                                                            salario = in.nextDouble();
                                                            funcionario.setSalario(salario);
                                                            break;

                                                        default:
                                                            if (submenu3 < 9 || submenu3 > 9) {
                                                                System.out.println("Opção inválida");
                                                            }
                                                    }

                                                } while (submenu3 != 9);

                                                funcaoFuncionario.alterar(funcionario);
                                            } catch (Exception e) {
                                                System.err.println(e.getMessage());
                                            }
                                            break;

                                        case 4:
                                            System.out.println("atualizar medicamento");
                                            break;
                                        case 5:
                                            System.out.println("atualizar equipamento");
                                            break;
                                        default:
                                            if (submenu2 < 6 || submenu2 > 6) {
                                                System.out.println("Opção inválida");
                                            }
                                    }

                                } while (submenu2 != 6);
                                break;
                            case 4:
                                do {
                                    System.out.println("\n1-Cliente, 2-Fornecedor, 3-Funcionario, 4-Medicamento, 5-Equipamento, 6-Voltar");
                                    submenu2 = in.nextInt();

                                    switch (submenu2) {
                                        case 1:
                                            System.out.println("remover cliente");
                                            break;
                                        case 2:
                                            System.out.println("remover fornecedor");
                                            break;
                                        case 3:
                                            System.out.println("remover funcionario");
                                            break;
                                        case 4:
                                            System.out.println("remover medicamento");
                                            break;
                                        case 5:
                                            System.out.println("remover equipamento");
                                            break;
                                        default:
                                            if (submenu2 < 6 || submenu2 > 6) {
                                                System.out.println("Opção inválida");
                                            }
                                    }

                                } while (submenu2 != 6);
                                break;
                            default:
                                if (submenu < 5 || submenu > 5) {
                                    System.out.println("Opção Inválida");
                                }
                        }

                    } while (submenu != 5);
                    break;
                default:
                    if (menu < 3 || menu > 3) {
                        System.out.println("Opção inválida!");
                    }
            }

            //System.out.println("--------------2015----------v1.0---");
        } while (menu != 3);
    }

}
