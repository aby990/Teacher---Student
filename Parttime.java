public class Parttime extends Teacher {
    int hoursWorked;

    public Parttime() {
        super();
    }
    
    public int setSalary() {
        return hoursWorked*15000;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Hours Worked   : " +hoursWorked);
        System.out.println("Salary         : " +setSalary());
    }

}
