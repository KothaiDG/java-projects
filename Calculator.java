import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter two numbers");
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println("sum :" +(a + b));
		System.out.println("difference :"+( a - b));
		System.out.println("Product :"+(a*b));
		System.out.println("Division :" + (a/b));
	}

}
