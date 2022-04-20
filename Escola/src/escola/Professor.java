/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;


public class Professor extends Funcionario{
    private double adicional;
    private String titulacao;
    
    public Professor(int matricula, String nome, double adicional){
        super(matricula,nome);
        this.adicional = adicional;
        
    }

   
    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

  
    public String getTitulacao() {
        return titulacao;
    }

 
    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
}
