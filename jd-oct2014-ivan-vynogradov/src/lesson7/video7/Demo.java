package lesson7.video7;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("Ivan", "Vinogradov");
		Student student2 = new Student("Ivan", "Smirnov");
		Student student3 = new Student("Natalia", "Trofimchyk");
		Student student4 = new Student("Natalia", "Sverdlova");
		Student student5 = new Student("Petr", "Stepenenko");
		Student student6 = new Student("Tatiana", "Shevchenko");
		
		ClassRoom classRoom = new ClassRoom();
		classRoom.enter(student1);
		classRoom.enter(student2);
		classRoom.enter(student3);
		classRoom.enter(student4);
		classRoom.enter(student5);
		classRoom.enter(student6);
		
		System.out.println("getStudentsCount:" + classRoom.getStudentsCount());
		classRoom.leave(student5);
		System.out.println("getStudentsCount:" + classRoom.getStudentsCount());
		
		System.out.println("Ivan Vinogradov is recent?" + classRoom.isRecent(student1) );
		classRoom.printStudentInfo(student3);
		
		classRoom.getStudents();
	}

}
