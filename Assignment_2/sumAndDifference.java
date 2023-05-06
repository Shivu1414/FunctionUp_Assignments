import java.util.Scanner;
public class sumAndDifference {
	public static void main(String args[]) {
		float num1,num2,sum,difference;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First number=");
		num1=sc.nextFloat();
		System.out.println("Enter First number=");
		num2=sc.nextFloat();
		
		sum=num1+num2;
		System.out.println("Sum of two numbers ="+sum);
		
		difference=num1-num2;
		System.out.println("Difference of two numbers ="+difference);
	}

}
