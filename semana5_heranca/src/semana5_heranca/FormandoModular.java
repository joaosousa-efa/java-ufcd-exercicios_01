/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana5_heranca;

/**
 *
 * @author João Sousa
 */
public class FormandoModular extends Formando {
 
    @Override
    public String toString() {
        return "FormandoModular {" + "Nome=" + this.getNome() + ", Numero=" + this.getNumero() + ", NotaUFCD=" + this.getNotaUFDC() + '}';
    }
    public double CalculaNotaFinal(){
        
        double nota = this.getNotaUFDC();
    
        return nota;
    }
    
    
}
