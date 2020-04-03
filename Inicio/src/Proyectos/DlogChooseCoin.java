package Proyectos;

import control.*;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class DlogChooseCoin extends javax.swing.JDialog {
    private Integer[] dataUser;
    private Integer[] dataMachine;
    private AccionListenerTotalMoney listenerTotalMoney;
    private AccionListenerEditData listener;
    private Integer dineroInicial;
    private Integer dineroIngresado;
    private Integer[] cantidadDinero;
    private Integer nose;
    private Integer totalMoney;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public DlogChooseCoin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.dineroInicial = 100;
        this.dineroIngresado = 0;
        this.totalMoney = 0;
        lblMostrarCoin.setText("Se ha Ingresado: $" + totalMoney + " a la Maquina");
        this.cantidadDinero = new Integer[4];
        this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnCoin1 = new javax.swing.JLabel();
        btnCoin2 = new javax.swing.JLabel();
        btnCoin5 = new javax.swing.JLabel();
        btnCoin10 = new javax.swing.JLabel();
        lblMostrarCoin = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnOkCoin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Set Coin");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Calculator", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Escoge Que Moneda Quieres Dar");
        jLabel2.setToolTipText("");

        btnCoin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/moneda1.png"))); // NOI18N
        btnCoin1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnCoin1MouseMoved(evt);
            }
        });
        btnCoin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCoin1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCoin1MouseExited(evt);
            }
        });

        btnCoin2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/moneda2.png"))); // NOI18N
        btnCoin2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnCoin2MouseMoved(evt);
            }
        });
        btnCoin2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCoin2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCoin2MouseExited(evt);
            }
        });

        btnCoin5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/moneda5.png"))); // NOI18N
        btnCoin5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnCoin5MouseMoved(evt);
            }
        });
        btnCoin5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCoin5MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCoin5MouseExited(evt);
            }
        });

        btnCoin10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/moneda10.png"))); // NOI18N
        btnCoin10.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnCoin10MouseMoved(evt);
            }
        });
        btnCoin10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCoin10MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCoin10MouseExited(evt);
            }
        });

        lblMostrarCoin.setDisplayedMnemonic('S');
        lblMostrarCoin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMostrarCoin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMostrarCoin.setText("jLabel6");

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        btnOkCoin.setText("Aceptar");
        btnOkCoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkCoinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOkCoin)
                .addGap(74, 74, 74))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOkCoin)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnCoin1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCoin2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCoin5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCoin10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblMostrarCoin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCoin5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnCoin1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCoin2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCoin10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(lblMostrarCoin)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void btnOkCoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkCoinActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnOkCoinActionPerformed

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated
        
        this.listenerTotalMoney.passValueTotalMoney(this.totalMoney);
        this.listener.passArrayValueUser(this.dataUser);
        this.listener.passArrayValueMachine(this.dataMachine);
    }//GEN-LAST:event_formWindowDeactivated

    private void btnCoin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCoin1MouseClicked
        btnCoin1.setIcon(initPresssedButton("moneda1.png"));
        comparative(0, "1");
    }//GEN-LAST:event_btnCoin1MouseClicked

    private void btnCoin2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCoin2MouseClicked
        btnCoin2.setIcon(initPresssedButton("moneda2.png"));
        comparative(1, "2");
    }//GEN-LAST:event_btnCoin2MouseClicked

    private void btnCoin5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCoin5MouseClicked
        btnCoin5.setIcon(initPresssedButton("moneda5.png"));
        comparative(2, "5");
    }//GEN-LAST:event_btnCoin5MouseClicked

    private void btnCoin10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCoin10MouseClicked
        btnCoin10.setIcon(initPresssedButton("moneda10.png"));
        comparative(3, "10");
    }//GEN-LAST:event_btnCoin10MouseClicked

    private void btnCoin1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCoin1MouseExited
        btnCoin1.setIcon(setIcono("moneda1.png"));
    }//GEN-LAST:event_btnCoin1MouseExited

    private void btnCoin2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCoin2MouseExited
        btnCoin2.setIcon(setIcono("moneda2.png"));
    }//GEN-LAST:event_btnCoin2MouseExited

    private void btnCoin5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCoin5MouseExited
        btnCoin5.setIcon(setIcono("moneda5.png"));
    }//GEN-LAST:event_btnCoin5MouseExited

    private void btnCoin10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCoin10MouseExited
        btnCoin10.setIcon(setIcono("moneda10.png"));
    }//GEN-LAST:event_btnCoin10MouseExited

    private void btnCoin1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCoin1MouseMoved
        btnCoin1.setIcon(setIcono("moneda1.png"));
    }//GEN-LAST:event_btnCoin1MouseMoved

    private void btnCoin2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCoin2MouseMoved
        btnCoin2.setIcon(setIcono("moneda2.png"));
    }//GEN-LAST:event_btnCoin2MouseMoved

    private void btnCoin5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCoin5MouseMoved
        btnCoin5.setIcon(setIcono("moneda5.png"));
    }//GEN-LAST:event_btnCoin5MouseMoved

    private void btnCoin10MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCoin10MouseMoved
       btnCoin10.setIcon(setIcono("moneda10.png"));
    }//GEN-LAST:event_btnCoin10MouseMoved

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCoin1;
    private javax.swing.JLabel btnCoin10;
    private javax.swing.JLabel btnCoin2;
    private javax.swing.JLabel btnCoin5;
    private javax.swing.JButton btnOkCoin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblMostrarCoin;
    // End of variables declaration//GEN-END:variables
    public void setDineroIngresado(Integer result){
        this.totalMoney = result;
        lblMostrarCoin.setText("Se ha Ingresado: $" + result + " a la Maquina");

    }
