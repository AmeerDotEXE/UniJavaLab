package ders8.Employee;

public class Engineer extends Employee implements Person {
    Engineer() {
        super();
    }
    Engineer(String _name, String _surName) {
        super(_name, _surName);
        setJob("Muhendis");
        setAnnualPermit(10);
    }
    Engineer(String _name, String _surName, int _salary) {
        super(_name, _surName);
        setSalary(_salary);
        if (_salary > 50_000) {
            setJob("Kidemli Muhendis");
            setAnnualPermit(15);
        }
    }
    
    protected int makeRaise(int howMuch) {
        int nsalary = getSalary() + howMuch + 10_000;
        return nsalary;
    }
    
    protected void infoBox() {
        System.out.println("Muhendis adi soyadi: "+getName()+" "+getSurName());
        System.out.println("Muhendis maas: "+getSalary());
        System.out.println("Muhendis yillik izin: "+getAnnualPermit());
    }
    
    protected void test() {
        super.test();
        System.out.println("Engineer sinifi");
    }
    
    public void gender(String cins) {
        System.out.println("Muhendis cinsiyeti: "+cins);
    }
}
