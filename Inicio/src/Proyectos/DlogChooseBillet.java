
package Proyectos;

import control.*;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class DlogChooseBillet extends javax.swing.JDialog {
    private Integer[] dataUser;
    private Integer[] dataMachine;
    private AccionListenerTotalMoney listenerTotalMoney;
    private AccionListenerEditData listenerArray;
    private Integer dineroInicial;
    private Integer dineroIngresado;
    private Integer[] cantidadDinero;
    private Integer totalMoney;
    

    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public DlogChooseBillet(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        initArrays();
        this.dineroInicial = 100;
        this.dineroIngresado = 0;
        this.totalMoney = 0;
        this.cantidadDinero = new Integer[5];
        lblMostrarBillet.setText("Se ha Ingresado: $" + totalMoney + " a la Maquina");
        this.repaint();
        btnBillet20.setPressedIcon(initPresssedButton("billete20.jpg"));
        btnBillet50.setPressedIcon(initPresssedButton("billete50.jpg"));
        btnBillet100.setPressedIcon(initPresssedButton("billete100.jpg"));
        btnBillet200.setPressedIcon(initPresssedButton("billete200.jpg"));
        btnBillet500.setPressedIcon(initPresssedButton("billete500.jpg"));
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnBillet20 = new javax.swing.JButton();
        btnBillet50 = new javax.swing.JButton();
        btnBillet100 = new javax.swing.JButton();
        btnBillet200 = new javax.swing.JButton();
        btnBillet500 = new javax.swing.JButton();
        lblMostrarBillet = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnOkBillets = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Set Billets");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Calculator", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Escoge Que Billetes Quieres Dar");
        jLabel2.setToolTipText("");

        btnBillet20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/billete20.jpg"))); // NOI18N
        btnBillet20.setToolTipText("");
        btnBillet20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBillet20ActionPerformed(evt);
            }
        });

        btnBillet50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/billete50.jpg"))); // NOI18N
        btnBillet50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBillet50ActionPerformed(evt);
            }
        });

        btnBillet100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/billete100.jpg"))); // NOI18N
        btnBillet100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBillet100ActionPerformed(evt);
            }
        });

        btnBillet200.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/billete200.jpg"))); // NOI18N
        btnBillet200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBillet200ActionPerformed(evt);
            }
        });

        btnBillet500.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/billete500.jpg"))); // NOI18N
        btnBillet500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBillet500ActionPerformed(evt);
            }
        });

        lblMostrarBillet.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMostrarBillet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMostrarBillet.setText("jLabel6");

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        btnOkBillets.setText("Aceptar");
        btnOkBillets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkBilletsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOkBillets)
                .addGap(74, 74, 74))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOkBillets)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnBillet20, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBillet50, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBillet100, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBillet200, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBillet500, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addComponent(lblMostrarBillet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnBillet200, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBillet500, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBillet50, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnBillet100, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBillet20, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(lblMostrarBillet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkBilletsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkBilletsActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnOkBilletsActionPerformed

    private void btnBillet20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBillet20ActionPerformed
        //comparative(cantidadDinero[0], 20);
        comparative(4, "20");
    }//GEN-LAST:event_btnBillet20ActionPerformed

    private void btnBillet50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBillet50ActionPerformed
        //comparative(cantidadDinero[1], 50);
        comparative( 5, "50");
    }//GEN-LAST:event_btnBillet50ActionPerformed

    private void btnBillet100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBillet100ActionPerformed
        //comparative(cantidadDinero[2], 100);
        comparative( 6, "100");
    }//GEN-LAST:event_btnBillet100ActionPerformed

    private void btnBillet200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBillet200ActionPerformed
        //comparative(cantidadDinero[3], 200);
        comparative( 7, "200");
    }//GEN-LAST:event_btnBillet200ActionPerformed

    private void btnBillet500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBillet500ActionPerformed
        //comparative(cantidadDinero[4], 500);
        comparative( 8, "500");
    }//GEN-LAST:event_btnBillet500ActionPerformed

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated
        // TODO add your handling code here:
        this.listenerArray.passArrayValueUser(this.dataUser);
        this.listenerArray.passArrayValueMachine(this.dataMachine);
        this.listenerTotalMoney.passValueTotalMoney(this.totalMoney);
    }//GEN-LAST:event_formWindowDeactivated
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBillet100;
    private javax.swing.JButton btnBillet20;
    private javax.swing.JButton btnBillet200;
    private javax.swing.JButton btnBillet50;
    private javax.swing.JButton btnBillet500;
    private javax.swing.JButton btnOkBillets;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblMostrarBillet;
    // End of variables declaration//GEN-END:variables

    public void setDineroIngresado(Integer result){
        this.totalMoney = result;
        lblMostrarBillet.setText("Se ha Ingresado: $" + result + " a la Maquina");

    }
    public void setDineroGuardado(Integer dineroInicial){
      this.dineroInicial = dineroInicial;  
      cantidadDinero[0] = dineroInicial/20;
      cantidadDinero[1] = dineroInicial/50;
      cantidadDinero[2] = dineroInicial/100;
      cantidadDinero[3] = dineroInicial/200;
      cantidadDinero[4] = dineroInicial/500;
    }
    private void comparative(Integer value, int num){
        boolean bin;
        if(value <= 0){
            for (Integer i : cantidadDinero) {
                bin = (i == 0) ? true : false;
                if(bin){
                    JOptionPane.showMessageDialog(this, "YA NO TIENES DINERO", "BYE", JOptionPane.WARNING_MESSAGE);
                    this.setVisible(false);
                    break;
                }else{
                    JOptionPane.showMessageDialog(this, "No Tienes ese Billete", "Lastima", JOptionPane.WARNING_MESSAGE);
                }
            }
        }else{
            this.dineroIngresado += num;
            lblMostrarBillet.setText("Se ha Ingresado: $" + this.dineroIngresado + " a la Maquina");
            switch(num){
                case 20:
                    dineroInicial -= num;
                    setDineroGuardado(dineroInicial);
                    break;
                case 50:
                    dineroInicial -= num;
                    setDineroGuardado(dineroInicial);
                    break;
                case 100:    
                    dineroInicial -= num;
                    setDineroGuardado(dineroInicial);
                    break;
                case 200:
                    dineroInicial -= num;
                    setDineroGuardado(dineroInicial);
                    break;
                case 500:
                    dineroInicial -= num;
                   setDineroGuardado(dineroInicial);
                    break;
            }
        }
    }
    public void setArraysData(Integer[] dataUser, Integer[] dataMachine){
        this.dataUser = dataUser;
        this.dataMachine = dataMachine;
    }
    private void comparative(Integer iterador, String num){
        int bin = 0;
        for(int i = 0; i < dataUser.length; i++){
            if(i >= 4 && dataUser[i] == 0){
                bin++;
            }
        }
        if(bin >= 9 ){
        JOptionPane.showMessageDialog(this, "YA NO TIENES BILLETES", "BYE", JOptionPane.WARNING_MESSAGE);
        this.setVisible(false);
        }
        else if((this.dataUser[iterador] == 0) && (bin < 9)){
            JOptionPane.showMessageDialog(this, "No Tines Billetes de $" + num, "Lastima", JOptionPane.WARNING_MESSAGE);
        }else{
            dataUser[iterador] -= 1;
            dataMachine[iterador] += 1;
            totalMoney += Integer.valueOf(num); 
            lblMostrarBillet.setText("Se ha Ingresado: $" + totalMoney + " a la Maquina");
        }
    }
    private void initArrays(){
        this.dataMachine = new Integer[11];
        dataMachine[0] = 37;
        dataMachine[1] = 0;
        dataMachine[2] = 15;
        dataMachine[3] = 45;
        dataMachine[4] = 0;
        dataMachine[5] = 7;
        dataMachine[6] = 3;
        dataMachine[7] = 0;
        dataMachine[8] = 0;
        dataMachine[9] = 17;
        dataMachine[10] = 27;
        this.dataUser = new Integer[9];
        for(int i = 0; i < dataUser.length; i++){
            if(i == 6){
                dataUser[i] = 1;
            }else{
                dataUser[i] = 0;
            }
        }
    }
    
    private ImageIcon initPresssedButton(String nameImage){
        ImageIcon icon = new ImageIcon(getClass().getResource("/Images/" + nameImage));
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(icon.getIconWidth() - 2, icon.getIconHeight() - 2, Image.SCALE_DEFAULT));
        return icono;
    }
    
    public void addAccionListener(AccionListenerTotalMoney listener) {
        this.listenerTotalMoney = listener;
    }
     public void addAccionListener(AccionListenerEditData listener) {
        this.listenerArray = listener;
    }
}
