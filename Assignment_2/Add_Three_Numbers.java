import java.util.Scanner;
public class Add_Two_Numbers {
	public static void main(String args[]) {
		float num1, num2, num3, result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First number=");
		num1=sc.nextFloat();
		System.out.println("Enter Second number=");
		num2=sc.nextFloat();
		System.out.println("Enter Third number=");
		num3=sc.nextFloat();
		
		result=num1+num2+num3;
		System.out.println("Sum of three numbers ="+result);
	}

}
