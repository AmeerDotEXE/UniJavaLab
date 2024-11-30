package ders7;

public class OgretimGorevlisi extends Akademisyen {
    protected String unvan;
    
    OgretimGorevlisi(
        String AdSoyad, int Telefon, String Email,
        String Bolum, String Gorev, String Dersler,
        String Unvan
    ) {
        super(AdSoyad, Telefon, Email, Bolum, Gorev, Dersler);
        unvan = Unvan;
    }
    
    protected void derseGir() { System.out.println(getUnvan()+" "+getAdSoyad()+" derse girdi."); }
    
    protected String getUnvan() { return unvan; }
    protected void setUnvan(String Unvan) { unvan = Unvan; }
}
