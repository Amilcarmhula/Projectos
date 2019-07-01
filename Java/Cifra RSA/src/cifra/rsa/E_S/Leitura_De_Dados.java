/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifra.rsa.E_S;


import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Mula
 */
public final class Leitura_De_Dados {
    private int m;
    
   
            
    public void mensagem() throws IOException{
        FileInputStream fis = new FileInputStream("E:/Programacao/New/f.txt");
        short s = (short)fis.read();
        String text = "";
        while(s!=-1){
            System.out.println(s);
            text += s+" ";
            s=(short) fis.read();
        }
        System.out.println(text);
        fis.close();
        
    }
    public static void main(String[] args) throws IOException {
        
        Leitura_De_Dados l  = new Leitura_De_Dados();
        
        l.mensagem();
        
    }
    
    
}
