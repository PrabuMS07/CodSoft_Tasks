package Tasks;
import java.util.*;
public class STUDENT_GRADE_CALCULATOR {
	
	public static void main (String arg[]) {
	Scanner sc = new Scanner(System.in);
	String Name;
	int M1;
	int M2;
	int M3;
	int M4;
	int M5;
	
	System.out.print("Enter The Student Name : ");
	Name = sc.nextLine();
	System.out.print("Enter Student Mark in Tamil : ");
	M1 = sc.nextInt();
	System.out.print("Enter Student Mark in English : ");
	M2 = sc.nextInt();
	System.out.print("Enter Student Mark in Maths : ");
	M3 = sc.nextInt();
	System.out.print("Enter Student Mark in Science : ");
	M4 = sc.nextInt();
	System.out.print("Enter Student Mark in Social Science : ");
	M5 = sc.nextInt();
	
	int Total = M1+M2+M3+M4+M5;
	int Avg = Total/5;
	System.out.println("Total Mark is : "+Total+"/500");
	System.out.println("Average Mark is : "+Avg);
	
	if (Avg >= 90) {
		
		System.out.println("Grade is A ");
	}
	else if (Avg >= 80) {
		System.out.println("Grade is B ");
	}
	else if (Avg >= 70) {
		System.out.println("Grade is c ");
	}
	else if (Avg >= 60) {
		System.out.println("Grade is D ");
	}
	else {
			System.out.println("Grade is E ");	
	}
	
	}
}
