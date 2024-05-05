package br.com.catolicapb.Main;

import br.com.catolicapb.Model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Vendedor vendedor = new Vendedor();
        Dono dono = new Dono();
        CadastrarMoto moto = new CadastrarMoto();
        MotoTestar testeDeMoto = new MotoTestar();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("=-=-=-=-MENU PRINCIPAL-=-=-=-=");
            System.out.println("1. Cadastrar vendedor; ");
            System.out.println("2. Cadastrar cliente; ");
            System.out.println("3. Cadastrar Dono; ");
            System.out.println("4. Login; ");
            System.out.println("5. sair;");
            System.out.print("\nDigite a opcao desejada: ");
            int opcao = scanner.nextInt();


            switch (opcao) {
                case 1:
                    vendedor.cadastrarVendedor();
                    System.out.println(vendedor);
                    break;
                case 2:
                    cliente.cadastrarCliente();
                    System.out.println(cliente);
                    break;
                case 3:
                    dono.cadastrarDono();
                    System.out.println(dono);
                    break;
                case 4:
                    System.out.print("Digite seu nome: ");
                    String loginNome = scanner.next();

                    System.out.print("Digite seu CPF: ");
                    String loginCPF = scanner.next();

                    System.out.print("Login para Cliente, Vendedor ou Dono? [C/V/D]: ");
                    String login = scanner.next().toUpperCase();

                    if (loginNome.equals(cliente.nome) || loginNome.equals(dono.nome) || loginNome.equals(vendedor.nome)) {
                        if (loginCPF.equals(cliente.cpf) && login.equals("C")){
                            System.out.println("\n=-=-=-=LOGIN EFETUADO COM SUCESSO=-=-=-=-=-\n");
                            while (true) {
                                System.out.println("=-=-=-=-=MENU CLIENTE=-=-=-=-");
                                System.out.println("1. Comprar moto;");
                                System.out.println("2. Sair;");
                                System.out.print("\nDigite a opcao desejada: ");
                                int opcaoCliente = scanner.nextInt();

                                if (opcaoCliente == 1) {
                                    cliente.comprarMoto(vendedor);
                                } else if (opcaoCliente == 2) {
                                    System.out.println("Saindo...");
                                    break;
                                } else {
                                    System.out.println("Algo deu errado...");
                                    break;
                                }
                            }

                        } else if (loginCPF.equals(vendedor.cpf) && login.equals("V")) {
                            System.out.println("\n=-=-=-=LOGIN EFETUADO COM SUCESSO=-=-=-=-=-\n");
                            while (true) {
                                System.out.println("=-=-=-=-=MENU VENDEDOR=-=-=-=-");
                                System.out.println("1. Vender moto;");
                                System.out.println("2. Sair;");
                                System.out.print("\nDigite a opcao desejada: ");
                                int opcaoVendedor = scanner.nextInt();

                                if (opcaoVendedor == 1) {
                                    vendedor.venderMoto();
                                } else if (opcaoVendedor == 2) {
                                    System.out.println("Saindo...");
                                    break;
                                } else {
                                    System.out.println("Algo deu errado...");
                                    break;
                                }
                            }
                        } else if (loginCPF.equals(dono.cpf) && login.equals("D")) {
                            System.out.println("\n=-=-=-=LOGIN EFETUADO COM SUCESSO=-=-=-=-=-\n");
                            while (true) {
                                System.out.println("=-=-=-=-=MENU DONO=-=-=-=-=-=-");
                                System.out.println("1. Cadastrar moto; ");
                                System.out.println("2. Testar moto; ");
                                System.out.println("3. Sair;");
                                System.out.print("\nDigite a opcao desejada: ");

                                int opcaoDono = scanner.nextInt();
                                if (opcaoDono == 1) {
                                    moto.cadastroMoto(dono);
                                } else if (opcaoDono == 2) {
                                    testeDeMoto.testarMoto();
                                } else if (opcaoDono == 3) {
                                    System.out.println("Saindo...");
                                    break;
                                } else {
                                    System.out.println("Algo deu errado...");
                                    break;
                                }
                            }

                        } else {
                            System.out.println("\nLogin falhou, tente novamente...\n");
                        }
                    }else{
                        System.out.println("\nLogin falhou, tente novamente...\n");
                    }
                    break;
            }
            if (opcao == 5){
                System.out.println("Saindo do sistema...");
                break;
            }
        }
    }
}