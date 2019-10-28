/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.vendas;


/**
 *
 * @author Mula
 */
public class VectorDeDados {
    private Object[] elementos;
    private int tamanho;
    
    public VectorDeDados(int capacidade){
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }
    
    /*Adiciona no vector*/
    public boolean adiciona(Object elemento){
        aumentacapacidade();
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
            }
        return false;
    }

    //Retorna tamanho do Vetor
     public int tamanho(){
         return this.tamanho;
     }
     
    @Override
     public String toString(){
         String s = "";
         for (int i = 0; i < this.tamanho-1; i++) {
             s+= this.elementos[i];
             s+=", ";
            }
         if(this.tamanho>0){
             s+= this.elementos[this.tamanho-1];
            }
         return s;
     }
   
     //Aumenta capacidade do veto
     public void aumentacapacidade(){
         if(this.tamanho == this.elementos.length){
             Object[] newElementos = new Object[this.elementos.length*2];
             for (int i = 0; i < this.elementos.length; i++) {
                 newElementos[i] = this.elementos[i];
             }
             this.elementos = newElementos;
         }
     }
     // Remove elemento no vetor por posicao
     public void removeP(int posicao){
         if(!(posicao>=0 && posicao<tamanho)){
             throw new IllegalArgumentException("Posicao Invalida!");
         }
         for (int i = posicao; i < tamanho-1; i++) {
             this.elementos[i]=this.elementos[i+1];
         }
         tamanho--;
     }
     
}
