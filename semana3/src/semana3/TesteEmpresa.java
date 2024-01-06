/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana3;

/**
 *
 * @author João Sousa
 */
public class TesteEmpresa {
    
    
    public static void main(String[] args) {
        
                
        // 12 13 14 15 16 17 18 19 20 21 22
        System.out.println("=====================================");
        System.out.println("Exercícios 12 13 14 15 16 17 18 19 20 21 22");
        
        Funcionario funcionario1 =  new Funcionario("Elon", 2000.00, false);
        funcionario1.setRecebeuSalarioMesAtual(true);
        
        System.out.println("O funcionario " + funcionario1.getNome() + " recebeu:" +  funcionario1.getRecebeuSalarioMesAtual());
        
        System.out.println("Salario: " + funcionario1.getSalario());
                
        
        funcionario1.setSalario(2000.00);
        
        System.out.println("Salario: " + funcionario1.getSalario());
                
    }
}
