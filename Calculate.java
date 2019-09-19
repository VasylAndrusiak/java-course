//import java.util.Scanner;
public class Calculate{
	public static void main(String [] args){
int a = Integer.valueOf(args[0]);
int b = Integer.valueOf(args[1]);
double a1 = Double.valueOf(args[2]);
double b1 = Double.valueOf(args[3]);
int sum = a + b;
int dif = a - b;
int div = a / b;
int mul = a * b;
System.out.println("sum = " + sum);
System.out.println("dif = " + dif );
System.out.println("div = " + div );
System.out.println("mul = " + mul );
double sum1 = a1 + b1;
double dif1 = a1 - b1;
double div1 = a1 / b1;
double mul1 = a1 * b1;
System.out.println("sum1 = " + sum1);
System.out.println("dif1 = " + dif1 );
System.out.println("div1 = " + div1 );
System.out.println("mul1 = " + mul1 );

	}
}