/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana5_heranca;

/**
 *
 * @author João Sousa
 */
public class Formando {
    
    private String nome = "";
    private int numero = 0;
    private double notaUFDC = 0;

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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getNotaUFDC() {
        return notaUFDC;
    }

    public void setNotaUFDC(double notaUFDC) {
        this.notaUFDC = notaUFDC;
    }

    public Formando() {
    }
    
    public double CalculaNotaFinal(){
        return 0;
    }
}
