/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana5;

import exceptions.ValorNumericoInvalidoException;
import exceptions.ValorStringInvalida;
import java.util.ArrayList;

/**
 *
 * @author João Sousa
 * 
 */
public class Paiis {
    
    
    private String linguaFalada;
    private Integer numeroPopulacao;
    private String presidenteRei;
    private String nomePrimeiroMinistro;
    private Integer valorPIB;
    private String nome;
    private String continente;
    private ArrayList<Cidade> cidades = new ArrayList<>();
    

    public Paiis(String linguaFalada, int numeroPopulacao, String presidenteRei, String nomePrimeiroMinistro, int valorPIB, String nome, String continente) {
        this.linguaFalada = linguaFalada;
        this.numeroPopulacao = numeroPopulacao;
        this.presidenteRei = presidenteRei;
        this.nomePrimeiroMinistro = nomePrimeiroMinistro;
        this.valorPIB = valorPIB;
        this.nome = nome;
        this.continente = continente;
        
    }
    
    public void addCidade(Cidade cidade) {
        cidades.add(cidade);
    }
    
    public void removeCidade(Cidade cidade) {
        try {
            cidades.remove(cidade);
            
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
    }
    
    public void substituiCidade(Integer pos, Cidade cidade){
        cidades.set(pos, cidade);
    }
    
    public Integer populacaoTotal(){
        
        Integer total = 0;
        for (Cidade cidade : cidades) {
            
            total = total + cidade.getNumeroPolulacao();
        }
        return total;
    }
    
    public Float mediaPopulacaoPorCidade(){
        
        Integer total = 0;
        for (Cidade cidade : cidades) {
            
            total = total + cidade.getNumeroPolulacao();
        }
        return (float)total / cidades.size();
    }
    
    public String cidadeMaisPopulosa(){
        
        Integer populacao = 0;
        Integer pos = 0;
        for (int i = 0; i < cidades.size(); i++) {
            
            if (cidades.get(i).getNumeroPolulacao() > populacao ) {
                populacao = cidades.get(i).getNumeroPolulacao();
                pos = i;
            }
        }
        return cidades.get(pos).getNome();
    }
    
    public String cidadeMenosPopulosa(){
        
        Integer populacao = cidades.get(0).getNumeroPolulacao();
        Integer pos = 0;
        for (int i = 0; i < cidades.size(); i++) {
            
            if (cidades.get(i).getNumeroPolulacao() < populacao ) {
                populacao = cidades.get(i).getNumeroPolulacao();
                pos = i;
            }
        }
        return cidades.get(pos).getNome();
    }
    
    public String cidadeAtravessadaMaisRios(){
        
        Integer numeroRios = 0;
        Integer pos = 0;
        for (int i = 0; i < cidades.size(); i++) {
            
            if (cidades.get(i).getNomeDosRios().size() > numeroRios ) {
                numeroRios = cidades.get(i).getNomeDosRios().size();
                pos = i;
            }
        }
        return cidades.get(pos).getNome();
    }
    
    public Boolean paiisTemCostaMaritima() {
        
        Boolean temCostaMaritima = false;
        
        for (int i = 0; i < cidades.size(); i++) {
            if (cidades.get(i).getTemCostamaritima() == true) {
                temCostaMaritima = true;
            }
        }
        
        return temCostaMaritima;
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
    
    public Integer getRendimentoPerCapita(){
        return this.getValorPIB() / this.getNumeroPopulacao();
    }
    
}
