package Static;

public class Identifica_dispositivo
{
	public static void main(String args[])
	{
		//primeira instancia
		Dispositivo_movel a=new Dispositivo_movel();
		a.identifica_numero("13 99655 8666");
		a.identifica_user("Carla");
		
		//segunda instancia
		Dispositivo_movel b=new Dispositivo_movel();
		b.identifica_numero("13 99777 6688");
		b.identifica_user("Giovana");
		
		System.out.println("Numero do telefone"+a.numero);
		System.out.println("Usuario do telefone"+a.user);
		
		System.out.println("Numero do telefone"+b.numero);
		System.out.println("Usuario do telefone"+b.user);
		
		b.DDD=17;
		a.DDD=16;
		
		System.out.println("DDD do telefone"+b.DDD);
		System.out.println("DDD do telefone"+a.DDD);
	}
}
