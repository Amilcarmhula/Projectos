/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.vendas.encomenda;

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
public class Encomendaa implements ControlaEncomenda{
    private int Code_Enc;
    private String Estado_Envio_Enc;
    private int E_Code_C;
    private int E_Code_Fun;
    private int E_Code_Trans;

    public  int getCode_Enc() {
        return Code_Enc;
    }

    private void setCode_Enc(int Code_Enc) {
        this.Code_Enc = Code_Enc;
    }

    private String getEstado_Envio_Enc() {
        return Estado_Envio_Enc;
    }

    private void setEstado_Envio_Enc(String Estado_Envio_Enc) {
        this.Estado_Envio_Enc = Estado_Envio_Enc;
    }

    private int getE_Code_C() {
        return E_Code_C;
    }

    private void setE_Code_C(int E_Code_C) {
        this.E_Code_C = E_Code_C;
    }

    private int getE_Code_Fun() {
        return E_Code_Fun;
    }

    private void setE_Code_Fun(int E_Code_Fun) {
        this.E_Code_Fun = E_Code_Fun;
    }

    private int getE_Code_Trans() {
        return E_Code_Trans;
    }

    private void setE_Code_Trans(int E_Code_Trans) {
        this.E_Code_Trans = E_Code_Trans;
    }
    
    @Override
    public String toString(){
    return Code_Enc+","+
            Estado_Envio_Enc+","+E_Code_C+","+
            E_Code_Fun+","+E_Code_Trans;
}

    @Override
    public Encomendaa colectaDados() {
        String menu = "Enviar encomenda?";
        menu += "\n S - SIM";
        menu += "\n N - NAO";
         /*
        Antes de fazer o registro da encomenda no ficheiro, deve antes ver se 
        existe registro para cliente, funcionario e transportador.
        */
        this.setCode_Enc(Integer.parseInt(JOptionPane.showInputDialog(null, "Introduza o codigo da Encomenda", "Registro", JOptionPane.INFORMATION_MESSAGE)));
        this.setE_Code_C(Integer.parseInt(JOptionPane.showInputDialog(null, "Introduza o codigo do Cliente", "Registro", JOptionPane.INFORMATION_MESSAGE)));
        this.setE_Code_Fun(Integer.parseInt(JOptionPane.showInputDialog(null, "Introduza o codigo do Funcionario", "Registro", JOptionPane.INFORMATION_MESSAGE)));
        this.setE_Code_Trans(Integer.parseInt(JOptionPane.showInputDialog(null, "Introduza o codigo do Transportador", "Registro", JOptionPane.INFORMATION_MESSAGE)));
        this.setEstado_Envio_Enc((JOptionPane.showInputDialog(null, menu, "Registro", JOptionPane.INFORMATION_MESSAGE)));
        
        return this;
    }

    @Override
    public void registracolectaDados() {
        try {
                    String menuL = "deseja adicionar mais Itens a lista?";
        menuL += "\n S - SIM";
        menuL += "\n N - NAO";
            VectorDeDados v = new VectorDeDados(2);
            v.adiciona(colectaDados());
            Escrita es = new Escrita();
            es.regEncomenda(v.toString());
            new ListaProdutoss().registracolectaDadosItens();
            /*
            deseja adicionar mais intens?
            */
            int a = 1;
            for (int i = 0; i < a; i++) {
                String r = JOptionPane.showInputDialog(null, menuL, "Info", JOptionPane.QUESTION_MESSAGE);
                if (r.equals("S")) {
                    new ListaProdutoss().registracolectaDadosItens();
                    a++;
                }
            }
            
            JOptionPane.showMessageDialog(null, "Registro com Sucesso!", "Registro", JOptionPane.INFORMATION_MESSAGE);
            System.out.println(v);
        } catch (IOException ex) {
            Logger.getLogger(Encomendaa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

     
}
