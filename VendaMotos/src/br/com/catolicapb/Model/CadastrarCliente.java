package br.com.catolicapb.Model;

import br.com.catolicapb.Enumeration.EnumMes;

import java.util.Scanner;

public class CadastrarCliente extends Pessoa{

    public EnumMes mes;
        public void cadastrarCliente(){
            boolean verifi = false;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite seu nome: ");
            this.nome = scanner.next();
            System.out.print("Digite seu cpf: ");
            this.cpf = scanner.next();
            System.out.print("Digite o dia do seu nascimento: ");
            this.dia = scanner.nextInt();
            System.out.print("Digite o mes do seu nascimento: ");
            String mesEscolhido = scanner.next().toUpperCase();

            for (EnumMes mes1: EnumMes.values()) {
                if (mesEscolhido.equals(mes1.mes)){
                    this.mes = EnumMes.valueOf(mesEscolhido);
                    verifi = true;
                    System.out.print("Digite o ano do seu nascimento: ");
                    this.ano = scanner.nextInt();
                    System.out.println("\nCliente cadastrado com sucesso!!!\n");
                    break;
                }else {
                    verifi = false;
                }
            }
            if (verifi == false){
                System.out.println("=-=-Mes nao encontrado...=-=-");
            }
        }
}

