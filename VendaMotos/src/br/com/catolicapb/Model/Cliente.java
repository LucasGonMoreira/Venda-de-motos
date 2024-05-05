package br.com.catolicapb.Model;

import br.com.catolicapb.Contrato.ICliente;
import br.com.catolicapb.Enumeration.EnumMes;
import br.com.catolicapb.Enumeration.EnumMoto;
import br.com.catolicapb.Model.*;

import java.util.Scanner;

public class Cliente extends CadastrarCliente implements ICliente {

    public void comprarMoto(Vendedor vendedor){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome de um vendedor: ");
        String vendedorNome = scanner.next();

        if (vendedorNome.equals(vendedor.nome)){
            System.out.println("Vendedor encontrado!!!");
            for (EnumMoto motos : EnumMoto.values()) {
                System.out.println(motos);
            }
            System.out.print("Digite o modelo da moto que quer comprar: ");
            String modelo = scanner.next();
            boolean validacao = false;
            for (EnumMoto motos : EnumMoto.values()) {
                if (modelo.equals(motos.modelo)) {
                    validacao = true;
                    break;
                } else {
                    validacao = false;
                    break;
                }
            }
            if (validacao != false) {
                System.out.println("Moto comprada com sucesso!!!");
            } else {
                System.out.println("Moto não encontrada...:/");
            }
        }else {
            System.out.println("Vendedor não encontrado");
        }

    }
}
