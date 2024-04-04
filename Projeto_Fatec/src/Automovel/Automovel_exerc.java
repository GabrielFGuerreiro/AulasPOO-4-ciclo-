/*Modificar a classe Automóvel: encapsular os atributos como private e
inserir os métodos set ( ) e get ( ) para cada um deles. */
package automovel;

public class Automovel_exerc
{
	private String modelo,cor,marca;
	private double preco;
	

   public void setModelo(String modelo) {this.modelo=modelo;}
   public void setCor(String cor) {this.cor=cor;}
   public void setMarca(String marca) {this.marca=marca;}
   public void setPreco(double preco) {this.preco=preco;}

 
   public void Informa_Automovel()
   {
	   System.out.println("Marca do carro: \t" + marca);
	   System.out.println("Modelo:\t" + modelo);
	   System.out.println("Cor do carro: \t" + cor);
	   System.out.println("Preço  do carro: \t" + preco);
   }

}