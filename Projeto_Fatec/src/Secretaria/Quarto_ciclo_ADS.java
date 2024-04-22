package Secretaria;

public class Quarto_ciclo_ADS extends Secretaria_escolar
{
    public static void main(String[] args)
    {
        Secretaria_escolar  A = new Secretaria_escolar();
        Insere_Dados(A); 

        Secretaria_escolar B = new Secretaria_escolar("Maria",22,7.7,"ADS");
        Insere_Dados(B);
    }

    public static void Insere_Dados(Secretaria_escolar C) 
    {
        System.out.println("Nome do aluno: \t" + C.getNome() + "\nIdade do aluno: \t" + C.getIdade() +
        "\nMédia do aluno: \t" + C.getMedia() + "\nCurso do aluno: \t" + C.getCurso());            
    }
}