public class Fulltime extends Teacher{
    int anualSalary;
    String unit;

    public Fulltime() {
        super();
        anualSalary = 0;
        unit = "";
    }

    public Fulltime(String name, int age, String subject, int anualSalary, String unit) {
        super(name, age, subject);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Annual Salary  : " +anualSalary);
        System.out.println("Unit           : " +unit);
    }
    
}
