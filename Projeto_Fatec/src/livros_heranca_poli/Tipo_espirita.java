package livros_heranca_poli;

public class Tipo_espirita extends Tipo_romance
{
    Tipo_espirita(String f)
    {
        super(f);
    }
    public void Consulta_livros()
    {
        System.out.println("Espírita");
    }
}
