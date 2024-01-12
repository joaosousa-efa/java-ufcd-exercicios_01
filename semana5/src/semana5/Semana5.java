/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana5;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author João Sousa
 */
public class Semana5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // pais 
        Paiis p = new Paiis("português", 10000000, "Marcelo", "Costa", 250000000, "Portugal", "Europa");
        
        
        // cidades
        
        Cidade c01 = new Cidade("Braga", "Ze", 20000, 10, false);
        ArrayList<String> c01_rios = new ArrayList<>(Arrays.asList("rio_aaa", "rio_abc"));
        c01.setNomeDosRios(c01_rios);
        p.addCidade(c01);
        
        Cidade c02 = new Cidade("Porto", "To", 50000, 30, false);
        ArrayList<String> c02_rios = new ArrayList<>(Arrays.asList("rio_aaa"));
        c01.setNomeDosRios(c02_rios);
        p.addCidade(c02);
        
        Cidade c03 = new Cidade("Viana", "Dino", 10000, 30, true);
        ArrayList<String> c03_rios = new ArrayList<>();
        c01.setNomeDosRios(c03_rios);
        p.addCidade(c03);
        
        System.out.println("Cidade mais populosa: " + p.cidadeMaisPopulosa());
        System.out.println("Cidade menos populosa: " + p.cidadeMenosPopulosa());
        System.out.println("Cidade com mais rios: " + p.cidadeAtravessadaMaisRios());
        
        if (p.paiisTemCostaMaritima()) {
            
            System.out.println("O país tem costa marítima.");
        } else {
            System.out.println("O país tem não costa marítima.");
        }
        
        
        
    }
    
}
