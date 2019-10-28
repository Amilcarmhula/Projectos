/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.vendas.cliente;

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
public class Clientee extends Pessoa implements ControlaCliente{
    private int code_C;

    public int getCode_C() {
        return code_C;
    }

    public void setCode_C(int code_C) {
        this.code_C = code_C;
    }
    @Override
    public String toString(){
        return code_C+",";
    }

    @Override
    public Clientee coletaDados() {
        this.setBI(JOptionPane.showInputDialog(null, "Introduza o N.BI", "Registro", JOptionPane.INFORMATION_MESSAGE));
        this.setCode_C(Integer.parseInt(JOptionPane.showInputDialog(null, "Introduza o codigo do cliente", "Registro", JOptionPane.INFORMATION_MESSAGE)));
        this.setNome(JOptionPane.showInputDialog(null, "Introduza o nome do cliente", "Registro", JOptionPane.INFORMATION_MESSAGE));
        this.setContacto(JOptionPane.showInputDialog(null, "Introduza o contacto do cliente", "Registro", JOptionPane.INFORMATION_MESSAGE));
        this.setEndereco(JOptionPane.showInputDialog(null, "Introduza o endereço do cliente", "Registro", JOptionPane.INFORMATION_MESSAGE));
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
            es.regCliente(v.toString());
        } catch (IOException ex) {
            Logger.getLogger(Clientee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
