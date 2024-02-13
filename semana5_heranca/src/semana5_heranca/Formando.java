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
    
    private String Nome = "";
    private double Numero = 0;
    private double NotaUFDC = 0;

    @Override
    public String toString() {
        return "Formando {" + "Nome=" + Nome + ", Numero=" + Numero + ", NotaUFDC=" + NotaUFDC + '}';
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public double getNumero() {
        return Numero;
    }

    public void setNumero(double Numero) {
        this.Numero = Numero;
    }

    public double getNotaUFDC() {
        return NotaUFDC;
    }

    public void setNotaUFDC(double NotaUFDC) {
        this.NotaUFDC = NotaUFDC;
    }

    public Formando() {
    }
    
    public double CalculaNotaFinal(){
        return 0;
    }
}
