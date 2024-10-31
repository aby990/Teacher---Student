public class Student extends Person{
    int studentNumber;
    int score;
    String major;

    public Student() {
        super();
	}

	@Override
	public void print(){
		super.print();
		System.out.println("Student Number : " +studentNumber);
		System.out.println("Score          : " +score);
		System.out.println("Major          : " +major);

	}

}
