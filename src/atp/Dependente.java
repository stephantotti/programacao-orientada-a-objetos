/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atp;

/**
 *
 * @author steph
 */
public class Dependente {
    
    public int idade;

    public Dependente(int idade) {
        this.idade = idade;
    }
    public boolean estaNaIdadeLimite(int idadeLimite){
        
        if(this.idade <= idadeLimite){
            return true;
        }
        else{
            return false;       
        }
        
    }
}
