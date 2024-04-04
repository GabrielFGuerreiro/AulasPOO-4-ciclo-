package Exercicios;

public class Plano_consulta
{
    public static void  main(String[] args)
    {
        Plano_de_ensino plano1 = new Plano_de_ensino();

        plano1.setMat("Matéria1");
        plano1.setCont("Conteúdo1");
        plano1.setAva("A1+A2");
        plano1.setBibli("Autor1");

        System.out.println(plano1.getMat()); 
        System.out.println(plano1.getCont());
        System.out.println(plano1.getAva());
        System.out.println(plano1.getBibli());

     
        Plano_de_ensino plano2 = new Plano_de_ensino("Matéria2","Conteúdo2","T1 e A2","Autor 2");

       
        System.out.println(plano2.getMat()); 
        System.out.println(plano2.getCont());
        System.out.println(plano2.getAva());
        System.out.println(plano2.getBibli());
    }
}

