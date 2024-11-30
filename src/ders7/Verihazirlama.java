package ders7;

public class Verihazirlama extends Memur {
    protected String gorev;
    
    Verihazirlama(
        String AdSoyad, int Telefon, String Email,
        String Departman, String Mesai,
        String Gorev
    ) {
        super(AdSoyad, Telefon, Email, Departman, Mesai);
        gorev = Gorev;
    }
    
    protected void Yazisma() {
        System.out.println(getDepartman()+" "+getGorev()+" "+getAdSoyad()+" yazisma yapti.");
    }
    
    protected String getGorev() { return gorev; }
    protected void setGorev(String Gorev) { gorev = Gorev; }
}
