/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author steph
 */
public class FolhaPagamento {
    
    public static ArrayList<Funcionario> funcionarios;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a quantidade de funcionários: ");
        int qtdFuncionarios = teclado.nextInt();teclado.nextLine();
        
        funcionarios = new ArrayList<Funcionario>();
     
        int c = 0;
        while(c < qtdFuncionarios){
        
            System.out.println("=== Funcionário "+c+"===");
            
            System.out.println("Informe o código do funcionário: ");
            int funCod = teclado.nextInt();teclado.nextLine();
            
            System.out.println("Informe o tipo do funcionário: ");
            System.out.println("1 - Concursado");
            System.out.println("2 - Temporário\n");
            int funTipo = teclado.nextInt();teclado.nextLine();
            
            System.out.println("Informe o Salário-base: ");
            double funSalarioBase = teclado.nextDouble();
            
            System.out.println("Quantos dependentes estão associados a este funcionário?");
            int qtdDependentes = teclado.nextInt(); teclado.nextLine();
            
            ArrayList<Dependente> dependentes = new ArrayList<Dependente>();
            int i = 0;
                    
            while (i < qtdDependentes) {
                
                System.out.println("_Dependente "+i+"_");
                
                System.out.println("Informe a Idade do dependente: ");
                int idade = teclado.nextInt();
                
                Dependente d = new Dependente(idade);
                
                dependentes.add(d);
                
                i++;
            }
            
            if (funTipo == 1){
                System.out.println("Informe os anos de contratação: ");
                int anos = teclado.nextInt();teclado.nextLine();
                
                FuncionarioConcursado funcionario = new FuncionarioConcursado(funCod, funSalarioBase, anos);
                
                for(Dependente d : dependentes){
                    funcionario.associaDependente(d);
                }
                
                funcionarios.add(funcionario);
            }
            else{
                System.out.println("Informe o número de meses do período de contrato: ");
                int meses = teclado.nextInt();teclado.nextLine();
                
                FuncionarioTemporario funcionario = new FuncionarioTemporario(funCod, funSalarioBase, meses);
                     
                for(Dependente d : dependentes){
                    funcionario.associaDependente(d);
                  
                funcionarios.add(funcionario);
            }
            
            c++;
        
                for(Funcionario funcionarios: funcionarios){
                funcionario.dadosFuncionario();
            }
            }
        }
    }
}