//    public void setDineroGuardado(Integer dineroInicial){
//      this.dineroInicial = dineroInicial;  
//      cantidadDinero[0] = dineroInicial/1;
//      cantidadDinero[1] = dineroInicial/2;
//      cantidadDinero[2] = dineroInicial/5;
//      cantidadDinero[3] = dineroInicial/10;
//    }
//    private void comparative(Integer value, Integer num){
//        boolean bin;
//        if(value <= 0){
//            for (Integer i : cantidadDinero) {
//                bin = (i == 0) ? true : false;
//                if(bin){
//                    JOptionPane.showMessageDialog(this, "YA NO TIENES DINERO", "BYE", JOptionPane.WARNING_MESSAGE);
//                    this.setVisible(false);
//                    break;
//                }else{
//                    JOptionPane.showMessageDialog(this, "No Tienes esa Moneda", "Lastima", JOptionPane.WARNING_MESSAGE);
//                }
//            }
//        }else{
//            this.dineroIngresado += num;
//            lblMostrarCoin.setText("Se ha Ingresado: $" + this.dineroIngresado + " a la Maquina");
//            switch(num){
//                case 1:
//                    dineroInicial -= num;
//                    setDineroGuardado(dineroInicial);
//                    break;
//                case 2:
//                    dineroInicial -= num;
//                    setDineroGuardado(dineroInicial);
//                    break;
//                case 5:    
//                    dineroInicial -= num;
//                    setDineroGuardado(dineroInicial);
//                    break;
//                case 10:
//                    dineroInicial -= num;
//                    setDineroGuardado(dineroInicial);
//                    break;
//            }
//        }
//    }
    public void setArraysData(Integer[] dataUser, Integer[] dataMachine){
        this.dataUser = dataUser;
        this.dataMachine = dataMachine;
    }
    private void comparative(Integer iterador, String num){
        int bin = 0;
        for(int i = 0; i < dataUser.length; i++){
            if(i < 4 && dataUser[i] == 0){
                bin++;
            }
        }
        if(bin >= 4 ){
        JOptionPane.showMessageDialog(this, "YA NO TIENES MONEDAS", "BYE", JOptionPane.WARNING_MESSAGE);
        this.setVisible(false);
        }
        else if((this.dataUser[iterador] == 0) && (bin < 9)){
            JOptionPane.showMessageDialog(this, "No Tienes esa Moneda de $" + num, "Lastima", JOptionPane.WARNING_MESSAGE);
        }else{
            dataUser[iterador] -= 1;
            dataMachine[iterador] += 1;
            totalMoney += Integer.valueOf(num); 
            lblMostrarCoin.setText("Se ha Ingresado: $" + totalMoney + " a la Maquina");
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
    private Dimension PresssedButton(String nameImage){
        ImageIcon icon = new ImageIcon(getClass().getResource("/Images/" + nameImage));
        int width = icon.getIconWidth();
        int heaight = icon.getIconHeight();
        Dimension icono = new Dimension(width, heaight);
        return icono;
    }
    
    private ImageIcon initPresssedButton(String nameImage){
        ImageIcon icon = new ImageIcon(getClass().getResource("/Images/" + nameImage));
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(icon.getIconWidth() - 10, icon.getIconHeight() - 10, Image.SCALE_DEFAULT));
        return icono;
    }
    private ImageIcon setIcono(String nameImage){
        ImageIcon icon = new ImageIcon(getClass().getResource("/Images/" + nameImage));
        return icon;
    }
    
    public void addAccionListener(AccionListenerTotalMoney listener) {
        this.listenerTotalMoney = listener;
    }
    public void addAccionListener(AccionListenerEditData listener) {
        this.listener = listener;
    }
}
