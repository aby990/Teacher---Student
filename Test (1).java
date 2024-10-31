import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Pilih Teacher / Student");
        System.out.println("1 untuk Teacher");
        System.out.println("2 untuk Student");
        int pilihan = in.nextInt();

        if (pilihan == 1) {
            System.out.println("Anda telah memilih Teacher");
            System.out.println("Pilih tipe Teacher :");
            System.out.println("1 untuk FullTime");
            System.out.println("2 untuk PartTime");
            int teacherType = in.nextInt();
            in.nextLine();
            if (teacherType == 1) {
                Fulltime fullTimeTeacher = new Fulltime();
                System.out.println("Name          : ");
                fullTimeTeacher.name = in.next();
                System.out.println("Age           : ");
                fullTimeTeacher.age = in.nextInt();
                System.out.println("Subject       : ");
                fullTimeTeacher.subject = in.next();
                System.out.println("Unit          : ");
                fullTimeTeacher.unit = in.next();
                System.out.println("Annual Salary : ");
                fullTimeTeacher.anualSalary = in.nextInt();
                System.out.println("--------------------------------");
                System.out.println("     DATA TEACHER, FULL TIME    ");
                System.out.println("--------------------------------");
                fullTimeTeacher.print();
            } else if (teacherType == 2) {
                Parttime partTimeTeacher = new Parttime();
                System.out.println("Name         : ");
                partTimeTeacher.name = in.next();
                System.out.println("Age          : ");
                partTimeTeacher.age = in.nextInt();
                System.out.println("Subject      : ");
                partTimeTeacher.subject = in.next();
                System.out.println("Hours Worked : ");
                partTimeTeacher.hoursWorked = in.nextInt();
                System.out.println("--------------------------------");
                System.out.println("     DATA TEACHER, PART TIME    ");
                System.out.println("--------------------------------");
                partTimeTeacher.print();
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        } else if (pilihan == 2) {
            Student murid = new Student();
            System.out.println("Name           : ");
            murid.name = in.next();
            System.out.println("Age            : ");
            murid.age = in.nextInt();
            System.out.println("Student number : ");
            murid.studentNumber = in.nextInt();
            System.out.println("Score          : ");
            murid.score = in.nextInt();
            System.out.println("Major          : ");
            murid.major = in.next();
            System.out.println("--------------------------------");
            System.out.println("           DATA STUDENT         ");
            System.out.println("--------------------------------");
            murid.print();
            
        } else {
            System.out.println("Pilihan tidak valid");
        }

        in.close();
    }
}
