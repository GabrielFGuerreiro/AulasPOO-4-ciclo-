package livros_heranca_poli;

public class Tipo_romance extends Livro
{
    Tipo_romance(String b)
    {
        super(b);
    }
    public void Consulta_livros()
    {
        System.out.println("Romance");
    }
}
