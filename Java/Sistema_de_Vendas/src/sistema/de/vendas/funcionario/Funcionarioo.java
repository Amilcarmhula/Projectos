/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.vendas.funcionario;

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
public class Funcionarioo extends Pessoa implements ControladorFunc{
    private int code_fun;
    private int code_depart;

    private int getConde_fun() {
        return code_fun;
    }

    private void setConde_fun(int conde_fun) {
        this.code_fun = conde_fun;
    }

    private int getConde_depart() {
        return code_depart;
    }

    private void setConde_depart(int conde_depart) {
        this.code_depart = conde_depart;
    }
        
/*
    @Override
    public String toString() {
        return "Funcionario {" + "BI: " + BI + ", Nome: " + nome +
                ", Endereco: " + endereco + ", Contacto: "+contacto+ 
                ", Cogido de Departamento: "+code_depart+", Codigo de Funcionario: "+code_fun+"}";
    }
*/
    @Override
    public String toString() {
        return BI + "," + nome +"," + endereco + ","+contacto+ ","+code_depart+","+code_fun;
    }

    @Override
    public Funcionarioo coletaDados() {
        this.setBI(JOptionPane.showInputDialog(null, "Introduza o N.BI", "Registro", JOptionPane.INFORMATION_MESSAGE));
        this.setConde_fun(Integer.parseInt(JOptionPane.showInputDialog(null, "Introduza o codigo do funcionario", "Registro", JOptionPane.INFORMATION_MESSAGE)));
        this.setNome(JOptionPane.showInputDialog(null, "Introduza o nome do funcionario", "Registro", JOptionPane.INFORMATION_MESSAGE));
        this.setContacto(JOptionPane.showInputDialog(null, "Introduza o contacto do funcionario", "Registro", JOptionPane.INFORMATION_MESSAGE));
        this.setEndereco(JOptionPane.showInputDialog(null, "Introduza o endereço do funcionario", "Registro", JOptionPane.INFORMATION_MESSAGE));
        this.setConde_depart(Integer.parseInt(JOptionPane.showInputDialog(null, "Introduza o codigo de departamento", "Registro", JOptionPane.INFORMATION_MESSAGE)));
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
            es.regFuncionario(v.toString());
        } catch (IOException ex) {
            Logger.getLogger(Funcionarioo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
