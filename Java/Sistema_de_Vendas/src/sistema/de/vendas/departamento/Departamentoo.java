/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.vendas.departamento;

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
public class Departamentoo implements ControlaDepart{
    private int code_depart;
    private String nome_depart;

    private int getCode_depart() {
        return code_depart;
    }

    private void setCode_depart(int code_depart) {
        this.code_depart = code_depart;
    }

    private String getNome_depart() {
        return nome_depart;
    }

    private void setNome_depart(String nome_depart) {
        this.nome_depart = nome_depart;
    }
    
    @Override
    public String toString() {
        return code_depart + "," + nome_depart;
    }

    @Override
    public Departamentoo coletaDados() {
        this.setCode_depart(Integer.parseInt(JOptionPane.showInputDialog(null, "Introduza o codigo do departamento", "Registro", JOptionPane.INFORMATION_MESSAGE)));
        this.setNome_depart(JOptionPane.showInputDialog(null, "Introduza o Nome do departamento", "Registro", JOptionPane.INFORMATION_MESSAGE));
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
            es.regDepartamento(v.toString());
        } catch (IOException ex) {
            Logger.getLogger(Departamentoo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
