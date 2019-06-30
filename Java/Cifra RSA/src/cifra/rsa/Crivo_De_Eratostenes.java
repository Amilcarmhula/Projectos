/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifra.rsa;

/**
 *
 * @author Mula
 */
public class Crivo_De_Eratostenes {

    private final int valorLimete;
    private final int[] vCrivo;
    private int[] vCrivoReduzido = new int[1];

    public Crivo_De_Eratostenes(int valorLimite) {
        this.valorLimete = valorLimite;
        this.vCrivo = new int[valorLimite - 1];
        preenche_vCrivo();
    }

    public final void preenche_vCrivo() {
        for (int i = 0; i < vCrivo.length; i++) {
            vCrivo[i] = 2 + i;
        }
        check_Crivo();
    }

    public int limiteCrivo() {
        int check;
        check = (int) Math.floor(Math.sqrt(valorLimete));
        return check;
    }

    public void check_Crivo() {
        int limite;
        limite = limiteCrivo();
        for (int i = 0; i <= limite; i++) {
            if (vCrivo[i] != 0) {
                for (int j = 1 + i; j < vCrivo.length; j++) {
                    if (vCrivo[j] % vCrivo[i] == 0) {
                        vCrivo[j] = 0;
                    }
                }
            }
        }
        mostraCrivo();
    }

    public void reduzVetorCrivo() {
        int count = 0;
        for (int i = 0; i < vCrivo.length; i++) {
            if (vCrivo[i] != 0) {
                vCrivoReduzido[count] = vCrivo[i];
                count++;

                int[] vaux = new int[vCrivoReduzido.length + 1];
                for (int j = 0; j < vCrivoReduzido.length; j++) {
                    vaux[j] = vCrivoReduzido[j];
                }
                this.vCrivoReduzido = vaux;
            }
        }
    }

    public void mostraCrivo() {
        reduzVetorCrivo();
        String v = "[ ";
        for (int i = 0; i < vCrivoReduzido.length - 1; i++) {
            v += vCrivoReduzido[i] + ", ";
        }
        v += "]";
        System.out.println(v);
    }

    public static void main(String[] args) {
        Crivo_De_Eratostenes ce = new Crivo_De_Eratostenes(20);
    }
}
