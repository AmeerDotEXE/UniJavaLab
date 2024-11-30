package ders7;

public class UniversityAuditTest {

	public static void main(String[] args) {
		// NOTE we used a schema (UML Diagram) for this
		// so names are kept in Turkish Language.
		
		Calisan c1 = new Calisan("Ahmet Mehmet", 1111, "aa@ibu.edu.tr");
        c1.giris();
        
        Akademisyen a1 = new Akademisyen(
            "hasan", 1112, "h@ibu.edu.tr",
            "bil muh.", "Akademisyen", "OOP"
        );
        a1.derseGir();
        a1.giris();
        
        OgretimGorevlisi o1 = new OgretimGorevlisi(
            "huseyin", 1113, "hu@ibu.edu.tr",
            "bil muh.", "Akademisyen.", "OOP",
            "Prof.Dr."
        );
        System.out.println(o1.getUnvan()+" "+o1.getAdSoyad()+" "+o1.getTelefon()+" "+o1.getGorev());
        o1.giris();
        o1.setSicilNo(122124455);
        System.out.println("sicil nosu: "+o1.getSicilNo());
	}

}
