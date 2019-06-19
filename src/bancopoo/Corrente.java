/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancopoo;

/**
 *
 * @author steniafelix
 */
public class Corrente extends Conta {
    protected double saldo;
    private final double taxa = 0.45;
    private final double taxaDeposito = 0.15;
    private final double taxaSaque = 0.25;
    
    
    public Corrente(String pTitular) {
        super(pTitular);
    }
    
    
    @Override
    public void Depositar(double pValor){
        System.out.println("");
        System.out.println("----- Realizar Depósito -----");
        System.out.println("- Saldo anterior: R$" + this.saldo);
        
        this.saldo += pValor - taxaDeposito;
        
        System.out.println("- Taxa: R$" + this.taxaDeposito);
        System.out.println("- Saldo Atual: R$" + this.saldo);
        System.out.println("----- Fim do Depósito -----");
    }
    
    @Override
    public void Sacar(double pValor){
        System.out.println("");
        System.out.println("----- Realizando Saque -----");
        System.out.println("- Saldo Anterior: " + this.saldo);
        
        if(pValor <= this.saldo) {
            this.saldo -= pValor - taxaSaque;
            System.out.println("- Taxa: R$" + this.taxaSaque);
            System.out.println("- Valor do Saque: R$" + pValor);
            System.out.println("- Saldo Atual: R$" + this.saldo);
        }else {
            System.out.println("- Saldo Insuficiente");
        }
        
        System.out.println("----- Fim do saque -----");
        System.out.println("");
    }
    
    @Override
    public void Transferir(Conta pDest, double pValor){
        System.out.println("");
        System.out.println("----- Realizando Transferência -----");
        System.out.println("- Saldo Anterior Origem: " + this.saldo);
        
        if(pValor <= this.saldo) {
            this.saldo -= pValor - taxa;
            pDest.saldo =+ pValor;
            System.out.println("- Taxa: R$" + this.taxa);
            System.out.println("- Valor da transferência: R$" + pValor);
            System.out.println("- Saldo Atual: R$" + this.saldo);
        }else {
            System.out.println("- Saldo Insuficiente");
        }
        
        System.out.println("----- Fim da Transferência -----");
        System.out.println("");
    }
    
    
}
