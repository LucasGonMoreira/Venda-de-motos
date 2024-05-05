package br.com.catolicapb.Model;

import br.com.catolicapb.Contrato.IVendedor;
import br.com.catolicapb.Enumeration.EnumMoto;

import java.util.Scanner;

public class Vendedor extends CadastrarVendedor implements IVendedor {

    public void venderMoto(){
        Scanner scanner = new Scanner(System.in);
        for (EnumMoto motosLista : EnumMoto.values()) {
            System.out.println(motosLista);
        }
        System.out.print("\nDigite o modelo da moto que quer vender: ");
        String modelo = scanner.next();
        boolean validacao = false;
        for (EnumMoto motos : EnumMoto.values()) {
            if (modelo.equals(motos.modelo)) {
                validacao = true;
                break;
            }else {
                validacao = false;
                break;
            }
        }
        if (validacao != false){
            System.out.println("Moto vendida com sucesso!!!");
        }else {
            System.out.println("Moto não encontrada...:/");
        }
    }
}
