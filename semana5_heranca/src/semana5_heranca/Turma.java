package semana5_heranca;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author João Sousa
 */
public class Turma {
    
    private String NomeTurma = "";
    private int NumeroTurma = 0;
    private ArrayList<Formando> formandos = new ArrayList<Formando>();

    public String getNomeTurma() {
        return NomeTurma;
    }

    public void setNomeTurma(String NomeTurma) {
        this.NomeTurma = NomeTurma;
    }

    public int getNumeroTurma() {
        return NumeroTurma;
    }

    public void setNumeroTurma(int NumeroTurma) {
        this.NumeroTurma = NumeroTurma;
    }

    public ArrayList<Formando> getFormandos() {
        return formandos;
    }

    public void setFormandos(ArrayList<Formando> formandos) {
        this.formandos = formandos;
    }

    public void AdicionaFormandos(Formando formando){
    
        
        this.formandos.add(formando);
    }
    
}
