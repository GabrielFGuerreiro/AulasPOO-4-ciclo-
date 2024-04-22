package Secretaria;

public class Matricula extends Quarto_ciclo_ADS
{
    public static void main(String [] args)
    {
        Quarto_ciclo_ADS E = new Quarto_ciclo_ADS();

        E.setMatricula("RA122000");
        System.out.println("Matrícula: \t" + E.getMatricula());
    }
}
