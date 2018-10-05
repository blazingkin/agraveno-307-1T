import java.util.*;
public class AddTwoNumbers {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int first = s.nextInt();
		System.out.println("And another:");
		int second = s.nextInt();
		System.out.println("The sum of your numbers is "+addTwo(first, second));
	}
	
	public static int addTwo(int first, int second) {
		return first + second;
	}
	
	

}
