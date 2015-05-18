package br.com.farmacia.teste;

import br.com.farmacia.repository.FornecedorRepository;
import br.com.farmacia.beans.Cliente;
import br.com.farmacia.beans.Fornecedor;
import br.com.farmacia.beans.Pessoa;
import br.com.farmacia.repository.ClienteRepository;
import java.util.Scanner;

public class MainLarissa {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // variáveis de apoio
        int menu, submenu, submenu2, submenu3;
        int codigo;
        String nome;
        String endereco, telefone, CNPJ, dataNas, RG, CPF;
        Pessoa p;

        ClienteRepository funcaoCliente = new ClienteRepository();
        FornecedorRepository funcaoFornecedor = new FornecedorRepository();
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
                                            System.out.println("\ncadastro de fornecedor");
                                            System.out.println("Digite o código: ");
                                            codigo = in.nextInt();
                                            in.nextLine();
                                            System.out.println("Digite seu nome: ");
                                            nome = in.nextLine();
                                            System.out.println("Digite o CNPJ:");
                                            CNPJ = in.nextLine();
                                            System.out.println("Digite o endereço: ");
                                            endereco = in.nextLine();
                                            System.out.println("Digite o telefone: ");
                                            telefone = in.nextLine();

                                            p = new Fornecedor(codigo, nome, endereco, telefone, CNPJ);
                                            funcaoFornecedor.cadastrar((Fornecedor) p);
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
                                            funcaoFornecedor.listar();
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
                                             System.out.println("\n-----Atualizar Fornecedor-----");
                                            System.out.println("Digite o codigo do Fornecdor: ");
                                            codigo = in.nextInt();

                                            try {
                                               Fornecedor fornecedor = funcaoFornecedor.consultar(codigo);
                                                funcaoFornecedor.exibeFornecedor(fornecedor);
                                                System.out.println("\nO que deseja alterar?");
                                                do {
                                                    System.out.println("\n1-Nome, 2-CNPJ, 3-Endereço, 4-Telefone, 5-Salvar");
                                                    submenu3 = in.nextInt();
                                                    in.nextLine();
                                                    switch (submenu3) {
                                                        case 1:
                                                            System.out.println("Digite seu nome: ");
                                                            nome = in.nextLine();
                                                            fornecedor.setNome(nome);
                                                            break;
                                                        case 2:
                                                            System.out.println("Digite o CNPJ: ");
                                                            CNPJ = in.nextLine();
                                                            fornecedor.setCNPJ(CNPJ);
                                                            break;                       
                                                        case 3:
                                                            System.out.println("Digite o endereço: ");
                                                            endereco = in.nextLine();
                                                            fornecedor.setEndereco(endereco);
                                                            break;
                                                        case 4:
                                                            System.out.println("Digite o telefone: ");
                                                            telefone = in.nextLine();
                                                            fornecedor.setTelefone(telefone);
                                                            break;
                                                        default:
                                                            if (submenu3 < 5 || submenu3 > 5) {
                                                                System.out.println("Opção inválida");
                                                            }
                                                    }

                                                } while (submenu3 != 5);

                                                funcaoFornecedor.alterar(fornecedor);
                                            } catch (Exception e) {
                                                System.err.println(e.getMessage());
                                            }break;
                                            
                                        case 3:
                                           System.out.println("atualizar funcionario");
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
                                            System.out.println("Digite o codigo do fornecedor: ");
                                            codigo = in.nextInt();
                                            funcaoFornecedor.remover(codigo);
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
