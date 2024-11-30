package ders7;

public class Akademisyen extends Calisan implements Devlet {
    protected String bolum;
    protected String gorev;
    protected String dersler;
    protected int sicilNo;
    
    Akademisyen(
        String AdSoyad, int Telefon, String Email,
        String Bolum, String Gorev, String Dersler
    ) {
        super(AdSoyad, Telefon, Email);
        bolum = Bolum;
        gorev = Gorev;
        dersler = Dersler;
    }
    
    public void giris() {
        System.out.println(getGorev()+" "+getAdSoyad()+" giris yapti.");
    }

    protected void derseGir() {
        System.out.println(getGorev()+" "+getAdSoyad()+" "+getDersler()+" dersine girdi.");
    }
    
    public int getSicilNo() { return sicilNo; }
    public void setSicilNo(int SicilNo) { sicilNo = SicilNo; }
    
    protected String getBolum() { return bolum; }
    protected String getGorev() { return gorev; }
    protected String getDersler() { return dersler; }
    protected void setBolum(String Bolum) { bolum = Bolum; }
    protected void setGorev(String Gorev) { gorev = Gorev; }
    protected void setDersler(String Dersler) { dersler = Dersler; }
}
