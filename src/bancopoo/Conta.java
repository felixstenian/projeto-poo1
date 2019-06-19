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
public class Conta {
    /*Atributos*/
    private int numero;
    private String titular;
    protected double saldo;
    static int qtdcontas = 0;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static int getQtdcontas() {
        return qtdcontas;
    }

    public static void setQtdcontas(int qtdcontas) {
        Conta.qtdcontas = qtdcontas;
    }
    
    public Conta (String pTitular){
        this.titular = pTitular;
        qtdcontas++;
        this.numero = qtdcontas;
        this.saldo = 0;
    }
    
    /*Metodos*/
    
    public void DadosBancarios() {
        System.out.println("");
        System.out.println("------- Dados Da Conta -------");
        System.out.println("- Número " + this.numero);
        System.out.println("- Titular: " + this.titular);
        System.out.println("- Saldo: R$" + this.saldo);
        System.out.println("----- Fim Dados da Conta -----");
        System.out.println("");
    }
    
    public void Depositar(double pValor) {
        System.out.println("");
        System.out.println("----- Realizar Depósito -----");
        System.out.println("- Saldo anterior: R$" + this.saldo);
        
        this.saldo += pValor;
        
        System.out.println("- Saldo Atual: R$" + this.saldo);
        System.out.println("----- Fim do Depósito -----");
    }
    
    public void Sacar(double pValor) {
        System.out.println("");
        System.out.println("----- Realizando Saque -----");
        System.out.println("- Saldo Anterior: " + this.saldo);
        
        if(pValor <= this.saldo) {
            this.saldo -= pValor;
            System.out.println("- Valor do Saque: R$" + pValor);
            System.out.println("- Saldo Atual: R$" + this.saldo);
        }else {
            System.out.println("- Saldo Insuficiente");
        }
        
        System.out.println("----- Fim do saque -----");
        System.out.println("");
    }
    
    public void Transferir(Conta pDest, double pValor) {
        System.out.println("");
        System.out.println("----- Realizando Transferência -----");
        System.out.println("- Saldo Anterior Origem: " + this.saldo);
        
        if(pValor <= this.saldo) {
            this.saldo -= pValor;
            pDest.saldo =+ pValor;
            System.out.println("- Valor da transferência: R$" + pValor);
            System.out.println("- Saldo Atual: R$" + this.saldo);
        }else {
            System.out.println("- Saldo Insuficiente");
        }
        
        System.out.println("----- Fim da Transferência -----");
        System.out.println("");
    }
    
}
