/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana5;

import exceptions.ValorNumericoInvalidoException;
import exceptions.ValorStringInvalida;

/**
 *
 * @author João Sousa
 * 
 */
public class Paiis {

    public Paiis(String linguaFalada, int numeroPopulacao, String presidenteRei, String nomePrimeiroMinistro, int valorPIB, String nome, String continente) {
        this.linguaFalada = linguaFalada;
        this.numeroPopulacao = numeroPopulacao;
        this.presidenteRei = presidenteRei;
        this.nomePrimeiroMinistro = nomePrimeiroMinistro;
        this.valorPIB = valorPIB;
        this.nome = nome;
        this.continente = continente;
        
    }

    @Override
    public String toString() {
        return "Paiis{" + "linguaFalada=" + linguaFalada + ", numeroPopulacao=" + numeroPopulacao + ", presidenteRei=" + presidenteRei + ", nomePrimeiroMinistro=" + nomePrimeiroMinistro + ", valorPIB=" + valorPIB + ", nome=" + nome + ", continente=" + continente + '}';
    }

    public Integer getNumeroPopulacao() {
        return numeroPopulacao;
    }

    public void setNumeroPopulacao(Integer numeroPopulacao) throws ValorNumericoInvalidoException {
        
        // implementação de uma exception
        if (numeroPopulacao < 0 ){
            throw new ValorNumericoInvalidoException("A população não pode ser um número negativo");
        }
        this.numeroPopulacao = numeroPopulacao;
    }

    public String getPresidenteRei() {
        return presidenteRei;
    }

    public void setPresidenteRei(String presidenteRei){
        
        this.presidenteRei = presidenteRei;
    }

    public String getNomePrimeiroMinistro() {
        return nomePrimeiroMinistro;
    }

    public void setNomePrimeiroMinistro(String nomePrimeiroMinistro) throws ValorStringInvalida {
        
        if ( "".equals(presidenteRei)) {
            throw new ValorStringInvalida("O nome do primeiro ministro, não pode ser uma string vazia.");
        }
        this.nomePrimeiroMinistro = nomePrimeiroMinistro;
    }

    public Integer getValorPIB() {
        return valorPIB;
    }

    public void setValorPIB(Integer valorPIB) {
        this.valorPIB = valorPIB;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }
    
    public String getLinguaFalada() {
        return linguaFalada;
    }

    public void setLinguaFalada(String linguaFalada) {
        this.linguaFalada = linguaFalada;
    }
    
    private String linguaFalada;
    private Integer numeroPopulacao;
    private String presidenteRei;
    private String nomePrimeiroMinistro;
    private Integer valorPIB;
    private String nome;
    private String continente;

    public Integer getRendimentoPerCapita(){
        return this.getValorPIB() / this.getNumeroPopulacao();
    }
    
}
