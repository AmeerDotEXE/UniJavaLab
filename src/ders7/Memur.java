package ders7;

public class Memur extends Calisan implements Devlet {
    protected String departman;
    protected String mesai;
    protected int sicilNo;
    
    Memur(
        String AdSoyad, int Telefon, String Email,
        String Departman, String Mesai
    ) {
        super(AdSoyad, Telefon, Email);
        departman = Departman;
        mesai = Mesai;
    }
    
    
    protected void calls() {
        System.out.println(getDepartman()+" "+getAdSoyad()+" "+getMesai()+" calisiyor.");
    }
    
    public int getSicilNo() { return sicilNo; }
    public void setSicilNo(int SicilNo) { sicilNo = SicilNo; }

    protected String getDepartman() { return departman; }
    protected String getMesai() { return mesai; }
    protected void setDepartman(String Departman) { departman = Departman; }
    protected void setMesai(String Mesai) { mesai = Mesai; }
}
