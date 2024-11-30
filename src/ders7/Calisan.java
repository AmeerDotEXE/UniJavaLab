package ders7;

public class Calisan {
	protected String adSoyad;
    protected int telefon;
    protected String email;
    
    Calisan(String AdSoyad, int Telefon, String Email) {
        adSoyad = AdSoyad;
        telefon = Telefon;
        email = Email;
    }
    
    public void giris() { System.out.println(adSoyad+" giris yapti."); }
    public void cikis() { System.out.println(adSoyad+" cikis yapti."); }
    public void yemek() { System.out.println(adSoyad+" yemek yedi."); }
    
    protected String getAdSoyad() { return adSoyad; }
    protected int getTelefon() { return telefon; }
    protected String getEmail() { return email; }
    protected void setAdSoyad(String AdSoyad) { adSoyad = AdSoyad; }
    protected void setTelefon(int Telefon) { telefon = Telefon; }
    protected void setEmail(String Email) { email = Email; }
}
