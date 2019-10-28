/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.vendas.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author An's
 */
public class Leitura {
    public void leProduto() throws IOException{
        FileReader f =f = new FileReader("C:\\Users\\Mula\\Documents\\NetBeansProjects\\Files-sistema-de-vendas\\Produto.txt");
            BufferedReader is = new BufferedReader(f);
            
        try {
            String colecta = "";
            String linha;
            String nomeiacao = "Codigo: ,Nome: ,Categoria: ,Validade: , Preco: ";
            String[] nomeiacaosplit = nomeiacao.split("[,]");
            int l = 0;
            String[] mostcoleta = new String[12];
            while((linha = is.readLine())!= null){
                System.out.println(linha);
//                String[] dados = linha.split("[,]");
//                for(int i = 0; i<nomeiacaosplit.length;i++){
//                    colecta += nomeiacaosplit[i];
//                    for (int j = i; j < i+1; j++) {
//                        colecta += dados[j]+", ";
//                    }
//                }
//                mostcoleta[l] = colecta;
//                l++;
//                colecta = "";
//                
            }  
//String menu ="Lista de Produtos: ";
//            for (int z = 0; z < 12; z++) {
//                menu += "\n "+mostcoleta[z]+"";
//                
//            }
//            JOptionPane.showMessageDialog(null, menu);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Leitura.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                f.close();
            } catch (IOException ex) {
                Logger.getLogger(Leitura.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
//    public void leProduto() throws FileNotFoundException, IOException{
//        FileReader f = new FileReader("C:\\Users\\Mula\\Documents\\NetBeansProjects\\Files-sistema-de-vendas\\Produto.txt");
//        BufferedReader is = new BufferedReader(f);
//        String colecta = "";
//        String linha;
//        String nomeiacao = "Codigo: ,Nome: ,Categoria: ,Validade: , Preco: ";
//        String[] nomeiacaosplit = nomeiacao.split("[,]");
//        int l = 0;
//       
//        String[] mostcoleta = new String[12];
//
//        while((linha = is.readLine())!= null){
//            String[] dados = linha.split("[,]");
//            for(int i = 0; i<nomeiacaosplit.length;i++){
//                colecta += nomeiacaosplit[i];                
//                for (int j = i; j < i+1; j++) {
//                    colecta += dados[j]+", ";
//                }
//            }
//            mostcoleta[l] = colecta;
//            l++;
//            colecta = "";
//            
//        }
//        String menu ="Lista de Produtos: ";
//        for (int z = 0; z < 12; z++) {
//            menu += "\n "+mostcoleta[z]+"";
//                
//            }
//        JOptionPane.showMessageDialog(null, menu);
//        }
    public void leDepartamento() throws FileNotFoundException, IOException{
        FileReader f = new FileReader("C:\\Users\\Mula\\Documents\\NetBeansProjects\\Files-sistema-de-vendas\\Departamento.txt");
        BufferedReader is = new BufferedReader(f);
        String colecta = "";
        String linha;
        String nomeiacao = "Codigo: ,Nome: ";
        String[] nomeiacaosplit = nomeiacao.split("[,]");
        int l = 0;
       
        String[] mostcoleta = new String[6];

        while((linha = is.readLine())!= null){
            String[] dados = linha.split("[,]");
            for(int i = 0; i<nomeiacaosplit.length;i++){
                colecta += nomeiacaosplit[i];                
                for (int j = i; j < i+1; j++) {
                    colecta += dados[j]+", ";
                }
            }
            mostcoleta[l] = colecta;
            l++;
            colecta = "";
            
        }
        String menu ="Lista de Departamentos: ";
        for (int z = 0; z < 6; z++) {
            menu += "\n "+mostcoleta[z]+"";
                
            }
        JOptionPane.showMessageDialog(null, menu);
        }   
    
    public static void main(String[] args) throws IOException {
        new Leitura().leProduto();
    }
    
}
