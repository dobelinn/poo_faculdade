/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;

public class Monitor extends Funcionario{
    private String setor;
    private String turno;
    
      public Monitor(int matricula,String nome, String setor){
        super(matricula,nome);
        this.setor = setor;
        this.turno = turno;
        
    }
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getTurno() {
        return turno;
    }


    public void setTurno(String turno) {
        this.turno = turno;
    }
    
}
