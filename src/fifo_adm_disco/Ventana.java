/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fifo_adm_disco;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author jonatanLara
 */
public class Ventana extends javax.swing.JFrame {
    int Pa;
    int []Pistas = new int[8];
    String p;
    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelCanvas = new javax.swing.JPanel();
        Button = new javax.swing.JButton();
        PA = new javax.swing.JButton();
        Bits = new javax.swing.JButton();
        sumaTotal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelCanvas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout PanelCanvasLayout = new javax.swing.GroupLayout(PanelCanvas);
        PanelCanvas.setLayout(PanelCanvasLayout);
        PanelCanvasLayout.setHorizontalGroup(
            PanelCanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        PanelCanvasLayout.setVerticalGroup(
            PanelCanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 254, Short.MAX_VALUE)
        );

        Button.setText("hacer Linea");
        Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActionPerformed(evt);
            }
        });

        PA.setText("PA");
        PA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PAActionPerformed(evt);
            }
        });

        Bits.setText("Bits");
        Bits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BitsActionPerformed(evt);
            }
        });

        jLabel1.setText("Algoritmo de FIFO");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Movimiento de disco");

        jButton1.setText("?");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(PanelCanvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(PA)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(84, 84, 84)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(Bits)
                                        .addGap(37, 37, 37)
                                        .addComponent(Button)
                                        .addGap(30, 30, 30)
                                        .addComponent(jButton1)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sumaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button)
                    .addComponent(PA)
                    .addComponent(Bits)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(PanelCanvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sumaTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void regla(){
        int n =4;int cont =1;
        while (cont<400) {            
           int mul = n*cont;
           Dibujar.hacerLineas(PanelCanvas.getGraphics(), mul, 0, mul, 10,Color.BLUE);
           cont ++;
        }
    }
    private void ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonActionPerformed
        // llamo al panel , posx incial, posy incial, posicion de x1 largo posicion en y1 largo
        try {
            regla();
            pint();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese el PA y las Pistas");
        }
        
    }//GEN-LAST:event_ButtonActionPerformed
    public boolean conformar(String cadena){
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }
    public void suma(){
        int a,b,c,d,e,f,g,h;
         a=Pa-Pistas[0];//11-13 ---2
         b = Pistas[0]-Pistas[1];//13-7 ----6
         c = Pistas[1]-Pistas[2];//7-21--- 14
         d = Pistas[2]-Pistas[3];//21-5 ---16
         e = Pistas[3]-Pistas[4];//5-1--4
         f = Pistas[4]-Pistas[5];//1-40--
         g = Pistas[5]-Pistas[6];//40-31
         h = Pistas[6]-Pistas[7];//31-32
          Metodos m = new Metodos();
           int sm= m.PasarAPositivo(a)+m.PasarAPositivo(b)+m.PasarAPositivo(c)+m.PasarAPositivo(d)
                 +m.PasarAPositivo(e)+m.PasarAPositivo(f)+m.PasarAPositivo(g)+m.PasarAPositivo(h);    
           //System.out.println("suma total: "+ sm);
           sumaTotal.setText("Suma  :"+" "+String.valueOf(sm));
    }
    private void PAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PAActionPerformed
      
       String axu = JOptionPane.showInputDialog(null,"introduce el PA",JOptionPane.INFORMATION_MESSAGE);
        //System.out.println(""+Pa);
       Pa = Integer.parseInt(axu);
    }//GEN-LAST:event_PAActionPerformed

    private void BitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BitsActionPerformed
       // p = JOptionPane.showInputDialog(null,"introdusca la pistas #"+(i+1),JOptionPane.INFORMATION_MESSAGE);
        
        for (int i = 0; i < Pistas.length; i++) {
            p = JOptionPane.showInputDialog(null,"introdusca la pistas #"+(i+1),JOptionPane.INFORMATION_MESSAGE);
        Pistas[i]=Integer.parseInt(p);
  }         
         for (int i = 0; i < Pistas.length; i++) {
             //Pistas[i] = Pistas[i]+Pistas[i+1];
             System.out.println(Pistas[i]);
        }
       
    }//GEN-LAST:event_BitsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            Aviso v  = new Aviso(this, true);
            v.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
        public void pint(){
           
            Dibujar.hacerLineas(PanelCanvas.getGraphics(), Pa*10,        30, Pistas[0]*10, 50,Color.red);
            Dibujar.hacerLineas(PanelCanvas.getGraphics(), Pistas[0]*10, 50,Pistas[1]*10, 70,Color.blue);
            Dibujar.hacerLineas(PanelCanvas.getGraphics(), Pistas[1]*10, 70, Pistas[2]*10, 90,Color.red);
            Dibujar.hacerLineas(PanelCanvas.getGraphics(), Pistas[2]*10, 90, Pistas[3]*10, 110,Color.blue);
            Dibujar.hacerLineas(PanelCanvas.getGraphics(), Pistas[3]*10, 110, Pistas[4]*10, 130,Color.red);
            Dibujar.hacerLineas(PanelCanvas.getGraphics(), Pistas[4]*10, 130, Pistas[5]*10, 150,Color.blue);
            Dibujar.hacerLineas(PanelCanvas.getGraphics(), Pistas[5]*10, 150, Pistas[6]*10, 170,Color.red);
            Dibujar.hacerLineas(PanelCanvas.getGraphics(), Pistas[6]*10, 170, Pistas[7]*10, 190,Color.blue);
           // Dibujar.hacerLineas(PanelCanvas.getGraphics(), 320, 190, 0, 1110);
            suma();
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bits;
    private javax.swing.JButton Button;
    private javax.swing.JButton PA;
    private javax.swing.JPanel PanelCanvas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel sumaTotal;
    // End of variables declaration//GEN-END:variables
}
