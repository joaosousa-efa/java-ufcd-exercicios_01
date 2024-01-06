/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author João Sousa
 */
public class TesteVariaveisEstruturadas {

    public static double calculaMedia(ArrayList<Double> sl) {
        
        Double total = 0.0;
        
        for (int i = 0; i < sl.size(); i++) {
            total = total + sl.get(i);
        }
        return total / sl.size();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // 4 5
        System.out.println("=====================================");
        System.out.println("Exercícios 4 5");

        ArrayList<Double> salarios = new ArrayList<Double>();
        ArrayList<String> nomes = new ArrayList<String>();

        salarios.addAll(Arrays.asList(1000.00, 900.00, 1000.00, 3000.00, 2000.00));
        nomes.addAll(Arrays.asList("Ana", "Bruno", "Carla", "Daniela", "Edu"));

        // 6
        System.out.println("=====================================");
        System.out.println("Exercício 6");
        
        System.out.println("Média dos salários " +  calculaMedia(salarios));
        
        
        // 7 8
        System.out.println("=====================================");
        System.out.println("Exercícios 7 e 8");

        ArrayList<Boolean> salariosPagos = new ArrayList<Boolean>();

        salariosPagos.addAll(Arrays.asList(true, true, true, false, false));

        // 9
        System.out.println("=====================================");
        System.out.println("Exercício 9");
        
        Double totalSalariosPorReceber = 0.0;
        
        for (int i = 0; i < salariosPagos.size(); i++) {
            if (salariosPagos.get(i) == false) {
                totalSalariosPorReceber = totalSalariosPorReceber + salarios.get(i);
            }
        }
        
        System.out.println("Total de salários por receber " + totalSalariosPorReceber);
        
        // 10
        System.out.println("=====================================");
        System.out.println("Exercício 10");
        Integer totaFuncionariosQueJaReceberam = 0;
        
        for (int i = 0; i < salariosPagos.size(); i++) {
            
            if (salariosPagos.get(i) == true) {
                totaFuncionariosQueJaReceberam = totaFuncionariosQueJaReceberam + 1; 
            }
            
        }
        
        System.out.println("Total de funcionários que já receberam: " + totaFuncionariosQueJaReceberam);
        
        
        // 11
        System.out.println("=====================================");
        System.out.println("Exercício 11");
        
        for (int i = 0; i < nomes.size(); i++) {
            
            if (salariosPagos.get(i) == true) {
                System.out.println("O/A funcionário " + nomes.get(i) + " já recebeu.");
            } else {
                System.out.println("O/A funcionário " + nomes.get(i) + " ainda não recebeu.");
            }
            
        }
        
    }
}
