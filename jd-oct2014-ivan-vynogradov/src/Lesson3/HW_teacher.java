package Lesson3;

public class HW_teacher {

	public static void main(String[] args) {

		String[][] trainee = { { "1", "Vasia", "Pupkin" },
				{ "2", "Ivan", "Vinogradov" }, { "3", "Semen", "Igorov" } };
		String[][] subjects = { { "1", "JAVA", "10" }, { "2", "Linux", "20" },
				{ "3", "C++", "5" } };
		int[][] grades = { { 1, 1, 5 }, { 1, 2, 4 }, { 1, 3, 5 }, { 2, 1, 4 },
				{ 2, 2, 5 }, { 2, 3, 4 }, { 3, 1, 5 }, { 3, 2, 5 }, { 3, 3, 3 } };
//		showTraineeInfo(Trainee);
//		showSubjectsInfo(Subjects);
		showGrades(trainee, subjects, grades, "Pupkin");
		showGrades(trainee, subjects, grades, "Igorov");
//		showSubjectGrades(subjects, grades, 3);
//		showGradesArrayById(grades, 3);
//		System.out.println(getGrade(grades, 1, 2));
	}
	
static void showGrades(String[][] trainee, String[][] subjects, int[][] grades, String lastname){
		int traineeId = 0;
		for(int i = 0; i < trainee.length; i++){
			for(int j = 0; j < trainee[i].length; j++){
				if(trainee[i][2].equals(lastname)){
					System.out.print(trainee[i][j] + " ");
					traineeId = Integer.parseInt(trainee[i][0]);
					
				}
			}
			//System.out.println();
			
		}
		System.out.println();
		//System.out.println();
		for(int i = 0; i < subjects.length; i++){
			//System.out.println("TEST:" + Integer.parseInt(subjects[i][0]));
			System.out.println(subjects[i][1] + " " + getGrade(grades, traineeId, Integer.parseInt(subjects[i][0])));
		}
		
	}

	static int getGrade(int[][] grades, int traineeId, int subjectId){
			int grade = 0;
		for(int i = 0; i < grades.length; i++){
				//System.out.println(grades[i][0]);
//				System.out.println(grades[i][1]);
				if(grades[i][0] == traineeId && grades[i][1] == subjectId){
					grade = grades[i][2];
				}
			
		}
		return grade;
		
	}

//	static void showTraineeInfo(String[][] Trainee) {
//		for (String[] i : Trainee) {
//			for (String j : i) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
//	}
//
//	static void showSubjectsInfo(String[][] subjects, int id) {
//		for(int i = 0; i < subjects.length; i++){
//			for(int j = 0; j < subjects[i].length; j++){
//				if(id == Integer.parseInt(subjects[i][1])){
//					System.out.print(subjects[i][j] + " ");}
//			}
//			System.out.println();
//		}
//	}
//	
//	static void showSubjectsInfo(String[][] subjects, int[][] grades, int id) {
//		for (String[] i : subjects) {
//			for (String j : i) {
//				System.out.print(j + " ");
//			}
//			showGradesArrayById(grades, id);
//			System.out.println();
//		}
//	}
//	
//	static void showSubjectGrades(String[][] subjects, int[][] grades, int id){
//		
//		for (String[] i : subjects) {
//			for (String j : i) {
//				System.out.print(j + " " );
//			}
//			
//			System.out.println();
//		}
//	}
//	
//	static void showGradesArray(int[][] grades){
//		for (int[] i : grades) {
//			for (int j : i) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
//	}
//	
//	static void showGradesArrayById(int[][] grades, int id){
//		for(int i = 0; i < grades.length; i++){
//				if(id == grades[i][2]){
//					System.out.print(grades[i][2] + " ");
//			}
//			//System.out.println();
//		}
//	}
//	// Fuck
	
	
	static void setGrade() {

	}

}
