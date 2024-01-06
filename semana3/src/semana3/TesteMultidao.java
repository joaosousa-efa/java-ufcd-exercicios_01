/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana3;

import java.util.ArrayList;

/**
 *
 * @author João Sousa
 */
public class TesteMultidao {
    
    public static void main(String[] args) {
        
        // 22 23 24 25 26
        System.out.println("=====================================");
        System.out.println("Exercícios 22 23 24 26");
        
        ArrayList<Funcionario> staff = new ArrayList<Funcionario>();
        
        Funcionario f01 = new Funcionario("Ana", 1000.00, true);
        staff.add(f01);
        Funcionario f02 = new Funcionario("Bruno", 1100.00, true);
        staff.add(f02);
        Funcionario f03 = new Funcionario("Carla", 990.00, false);
        staff.add(f03);
        Funcionario f04 = new Funcionario("Daniela", 1300.00, false);
        staff.add(f04);
        Funcionario f05 = new Funcionario("Edu", 1000.00, true);
        staff.add(f05);
        
        Double salarioMedio = 0.0;
        Double totalSalarios = 0.0;
        
        for (int i = 0; i < staff.size(); i++) {
            
            totalSalarios = totalSalarios + staff.get(i).getSalario();
            
        }
        
        System.out.println("Salário médio: " + totalSalarios / staff.size());
        
        
        // 27
        System.out.println("=====================================");
        System.out.println("Exercício 27");
        
        
        Double salarioMaisAltoDosQueReceberam = 0.0;
        
        for (int i = 0; i < staff.size(); i++) {
            
            if (staff.get(i).getRecebeuSalarioMesAtual() == true ) {
                
                if (staff.get(i).getSalario() > salarioMaisAltoDosQueReceberam) {
                    salarioMaisAltoDosQueReceberam = staff.get(i).getSalario();
                }
            }
        }
        
        System.out.println("Salário mais alto das pessoas que receberam: " + salarioMaisAltoDosQueReceberam);
        
        
        // 28
        System.out.println("=====================================");
        System.out.println("Exercício 28");
        
        // por omissão vamos definir que o primeiro recebe o salario mais baixo
        Double salarioMaisAltoDosQueNaoReceberam = staff.get(0).getSalario();
        
        for (int i = 0; i < staff.size(); i++) {
            
            if (staff.get(i).getRecebeuSalarioMesAtual() == false ) {
                
                if (staff.get(i).getSalario() < salarioMaisAltoDosQueNaoReceberam) {
                    salarioMaisAltoDosQueNaoReceberam = staff.get(i).getSalario();
                }
            }
        }
        
        System.out.println("Salário mais baixo das pessoas que não receberam: " + salarioMaisAltoDosQueNaoReceberam);
    }
}
