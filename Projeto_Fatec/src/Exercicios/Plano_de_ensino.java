package Exercicios;

public class Plano_de_ensino
{
    private String materia;
    private String cont_prog;
    private String crit_ava;
    private String bibli;

    Plano_de_ensino(){}

    Plano_de_ensino(String materia,String cont_prog,String crit_ava,String bibli)
    {
        this.materia=materia;
        this.cont_prog=cont_prog;
        this.crit_ava=crit_ava;
        this.bibli=bibli;
    }

    public void setmateria(String materia) {this.materia=materia;}
    public void setcont_prog(String cont_prog) {this.cont_prog=cont_prog;}
    public void setcrit_ava(String crit_ava) {this.crit_ava=crit_ava;}
    public void setbibli(String bibli) {this.bibli=bibli;}

    public String getMateria() {return materia;}
    public String getcont_prog() {return cont_prog;}
    public String getcrit_ava() {return crit_ava;}
    public String getbibli() {return bibli;}

    public void mostradados()
    {
        System.out.println("\n"+"materia:" + "\t" + materia + "\n"
        + "cont_prog" + "\t" + cont_prog + "\n" + "crit_ava:" + "\t" + crit_ava + "\n"
        + "bibli" + "\t" + bibli + "\n");
    }
}