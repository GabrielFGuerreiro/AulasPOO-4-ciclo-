package Exercicios;

public class Plano_consulta
{
    public static void main(String args[])
    {
        Plano_de_ensino a = new Plano_de_ensino();
        a.mostradados();

        Plano_de_ensino b = new Plano_de_ensino("Java","Método construtor", "A1 e A2", "Autor1");
        b.mostradados();
    }
}