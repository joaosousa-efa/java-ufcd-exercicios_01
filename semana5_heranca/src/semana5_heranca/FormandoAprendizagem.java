/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana5_heranca;

/**
 *
 * @author João Sousa
 */
public class FormandoAprendizagem extends FormandoEFA{
    
    private double NotaPAF = 0;

    @Override
    public String toString() {
        return "FormandoAprendizagem {" + "Nome=" + this.getNome() + ", Numero=" + this.getNumero() + ","+ "NotaPAF=" + NotaPAF + '}';
    }
    
    public double getNotaPAF() {
        return NotaPAF;
    }

    public void setNotaPAF(double NotaPAF) {
        this.NotaPAF = NotaPAF;
    }

    @Override
    public double CalculaNotaFinal(){
        
        double nota = (this.getNotaUFDC() * 0.7) + (this.getNotaPAF() * 0.3);
    
        return nota;
    }
}
