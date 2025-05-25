package assignments;

public class Assignment2_array {

	public static void main(String[] args) {
		
		String [] sem1= {"Mathematics I","Physics","Chemistry","Computer Programming","Engineering Drawing","Basic Electrical Eng."};
		
		String [] status1 = {"Pass(78)","Pass(85)","Fail(21)","Pass(74)","Pass(88)","Pass(79)"};
		
		String [] [] result1 = {sem1, status1};
		
		System.out.println(result1 [1][3]);
		
		//Print Semester 2 Subject 4 and Subject 5 names.
		
		String [] sem2 = {"Mathematics II","Mechanics","EnvironmentalSci.","Basic Electronics","Engineering Physics","Engineering Graphics"};
		
		String [] Status2 = {"Pass(82)","Pass(77)","Pass(93)","Fail(19)","Fail(24)","Pass(90)"};
		
		String [] [] result2 = {sem2,Status2};
		System.out.print(result2 [0][3]);
		System.out.println(result2 [0][4]);

		//Print the Status/Marks of Semester 4 Subject 3 and Subject 6.
		
		String [] sem4 = {"Algorithms","ComputerComputerNetworks","DatabaseSystems","Microprocessors","Communication Eng.","Software Engineering"};
		
		String [] Status4 = {"Pass(91)","Pass(73)","Fail(19)","Pass(80)","Pass(76)","Pass(87)"};
		
		String [] [] result4 = {sem4,Status4};
		
		System.out.print(result4 [0][2]);
		System.out.println(result4 [0][5]); 
		
		
		
		//Semesters as the first dimension.
		
		//1 D array
		String Semester [] = {"Sem 1", "Sem 2", "Sem 3","Sem 4","Sem 5"};
		
		//2 D array  of sem 1
		String [] SEM1 = {"Mathematics I","Physics","Chemistry","Computer Programming","Engineering Drawing","Basic Electrical Eng."};
		
		String [] Marks1 = {"Pass(78)","Pass(85)","Fail(21)","Pass(74)","Pass(88)","Pass(79)"};
		
		String array2 [] [] = {SEM1,Marks1};
		
		// 2D array of sem2

		String [] SEM2 = {"Mathematics II","Mechanics","EnvironmentalSci.","Basic Electronics","Engineering Physics","Engineering Graphics"};
		String [] MARKS2 = {"Pass(82)","Pass(77)","Pass(93)","Fail(19)","Fail(24)","Pass(90)"};
		
		String [] [] array3 = {SEM2,MARKS2};
		
		// 3D array 
		String [] [] [] Result3 = {array2,array3};
		
		System.out.println(Result3 [0][1][1]);
		
	
}
}
