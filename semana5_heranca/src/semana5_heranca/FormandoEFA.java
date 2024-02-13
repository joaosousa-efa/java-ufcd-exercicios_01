/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana5_heranca;

/**
 *
 * @author João Sousa
 */
public class FormandoEFA extends Formando{
    
    private double notaPra = 0;

    @Override
    public String toString() {
        return "FormandoEFA {" + "Nome=" + this.getNome() + ", Numero=" + this.getNumero() + ", NotaPra=" + notaPra + '}';
    }

    
    
    public double getNotaPra() {
        return notaPra;
    }

    public void setNotaPra(double notaPra) {
        this.notaPra = notaPra;
    }
    
    @Override
    public double CalculaNotaFinal(){
        
        double nota = (this.getNotaUFDC() * 0.9) + (this.getNotaPra() * 0.1);
    
        return nota;
    }
    
}
