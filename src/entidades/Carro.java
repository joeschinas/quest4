/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;


public class Carro {
    private Integer combustivel;
    private Integer km;

    public Carro() {
    }

    public Carro(Integer combustivel, Integer km) {
        this.combustivel = combustivel;
        this.km = km;
    }

    public Integer getKm() {
        return km;
    }

    public void setKm(Integer km) {
        this.km = km;
    }
    public void setCombustivel(Integer combustivel) {
        this.combustivel = combustivel;
    }

    public Integer getCombustivel() {
        return combustivel;
    }
    
    public Integer adicionarGas(Integer quantidade){
    return combustivel=+quantidade;
    }
    public Integer km(Integer quantidadeKm){
    return km+=quantidadeKm;
    }
    public void andar(Integer quantidadeKm){
     Integer aux=quantidadeKm/5;
   
    combustivel-=aux;
    System.out.println("Carro chegou ! resta de combustivel ainda:"+combustivel+"L");

    }
    
    
}
