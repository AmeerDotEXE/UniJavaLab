package ders8.Employee;

public class Employee {
    private String name;
    private String surName;
    private String job;
    private int salary;
    private int annualPermit;
    
    Employee() {}
    Employee(String _name, String _surName) {
        name = _name;
        surName = _surName;
        job = "Caliskan";
        salary = 30_000;
        annualPermit = 10;
    }
    Employee(String _name, String _surName, int _salary) {
        this(_name, _surName); // bunu kullanarak bir usteki constructor kullanir
        salary = _salary;
        if (salary > 30_000) {
            job = "Kidemli Caliskan";
            annualPermit += 5;
        }
    }
    
    void setName(String Name) { name = Name; }
    String getName() { return name; }
    void setSurName(String SurName) { surName = SurName; }
    String getSurName() { return surName; }
    void setJob(String Job) { job = Job; }
    String getJob() { return job; }
    void setSalary(int Salary) { salary = Salary; }
    int getSalary() { return salary; }
    void setAnnualPermit(int AnnualPermit) { annualPermit = AnnualPermit; }
    int getAnnualPermit() { return annualPermit; }
    
    protected int makeRaise(int howMuch) {
        int nsalary = salary + howMuch;
        return nsalary;
    }
    protected void infoBox() {
        System.out.println("Calisan adi soyadi: "+getName()+" "+getSurName());
        System.out.println("Calisan maas: "+getSalary());
        System.out.println("Calisan yillik izin: "+getAnnualPermit());
    }
    protected void test() {
        System.out.println("Employee sinifi");
    }
}
