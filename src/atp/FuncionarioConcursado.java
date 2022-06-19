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
public class FuncionarioConcursado extends Funcionario{
   
    public int anos;
    private int qtdDependentesdIdadeLimite;

    public FuncionarioConcursado(int funCod, double funSalarioBase, int anos) {
        this.funCod = funCod;
        this.funSalarioBase = funSalarioBase;
        this.anos = anos;
    }
        
    public double valorMensalRecebido(){
        return this.funSalarioBase + (200 * this.anos);
    }
    
    public int valorAdicionalPelosDependentes(){
        return this.qtdDependentesdIdadeLimite(21);
    }
    
    public void dadosFuncionario() {
            
        System.out.println("___Funcionário Concursado___");

        super.dadosFuncionario();
        
        System.out.println("Salário Mensal: " + ( this.funSalarioBase + (200 * this.anos) + 50 * this.qtdDependentesdIdadeLimite));  
    }
}