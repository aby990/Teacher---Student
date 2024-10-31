public class Teacher extends Person {
    String subject;
    int yearIn;

    //access_modifier tipe data atau method
    public Teacher() {
        super();
    }

    public Teacher(String name, int age, String subject) {
        super();
    }

    @Override
	public void print(){
		super.print();
		System.out.println("Subject  : " +subject);

    
    }

}
