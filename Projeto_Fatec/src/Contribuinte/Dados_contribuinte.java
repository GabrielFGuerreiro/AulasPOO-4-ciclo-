package Contribuinte;
public class Dados_contribuinte
{
	private String nome;
	private String CPF;
	private String CNPJ;
	private String cartao;
	
	public void setnome(String nome)
	{
		this.nome=nome;
	}
	
	public void setCPF(String CPF)
	{
		this.CPF=CPF;
	}
	
	public void setCNPJ(String CNPJ)
	{
		this.CNPJ=CNPJ;
	}
	
	public void setcartao(String cartao)
	{
		this.cartao=cartao;
	}	
	
	public String getnome()
	{
		return nome;
	}
	
	public String getCPF()
	{
		return CPF;
	}
	
	public String getCNPJ()
	{
		return CNPJ;
	}
	
	public String getcartao()
	{
		return cartao;
	}
}
