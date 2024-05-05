package br.com.catolicapb.Enumeration;

public enum EnumMoto {
    YamahaMT09("YamahaMT09"),
    YamahaMT03("YamahaMT03"),
    HondaCB650F("HondaCB650F"),
    HondaCB1000("HondaCB1000"),
    BmwS1000RR("BmwS1000RR");

    public String modelo;

    EnumMoto(String modelo){
        this.modelo = modelo;
    }
}
