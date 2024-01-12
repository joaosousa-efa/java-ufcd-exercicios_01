/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana5;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author João Sousa
 * 
 */
public class Cidade {
    
    private String nome;
    private String presidenteCamera;
    private Integer numeroPolulacao;
    private Integer areGeografica;
    private Boolean temCostamaritima;
    private ArrayList<String> nomeDosRios = new ArrayList();

    public Cidade(String nome, String presidenteCamera, Integer numeroPolulacao, Integer areGeografica, Boolean temCostamaritima) {
        this.nome = nome;
        this.presidenteCamera = presidenteCamera;
        this.numeroPolulacao = numeroPolulacao;
        this.areGeografica = areGeografica;
        this.temCostamaritima = temCostamaritima;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.nome);
        hash = 67 * hash + Objects.hashCode(this.presidenteCamera);
        hash = 67 * hash + Objects.hashCode(this.numeroPolulacao);
        hash = 67 * hash + Objects.hashCode(this.areGeografica);
        hash = 67 * hash + Objects.hashCode(this.temCostamaritima);
        hash = 67 * hash + Objects.hashCode(this.nomeDosRios);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cidade other = (Cidade) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.presidenteCamera, other.presidenteCamera)) {
            return false;
        }
        if (!Objects.equals(this.numeroPolulacao, other.numeroPolulacao)) {
            return false;
        }
        if (!Objects.equals(this.areGeografica, other.areGeografica)) {
            return false;
        }
        if (!Objects.equals(this.temCostamaritima, other.temCostamaritima)) {
            return false;
        }
        return Objects.equals(this.nomeDosRios, other.nomeDosRios);
    }

    @Override
    public String toString() {
        return "Cidade{" + "nome=" + nome + ", presidenteCamera=" + presidenteCamera + ", numeroPolulacao=" + numeroPolulacao + ", areGeografica=" + areGeografica + ", temCostamaritima=" + temCostamaritima + ", nomeDosRios=" + nomeDosRios + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPresidenteCamera() {
        return presidenteCamera;
    }

    public void setPresidenteCamera(String presidenteCamera) {
        this.presidenteCamera = presidenteCamera;
    }

    public Integer getNumeroPolulacao() {
        return numeroPolulacao;
    }

    public void setNumeroPolulacao(Integer numeroPolulacao) {
        this.numeroPolulacao = numeroPolulacao;
    }

    public Integer getAreGeografica() {
        return areGeografica;
    }

    public void setAreGeografica(Integer areGeografica) {
        this.areGeografica = areGeografica;
    }

    public Boolean getTemCostamaritima() {
        return temCostamaritima;
    }

    public void setTemCostamaritima(Boolean temCostamaritima) {
        this.temCostamaritima = temCostamaritima;
    }

    public ArrayList<String> getNomeDosRios() {
        return nomeDosRios;
    }

    public void setNomeDosRios(ArrayList<String> nomeDosRios) {
        this.nomeDosRios = nomeDosRios;
    }
    
}
