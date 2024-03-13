package encapulamento_2;

import encapsulamento_1.Acesso_numeros;

public class Verifica_encapsulamento_2
{
	public static void main(String args[])
	{
		Acesso_numeros chave=new Acesso_numeros();
		
		/*chave.a=10; ENCAPSULAMENTO package-private não permite
		acessp de fora do pacote*/
		chave.setnumero("a",10);
		chave.b=20;
		/*chave.c=30; Não é possível acessar a var private diretamenta*/
		chave.setnumero("c",30);
		/*chave.d=40; Não é possível acessar a var protected diretamenta*/
		chave.setnumero("d",40);
		
		chave.mostra_numero();			
	}
}
