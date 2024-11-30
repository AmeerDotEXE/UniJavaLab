package ders8.Employee;

public class Worker extends Employee implements Person {
    private String department;
    
    Worker(String _name, String _surName) {
        super(_name, _surName);
        department = "Bilgi İslem";
        setJob("Teknisyen");
        setAnnualPermit(10);
        setSalary(45_000);
    }
    
    protected int makeRaise(int howMuch) {
        int nsalary = getSalary() + howMuch + 10_000;
        return nsalary;
    }
    
    void setDepartment(String _department) { department = _department; }
    String getDepartment() { return department; }

    public void gender(String cins) {
        System.out.println("İsci cinsiyeti: "+cins);
    }
}
