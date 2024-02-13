
import semana5_heranca.Formando;
import semana5_heranca.FormandoAprendizagem;
import semana5_heranca.FormandoEFA;
import semana5_heranca.FormandoModular;
import semana5_heranca.Turma;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author João Sousa
 */
public class TesteTurmas {
    
    public static void main(String[] args) {
        
        Turma turma = new Turma();
        
        FormandoEFA forEfa = new FormandoEFA();
        forEfa.setNome("Ze");
        forEfa.setNumero(5);
        forEfa.setNotaPra(15);
        turma.AdicionaFormandos(forEfa);
        
        FormandoAprendizagem forApr = new FormandoAprendizagem();
        forApr.setNome("Ana");
        forApr.setNumero(7);
        forApr.setNotaPra(15);
        forApr.setNotaPAF(17);
        turma.AdicionaFormandos(forApr);
        
        FormandoModular forMod = new FormandoModular();
        forMod.setNome("Bruna");
        forMod.setNumero(14);
        forMod.setNotaUFDC(17);
        turma.AdicionaFormandos(forMod);
        
        
        for (int i = 0; i < turma.getFormandos().size(); i++) {
            
            System.out.println(turma.getFormandos().get(i).getNome());
            System.out.println(turma.getFormandos().get(i).toString());
            System.out.println("");
            double notaFinal = turma.getFormandos().get(i).CalculaNotaFinal();
            
            System.out.println("Nota Final:" + notaFinal );
            
        }
    }
    
}
