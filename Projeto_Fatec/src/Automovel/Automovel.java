package Automovel;

public class Automovel
{
	String modelo,cor,marca;
	double preco;
	
	public void Informa_Automovel()
	{
		System.out.println("marca do carro: \t" + marca);
		System.out.println("Modelo: Agile\t" + modelo);
		System.out.println("Cor do carro: \t" + cor);
		System.out.println("Preço  do carro: \t" + preco);
	}
}