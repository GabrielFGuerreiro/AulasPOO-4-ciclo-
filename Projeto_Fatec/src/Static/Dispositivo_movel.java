package Static;

public class Dispositivo_movel
{
	/*varivel com escopo de instancia:
	pode ser alterada por uma nova instancia*/
	public String numero;
	/*variavel com escopo de classe(static):
	 prevalece o valor da ultima variavel de instancia*/
	public static String user;
	public static int DDD;
	
	public void identifica_numero(String numero) {this.numero=numero;}
	public void identifica_user(String user) {this.user=user;}

}

