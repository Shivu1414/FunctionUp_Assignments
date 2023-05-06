import java.util.Scanner;
public class evenOddFunction {
	public static void main(String args[]) {
		int input;
		boolean s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number=");
		input=sc.nextInt();
		s=evenOdd(input);
		if(s==true) {
			System.out.println("Number is Even");
		}
		else{
			System.out.println("Number is Odd");
		}
	}
	public static boolean evenOdd(int input){
		boolean s;
		s=(input%2)==0;
		return s;
		
	}

}
