/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atp;

import java.util.ArrayList;

/**
 *
 * @author steph
 */
public class Funcionario {
    
    public int funCod;   
    public double funSalarioBase;
    
    public ArrayList<Dependente> dependentes = new ArrayList<Dependente>();


    public boolean associaDependente (Dependente d){

        if(dependentes.size() > 5 ){
            System.out.println("Você já atingiu o limite de dependentes! ");
            return false;
        }
        else{
            dependentes.add(d);
            return true;
        }
        
    }    
    public ArrayList<idade> idades = new ArrayList<idade>();
    
    /**
     *
     * @param idade
     * @return
     */
    public int qtdDependentesdIdadeLimite(int idade){
        
       int cont = 0;
       
       for(idade t: this.idades){
           
           if(t.estaNaIdadeLimite(idade)){
               cont = cont + t.idades;
           }
       
           cont++;  
           }
           return cont;
        }
    public void calculaValorMensal(){
       
    }
  
    public void dadosFuncionario(){
           
        System.out.println("Código: " + this.funCod);
    } 
        
}