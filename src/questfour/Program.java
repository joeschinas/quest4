/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questfour;

import entidades.Carro;
import java.util.Locale;
import java.util.Scanner;


public class Program {

   
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner (System.in);
        Carro ferrari = new Carro(0,0);
        System.out.println("Carro sem gasolina adicione uma quantidade para andar: ");
        Integer quantidadeCom=read.nextInt();
        ferrari = new Carro(quantidadeCom,0);
        System.out.println("Quantos Km deseja andar com seu carro ?");
        Integer quantidadeKm=read.nextInt();
        System.out.println("Carro Esta andando......");
        ferrari.andar(quantidadeKm);
        
        
        
        
        
    }
    
}
