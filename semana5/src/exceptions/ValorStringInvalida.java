/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package exceptions;

/**
 *
 * @author João Sousa
 */
public class ValorStringInvalida extends Exception{

    /**
     * Creates a new instance of <code>ValorStringInvalida</code> without detail
     * message.
     */
    public ValorStringInvalida() {
    }

    /**
     * Constructs an instance of <code>ValorStringInvalida</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ValorStringInvalida(String msg) {
        super(msg);
    }
}
