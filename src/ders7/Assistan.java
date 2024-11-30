package ders7;

public class Assistan extends Akademisyen {
    protected String yuksekOgretim;
    
    Assistan(
        String AdSoyad, int Telefon, String Email,
        String Bolum, String Gorev, String Dersler,
        String YuksekOgretim
    ) {
        super(AdSoyad, Telefon, Email, Bolum, Gorev, Dersler);
        yuksekOgretim = YuksekOgretim;
    }
    
    protected void labaGir() {
        System.out.println(getYuksekOgretim()+" "+getAdSoyad()+" laba girdi.");
        
    }
    
    protected String getYuksekOgretim() { return yuksekOgretim; }
    protected void setYuksekOgretim(String YuksekOgretim) { yuksekOgretim = YuksekOgretim; }
}
