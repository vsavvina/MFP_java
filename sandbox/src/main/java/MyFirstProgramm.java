public class MyFirstProgramm
{
	public static void main (String[] args)
	{
		Kvadrat s = new Kvadrat(6);//создали объект типа Kvadrat
		System.out.println("Площадь квадрата со стороной "+ s.l + " = " + s.ploshad());
	}
}