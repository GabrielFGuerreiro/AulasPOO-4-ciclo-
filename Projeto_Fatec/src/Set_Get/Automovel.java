package Set_Get;

public class Automovel
{
	//atributos
	private String modelo;
	private double preco;
	
	//métodos sett
	public void set_modelo(String modelo)
	{
		this.modelo=modelo;
	}
	public void set_preco(double preco)
	{
		this.preco=preco;
	}
	
	//métodos get
	public String get_modelo()
	{
		return modelo;
	}
	public double get_preco()
	{
		return preco;
	}
}
