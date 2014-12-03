package lesson7.video7;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom {
	private List<Student> students = new ArrayList<Student>();
	
	public void enter(Student student){
		students.add(student);
	}
	
	public void leave(Student student){
		students.remove(student);
	}
	
	public int getStudentsCount(){
		return students.size();
	}
	
	public boolean isRecent(Student student){
		
		if (students.contains(student)){
			return true;
		}else{
			return false;
		}
		
		
	}
	
	public void printStudentInfo(Student student){
		for(int i = 0; i < students.size(); i++){
			Student currentStudent = students.get(i);
			if(currentStudent.equals(student)){
				System.out.println("printStudentInfo:");
				System.out.println("StudentName: " + currentStudent.getName());
				System.out.println("StudentLastName: " + currentStudent.getSecondName());
			}
			
			
			
		}
	}
	
	public void getStudents(){
		System.out.println("--------------GET ALL STUDENTS-----------");
		for(int i = 0; i < students.size(); i++){
			Student currentStudent = students.get(i);
				System.out.println("Student" + (i + 1) +  " " + currentStudent.getName() + " " + currentStudent.getSecondName());
				
		}
	}
}
