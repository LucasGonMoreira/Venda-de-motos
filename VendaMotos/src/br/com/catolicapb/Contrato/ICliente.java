package br.com.catolicapb.Contrato;

import br.com.catolicapb.Enumeration.EnumMoto;
import br.com.catolicapb.Model.Vendedor;

public interface ICliente {
    void comprarMoto(Vendedor vendedor);
    void cadastrarCliente();

}
