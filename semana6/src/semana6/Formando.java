/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana6;

/**
 *
 * @author João Sousa
 */
public class Formando {
    
    private String nome = "";
    private double numero = 0;
    private double notaUFDC = 0;
    
    public static int contador = 1;

    public Formando() {
        this.setNumero(incrementaAluno());
    }
    
    @Override
    public String toString() {
        return "Formando {" + "Nome=" + nome + ", Numero=" + numero + ", NotaUFDC=" + notaUFDC + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double Numero) {
        this.numero = numero;
    }

    public double getNotaUFDC() {
        return notaUFDC;
    }

    public void setNotaUFDC(double notaUFDC) {
        this.notaUFDC = notaUFDC;
    }

    
    public double CalculaNotaFinal(){
        return 0;
    }
    
    public int incrementaAluno(){
        return contador++;
    }
}
