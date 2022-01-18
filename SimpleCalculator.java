package Pratham1;
import java.util.*;
public class SimpleCalculator {
	public static void main(String[] args) {
		double a, b, c;
		char operator;
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose an operator");
		System.out.println("Addition enter '+'");
		System.out.println("Substraction enter '-'");
		System.out.println("Multiplication enter '*'");
		System.out.println("Division enter '/'");
		operator = sc.next().charAt(0);
		a=sc.nextDouble();
		System.out.print("");
		b=sc.nextDouble();
		System.out.print("");
		
	    switch (operator) {
	    case '+':
	    	c=a+b;
	    	System.out.println(c);
	    	break;
	    case '-':
	    	c=a-b;
	    	System.out.println(c);
	    	break;
	    case '*':
	    	c=a*b;
	    	System.out.println(c);
	    	break;
	    case '/':
	    	c=a/b;
	    	System.out.println(c);
	    	break;
	    default:
	    	System.out.println("Please select given operators");
	    	break;
	    }
	    sc.close();
	}

}
