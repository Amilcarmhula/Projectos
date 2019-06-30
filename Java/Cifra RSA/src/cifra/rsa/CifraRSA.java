/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifra.rsa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Mula
 */
public class CifraRSA {

    private int e;
    private int p;
    private int q;

    public CifraRSA() {
        this.e = 3;
        this.p = 17;
        this.q = 23;
    }

    public void verificacao_De_chaves() {

    }

    public int produtoPQ() {
        int n;
        n = this.p * this.q;
        return n;
    }

    public int fTotiente() {
        int ft;
        ft = (p - 1) * (q - 1);
        return ft;

    }

    public int inverso_multiplicativo() {
        int inv = 0;
        for (int i = 0; i < 999999999; i++) {
            if ((i * this.e) % fTotiente() == 1) {
                inv = i;
                break;
            }
        }
        return inv;
    }

    /*
    O codigo apresente comportamente nao desejavel para caracteres acentuados
    CORRIGIR SE POSSIVEL
     */
    public String encriptografa() throws FileNotFoundException, IOException {
        int c = 0;
        FileInputStream fis = new FileInputStream("E:/Programacao/New/Read.txt");
        int s = fis.read();
        String text = "";

        while (s != -1) {
            c = (int) Math.pow(s, this.e) % produtoPQ();
            text += c + " ";
            s = fis.read();
        }
        fis.close();
        return text;
    }

    public void save() throws FileNotFoundException, IOException {
        FileWriter fw = new FileWriter("E:/Programacao/New/Write.txt");
        fw.write(encriptografa());
        fw.close();

    }

    public String decriptografa() throws IOException {
        FileInputStream fis = new FileInputStream("E:/Programacao/New/Re-write.txt");
        int s = fis.read();
        String text = "";
        long m;
        while (s != -1) {
            m = (long) Math.pow(s, this.inverso_multiplicativo()) % produtoPQ();
            text += m + " ";
            s = fis.read();
        }
        System.out.println(text);
        return text;
    }

    public static void main(String[] args) throws IOException {
        CifraRSA c = new CifraRSA();

        c.encriptografa();

    }

}
