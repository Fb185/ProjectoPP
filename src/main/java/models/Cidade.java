package models;

public class Cidade {
    private String name;
    private int passageirosNaEstacao;
    private int autocarrosNaEstacao;

    public Cidade() {
        System.out.println("Estacao Braga Operacional");
    }

    public String getName() {
        return this.name;
    }

    public int getPassageirosNaEstacao() {
        return this.passageirosNaEstacao;
    }

    public int getAutocarrosNaEstacao() {
        return this.autocarrosNaEstacao;
    }

}
