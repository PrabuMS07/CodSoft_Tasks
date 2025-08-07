package Tasks;
import java.util.*;
public class NUMBER_GAME 
{
	
	public static void main (String arg[]) 
	{
		
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the User Name ");
		String name = sc.nextLine();
		User U = new User(name);
		
		int i = 0;
		while (i<5) 
	   {
			
			int n2 = r.nextInt(100-1+1)+1;
			//generate the number 
			
			System.out.println(n2);
			System.out.println("Enter the guess Number range is between 1 - 100 ");
			int n1 = sc.nextInt();
			boolean Is_win = false;
			if (n1 == n2) {
				System.out.println("Congratulation You Won :) ");
				Is_win = true;
			}
			else if (n2>n1){
				System.out.println("Too Low :( \n Try Again..." );
			}
			else {
				System.out.println("Too High :( \n Try Again..." );
			}
			U.Update(Is_win);
			
			i++;
		}
		
		System.out.println("User Name : "+ U.Name );
		System.out.println("No of Attempt : "+ U.No_of_Attempt );
		System.out.println("Winning Count : "+ U.No_of_Game_Won );
		sc.close();
		
	}
}
	

	

