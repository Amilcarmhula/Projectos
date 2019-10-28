/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.vendas.fornecedor;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sistema.de.vendas.*;
import sistema.de.vendas.io.Escrita;

/**
 *
 * @author Mula
 */
public class Fornecedorr implements ControlaForn{

    private int Code_Forn;
    private String Nome_Forn;
    private String Endereco_Forn;
    private String Pais_Forn;

    private int getCode_Forn() {
        return Code_Forn;
    }

    private void setCode_Forn(int Code_Forn) {
        this.Code_Forn = Code_Forn;
    }

    private String getNome_Forn() {
        return Nome_Forn;
    }

    private void setNome_Forn(String Nome_Forn) {
        this.Nome_Forn = Nome_Forn;
    }

    private String getEndereco_Forn() {
        return Endereco_Forn;
    }

    private void setEndereco_Forn(String Endereco_Forn) {
        this.Endereco_Forn = Endereco_Forn;
    }


    private String getPais_Forn() {
        return Pais_Forn;
    }

    private void setPais_Forn(String Pais_Forn) {
        this.Pais_Forn = Pais_Forn;
    }
    
    @Override
    public String toString(){
        return Code_Forn+","+Nome_Forn+","+Pais_Forn+","+Endereco_Forn;
    }

    @Override
    public Fornecedorr colectaDados() {
        this.setCode_Forn(Integer.parseInt(JOptionPane.showInputDialog(null, "Introduza o codigo do Fornecedor", "Registro", JOptionPane.INFORMATION_MESSAGE)));
        this.setNome_Forn(JOptionPane.showInputDialog(null, "Introduza o nome  do Fornecedor", "Registro", JOptionPane.INFORMATION_MESSAGE));
        this.setPais_Forn(JOptionPane.showInputDialog(null, "Introduza o pais", "Registro", JOptionPane.INFORMATION_MESSAGE));
        this.setEndereco_Forn(JOptionPane.showInputDialog(null, "Introduza o endereco do Fornecedor", "Registro", JOptionPane.INFORMATION_MESSAGE));
        return this;
    }
    
    @Override
    public void registraDados(){
        try {
            VectorDeDados v = new VectorDeDados(2);
            v.adiciona(colectaDados());
            JOptionPane.showMessageDialog(null, "Registro com Sucesso!", "Registro", JOptionPane.INFORMATION_MESSAGE);
            System.out.println(v);
            Escrita es = new Escrita();
            es.regFornecedor(v.toString());
        } catch (IOException ex) {
            Logger.getLogger(Fornecedorr.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
