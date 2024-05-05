package br.com.catolicapb.Enumeration;

public enum EnumMes {
    JANEIRO("JANEIRO"),
    FEVEREIRO("FEVEREIRO"),
    MARCO("MARCO"),
    ABRIL("ABRIL"),
    MAIO("MAIO"),
    JUNHO("JUNHO"),
    JULHO("JULHO"),
    AGOSTO("AGOSTO"),
    SETEMBRO("SETEMBRO"),
    OUTUBRO("OUTUBRO"),
    NOVEMBRO("NOVEMBRO"),
    DEZEMBRO("DEZEMBRO");

    public String mes;

    EnumMes(String mes){
        this.mes = mes;
    }
}
