public class Rettangolo implements Forma {

    public String nomeForma;

    public double base;

    public double altezza;

    public Rettangolo(String nomeForma, double base, double altezza) {
        this.nomeForma = nomeForma;
        this.base = base;
        this.altezza = altezza;
    }

    public String getNomeForma() {
        return nomeForma;
    }

    public void setNomeForma(String nomeForma) {
        this.nomeForma = nomeForma;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public void calcolaArea(){
        System.out.println(getAltezza() * getBase());
    }
}

