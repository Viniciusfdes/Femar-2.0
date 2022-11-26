/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author felip
 */
public class Veiculo {
    
    private int id_veiculo;
    private String marca;
    private String ano;
    private String modelo;
    private String cor;
    private String preco;
    private String estado;

    public Veiculo() {
    }

    public Veiculo(String marca, String ano, String modelo, String cor, String preco, String estado) {
        this.marca = marca;
        this.ano = ano;
        this.modelo = modelo;
        this.cor = cor;
        this.preco = preco;
        this.estado = estado;
    }

    public int getId() {
        return id_veiculo;
    }

    public void setId(int id_veiculo) {
        this.id_veiculo = id_veiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
    
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
