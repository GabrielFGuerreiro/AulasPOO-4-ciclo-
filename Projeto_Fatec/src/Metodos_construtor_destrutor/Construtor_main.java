package Metodos_construtor_destrutor;

public class Construtor_main
{
	public static void main(String args[])
	{
		Construtor a = new Construtor();
		a.mostradados();
		
		Construtor b = new Construtor(1977,"Voljswagen", "Fusca", 3888.00);
		b.mostradados();
		
	}
}