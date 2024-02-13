/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana6;

/**
 *
 * @author João Sousa
 */
public class FormandoEFA extends Formando{
    
    private double NotaPra = 0;

    @Override
    public String toString() {
        return "FormandoEFA {" + "Nome=" + this.getNome() + ", Numero=" + this.getNumero() + "," + "NotaPra=" + NotaPra + '}';
    }

    
    
    public double getNotaPra() {
        return NotaPra;
    }

    public void setNotaPra(double NotaPra) {
        this.NotaPra = NotaPra;
    }
    
    @Override
    public double CalculaNotaFinal(){
        
        double nota = (this.getNotaUFDC() * 0.9) + (this.getNotaPra() * 0.1);
    
        return nota;
    }
    
}
