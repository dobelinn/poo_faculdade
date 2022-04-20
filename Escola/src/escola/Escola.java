/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;

/**
 *
 * @author pesquisa
 */
public class Escola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Monitor monitor = new Monitor();
//        monitor.setNome("Monitor");
//        monitor.setSetor("Laboratorios");
        int matricula  = 1234;
        String nome = "Ackley";
        double adicional = 10;
        Professor prof = new Professor(matricula,nome,adicional);
//        prof.setNome("Ackley");;
//        prof.setMatricula(6542);
//        prof.setTitulacao("Doutor");
//        prof.setAdicional(10);
//        prof.setSalario(5000.00);
        System.out.println("Nome do professor: "+prof.getNome());
        System.out.println("Matricula do professor: "+prof.getMatricula());
        System.out.println("Titulação do professor: "+prof.getTitulacao());
        System.out.println("Salario do professor:R$"+prof.getSalario());
        System.out.println("Adicional do professor: "+prof.getAdicional());

        
    }
    
}
