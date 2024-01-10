/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import exceptions.ValorNumericoInvalidoException;
import exceptions.ValorStringInvalida;
import java.util.logging.Level;
import java.util.logging.Logger;
import semana4.Paiis;

/**
 *
 * @author João Sousa
 * 
 */
public class TestePaiis {
    public static void main(String[] args) {
        
        //Paiis portugal = new Paiis("");
        
        //portugal.setLinguaFalada("Português");
        
        
        //System.out.println("Lingua falada: " + portugal.getLinguaFalada());
    
        Paiis p01 = new Paiis("Português", 10000000, "Marcelo", "Costa", 257391000, "Portugal", "Europa");
        
        
        System.out.println(p01.toString());
        
        System.out.println(p01.getRendimentoPerCapita() + "Mil");
        
        try {
            // provocando um exception

            p01.setNumeroPopulacao(-100);
        } catch (ValorNumericoInvalidoException ex) {
            Logger.getLogger(TestePaiis.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            p01.setNomePrimeiroMinistro("");
        } catch (ValorStringInvalida ex) {
            Logger.getLogger(TestePaiis.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(p01.toString());
    }
 
}
