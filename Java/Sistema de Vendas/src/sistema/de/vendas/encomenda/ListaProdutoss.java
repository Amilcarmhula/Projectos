/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.vendas.encomenda;

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
public class ListaProdutoss implements ControlaLista{

    private int CodeE_L;
    private int CodeP_L;
    private double QuantidadeE_L;
    private double DescontoE_L;
    private Date DataE_l;

    private int getCodeE_L() {
        return CodeE_L;
    }

    private void setCodeE_L(int CodeE_L) {
        this.CodeE_L = CodeE_L;
    }

    private int getCodeP_L() {
        return CodeP_L;
    }

    private void setCodeP_L(int CodeP_L) {
        this.CodeP_L = CodeP_L;
    }

    private double getQuantidadeE_L() {
        return QuantidadeE_L;
    }

    private void setQuantidadeE_L(double QuantidadeE_L) {
        this.QuantidadeE_L = QuantidadeE_L;
    }

    private double getDescontoE_L() {
        return DescontoE_L;
    }

    private void setDescontoE_L(double DescontoE_L) {
        this.DescontoE_L = DescontoE_L;
    }

    private Date getDataE_l() {
        return DataE_l;
    }

    private void setDataE_l(Date DataE_l) {
        this.DataE_l = DataE_l;
    }

    @Override
    public String toString() {
        return CodeE_L + ","+ CodeP_L + "," + QuantidadeE_L + ","+ DescontoE_L + ","+ DataE_l;
    }

    @Override
    public ListaProdutoss colectaDadosItens() {
        Date data = new Date();
        
        /*
        Antes de adicional os produtos a lista de encomenda, deve antes ver se 
        existe registro para produto.
        */
        JOptionPane.showMessageDialog(null, "Adicionando Itens na lista de Encomenda!", "Info", JOptionPane.INFORMATION_MESSAGE);
        this.setCodeE_L(new Encomendaa().getCode_Enc());
        this.setCodeP_L(Integer.parseInt(JOptionPane.showInputDialog(null, "Introduza o codigo do Produto", "Registro", JOptionPane.INFORMATION_MESSAGE)));
        this.setDataE_l(data);
        this.setQuantidadeE_L(Integer.parseInt(JOptionPane.showInputDialog(null, "Introduza a quantidade do produto", "Registro", JOptionPane.INFORMATION_MESSAGE)));
        double desc;
        if (this.getQuantidadeE_L() >= 3 && this.getQuantidadeE_L() <= 5) {
            desc = 3;
            JOptionPane.showMessageDialog(null, "3% de desconto!", "Registro", JOptionPane.INFORMATION_MESSAGE);
        } else if (this.getQuantidadeE_L() >= 6 && this.getQuantidadeE_L() <= 15) {
            desc = 9;
            JOptionPane.showMessageDialog(null, "9% de desconto!", "Registro", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "18% de desconto!", "Registro", JOptionPane.INFORMATION_MESSAGE);
            desc = 18;
        }
        this.setDescontoE_L(desc);
        return this;
    }

    @Override
    public void registracolectaDadosItens() {
        try {
            VectorDeDados v = new VectorDeDados(2);
            v.adiciona(colectaDadosItens());
            System.out.println(v);
            Escrita es = new Escrita();
            es.regListaProdutos(v.toString());
        } catch (IOException ex) {
            Logger.getLogger(ListaProdutoss.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
