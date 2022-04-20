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
        int horasAtividadeProfIntegral = 12;
        int quantidadeAulasProfHorista = 15;
        int valorAulaProfHorista = 35;


        //Professor prof = new Professor(matricula,nome,adicional);
        //Funcionario func = new Funcionario(matricula, nome);    
        ProfIntegral profIntegral = new ProfIntegral(matricula, nome, adicional, horasAtividade);
        ProfHorista profHorista = new ProfHorista(matricula, nome, adicional, quantidadeAulasProfHorista, valorAulaProfHorista);
//        prof.setNome("Ackley");;
//        prof.setMatricula(6542);
//        prof.setTitulacao("Doutor");
//        prof.setAdicional(10);
//        prof.setSalario(5000.00);
        System.out.println("Nome do professor: "+profIntegral.getNome());
        System.out.println("Matricula do professor: "+profIntegral.getMatricula());
        System.out.println("Titulação do professor: "+profIntegral.getTitulacao());
        System.out.println("Salario do professor:R$"+profIntegral.getSalario());
        System.out.println("Adicional do professor: "+profIntegral.getAdicional());

        System.out.println("Nome do professor: "+profHorista.getNome());
        System.out.println("Matricula do professor: "+profHorista.getMatricula());
        System.out.println("Titulação do professor: "+profHorista.getTitulacao());
        System.out.println("Salario do professor:R$"+profHorista.getSalario());
        System.out.println("Adicional do professor: "+profHorista.getAdicional());

        System.out.println(profIntegral);
        System.out.println(profHorista);
        
    }
    
}
