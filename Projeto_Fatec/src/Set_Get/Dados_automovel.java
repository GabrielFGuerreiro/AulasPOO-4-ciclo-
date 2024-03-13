package Set_Get;

import javax.swing.JOptionPane;

public class Dados_automovel
{
	public static void main(String args[])
	{
		//variavel de instancia
		Automovel a = new Automovel();
		
		String md,pr;
		double pc;
		
		md=JOptionPane.showInputDialog("Digite o modelo");
		pr=JOptionPane.showInputDialog("Digite o preço");
		pc=Double.parseDouble(pr);
		
		a.set_modelo(md);
		a.set_preco(pc);

		System.out.println("Modelo: "+a.get_modelo());
		System.out.println("Preço: "+a.get_preco());
	}
}
