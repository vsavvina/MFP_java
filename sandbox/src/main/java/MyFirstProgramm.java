public class MyFirstProgramm
{
//	public static void main (String[] args)
//	{
//		chislo(6);
//	}
//	public static void chislo(int cifra)
//	{
//		System.out.println("Введено число "+ cifra);
//	}
	public static void main (String[] args)
	{
		int sm = 6;
		double a = 2;
		double b = 7;
		System.out.println("Площадь квадрата со стороной "+ sm + " = " + ploshad(sm));
		System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = "+ ploshad(a, b));
	}
	public static int ploshad(int s)
	{
		return s*s;
	}
	public static double ploshad(double c, double z)
	{
		return c*z;
	}
}