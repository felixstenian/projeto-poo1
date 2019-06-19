/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancopoo;
import java.util.ArrayList;
import  java.util.Scanner;
/**
 *
 * @author steniafelix
 */
public class BancoPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String aux;
        int opcao, numero, num2, op;
        double valor;

        ArrayList<Poupanca> pp = new ArrayList();
        Poupanca pp1 = null, pp2 = null;
        
        ArrayList<Corrente> cc = new ArrayList();
        Corrente cc1 = null, cc2 = null;
       
        
        do{
            menu();
            opcao = in.nextInt();
            in.nextLine();
            
            switch(opcao) {
                case 1:
                    System.out.println("Digite o nome do titular: ");
                    aux = in.nextLine();
                    
                    System.out.println("Digite o tipo da conta");
                    System.out.println("1. Conta Poupança");
                    System.out.println("2. Conta Corrente");
                    op = in.nextInt();
                    if(op == 1){
                        pp1 = new Poupanca(aux);
                        pp.add(pp1);
                        System.out.println("Conta Criada !");
                        break;
                    }
                    
                    if(op == 2){
                        cc1 = new Corrente(aux);
                        cc.add(cc1);
                        System.out.println("Conta Criada !");
                        break;
                    }else {
                     System.out.print("Opção inválida");   
                    }
                    
                case 2:
                    System.out.println("Digite o tipo da conta");
                    System.out.println("1. Conta Poupança");
                    System.out.println("2. Conta Corrente");
 
                    op = in.nextInt();
 
                    if(op == 1){
                        System.out.println("Digite o número da conta: ");
                        numero = in.nextInt();
                        
                        pp1 = pp.get(numero-1);
                        pp1.DadosBancarios();
                        break;
                        
                    } if(op == 2) {
                        System.out.println("Digite o número da conta: ");
                        numero = in.nextInt();
                        
                        cc1 = cc.get(numero-1);
                        cc1.DadosBancarios();
                        break;
                    }else {
                     System.out.print("Opção inválida");   
                    }                 
                case 3:
                    System.out.println("Digite o tipo da conta");
                    System.out.println("1. Conta Poupança");
                    System.out.println("2. Conta Corrente");
 
                    op = in.nextInt();
 
                    if(op == 1){
                        System.out.println("Digite o número da conta: ");
                        numero = in.nextInt();
                        
                        pp1 = pp.get(numero-1);
                    
                        System.out.println("Digite o valor do depósito: ");
                        valor = in.nextDouble();
                    
                    
                    pp1.Depositar(valor);
                    System.out.println("Depósito realizado !");
                    break;
                        
                    } 
                    if(op == 2) {
                        System.out.println("Digite o número da conta: ");
                        numero = in.nextInt();
                        
                        cc1 = cc.get(numero-1);
                    
                        System.out.println("Digite o valor do depósito: ");
                        valor = in.nextDouble();
                    
                    
                    cc1.Depositar(valor);
                    System.out.println("Depósito realizado !");
                    break;
                    }else {
                     System.out.print("Opção inválida");   
                    }
                case 4:
                    System.out.println("Digite o tipo da conta");
                    System.out.println("1. Conta Poupança");
                    System.out.println("2. Conta Corrente");
 
                    op = in.nextInt();
 
                    if(op == 1){
                        System.out.println("Digite o número da conta: ");
                        numero = in.nextInt();
                    
                        pp1 = pp.get(numero-1);
                    
                        System.out.println("Digite o valor do saque: ");
                        valor = in.nextDouble();
                    
                        pp1.Sacar(valor);
                        System.out.println("Saque Realizado !");
                        break;
                        
                    } if(op == 2) {
                        System.out.println("Digite o número da conta: ");
                        numero = in.nextInt();
                    
                        cc1 = cc.get(numero-1);
                    
                        System.out.println("Digite o valor do saque: ");
                        valor = in.nextDouble();
                    
                        cc1.Sacar(valor);
                        System.out.println("Saque Realizado !");
                        break;
                    }else {
                     System.out.print("Opção inválida");   
                    }
                case 5:
                    System.out.println("Digite o tipo da conta de origem: ");
                    System.out.println("1. Conta Poupança");
                    System.out.println("2. Conta Corrente");
                    op = in.nextInt();
 
                    System.out.println("Digite o número da conta de origem: ");
                    numero = in.nextInt();
                    
                    if(op == 1){
                        pp1 = pp.get(numero-1);
                        
                        System.out.println("Digite o número da conta de destino: ");
                        num2 = in.nextInt();
                        
                        System.out.println("Digite o tipo da conta de origem: ");
                        System.out.println("1. Conta Poupança");
                        System.out.println("2. Conta Corrente");
                        op = in.nextInt();
                        if(op == 1) {
                            System.out.println("Digite o valor da transferência: ");
                            valor = in.nextDouble();
                    
                            pp1.Transferir(pp2, valor);
                            System.out.println("Transferência Realizada !");
                            break;
                        } if(op == 2){
                            System.out.println("Digite o valor da transferência: ");
                            valor = in.nextDouble();
                    
                            pp1.Transferir(cc1, valor);
                            System.out.println("Transferência Realizada !");
                            break;
                        }
                        
                        
                    } if(op == 2) {
                        cc1 = cc.get(numero-1);
                        
                        System.out.println("Digite o número da conta de destino: ");
                        num2 = in.nextInt();
                        
                        System.out.println("Digite o tipo da conta de origem: ");
                        System.out.println("1. Poupança");
                        System.out.println("2. Corrente");
                        op = in.nextInt();
                        if(op == 1) {
                            System.out.println("Digite o valor da transferência: ");
                            valor = in.nextDouble();
                    
                            cc1.Transferir(pp1, valor);
                            System.out.println("Transferência Realizada !");
                            break;
                        } if(op == 2){
                            System.out.println("Digite o valor da transferência: ");
                            valor = in.nextDouble();
                    
                            cc1.Transferir(cc2, valor);
                            System.out.println("Transferência Realizada !");
                            break;
                        }
                    }else {
                     System.out.print("Opção inválida");   
                    }
                default:
                    if(opcao != 0)
                        System.out.print("Opção inválida");
                    break;
            }
            
            System.out.println("");
            
        } while(opcao != 0);
      
    }
    public static void menu(){
        System.out.println("");
        System.out.println("----- MENU -----");
        System.out.println("1) Criar conta");
        System.out.println("2) Dados da Conta");
        System.out.println("3) Deposito");
        System.out.println("4) Saque");
        System.out.println("5) Transferencia");
        System.out.println("0) Sair");
            
        System.out.println("Opção: ");
    }
    
    
    
}
