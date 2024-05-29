package livros_heranca_poli;

public class Tipo_acao extends Tipo_romance
{
    Tipo_acao(String a)
    {
        super(a);
    }

    public void Consulta_livros()
    {
        System.out.println("Ação");
    }
}
