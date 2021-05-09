import java.util.*;
class Six
{
	public static void main(String args[])
	{
		int a,b, c, d, e, f,g;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first number : ");
		a = sc.nextInt();
		System.out.println("Input second number : ");
		b = sc.nextInt();
		c = a + b;
		System.out.println(+a+ " + " +b+ " = " +c);
		d = a - b;
		System.out.println(+a+ " - " +b+ " = " +d);
		e = a * b;
		System.out.println(+a+ " x " +b+ " = " +e);
		f = a/b;
		System.out.println(+a+ " / " +b+ " = " +f);
		g = a%b;
		System.out.println(+a+ " mod " +b+ " = " +g);
	}
}