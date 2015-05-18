package br.com.farmacia.ui;

import br.com.farmacia.beans.Cliente;
import br.com.farmacia.beans.Equipamento;
import br.com.farmacia.beans.Fornecedor;
import br.com.farmacia.beans.Funcionario;
import br.com.farmacia.beans.Medicamento;
import br.com.farmacia.beans.Pessoa;
import br.com.farmacia.beans.Produto;
import br.com.farmacia.repository.ClienteRepository;
import br.com.farmacia.repository.EquipamentoRepository;
import br.com.farmacia.repository.FornecedorRepository;
import br.com.farmacia.repository.FuncionarioRepository;
import br.com.farmacia.repository.MedicamentoRepository;
import java.util.Scanner;

public class Sistema {

    public static void executar() {

        Scanner in = new Scanner(System.in);

        // variáveis de apoio
        int menu, submenu, submenu2, submenu3;
        int codigo, codFornec, qtdEstoque;
        double precoCusto, precoVenda, salario;
        char rGenerico, rPrescricao;
        String nome, RG, CPF, CNPJ, dataNasc, endereco, telefone, categoria, funcao, modoOperacao, generico, prescricao;
        Pessoa pessoa;
        Produto produto;
        Fornecedor fornecedor;

        // instanciando os repositórios
        FornecedorRepository funcaoFornecedor = new FornecedorRepository();
        FuncionarioRepository funcaoFuncionario = new FuncionarioRepository();
        ClienteRepository funcaoCliente = new ClienteRepository();
        MedicamentoRepository funcaoMedicamento = new MedicamentoRepository();
        EquipamentoRepository funcaoEquipamento = new EquipamentoRepository();

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
                        System.out.println("\n1-Cadastrar, 2-Listar, 3-Atualizar, 4-Remover, 5-Voltar");
                        submenu = in.nextInt();

                        switch (submenu) {
                            case 1:
                                do {
                                    System.out.println("\n1-Cliente, 2-Fornecedor, 3-Funcionario, 4-Medicamento, 5-Equipamento, 6-Voltar");
                                    submenu2 = in.nextInt();

                                    switch (submenu2) {
                                        case 1:
                                            System.out.println("\n-----cadastro de cliente-----");
                                            System.out.println("Digite o código: ");
                                            codigo = in.nextInt();
                                            in.nextLine();
                                            System.out.println("Digite o nome: ");
                                            nome = in.nextLine();
                                            System.out.println("Digite o RG: ");
                                            RG = in.nextLine();
                                            System.out.println("Digite o CPF: ");
                                            CPF = in.nextLine();
                                            System.out.println("Digite a data de nascimento: ");
                                            dataNasc = in.nextLine();
                                            System.out.println("Digite o endereço: ");
                                            endereco = in.nextLine();
                                            System.out.println("Digite o telefone: ");
                                            telefone = in.nextLine();

                                            pessoa = new Cliente(codigo, nome, endereco, telefone, RG, CPF, dataNasc);
                                            funcaoCliente.cadastrar((Cliente) pessoa);
                                            break;
                                        case 2:
                                            System.out.println("\n-----cadastro de fornecedor-----");
                                            System.out.println("Digite o código: ");
                                            codigo = in.nextInt();
                                            in.nextLine();
                                            System.out.println("Digite o nome: ");
                                            nome = in.nextLine();
                                            System.out.println("Digite o CNPJ:");
                                            CNPJ = in.nextLine();
                                            System.out.println("Digite o endereço: ");
                                            endereco = in.nextLine();
                                            System.out.println("Digite o telefone: ");
                                            telefone = in.nextLine();

                                            pessoa = new Fornecedor(codigo, nome, endereco, telefone, CNPJ);
                                            funcaoFornecedor.cadastrar((Fornecedor) pessoa);
                                            break;
                                        case 3:
                                            System.out.println("\n-----cadastro de funcionário-----");
                                            System.out.println("Digite o código: ");
                                            codigo = in.nextInt();
                                            in.nextLine();
                                            System.out.println("Digite o nome: ");
                                            nome = in.nextLine();
                                            System.out.println("Digite o RG: ");
                                            RG = in.nextLine();
                                            System.out.println("Digite o CPF: ");
                                            CPF = in.nextLine();
                                            System.out.println("Digite a Data de Nascimento: ");
                                            dataNasc = in.nextLine();
                                            System.out.println("Digite o endereço: ");
                                            endereco = in.nextLine();
                                            System.out.println("Digite o telefone: ");
                                            telefone = in.nextLine();
                                            System.out.println("Digite a função: ");
                                            funcao = in.nextLine();
                                            System.out.println("Digite o salário: ");
                                            salario = in.nextDouble();

                                            pessoa = new Funcionario(codigo, nome, endereco, telefone, RG, CPF, dataNasc, funcao, salario);
                                            funcaoFuncionario.cadastrar((Funcionario) pessoa);
                                            break;
                                        case 4:
                                            System.out.println("\n-----cadastro de medicamento-----");
                                            System.out.println("Digite o código: ");
                                            codigo = in.nextInt();
                                            in.nextLine();
                                            System.out.println("Digite o nome: ");
                                            nome = in.nextLine();
                                            System.out.println("Digite o preço de custo: ");
                                            precoCusto = in.nextDouble();
                                            System.out.println("Digite o preço de venda: ");
                                            precoVenda = in.nextDouble();
                                            System.out.println("Digite a quantidade em estoque: ");
                                            qtdEstoque = in.nextInt();
                                            in.nextLine();
                                            System.out.println("Digite o código do fornecedor: ");
                                            codFornec = in.nextInt();
                                            fornecedor = null;
                                            try {
                                                fornecedor = funcaoFornecedor.consultar(codFornec);
                                            } catch (Exception e) {
                                                System.err.println(e.getMessage());
                                            }

                                            System.out.println("O medicamento é genérico? S ou N ");
                                            rGenerico = in.next().charAt(0);
                                            if (rGenerico == 'S' || rGenerico == 's') {
                                                generico = "Sim";
                                            } else {
                                                generico = "Não";
                                            }
                                            System.out.println("O medicamento requer prescrição médica? S ou N ");
                                            rPrescricao = in.next().charAt(0);
                                            if (rPrescricao == 'S' || rPrescricao == 's') {
                                                prescricao = "Sim";
                                            } else {
                                                prescricao = "Não";
                                            }
                                            System.out.println("Informe a categoria do medicamento: ");
                                            categoria = in.nextLine();

                                            produto = new Medicamento(codigo, nome, precoCusto, precoVenda, qtdEstoque, fornecedor, generico, prescricao, categoria);
                                            funcaoMedicamento.cadastrar((Medicamento) produto);
                                            break;
                                        case 5:
                                            System.out.println("\n-----cadastro de equipamento-----");
                                            System.out.println("Digite o código: ");
                                            codigo = in.nextInt();
                                            in.nextLine();
                                            System.out.println("Digite o nome: ");
                                            nome = in.nextLine();
                                            System.out.println("Digite o preço de Custo: ");
                                            precoCusto = in.nextDouble();
                                            System.out.println("Digite o preço de Venda");
                                            precoVenda = in.nextDouble();
                                            System.out.println("Digite a quantidade em estoque: ");
                                            qtdEstoque = in.nextInt();
                                            in.nextLine();
                                            System.out.println("Digite o código do fornecedor: ");
                                            codFornec = in.nextInt();
                                            in.nextLine();
                                            fornecedor = null;
                                            try {
                                                fornecedor = funcaoFornecedor.consultar(codFornec);
                                            } catch (Exception e) {
                                                System.err.println(e.getMessage());
                                            }
                                            System.out.println("Digite o modo de operação: ");
                                            modoOperacao = in.nextLine();

                                            produto = new Equipamento(codigo, nome, precoCusto, precoVenda, qtdEstoque, fornecedor, modoOperacao);
                                            funcaoEquipamento.cadastrar((Equipamento) produto);
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
                                            System.out.println("\n-----Listagem de clientes-----");
                                            funcaoCliente.listar();
                                            break;
                                        case 2:
                                            System.out.println("\n-----Listagem de fornecedores-----");
                                            funcaoFornecedor.listar();
                                            break;
                                        case 3:
                                            System.out.println("\n-----Listagem de funcionario-----");
                                            funcaoFuncionario.listar();
                                            break;
                                        case 4:
                                            System.out.println("\n-----Listagem de medicamento-----");
                                            funcaoMedicamento.listar();
                                            break;
                                        case 5:
                                            System.out.println("\n-----Listagem de equipamento-----");
                                            funcaoEquipamento.listar();
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
                                            System.out.println("\n-----Atualizar cliente-----");
                                            System.out.println("Digite o codigo do cliente: ");
                                            codigo = in.nextInt();

                                            try {
                                                Cliente cliente = funcaoCliente.consultar(codigo);
                                                funcaoCliente.exibeCliente(cliente);
                                                System.out.println("\nO que deseja alterar?");
                                                do {
                                                    System.out.println("\n1-Nome, 2-RG, 3-CPF, 4-Data de Nasc, 5-Endereço, 6-Telefone, 7-Salvar");
                                                    submenu3 = in.nextInt();
                                                    in.nextLine();
                                                    switch (submenu3) {
                                                        case 1:
                                                            System.out.println("Digite o novo nome: ");
                                                            nome = in.nextLine();
                                                            cliente.setNome(nome);
                                                            break;
                                                        case 2:
                                                            System.out.println("Digite o novo RG: ");
                                                            RG = in.nextLine();
                                                            cliente.setRG(RG);
                                                            break;
                                                        case 3:
                                                            System.out.println("Digite o novo CPF: ");
                                                            CPF = in.nextLine();
                                                            cliente.setCPF(CPF);
                                                            break;
                                                        case 4:
                                                            System.out.println("Digite a nova Data de Nascimento: ");
                                                            dataNasc = in.nextLine();
                                                            cliente.setDataNasc(dataNasc);
                                                            break;
                                                        case 5:
                                                            System.out.println("Digite o novo endereço: ");
                                                            endereco = in.nextLine();
                                                            cliente.setEndereco(endereco);
                                                            break;
                                                        case 6:
                                                            System.out.println("Digite o novo telefone: ");
                                                            telefone = in.nextLine();
                                                            cliente.setTelefone(telefone);
                                                            break;
                                                        default:
                                                            if (submenu3 < 7 || submenu3 > 7) {
                                                                System.out.println("Opção inválida");
                                                            }
                                                    }

                                                } while (submenu3 != 7);

                                                funcaoCliente.alterar(cliente);

                                            } catch (Exception e) {
                                                System.err.println(e.getMessage());
                                            }

                                            break;
                                        case 2:
                                            System.out.println("\n-----Atualizar fornecedor-----");
                                            System.out.println("Digite o código do Fornecdor: ");
                                            codigo = in.nextInt();

                                            try {
                                                fornecedor = funcaoFornecedor.consultar(codigo);
                                                funcaoFornecedor.exibeFornecedor(fornecedor);
                                                System.out.println("\nO que deseja alterar?");
                                                do {
                                                    System.out.println("\n1-Nome, 2-CNPJ, 3-Endereço, 4-Telefone, 5-Salvar");
                                                    submenu3 = in.nextInt();
                                                    in.nextLine();
                                                    switch (submenu3) {
                                                        case 1:
                                                            System.out.println("Digite o novo nome: ");
                                                            nome = in.nextLine();
                                                            fornecedor.setNome(nome);
                                                            break;
                                                        case 2:
                                                            System.out.println("Digite o novo CNPJ: ");
                                                            CNPJ = in.nextLine();
                                                            fornecedor.setCNPJ(CNPJ);
                                                            break;
                                                        case 3:
                                                            System.out.println("Digite o novo endereço: ");
                                                            endereco = in.nextLine();
                                                            fornecedor.setEndereco(endereco);
                                                            break;
                                                        case 4:
                                                            System.out.println("Digite o novo telefone: ");
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
                                            }

                                            break;
                                        case 3:
                                            System.out.println("\n-----Atualizar funcionario-----");
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
                                                            System.out.println("Digite o novo nome: ");
                                                            nome = in.nextLine();
                                                            funcionario.setNome(nome);
                                                            break;
                                                        case 2:
                                                            System.out.println("Digite o novo RG: ");
                                                            RG = in.nextLine();
                                                            funcionario.setRG(RG);
                                                            break;
                                                        case 3:
                                                            System.out.println("Digite o novo CPF: ");
                                                            CPF = in.nextLine();
                                                            funcionario.setCPF(CPF);
                                                            break;
                                                        case 4:
                                                            System.out.println("Digite a Data de Nascimento: ");
                                                            dataNasc = in.nextLine();
                                                            funcionario.setDataNasc(dataNasc);
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
                                            System.out.println("\n-----Atualizar medicamento-----");

                                            System.out.println("Digite o código do Medicamento");
                                            codigo = in.nextInt();
                                            in.nextLine();

                                            try {
                                                Medicamento medicamento = funcaoMedicamento.consultar(codigo);
                                                funcaoMedicamento.exibeMedicamento(medicamento);
                                                System.out.println("Quais dos campos deseja alterar");

                                                do {
                                                    System.out.println("\n1-Nome, 2-PrecoCusto, 3-PrecoVenda, 4-Quantidade estocada, 5-Fornecedor, 6-Genérico, 7-Prescrição médica, 8-Categoria, 9-Salvar");
                                                    submenu3 = in.nextInt();
                                                    in.nextLine();

                                                    switch (submenu3) {
                                                        case 1:
                                                            System.out.println("Digite o novo nome do medicamento: ");
                                                            nome = in.nextLine();
                                                            medicamento.setNome(nome);
                                                            break;
                                                        case 2:
                                                            System.out.println("Digite o novo preço de custo: ");
                                                            precoCusto = in.nextDouble();
                                                            medicamento.setPrecoCusto(precoCusto);
                                                            break;
                                                        case 3:
                                                            System.out.println("Digite o novo preço de venda: ");
                                                            precoVenda = in.nextDouble();
                                                            medicamento.setPrecoVenda(precoVenda);
                                                            break;
                                                        case 4:
                                                            System.out.println("Digite a nova quantidade em estoque: ");
                                                            qtdEstoque = in.nextInt();
                                                            medicamento.setQtdEstoque(qtdEstoque);
                                                            break;
                                                        case 5:
                                                            System.out.println("Digite o código do novo fornecedor: ");
                                                            codFornec = in.nextInt();
                                                            fornecedor = funcaoFornecedor.consultar(codFornec);
                                                            medicamento.setFornecedor(fornecedor);
                                                            break;
                                                        case 6:
                                                            System.out.println("O medicamento é genérico? S ou N");
                                                            rGenerico = in.next().charAt(0);
                                                            if (rGenerico == 'S') {
                                                                generico = "Sim";
                                                            } else {
                                                                generico = "Não";
                                                            }
                                                            medicamento.setGenerico(generico);
                                                            break;
                                                        case 7:
                                                            System.out.println("O medicamento requer prescrição médica? S ou N ");
                                                            rPrescricao = in.next().charAt(0);
                                                            if (rPrescricao == 'S') {
                                                                prescricao = "Sim";
                                                            } else {
                                                                prescricao = "Não";
                                                            }
                                                            medicamento.setPrescricaoMedica(prescricao);
                                                            break;
                                                        case 8:
                                                            System.out.println("Informe a nova categoria do medicamento: ");
                                                            categoria = in.nextLine();
                                                            medicamento.setCategoria(categoria);
                                                        default:
                                                            if (submenu3 > 9 && submenu < 9) {
                                                                System.out.println("Opção inválida");
                                                            }
                                                    }

                                                    funcaoMedicamento.alterar(medicamento);

                                                } while (submenu3 != 9);
                                            } catch (Exception e) {
                                                System.err.println(e.getMessage());
                                            }

                                            break;
                                        case 5:
                                            System.out.println("\n-----Atualizar equipamento-----");
                                            System.out.println("Digite o código do equipamento");
                                            codigo = in.nextInt();
                                            in.nextLine();

                                            try {
                                                Equipamento equipamento = funcaoEquipamento.consultar(codigo);
                                                funcaoEquipamento.exibeEquipamento(equipamento);
                                                System.out.println("Quais dos campos cmpos deseja alterar");

                                                do {
                                                    System.out.println("\n1-Nome, 2-PrecoCusto, 3-PrecoVenda, 4-Quantidade estocada, 5-Fornecedor, 6-Modo Opeacional, 7-Salvar");
                                                    submenu3 = in.nextInt();
                                                    in.nextLine();

                                                    switch (submenu3) {
                                                        case 1:
                                                            System.out.println("Digite o novo nome: ");
                                                            nome = in.nextLine();
                                                            equipamento.setNome(nome);
                                                            break;
                                                        case 2:
                                                            System.out.println("Digite o novo preço de custo: ");
                                                            precoCusto = in.nextDouble();
                                                            equipamento.setPrecoCusto(precoCusto);
                                                            break;
                                                        case 3:
                                                            System.out.println("Digite o novo preço de venda: ");
                                                            precoVenda = in.nextDouble();
                                                            equipamento.setPrecoVenda(precoVenda);
                                                            break;
                                                        case 4:
                                                            System.out.println("Digite a nova quantidade em estoque: ");
                                                            qtdEstoque = in.nextInt();
                                                            equipamento.setQtdEstoque(qtdEstoque);
                                                            break;
                                                        case 5:
                                                            System.out.println("Digite o código do novo fornecedor: ");
                                                            codFornec = in.nextInt();
                                                            fornecedor = funcaoFornecedor.consultar(codFornec);
                                                            equipamento.setFornecedor(fornecedor);
                                                            break;
                                                        case 6:
                                                            System.out.println("Digite o novo modo operacional: ");
                                                            modoOperacao = in.nextLine();
                                                            equipamento.setModoOperacao(modoOperacao);
                                                        default:
                                                            if (submenu3 > 7 && submenu < 7) {
                                                                System.out.println("Opção inválida");
                                                            }
                                                    }

                                                    funcaoEquipamento.alterar(equipamento);

                                                } while (submenu3 != 7);

                                            } catch (Exception e) {
                                                System.err.println(e.getMessage());
                                            }

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
                                            System.out.println("\n-----Remover cliente-----");
                                            System.out.println("Digite o código do cliente: ");
                                            codigo = in.nextInt();
                                            funcaoCliente.remover(codigo);
                                            break;
                                        case 2:
                                            System.out.println("\n-----Remover fornecedor-----");
                                            System.out.println("Digite o código do fornecedor: ");
                                            codigo = in.nextInt();
                                            funcaoFornecedor.remover(codigo);
                                            break;
                                        case 3:
                                            System.out.println("\n-----Remover funcionario-----");
                                            System.out.println("Digite o código do funcionário: ");
                                            codigo = in.nextInt();
                                            funcaoFuncionario.remover(codigo);
                                            break;
                                        case 4:
                                            System.out.println("\n-----Remover medicamento-----");
                                            System.out.println("Digite o código do medicamento: ");
                                            codigo = in.nextInt();
                                            funcaoMedicamento.remover(codigo);
                                            break;
                                        case 5:
                                            System.out.println("\n-----Remover equipamento-----");
                                            System.out.println("Digite o código do equipamento: ");
                                            codigo = in.nextInt();
                                            funcaoEquipamento.remover(codigo);
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
