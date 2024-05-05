package br.com.catolicapb.Model;

import br.com.catolicapb.Contrato.IMoto;
import br.com.catolicapb.Enumeration.EnumMarcas;

import java.util.Scanner;

public class CadastrarMoto extends Moto {
    public void cadastroMoto(Dono dono){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu codigo: ");
        String codigo = scanner.next();
        if (codigo.equals(dono.codigo)){
            System.out.print("Digite o nome da moto: ");
            this.nomeDaMoto = scanner.next();

            for (EnumMarcas marcasParceiras: EnumMarcas.values()){
                System.out.println(marcasParceiras);
            }

            System.out.print("\nDigite a marca da moto: ");
            this.marcas = EnumMarcas.valueOf(scanner.next().toUpperCase());
            System.out.print("Digite a placa: ");
            this.placa = scanner.next();
            System.out.print("Digite o chassi: ");
            this.chassi = scanner.next();
            System.out.print("Digite a quantidade de rodas: ");
            this.quantidadeDePneu = scanner.nextInt();
            System.out.println("\nMoto cadastrada com sucesso!!!\n");
        }else {
            System.out.println("Algo deu errado :/");
        }

    }
}
