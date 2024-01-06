/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana2;

import java.util.List;

/**
 *
 * @author João Sousa
 * 
 */
public class TesteVariaveisEstruturadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // 3 e 4
        System.out.println("=====================================");
        System.out.println("Exercícios 3 e 4");
        System.out.println("Declaração de variáveis.");
        Double salarioP1 = 1000.0;
        Double salarioP2 = 2000.0;
        Double salarioP3 = 3000.0;
        
        // 5
        System.out.println("=====================================");
        System.out.println("Exercício 5");
        Double mediaSalarios = (salarioP1 + salarioP2 + salarioP3) / 3;
        
        
        System.out.println("A média de salários é: " + mediaSalarios);
        
        // 6
        System.out.println("=====================================");
        System.out.println("Exercício 6");
        Double salarioTopo = 0.0;
        
        
        if (salarioP1 > salarioTopo) {
            salarioTopo = salarioP1;
        }
        if (salarioP2 > salarioTopo) {
            salarioTopo = salarioP2;
        }
        if (salarioP3 > salarioTopo) {
            salarioTopo = salarioP3;
        }
        
        
        System.out.println("O salário mais alto é o de: " +  salarioTopo);
        
        // 7
        System.out.println("=====================================");
        System.out.println("Exercícios 7");
        String nomeAdministradorEmpresa = "Elon Musk";
        
        Integer nLetras = 0;
        
        nLetras = nomeAdministradorEmpresa.length();
        
        System.out.println("O nome do administrador tem: " + nLetras + " letras.");
        
        // 9
        System.out.println("=====================================");
        System.out.println("Exercício 9");
        if ( nLetras > ( 2 * mediaSalarios)  ) {
            System.out.println("É maior");
        } else {
            System.out.println("É menor");
        }
        
        // 10 11 12 13
        System.out.println("=====================================");
        System.out.println("Exercícios 10 11 12 13");
        String nomesFuncionarios[] = {"Ana", "Bruno", "Carla", "Daniela", "Edu"};
        Double salariosFuncionarios[] = {1000.00, 900.00, 850.00, 1050.00, 930.00};
        
        
        for (int i = 0; i < nomesFuncionarios.length; i++) {
            
            System.out.println("Bom dia " + nomesFuncionarios[i]);
            
        }

        
        // 14
        System.out.println("=====================================");
        System.out.println("Exercício 14");
        Double totalSalarios = 0.0;
        
        for (int i = 0; i < salariosFuncionarios.length; i++) {
            
            totalSalarios = totalSalarios + salariosFuncionarios[i]; 
        }
        
        mediaSalarios = totalSalarios / nomesFuncionarios.length;
           
        System.out.println("A média de salários dos 5 funcionároios é " + mediaSalarios);
            
        // 15 16
        System.out.println("=====================================");
        System.out.println("Exercícios 15 16");
        Boolean pagamentoEfetuados[] = {true, true, true, false, false };
        
        // 17
        System.out.println("=====================================");
        System.out.println("Exercício 17");
        Double totaSalariosPorReceber = 0.0;
        
        for (int i = 0; i < pagamentoEfetuados.length; i++) {
            
            if (pagamentoEfetuados[i] == false) {
                totaSalariosPorReceber = totaSalariosPorReceber + salariosFuncionarios[i]; 
            }
            
        }
        
        System.out.println("Total de salários por receber: " + totaSalariosPorReceber);

        // 18
        System.out.println("=====================================");
        System.out.println("Exercício 18");
        Integer totaFuncionariosQueJaReceberam = 0;
        
        for (int i = 0; i < pagamentoEfetuados.length; i++) {
            
            if (pagamentoEfetuados[i] == true) {
                totaFuncionariosQueJaReceberam = totaFuncionariosQueJaReceberam + 1; 
            }
            
        }
        
        System.out.println("Total de funcionários que já receberam: " + totaFuncionariosQueJaReceberam);
        
         // 19
        System.out.println("=====================================");
        System.out.println("Exercício 19");
        
        for (int i = 0; i < nomesFuncionarios.length; i++) {
            
            if (pagamentoEfetuados[i] == true) {
                System.out.println("O/A funcionário " + nomesFuncionarios[i] + " já recebeu.");
            } else {
                System.out.println("O/A funcionário " + nomesFuncionarios[i] + " ainda não recebeu.");
            }
            
        }

    }
    
}
