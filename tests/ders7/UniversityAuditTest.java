package ders7;

import static org.junit.Assert.*;

import org.junit.Test;

public class UniversityAuditTest {

	@Test
	public void test() {
        Calisan c1 = new Calisan("Ahmet", 111, "a@ibu.edu.tr");
        Akademisyen a1 = new Akademisyen(
            "Mehmet", 112, "h@ibu.edu.tr",
            "bil muh.", "Akademisyen", "OOP"
        );
        OgretimGorevlisi o1 = new OgretimGorevlisi(
            "Huseyin", 113, "hu@ibu.edu.tr",
            "bil muh.", "Akademisyen", "OOP",
            "Prof.Dr."
        );
        Assistan as1 = new Assistan(
            "Hassan", 114, "ha@ibu.edu.tr",
            "bil muh.", "Akademisyen", "OOP",
            "microchips"
        );
        Memur m1 = new Memur(
            "Mahmut", 115, "m@ibu.edu.tr",
            "kapi", "sabah"
        );
        Guvenlik g1 = new Guvenlik(
            "Nur", 116, "n@ibu.edu.tr",
            "kapi", "gece", "takdir"
        );
        Verihazirlama v1 = new Verihazirlama(
            "James", 117, "j@ibu.edu.tr",
            "saglik", "sabah", "belgeler"
        );

        c1.giris();
        c1.cikis();
        c1.yemek();
        assertEquals("Ahmet", c1.getAdSoyad());
        assertEquals(111, c1.getTelefon());
        assertEquals("a@ibu.edu.tr", c1.getEmail());
        
        a1.giris();
        a1.derseGir();
        a1.setSicilNo(3_112);
        assertEquals("Mehmet", a1.getAdSoyad());
        assertEquals(112, a1.getTelefon());
        assertEquals("h@ibu.edu.tr", a1.getEmail());
        assertEquals("bil muh.", a1.getBolum());
        assertEquals("Akademisyen", a1.getGorev());
        assertEquals("OOP", a1.getDersler());
        assertEquals(3_112, a1.getSicilNo());
        
        o1.derseGir();
        o1.setSicilNo(3_113);
        assertEquals("Prof.Dr.", o1.getUnvan());
        assertEquals(3_113, o1.getSicilNo());

        as1.labaGir();
        assertEquals("microchips", as1.getYuksekOgretim());

        m1.giris();
        m1.calls();
        m1.setSicilNo(3_115);
        assertEquals("kapi", m1.getDepartman());
        assertEquals("sabah", m1.getMesai());
        assertEquals(3_115, m1.getSicilNo());
        
        assertEquals("takdir", g1.getBelge());

        v1.Yazisma();
        assertEquals("belgeler", v1.getGorev());
	}

}
