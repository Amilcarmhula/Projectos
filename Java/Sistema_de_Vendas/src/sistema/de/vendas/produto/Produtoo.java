/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.vendas.produto;

import java.io.IOException;
import sistema.de.vendas.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sistema.de.vendas.io.Escrita;

/**
 *
 * @author Mula
 */
public class Produtoo implements ControlaProduto{
    private int code_P;
    private String Nome_P;
    private String validade_P;
    private String categoria_P;
    private double preco_P;

    private int getCode_P() {
        return code_P;
    }

    private void setCode_P(int code_P) {
        this.code_P = code_P;
    }

    private String getNome_P() {
        return Nome_P;
    }

    private void setNome_P(String Nome_P) {
        this.Nome_P = Nome_P;
    }

    private String getValidade_P() {
        return validade_P;
    }

    private void setValidade_P(String calidade_P) {
        this.validade_P = calidade_P;
    }

    private String getCategoria_P() {
        return categoria_P;
    }

    private void setCategoria_P(String categoria_P) {
        this.categoria_P = categoria_P;
    }

    private double getPreco_P() {
        return preco_P;
    }

    private void setPreco_P(double preco_P) {
        this.preco_P = preco_P;
    }
    
    @Override
    public String toString(){
     return code_P+","+Nome_P+","+categoria_P+","+validade_P;
    }

    @Override
    public Produtoo coletaDados() {
        this.setCode_P(Integer.parseInt(JOptionPane.showInputDialog(null, "Introduza o codigo de Produto", "Registro", JOptionPane.INFORMATION_MESSAGE)));
        this.setNome_P(JOptionPane.showInputDialog(null, "Introduza o nome do Produto", "Registro", JOptionPane.INFORMATION_MESSAGE));
        this.setCategoria_P(JOptionPane.showInputDialog(null, "Introduza a categoria o Produto", "Registro", JOptionPane.INFORMATION_MESSAGE));
        this.setValidade_P(JOptionPane.showInputDialog(null, "Introduza a data de validade do Produto", "Registro", JOptionPane.INFORMATION_MESSAGE));
        this.setPreco_P(Double.parseDouble(JOptionPane.showInputDialog(null, "Introduza o preco do Produto", "Registro", JOptionPane.INFORMATION_MESSAGE)));
        return this;
    }

    @Override
    public void registraDados() {
        try {
            VectorDeDados v = new VectorDeDados(2);
            v.adiciona(coletaDados());
            JOptionPane.showMessageDialog(null, "Registro com Sucesso!", "Registro", JOptionPane.INFORMATION_MESSAGE);
            System.out.println(v);
            Escrita es = new Escrita();
            es.regProduto(v.toString());
        } catch (IOException ex) {
            Logger.getLogger(Produtoo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
