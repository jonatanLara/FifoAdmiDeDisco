/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fifo_adm_disco;

import java.util.Scanner;

/**
 *
 * @author jonatanLara
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num[]= new int[8];
        int aux,PA,a,b,c,d,e,f,g,h;         
        Metodos m = new Metodos();
        Scanner leer= new Scanner(System.in);
        System.out.println("PA");
        PA= leer.nextInt();
        
        for (int i = 0; i < num.length; i++) {
            System.out.println("Introducir el elemento #"+(i+1)+";");
            num[i]=leer.nextInt();
        }
       
         a=PA-num[0];//11-13 ---2
         b = num[0]-num[1];//13-7 ----6
         c = num[1]-num[2];//7-21--- 14
         d = num[2]-num[3];//21-5 ---16
         e = num[3]-num[4];//5-1--4
         f = num[4]-num[5];//1-40--
         g = num[5]-num[6];//40-31
         h = num[6]-num[7];//31-32
       
         System.out.print(m.sumaNumero(a)+" ");
         System.out.print(m.sumaNumero(b)+" ");
         System.out.print(m.sumaNumero(c)+" ");
         System.out.print(m.sumaNumero(d)+" ");
         System.out.print(m.sumaNumero(e)+" ");
         System.out.print(m.sumaNumero(f)+" ");
         System.out.print(m.sumaNumero(g)+" ");
         System.out.print(m.sumaNumero(h)+" ");
         
         int sm= m.sumaNumero(a)+m.sumaNumero(b)+m.sumaNumero(c)+m.sumaNumero(d)
                 +m.sumaNumero(e)+m.sumaNumero(f)+m.sumaNumero(g)+m.sumaNumero(h);
         System.out.println("suma total: "+ sm);
//         m.imipir(m.sumaNumero(a));
//         m.imipir(m.sumaNumero(b));
//         m.imipir(m.sumaNumero(c));
//         m.imipir(m.sumaNumero(d));
//         m.imipir(m.sumaNumero(e));
//         m.imipir(m.sumaNumero(f));
//         m.imipir(m.sumaNumero(g));
//         m.imipir(m.sumaNumero(h));
//        
        System.out.println("");
     //   m.regla();
        m.arr(PA);
        m.arr(num[0]);
        m.arr(num[1]);
        m.arr(num[2]);
        m.arr(num[3]);
        m.arr(num[4]);
        m.arr(num[5]);
        m.arr(num[6]);
        m.arr(num[7]);
       }
        
    
}
