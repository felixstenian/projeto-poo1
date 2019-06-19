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
public interface interfaceConta {
    void DadosBancarios();
    void Depositar(double pValor);
    void Sacar(double pValor);
    void Transferir(Conta pDest, double pValor);
}
