/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package variaveis;

/**
 *
 * @author João Sousa
 *
 */
public class TreinoBaseVariaveis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Integer idade = 37;

        if (idade >= 18) {
            System.out.println("Maior de idade.");

            Integer diffIdade = idade - 18;

            System.out.println("Já passou " + diffIdade + " anos desde que adequeriu a maioridade.");
        } else {
            System.out.println("Mennor de idade.");
        }

        int i = 3;
        int j = 12;

        if (i > j) {
            double t = 0;
            t = i + 3;
        } else {
            double t = 0;
            t = j + 3;
        }

        //System.out.println(t);
        // A variavél t está fora do âmbito
        
        
        
    }
    
}
