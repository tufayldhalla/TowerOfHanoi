import java.util.Scanner;

/*
 * Tufayl Dhalla
 * 101003562
 */
public class TowerOfHanoi {

	//Method to solve the tower of hanoi problem using recursion 
	public static int solveTowers(int n, char source, char destination, char spare, int instructionNumber) {
		//If 1 disk
		if (n == 1) {
			instructionNumber++;
			//Output statement telling user where to move disk 1
			System.out.println(instructionNumber + "." + " Move disk 1 from " + source + " to " + destination);
		}
		else {
			//Recalling method to move block from source to spare
			instructionNumber = solveTowers(n-1,source,spare,destination,instructionNumber);
			instructionNumber++;
			//Output statement telling user where to move current block
			System.out.println(instructionNumber + "." + " Move disk " + n + " from " + source + " to " + destination);
			//Recalling method to move block from spare to destination
			instructionNumber = solveTowers(n-1,spare,destination,source,instructionNumber);
		}
		
		return instructionNumber;
	}
	
	public static void main(String[] args) {
		
		//n = number of disks
		int n = 0;
		//f = first post name (source)
		char f = ' ';
		//s = second post name (spare)
		char s = ' ';
		//t = third post name (destination)
		char t = ' ';
		
		//Scanner to read user inputs
		Scanner var1 = new Scanner(System.in);
		
		//Asking for n number of disks
		System.out.print("Enter a number of disks: ");
		n = var1.nextInt();
		
		//Asking for character for source post
		System.out.print("Enter a character for the first post (source): ");
		f = var1.next().charAt(0);
		
		//Asking for character for spare post
		System.out.print("Enter a character for the second post (spare): ");
		s = var1.next().charAt(0);
		
		//Asking for character for destination post
		System.out.print("Enter a character for the third post (destination): ");
		t = var1.next().charAt(0);
		
		solveTowers(n,f,t,s,0);
		

	}

}
