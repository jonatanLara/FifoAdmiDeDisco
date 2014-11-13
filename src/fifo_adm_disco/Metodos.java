/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fifo_adm_disco;

/**
 *
 * @author jonatanLara
 */
public class Metodos {
   
    public Metodos(){
       
    }
   
   public int PasarAPositivo(int i){
       if (i<0) {
           i = i*(-1);
           
       }
       else{
       
           return i;
       }
       return i;
   }
   
   public void arr(int x){
   String arreglo[] = new String[41];
   //String arRegla[] = new String[41];
   
      arreglo[x] =String.valueOf(x);
       for (int i = 0; i < arreglo.length; i++) {
           
           
           if (arreglo[i]==null) {
               System.out.print("-");
           }else{
                System.out.print(arreglo[i]);
           }
           
       }
       System.out.println("");
     }
    public void regla(int x){
    
        for (int i = 0; i < x; i++) {
            
            System.out.print(i);
        }
        
    }
}
