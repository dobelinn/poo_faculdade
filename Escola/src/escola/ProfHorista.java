package escola;


public class ProfHorista extends Professor{
private int quantAulas;
private int valorAula;

    public ProfHorista(int matricula, String nome, double adicional, int quantAulas, int valorAula) {
        super(matricula, nome, adicional);
        this.quantAulas = quantAulas;
        this.valorAula = valorAula;
    }

}
