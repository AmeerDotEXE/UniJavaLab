package ders7;

public class Guvenlik extends Memur {
    protected String belge;
    
    Guvenlik(
        String AdSoyad, int Telefon, String Email,
        String Departman, String Mesai,
        String Belge
    ) {
        super(AdSoyad, Telefon, Email, Departman, Mesai);
        belge = Belge;
    }
    
    protected String getBelge() { return belge; }
    protected void setBelge(String Belge) { belge = Belge; }
}
