package Contribuinte;
public class Informa_dados
{
	public static void	main(String [] args)
	{
		Dados_contribuinte a = new Dados_contribuinte();
		a.setnome("Daniela Bento");
		a.setCPF("065.887.443-54");
		a.setCNPJ("776 998 /0001");
		a.setcartao("776-J");
		
	System.out.println("Nome do contribuinte " + a.getnome());
	System.out.println("CPF do contribuinte " + a.getCPF());
	System.out.println("CNPJ do contribuinte " + a.getCNPJ());
	System.out.println("Cartão do contribuinte " + a.getcartao());
	}
}
