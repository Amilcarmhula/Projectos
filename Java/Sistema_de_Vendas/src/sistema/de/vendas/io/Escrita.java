/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.vendas.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mula
 */
public class Escrita {

     
    
    public void regCliente(String texto) {
        File ff =  new File("C:\\Users\\Mula\\Documents\\NetBeansProjects\\Files-sistema-de-vendas\\Cliente.txt");
            
        FileWriter fw =  null;
        try {
            fw = new FileWriter(ff.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.newLine();
            bw.append(texto);
            bw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Escrita.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }
    
    public void regDepartamento(String texto) throws IOException {
        FileWriter fw = null;
     BufferedWriter bw = null;
     File ff = null;
        ff = new File("C:\\Users\\Mula\\Documents\\NetBeansProjects\\Files-sistema-de-vendas\\Departamento.txt");

        fw = new FileWriter(ff.getAbsoluteFile(), true);
        bw = new BufferedWriter(fw);

        bw.newLine();
        bw.append(texto);

        bw.close();
        fw.close();
    }
    
    public void regEncomenda(String texto) throws IOException {
        FileWriter fw = null;
     BufferedWriter bw = null;
     File ff = null;
        ff = new File("C:\\Users\\Mula\\Documents\\NetBeansProjects\\Files-sistema-de-vendas\\Encomenda.txt");

        fw = new FileWriter(ff.getAbsoluteFile(), true);
        bw = new BufferedWriter(fw);

        bw.newLine();
        bw.append(texto);

        bw.close();
        fw.close();
    }
    
    public void regFornecedor(String texto) throws IOException {
        FileWriter fw = null;
     BufferedWriter bw = null;
     File ff = null;
        ff = new File("C:\\Users\\Mula\\Documents\\NetBeansProjects\\Files-sistema-de-vendas\\Fornecedor.txt");

        fw = new FileWriter(ff.getAbsoluteFile(), true);
        bw = new BufferedWriter(fw);

        bw.newLine();
        bw.append(texto);

        bw.close();
        fw.close();
    }
    
    public void regFuncionario(String texto) throws IOException {
        FileWriter fw = null;
     BufferedWriter bw = null;
     File ff = null;
        ff = new File("C:\\Users\\Mula\\Documents\\NetBeansProjects\\Files-sistema-de-vendas\\Funcionario.txt");

        fw = new FileWriter(ff.getAbsoluteFile(), true);
        bw = new BufferedWriter(fw);

        bw.newLine();
        bw.append(texto);

        bw.close();
        fw.close();
    }
   
    public void regListaProdutos(String texto) throws IOException {
        FileWriter fw = null;
     BufferedWriter bw = null;
     File ff = null;
        ff = new File("C:\\Users\\Mula\\Documents\\NetBeansProjects\\Files-sistema-de-vendas\\ListaProdutos.txt");

        fw = new FileWriter(ff.getAbsoluteFile(), true);
        bw = new BufferedWriter(fw);

        bw.newLine();
        bw.append(texto);

        bw.close();
        fw.close();
    }
    public void regProduto(String texto) throws IOException {
        FileWriter fw = null;
     BufferedWriter bw = null;
     File ff = null;
        ff = new File("C:\\Users\\Mula\\Documents\\NetBeansProjects\\Files-sistema-de-vendas\\Produto.txt");

        fw = new FileWriter(ff.getAbsoluteFile(), true);
        bw = new BufferedWriter(fw);

        bw.newLine();
        bw.append(texto);

        bw.close();
        fw.close();
    }
//        try {
//            ff = new File("D:\\My fies\\FileOutput.txt");
//
//            fw = new FileWriter(ff.getAbsoluteFile(), true);
//            bw = new BufferedWriter(fw);
//
//            bw.newLine();
//            bw.append(texto);
//        } catch (IOException exx) {
//            exx.printStackTrace();
//        } finally {
//            try {
//                if (bw != null) {
//                    bw.close();
//                }
//                if (fw != null) {
//                    fw.close();
//                }
//
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//        }
}
