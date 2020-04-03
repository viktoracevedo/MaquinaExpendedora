package Proyectos;


import control.AccionListenerEditData;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DlogEditUser extends javax.swing.JDialog {
    public static final Integer[] MAIN_NUM = {1,2,5,10,20,50,100,200,500};
    private Integer[] dataUser;
    private JTextField[] arrayEdtUser;
    private JLabel[] arrayLbl;
    private AccionListenerEditData listener;
    private Integer total;
    private boolean booleano;
    private int aux;
   
    public DlogEditUser(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        lblCantidadTotal.setText("Cantidad Total: $100");
        this.total = 0;
        
        initArrays();
        for(int i = 0; i < arrayEdtUser.length; i++ ){
        arrayEdtUser[i].setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            int iterador = i;
            arrayEdtUser[iterador].addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e){
                char letra = e.getKeyChar();
                int tecla = (int)e.getKeyChar();
                if(!Character.isDigit(letra) &&  tecla != 8){
                    booleano = true;
                    aux = iterador;
                }else{
                    booleano = false;
                    aux = iterador;
                }
            }
            });
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        btnAceptarEditUser = new javax.swing.JButton();
        btnResetEditUser = new javax.swing.JButton();
        btnCancelarEditUser = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        lblCantidadTotal = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl10 = new javax.swing.JLabel();
        lbl20 = new javax.swing.JLabel();
        lbl50 = new javax.swing.JLabel();
        lbl100 = new javax.swing.JLabel();
        lbl200 = new javax.swing.JLabel();
        lbl500 = new javax.swing.JLabel();
        edt$1user = new javax.swing.JTextField();
        edt$2user = new javax.swing.JTextField();
        edt$5user = new javax.swing.JTextField();
        edt$10user = new javax.swing.JTextField();
        edt$20user = new javax.swing.JTextField();
        edt$50user = new javax.swing.JTextField();
        edt$100user = new javax.swing.JTextField();
        edt$200user = new javax.swing.JTextField();
        edt$500user = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit User");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        btnAceptarEditUser.setText("ACEPTAR");
        btnAceptarEditUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarEditUserActionPerformed(evt);
            }
        });

        btnResetEditUser.setText("RESET");
        btnResetEditUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetEditUserActionPerformed(evt);
            }
        });

        btnCancelarEditUser.setText("CANCELAR");
        btnCancelarEditUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEditUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAceptarEditUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnResetEditUser)
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelarEditUser)
                .addGap(56, 56, 56))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarEditUser)
                    .addComponent(btnResetEditUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelarEditUser)
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setPreferredSize(new java.awt.Dimension(300, 400));

        lblCantidadTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCantidadTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantidadTotal.setText("Cantidad Inicial: $100");

        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl1.setText("Monedas de $1:");
        lbl1.setMaximumSize(new java.awt.Dimension(20, 20));

        lbl2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl2.setText("Monedas de $2:");
        lbl2.setMaximumSize(new java.awt.Dimension(20, 20));

        lbl5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl5.setText("Monedas de $5:");
        lbl5.setMaximumSize(new java.awt.Dimension(20, 20));

        lbl10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl10.setText("Monedas de $10:");
        lbl10.setMaximumSize(new java.awt.Dimension(20, 20));

        lbl20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl20.setText("Billetes de $20:");
        lbl20.setMaximumSize(new java.awt.Dimension(20, 20));

        lbl50.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl50.setText("Billetes de $50:");
        lbl50.setMaximumSize(new java.awt.Dimension(20, 20));

        lbl100.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl100.setText("Billetes de $100:");
        lbl100.setMaximumSize(new java.awt.Dimension(20, 20));

        lbl200.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl200.setText("Billetes de $200:");
        lbl200.setMaximumSize(new java.awt.Dimension(20, 20));

        lbl500.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl500.setText("Billetes de $500:");
        lbl500.setMaximumSize(new java.awt.Dimension(20, 20));

        edt$1user.setText("0");
        edt$1user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edt$1userFocusGained(evt);
            }
        });
        edt$1user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edt$1userKeyReleased(evt);
            }
        });

        edt$2user.setText("0");
        edt$2user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edt$2userFocusGained(evt);
            }
        });
        edt$2user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edt$2userKeyReleased(evt);
            }
        });

        edt$5user.setText("0");
        edt$5user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edt$5userFocusGained(evt);
            }
        });
        edt$5user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edt$5userKeyReleased(evt);
            }
        });

        edt$10user.setText("0");
        edt$10user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edt$10userFocusGained(evt);
            }
        });
        edt$10user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edt$10userKeyReleased(evt);
            }
        });

        edt$20user.setText("0");
        edt$20user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edt$20userFocusGained(evt);
            }
        });
        edt$20user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edt$20userKeyReleased(evt);
            }
        });

        edt$50user.setText("0");
        edt$50user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edt$50userFocusGained(evt);
            }
        });
        edt$50user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edt$50userKeyReleased(evt);
            }
        });

        edt$100user.setText("1");
        edt$100user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edt$100userFocusGained(evt);
            }
        });
        edt$100user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edt$100userKeyReleased(evt);
            }
        });

        edt$200user.setText("0");
        edt$200user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edt$200userFocusGained(evt);
            }
        });
        edt$200user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edt$200userKeyReleased(evt);
            }
        });

        edt$500user.setText("0");
        edt$500user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edt$500userFocusGained(evt);
            }
        });
        edt$500user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edt$500userKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl50, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl100, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl200, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl500, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 27, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edt$10user, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(edt$2user, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(edt$1user, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(edt$5user, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(edt$20user, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edt$50user, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edt$100user, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edt$200user, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edt$500user, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblCantidadTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCantidadTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edt$1user, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edt$2user, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edt$5user, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edt$10user, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edt$20user, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl50, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edt$50user, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl100, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edt$100user, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl200, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edt$200user, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl500, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edt$500user, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarEditUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarEditUserActionPerformed
        boolean bin = false;
        for(int i = 0; i < arrayEdtUser.length; i++){
            if(arrayEdtUser[i].getText().equals("")){
                bin = true;
                break;
            }
        }
        if((booleano) || (bin)){
            JOptionPane.showMessageDialog(this, "No puedes Guardar", "Has Ingresado valores invalidos", 0, null);
        }else{
            for(int i= 0; i < dataUser.length; i++){
                dataUser[i] = Integer.valueOf(arrayEdtUser[i].getText());
            }
        this.setVisible(false);
        }
    }//GEN-LAST:event_btnAceptarEditUserActionPerformed

    private void btnCancelarEditUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEditUserActionPerformed
        for(int i= 0; i < arrayEdtUser.length; i++){
            arrayEdtUser[i].setText(dataUser[i] + "");
            arrayEdtUser[i].setForeground(Color.BLACK);
            arrayEdtUser[i].setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        }
        for (JLabel i : arrayLbl) {
            i.setForeground(Color.BLACK);
        }
        booleano = false;
        setActualizacion();
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarEditUserActionPerformed

    private void btnResetEditUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetEditUserActionPerformed
        for(int i = 0; i < arrayEdtUser.length; i++){
            if(i == 6){
                arrayEdtUser[i].setText("1");
            }else{
                arrayEdtUser[i].setText("0");
            }
            arrayLbl[i].setForeground(Color.BLACK);
            arrayEdtUser[i].setForeground(Color.BLACK);
            arrayEdtUser[i].setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            booleano = false;
        }
        lblCantidadTotal.setText("Cantidad Total: $100");
        setActualizacion();
    }//GEN-LAST:event_btnResetEditUserActionPerformed

    private void edt$2userKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edt$2userKeyReleased
        setActualizacion();
    }//GEN-LAST:event_edt$2userKeyReleased

    private void edt$5userKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edt$5userKeyReleased
        setActualizacion();
    }//GEN-LAST:event_edt$5userKeyReleased

    private void edt$10userKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edt$10userKeyReleased
        setActualizacion();
    }//GEN-LAST:event_edt$10userKeyReleased

    private void edt$20userKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edt$20userKeyReleased
        setActualizacion();
    }//GEN-LAST:event_edt$20userKeyReleased

    private void edt$50userKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edt$50userKeyReleased
        setActualizacion();
    }//GEN-LAST:event_edt$50userKeyReleased

    private void edt$100userKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edt$100userKeyReleased
        setActualizacion();
    }//GEN-LAST:event_edt$100userKeyReleased

    private void edt$200userKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edt$200userKeyReleased
        setActualizacion();
    }//GEN-LAST:event_edt$200userKeyReleased

    private void edt$500userKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edt$500userKeyReleased
        setActualizacion();
    }//GEN-LAST:event_edt$500userKeyReleased

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated
        this.listener.passArrayValueUser(this.dataUser);
    }//GEN-LAST:event_formWindowDeactivated

    private void edt$1userKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edt$1userKeyReleased
        setActualizacion();
    }//GEN-LAST:event_edt$1userKeyReleased

    private void edt$1userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edt$1userFocusGained
        arrayEdtUser[0].setText("");
    }//GEN-LAST:event_edt$1userFocusGained

    private void edt$2userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edt$2userFocusGained
        arrayEdtUser[1].setText("");
    }//GEN-LAST:event_edt$2userFocusGained

    private void edt$5userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edt$5userFocusGained
         arrayEdtUser[2].setText("");
    }//GEN-LAST:event_edt$5userFocusGained

    private void edt$10userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edt$10userFocusGained
        arrayEdtUser[3].setText("");
    }//GEN-LAST:event_edt$10userFocusGained

    private void edt$20userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edt$20userFocusGained
        arrayEdtUser[4].setText("");
    }//GEN-LAST:event_edt$20userFocusGained

    private void edt$50userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edt$50userFocusGained
         arrayEdtUser[5].setText("");
    }//GEN-LAST:event_edt$50userFocusGained

    private void edt$100userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edt$100userFocusGained
        arrayEdtUser[6].setText("");
    }//GEN-LAST:event_edt$100userFocusGained

    private void edt$200userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edt$200userFocusGained
         arrayEdtUser[7].setText("");
    }//GEN-LAST:event_edt$200userFocusGained

    private void edt$500userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edt$500userFocusGained
         arrayEdtUser[8].setText("");
    }//GEN-LAST:event_edt$500userFocusGained

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarEditUser;
    private javax.swing.JButton btnCancelarEditUser;
    private javax.swing.JButton btnResetEditUser;
    private javax.swing.JTextField edt$100user;
    private javax.swing.JTextField edt$10user;
    private javax.swing.JTextField edt$1user;
    private javax.swing.JTextField edt$200user;
    private javax.swing.JTextField edt$20user;
    private javax.swing.JTextField edt$2user;
    private javax.swing.JTextField edt$500user;
    private javax.swing.JTextField edt$50user;
    private javax.swing.JTextField edt$5user;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl100;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl20;
    private javax.swing.JLabel lbl200;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl50;
    private javax.swing.JLabel lbl500;
    private javax.swing.JLabel lblCantidadTotal;
    // End of variables declaration//GEN-END:variables
    
    public void setActualizacion(){
        total = 0;
        for(int i = 0; i < DlogEditUser.MAIN_NUM.length ; i++){
            if(booleano){
                lblCantidadTotal.setText("NO SE PERMITEN LETRAS");
                arrayLbl[aux].setForeground(Color.RED);
                arrayEdtUser[aux].setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                arrayEdtUser[aux].setForeground(Color.RED);
                break;
            }else{
                total += DlogEditUser.MAIN_NUM[i] * Integer.valueOf(arrayEdtUser[i].getText().equals("") ? "0" : arrayEdtUser[i].getText());
                arrayLbl[i].setForeground(Color.BLACK);
                arrayEdtUser[i].setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                arrayEdtUser[i].setForeground(Color.BLACK);
                
            }
            if(arrayEdtUser[i].getText().equals("")){
                arrayEdtUser[i].setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                //tempUno = true;
            }else{
                arrayEdtUser[i].setForeground(Color.BLACK);
                arrayEdtUser[i].setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                //tempUno = false;
            }
            lblCantidadTotal.setText("Cantidad Total: $" + total);
        }
    }
    
    private void initArrays(){
        this.dataUser = new Integer[9];
        for(int i = 0; i < dataUser.length; i++){
            if(i == 6){
                dataUser[i] = 1;
            }else{
                dataUser[i] = 0;
            }
        }
        arrayEdtUser = new JTextField[9];
        arrayEdtUser[0] = edt$1user;
        arrayEdtUser[1] = edt$2user;
        arrayEdtUser[2] = edt$5user;
        arrayEdtUser[3] = edt$10user;
        arrayEdtUser[4] = edt$20user;
        arrayEdtUser[5] = edt$50user;
        arrayEdtUser[6] = edt$100user;
        arrayEdtUser[7] = edt$200user;
        arrayEdtUser[8] = edt$500user;
        arrayLbl = new JLabel[9];
        arrayLbl[0] = lbl1;
        arrayLbl[1] = lbl2;
        arrayLbl[2] = lbl5;
        arrayLbl[3] = lbl10;
        arrayLbl[4] = lbl20;
        arrayLbl[5] = lbl50;
        arrayLbl[6] = lbl100;
        arrayLbl[7] = lbl200;
        arrayLbl[8] = lbl500;
    }
    
    public void addAccionListener(AccionListenerEditData listener) {
        this.listener = listener;
    }


}
