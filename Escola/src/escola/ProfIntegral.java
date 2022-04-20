package escola;


public class ProfIntegral extends Professor{
   private int horasAtividade;
   private int atividades;

    public ProfIntegral(int matricula, String nome, double adicional, int horasAtividade) {
        super(matricula, nome, adicional);
        this.horasAtividade = horasAtividade;
    }
}
