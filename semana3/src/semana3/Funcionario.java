/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana3;

/**
 *
 * @author João Sousa
 */
public class Funcionario {
    
    private String nome = "";
    private Double salario = 1000.00;
    private Boolean recebeu = false;
    
    public Funcionario(String nome, Double salario, Boolean recebeu) {
        this.nome = nome;
        this.salario = salario;
        this.recebeu = recebeu;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Boolean getRecebeuSalarioMesAtual() {
        return recebeu;
    }

    public void setRecebeuSalarioMesAtual(Boolean recebeu) {
        this.recebeu = recebeu;
    }
    
}
