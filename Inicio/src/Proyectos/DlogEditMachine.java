package Proyectos;

import control.AccionListenerEditData;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DlogEditMachine extends javax.swing.JDialog {
    private Integer[] dataMachine;
    private JTextField[] arrayEdtMachine;
    private JLabel[] arrayLbl;
    private AccionListenerEditData listener;
    private boolean booleano;
    private int aux;
    
    public DlogEditMachine(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        lblMensaje.setText("");
        initArrays(); 
        
        for(int i = 0; i < arrayEdtMachine.length; i++ ){
        arrayEdtMachine[i].setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            int iterador = i;
            arrayEdtMachine[iterador].addKeyListener(new KeyAdapter() {
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

        jPanel4 = new javax.swing.JPanel();
        lblCostoSoda = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl10 = new javax.swing.JLabel();
        lbl20 = new javax.swing.JLabel();
        lbl50 = new javax.swing.JLabel();
        lbl100 = new javax.swing.JLabel();
        lbl200 = new javax.swing.JLabel();
        lbl500 = new javax.swing.JLabel();
        edt$Refresco = new javax.swing.JTextField();
        edt$Cantidad = new javax.swing.JTextField();
        edt$1 = new javax.swing.JTextField();
        edt$2 = new javax.swing.JTextField();
        edt$5 = new javax.swing.JTextField();
        edt$10 = new javax.swing.JTextField();
        edt$20 = new javax.swing.JTextField();
        edt$50 = new javax.swing.JTextField();
        edt$100 = new javax.swing.JTextField();
        edt$200 = new javax.swing.JTextField();
        edt$500 = new javax.swing.JTextField();
        lblMensaje = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnAceptarEditMachine = new javax.swing.JButton();
        btnCancelarEditMachine = new javax.swing.JButton();
        btnResetEditMachine = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Machine");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setPreferredSize(new java.awt.Dimension(300, 400));

        lblCostoSoda.setText("Costo del Refresco:");

        lblCantidad.setText("Cantidad de Refrescos:");

        lbl1.setText("Monedas de $1:");

        lbl2.setText("Monedas de $2:");

        lbl5.setText("Monedas de $5:");

        lbl10.setText("Monedas de $10:");

        lbl20.setText("Billetes de $20:");

        lbl50.setText("Billetes de $50:");

        lbl100.setText("Billetes de $100:");

        lbl200.setText("Billetes de $200:");

        lbl500.setText("Billetes de $500:");

        edt$Refresco.setText("17");
        edt$Refresco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edt$RefrescoFocusGained(evt);
            }
        });
        edt$Refresco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edt$RefrescoKeyReleased(evt);
            }
        });

        edt$Cantidad.setText("27");
        edt$Cantidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edt$CantidadFocusGained(evt);
            }
        });
        edt$Cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edt$CantidadKeyReleased(evt);
            }
        });

        edt$1.setText("37");
        edt$1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edt$1FocusGained(evt);
            }
        });
        edt$1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edt$1KeyReleased(evt);
            }
        });

        edt$2.setText("0");
        edt$2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edt$2FocusGained(evt);
            }
        });
        edt$2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edt$2KeyReleased(evt);
            }
        });

        edt$5.setText("15");
        edt$5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edt$5FocusGained(evt);
            }
        });
        edt$5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edt$5KeyReleased(evt);
            }
        });

        edt$10.setText("45");
        edt$10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edt$10FocusGained(evt);
            }
        });
        edt$10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edt$10KeyReleased(evt);
            }
        });

        edt$20.setText("0");
        edt$20.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edt$20FocusGained(evt);
            }
        });
        edt$20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edt$20KeyReleased(evt);
            }
        });

        edt$50.setText("7");
        edt$50.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edt$50FocusGained(evt);
            }
        });
        edt$50.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edt$50KeyReleased(evt);
            }
        });

        edt$100.setText("3");
        edt$100.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edt$100FocusGained(evt);
            }
        });
        edt$100.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edt$100KeyReleased(evt);
            }
        });

        edt$200.setText("0");
        edt$200.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edt$200FocusGained(evt);
            }
        });
        edt$200.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edt$200KeyReleased(evt);
            }
        });

        edt$500.setText("0");
        edt$500.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edt$500FocusGained(evt);
            }
        });
        edt$500.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edt$500KeyReleased(evt);
            }
        });

        lblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensaje.setText("jLabel1");
        lblMensaje.setToolTipText("");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl500)
                            .addComponent(lbl200)
                            .addComponent(lbl100)
                            .addComponent(lbl50)
                            .addComponent(lbl20)
                            .addComponent(lbl10)
                            .addComponent(lbl5)
                            .addComponent(lbl2)
                            .addComponent(lbl1)
                            .addComponent(lblCantidad)
                            .addComponent(lblCostoSoda))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edt$Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edt$Refresco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edt$1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edt$2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edt$5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edt$10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edt$20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edt$50, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edt$100, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edt$200, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edt$500, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCostoSoda)
                    .addComponent(edt$Refresco, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantidad)
                    .addComponent(edt$Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl1)
                    .addComponent(edt$1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl2)
                    .addComponent(edt$2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl5)
                    .addComponent(edt$5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl10)
                    .addComponent(edt$10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl20)
                    .addComponent(edt$20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl50)
                    .addComponent(edt$50, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl100)
                    .addComponent(edt$100, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl200)
                    .addComponent(edt$200, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl500)
                    .addComponent(edt$500, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        btnAceptarEditMachine.setText("ACEPTAR");
        btnAceptarEditMachine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarEditMachineActionPerformed(evt);
            }
        });

        btnCancelarEditMachine.setText("CANCELAR");
        btnCancelarEditMachine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEditMachineActionPerformed(evt);
            }
        });

        btnResetEditMachine.setText("RESET");
        btnResetEditMachine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetEditMachineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAceptarEditMachine, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelarEditMachine)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnResetEditMachine, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarEditMachine)
                    .addComponent(btnCancelarEditMachine))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnResetEditMachine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarEditMachineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarEditMachineActionPerformed
        boolean bin = false;
        for(int i = 0; i < arrayEdtMachine.length; i++){
            if(arrayEdtMachine[i].getText().equals("")){
                bin = true;
                break;
            }
        }
        if((booleano) || (bin)){
            JOptionPane.showMessageDialog(this, "No puedes Guardar", "Has Ingresado valores invalidos", 0, null);
        }else{
            for(int i= 0; i < dataMachine.length; i++){
                dataMachine[i] = Integer.valueOf(arrayEdtMachine[i].getText());
            }
        MaquinaExpendedora.voidMachine = false;
        this.setVisible(false);
        }
    }//GEN-LAST:event_btnAceptarEditMachineActionPerformed

    private void btnCancelarEditMachineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEditMachineActionPerformed
        for(int i= 0; i < arrayEdtMachine.length; i++){
            arrayEdtMachine[i].setText(dataMachine[i] + "");
            arrayEdtMachine[i].setForeground(Color.BLACK);
            arrayEdtMachine[i].setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        }
        for (JLabel i : arrayLbl) {
            i.setForeground(Color.BLACK);
        }
        booleano = false;
        MaquinaExpendedora.voidMachine = false;
        setActualizacion();
        this.setVisible(false);

    }//GEN-LAST:event_btnCancelarEditMachineActionPerformed

    private void btnResetEditMachineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetEditMachineActionPerformed
        arrayEdtMachine[0].setText("37");
        arrayEdtMachine[1].setText("0");
        arrayEdtMachine[2].setText("15");
        arrayEdtMachine[3].setText("45");
        arrayEdtMachine[4].setText("0");
        arrayEdtMachine[5].setText("7");
        arrayEdtMachine[6].setText("3");
        arrayEdtMachine[7].setText("0");
        arrayEdtMachine[8].setText("0");
        arrayEdtMachine[9].setText("17");
        arrayEdtMachine[10].setText("27");
        booleano = false;
        for (JTextField i : arrayEdtMachine) {
            i.setForeground(Color.BLACK);
            i.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        }
        for (JLabel i : arrayLbl) {
            i.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_btnResetEditMachineActionPerformed

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated
        this.listener.passArrayValueMachine(this.dataMachine);        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowDeactivated

    private void edt$RefrescoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edt$RefrescoFocusGained
        arrayEdtMachine[9].setText("");
    }//GEN-LAST:event_edt$RefrescoFocusGained

    private void edt$CantidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edt$CantidadFocusGained
        arrayEdtMachine[10].setText("");
    }//GEN-LAST:event_edt$CantidadFocusGained

    private void edt$1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edt$1FocusGained
        arrayEdtMachine[0].setText("");
    }//GEN-LAST:event_edt$1FocusGained

    private void edt$2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edt$2FocusGained
        arrayEdtMachine[1].setText("");
    }//GEN-LAST:event_edt$2FocusGained

    private void edt$5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edt$5FocusGained
         arrayEdtMachine[2].setText("");
    }//GEN-LAST:event_edt$5FocusGained

    private void edt$10FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edt$10FocusGained
         arrayEdtMachine[3].setText("");
    }//GEN-LAST:event_edt$10FocusGained

    private void edt$20FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edt$20FocusGained
         arrayEdtMachine[4].setText("");
    }//GEN-LAST:event_edt$20FocusGained

    private void edt$50FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edt$50FocusGained
         arrayEdtMachine[5].setText("");
    }//GEN-LAST:event_edt$50FocusGained

    private void edt$100FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edt$100FocusGained
         arrayEdtMachine[6].setText("");
    }//GEN-LAST:event_edt$100FocusGained

    private void edt$200FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edt$200FocusGained
        arrayEdtMachine[7].setText("");
    }//GEN-LAST:event_edt$200FocusGained

    private void edt$500FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edt$500FocusGained
         arrayEdtMachine[8].setText("");
    }//GEN-LAST:event_edt$500FocusGained

    private void edt$RefrescoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edt$RefrescoKeyReleased
        setActualizacion();
    }//GEN-LAST:event_edt$RefrescoKeyReleased

    private void edt$CantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edt$CantidadKeyReleased
        setActualizacion();
    }//GEN-LAST:event_edt$CantidadKeyReleased

    private void edt$1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edt$1KeyReleased
       setActualizacion();
    }//GEN-LAST:event_edt$1KeyReleased

    private void edt$2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edt$2KeyReleased
        setActualizacion();
    }//GEN-LAST:event_edt$2KeyReleased

    private void edt$5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edt$5KeyReleased
        setActualizacion();
    }//GEN-LAST:event_edt$5KeyReleased

    private void edt$10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edt$10KeyReleased
        setActualizacion();
    }//GEN-LAST:event_edt$10KeyReleased

    private void edt$20KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edt$20KeyReleased
        setActualizacion();
    }//GEN-LAST:event_edt$20KeyReleased

    private void edt$50KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edt$50KeyReleased
        setActualizacion();
    }//GEN-LAST:event_edt$50KeyReleased

    private void edt$100KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edt$100KeyReleased
        setActualizacion();
    }//GEN-LAST:event_edt$100KeyReleased

    private void edt$200KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edt$200KeyReleased
        setActualizacion();
    }//GEN-LAST:event_edt$200KeyReleased

    private void edt$500KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edt$500KeyReleased
        setActualizacion();
    }//GEN-LAST:event_edt$500KeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarEditMachine;
    private javax.swing.JButton btnCancelarEditMachine;
    private javax.swing.JButton btnResetEditMachine;
    private javax.swing.JTextField edt$1;
    private javax.swing.JTextField edt$10;
    private javax.swing.JTextField edt$100;
    private javax.swing.JTextField edt$2;
    private javax.swing.JTextField edt$20;
    private javax.swing.JTextField edt$200;
    private javax.swing.JTextField edt$5;
    private javax.swing.JTextField edt$50;
    private javax.swing.JTextField edt$500;
    private javax.swing.JTextField edt$Cantidad;
    private javax.swing.JTextField edt$Refresco;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl100;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl20;
    private javax.swing.JLabel lbl200;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl50;
    private javax.swing.JLabel lbl500;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCostoSoda;
    private javax.swing.JLabel lblMensaje;
    // End of variables declaration//GEN-END:variables
    
    public void setActualizacion(){
        //total = 0;
        for(int i = 0; i < arrayEdtMachine.length ; i++){
            if(booleano){
                lblMensaje.setText("NO SE PERMITEN LETRAS");
                arrayLbl[aux].setForeground(Color.RED);
                arrayEdtMachine[aux].setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                arrayEdtMachine[aux].setForeground(Color.RED);
                break;
            }else{
                //total += DlogEditUser.MAIN_NUM[i] * Integer.valueOf(arrayEdtMachine[i].getText().equals("") ? "0" : arrayEdtMachine[i].getText());
                arrayLbl[i].setForeground(Color.BLACK);
                arrayEdtMachine[i].setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                arrayEdtMachine[i].setForeground(Color.BLACK);
                
            }
            if(arrayEdtMachine[i].getText().equals("")){
                arrayEdtMachine[i].setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }else{
                arrayEdtMachine[i].setForeground(Color.BLACK);
                arrayEdtMachine[i].setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            }
            //lblMensaje.setText("Cantidad Total: $" + total);
        }
    }
    
    private void initArrays(){
        dataMachine = new Integer[11];
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
        arrayEdtMachine = new JTextField[11];
        arrayEdtMachine[0] = edt$1;
        arrayEdtMachine[1] = edt$2;
        arrayEdtMachine[2] = edt$5;
        arrayEdtMachine[3] = edt$10;
        arrayEdtMachine[4] = edt$20;
        arrayEdtMachine[5] = edt$50;
        arrayEdtMachine[6] = edt$100;
        arrayEdtMachine[7] = edt$200;
        arrayEdtMachine[8] = edt$500;
        arrayEdtMachine[9] = edt$Refresco;
        arrayEdtMachine[10] = edt$Cantidad;
        arrayLbl = new JLabel[11];
        arrayLbl[0] = lbl1;
        arrayLbl[1] = lbl2;
        arrayLbl[2] = lbl5;
        arrayLbl[3] = lbl10;
        arrayLbl[4] = lbl20;
        arrayLbl[5] = lbl50;
        arrayLbl[6] = lbl100;
        arrayLbl[7] = lbl200;
        arrayLbl[8] = lbl500;
        arrayLbl[9] = lblCostoSoda;
        arrayLbl[10] = lblCantidad;
    }
    
    public void addAccionListener(AccionListenerEditData listener) {
        this.listener = listener;
    }
}
