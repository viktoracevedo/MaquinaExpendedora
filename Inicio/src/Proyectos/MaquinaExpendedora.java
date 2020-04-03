package Proyectos;

import control.*;
import java.awt.Image;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class MaquinaExpendedora extends javax.swing.JFrame {
    private Integer[] dataUser;
    private Integer[] dataMachine;
    private Integer[] arrayBefore;
    private JButton btnNum[];
    public static final Integer[] MAIN_NUM = {1,2,5,10,20,50,100,200,500};
    public static final String[] CODE = {"A1", "A2", "A3", "A4",
                        "B5", "B6", "B7", "B8",
                        "C9", "C10", "C11", "C12"
                        };
    private DlogEditUser editUser;
    private DlogEditMachine editMachine;
    private DlogChooseBillet chooseBillet;
    private DlogChooseCoin chooseCoin;
    private DlogProbabilidad probabilidad;
    private Integer totalMoney;
    private Integer valueProbabilidad;
    private String auxUnoNumPad;
    private String auxDosNumPad;
    private Integer contadorDeClick;
    private Integer contadorDeSoda;
    public static boolean voidMachine;
   
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public MaquinaExpendedora() {
        initComponents();
        //this.setIconImage(new ImageIO() );
        this.setLocationRelativeTo(null);
        this.editUser = new DlogEditUser(this, true);
        this.editMachine = new DlogEditMachine(this, true);
        this.chooseBillet = new DlogChooseBillet(this, true);
        this.chooseCoin = new DlogChooseCoin(this, true);
        this.probabilidad = new DlogProbabilidad(this, true);
        auxUnoNumPad = "";
        auxDosNumPad = "";
        contadorDeClick = 0;
        contadorDeSoda = 0;
        valueProbabilidad = 0;
        totalMoney = 0;
        voidMachine = false;
        
        btnBillete.setPressedIcon(initPresssedButton("boton1.jpg"));
        btnMoneda.setPressedIcon(initPresssedButton("boton2.jpg"));
        btnDevolver.setPressedIcon(initPresssedButton("boton3.jpg"));
        btnDarCoca.setPressedIcon(initPresssedButton("boton4.jpg"));
        initArrays();
        initAccionListeners();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        btnDarCoca = new javax.swing.JButton();
        A1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        A2 = new javax.swing.JLabel();
        A3 = new javax.swing.JLabel();
        A4 = new javax.swing.JLabel();
        B5 = new javax.swing.JLabel();
        B6 = new javax.swing.JLabel();
        B7 = new javax.swing.JLabel();
        B8 = new javax.swing.JLabel();
        C9 = new javax.swing.JLabel();
        C10 = new javax.swing.JLabel();
        C11 = new javax.swing.JLabel();
        C12 = new javax.swing.JLabel();
        lblDisplay1 = new javax.swing.JLabel();
        lblDisplay2 = new javax.swing.JLabel();
        lblDisplay3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnBillete = new javax.swing.JButton();
        btnDevolver = new javax.swing.JButton();
        btnOcho = new javax.swing.JButton();
        btnSiete = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();
        btnUno = new javax.swing.JButton();
        btnCero = new javax.swing.JButton();
        btnEnter = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnB = new javax.swing.JButton();
        btnA = new javax.swing.JButton();
        btnNueve = new javax.swing.JButton();
        btnMoneda = new javax.swing.JButton();
        imgMachine_fix = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mmSalir = new javax.swing.JMenuItem();
        mmVer = new javax.swing.JMenu();
        mm_VerUser = new javax.swing.JMenuItem();
        mm_VerMachine = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mmBtnAtascoSoda = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mmEditMachine = new javax.swing.JMenuItem();
        mmEditUser = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Maquina Despachadora");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDarCoca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/boton4.jpg"))); // NOI18N
        btnDarCoca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDarCocaActionPerformed(evt);
            }
        });
        jPanel2.add(btnDarCoca, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 790, 320, 120));

        A1.setFont(new java.awt.Font("Calculator", 1, 40)); // NOI18N
        A1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A1.setText("A1");
        A1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel2.add(A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, -1, 30));

        jLabel5.setFont(new java.awt.Font("Calculator", 0, 24)); // NOI18N
        jLabel5.setText("BANDEJA");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 760, -1, -1));

        jLabel6.setFont(new java.awt.Font("Calculator", 0, 24)); // NOI18N
        jLabel6.setText("BANDEJA");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 760, -1, -1));

        A2.setFont(new java.awt.Font("Calculator", 1, 40)); // NOI18N
        A2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A2.setText("A2");
        A2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel2.add(A2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, -1, 30));

        A3.setFont(new java.awt.Font("Calculator", 1, 40)); // NOI18N
        A3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A3.setText("A3");
        A3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel2.add(A3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, -1, 30));

        A4.setFont(new java.awt.Font("Calculator", 1, 40)); // NOI18N
        A4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A4.setText("A4");
        A4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel2.add(A4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, -1, 30));

        B5.setFont(new java.awt.Font("Calculator", 1, 40)); // NOI18N
        B5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B5.setText("B5");
        B5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel2.add(B5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 540, -1, 30));

        B6.setFont(new java.awt.Font("Calculator", 1, 40)); // NOI18N
        B6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B6.setText("B6");
        B6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel2.add(B6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 540, -1, 30));

        B7.setFont(new java.awt.Font("Calculator", 1, 40)); // NOI18N
        B7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B7.setText("B7");
        B7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel2.add(B7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 540, -1, 30));

        B8.setFont(new java.awt.Font("Calculator", 1, 40)); // NOI18N
        B8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B8.setText("B8");
        B8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel2.add(B8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 540, -1, 30));

        C9.setFont(new java.awt.Font("Calculator", 1, 40)); // NOI18N
        C9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C9.setText("C9");
        C9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel2.add(C9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 710, -1, 30));

        C10.setFont(new java.awt.Font("Calculator", 1, 40)); // NOI18N
        C10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C10.setText("C10");
        C10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel2.add(C10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 710, -1, 30));

        C11.setFont(new java.awt.Font("Calculator", 1, 40)); // NOI18N
        C11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C11.setText("C11");
        C11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel2.add(C11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 710, -1, 30));

        C12.setFont(new java.awt.Font("Calculator", 1, 40)); // NOI18N
        C12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C12.setText("C12");
        C12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel2.add(C12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 710, -1, 30));

        lblDisplay1.setFont(new java.awt.Font("Calculator", 1, 24)); // NOI18N
        lblDisplay1.setText("WELCOME ");
        jPanel2.add(lblDisplay1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 110, 20));

        lblDisplay2.setFont(new java.awt.Font("Calculator", 1, 24)); // NOI18N
        lblDisplay2.setText("Que Desea");
        jPanel2.add(lblDisplay2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 100, 30));

        lblDisplay3.setFont(new java.awt.Font("Calculator", 1, 24)); // NOI18N
        lblDisplay3.setText("Comprar?");
        jPanel2.add(lblDisplay3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, 130, 30));

        jLabel3.setFont(new java.awt.Font("Calculator", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Billetes");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, 70, 20));

        jLabel1.setFont(new java.awt.Font("Calculator", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Monedas ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 590, 90, -1));

        jLabel4.setFont(new java.awt.Font("Calculator", 0, 24)); // NOI18N
        jLabel4.setText("Cambio");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 680, -1, 20));

        btnBillete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/boton1.jpg"))); // NOI18N
        btnBillete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBilleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnBillete, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, 70, 40));

        btnDevolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/boton3.jpg"))); // NOI18N
        btnDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolverActionPerformed(evt);
            }
        });
        jPanel2.add(btnDevolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 700, 70, 80));

        btnOcho.setBackground(new java.awt.Color(255, 255, 255));
        btnOcho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/num8.png"))); // NOI18N
        btnOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOchoActionPerformed(evt);
            }
        });
        jPanel2.add(btnOcho, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 480, 20, 20));

        btnSiete.setBackground(new java.awt.Color(255, 255, 255));
        btnSiete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/num7.png"))); // NOI18N
        btnSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSieteActionPerformed(evt);
            }
        });
        jPanel2.add(btnSiete, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 480, 20, 20));

        btnCuatro.setBackground(new java.awt.Color(255, 255, 255));
        btnCuatro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/num4.png"))); // NOI18N
        btnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuatroActionPerformed(evt);
            }
        });
        jPanel2.add(btnCuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 500, 20, 20));

        btnUno.setBackground(new java.awt.Color(255, 255, 255));
        btnUno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnUno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/num1.png"))); // NOI18N
        btnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnoActionPerformed(evt);
            }
        });
        jPanel2.add(btnUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 520, 20, 20));

        btnCero.setBackground(new java.awt.Color(255, 255, 255));
        btnCero.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/num0.png"))); // NOI18N
        btnCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCeroActionPerformed(evt);
            }
        });
        jPanel2.add(btnCero, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 540, 20, 20));

        btnEnter.setBackground(new java.awt.Color(255, 255, 255));
        btnEnter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/numEnter.png"))); // NOI18N
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });
        jPanel2.add(btnEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 540, 30, 20));

        btnDos.setBackground(new java.awt.Color(255, 255, 255));
        btnDos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/num2.png"))); // NOI18N
        btnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosActionPerformed(evt);
            }
        });
        jPanel2.add(btnDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 520, 20, 20));

        btnCinco.setBackground(new java.awt.Color(255, 255, 255));
        btnCinco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/num5.png"))); // NOI18N
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });
        jPanel2.add(btnCinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 500, 20, 20));

        btnSeis.setBackground(new java.awt.Color(255, 255, 255));
        btnSeis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/num6.png"))); // NOI18N
        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });
        jPanel2.add(btnSeis, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 500, 20, 20));

        btnTres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/num3.png"))); // NOI18N
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });
        jPanel2.add(btnTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 520, 20, 20));

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/numClear.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 540, 30, 20));

        btnC.setBackground(new java.awt.Color(255, 255, 255));
        btnC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/numC.png"))); // NOI18N
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        jPanel2.add(btnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 520, 20, 20));

        btnB.setBackground(new java.awt.Color(255, 255, 255));
        btnB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/numB.png"))); // NOI18N
        btnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBActionPerformed(evt);
            }
        });
        jPanel2.add(btnB, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, 20, 20));

        btnA.setBackground(new java.awt.Color(255, 255, 255));
        btnA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/numA.png"))); // NOI18N
        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAActionPerformed(evt);
            }
        });
        jPanel2.add(btnA, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 480, 20, 20));

        btnNueve.setBackground(new java.awt.Color(255, 255, 255));
        btnNueve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/num9.png"))); // NOI18N
        btnNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNueveActionPerformed(evt);
            }
        });
        jPanel2.add(btnNueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 480, 20, 20));

        btnMoneda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/boton2.jpg"))); // NOI18N
        btnMoneda.setToolTipText(" ");
        btnMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonedaActionPerformed(evt);
            }
        });
        jPanel2.add(btnMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 610, 60, 50));

        imgMachine_fix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/maquina_final.jpg"))); // NOI18N
        jPanel2.add(imgMachine_fix, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1050));

        jScrollPane2.setViewportView(jPanel2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 755, 750));

        jMenu1.setText("Opciones");

        mmSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, 0));
        mmSalir.setText("Salir");
        mmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmSalirActionPerformed(evt);
            }
        });
        jMenu1.add(mmSalir);

        mmVer.setText("Ver Inventario");

        mm_VerUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, 0));
        mm_VerUser.setText("Usuario");
        mm_VerUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mm_VerUserActionPerformed(evt);
            }
        });
        mmVer.add(mm_VerUser);

        mm_VerMachine.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, 0));
        mm_VerMachine.setText("Maquina");
        mm_VerMachine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mm_VerMachineActionPerformed(evt);
            }
        });
        mmVer.add(mm_VerMachine);

        jMenu1.add(mmVer);
        jMenu1.add(jSeparator1);

        mmBtnAtascoSoda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mmBtnAtascoSoda.setText("AtascoSoda");
        mmBtnAtascoSoda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmBtnAtascoSodaActionPerformed(evt);
            }
        });
        jMenu1.add(mmBtnAtascoSoda);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar-Cantidades");

        mmEditMachine.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, 0));
        mmEditMachine.setText("Edit Machine");
        mmEditMachine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmEditMachineActionPerformed(evt);
            }
        });
        jMenu2.add(mmEditMachine);

        mmEditUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, 0));
        mmEditUser.setText("Edit User");
        mmEditUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmEditUserActionPerformed(evt);
            }
        });
        jMenu2.add(mmEditUser);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuatroActionPerformed
        metodoPadNumerico("4");
    }//GEN-LAST:event_btnCuatroActionPerformed

    private void btnSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSieteActionPerformed
        metodoPadNumerico("7");
    }//GEN-LAST:event_btnSieteActionPerformed

    private void btnMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonedaActionPerformed
        chooseCoin.setArraysData(dataUser, dataMachine);
        chooseCoin.setDineroIngresado(this.totalMoney);
        setCondiciones(0);
        chooseCoin.setVisible(true);
    }//GEN-LAST:event_btnMonedaActionPerformed

    private void btnCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCeroActionPerformed
        metodoPadNumerico("0");
    }//GEN-LAST:event_btnCeroActionPerformed

    private void btnBilleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBilleteActionPerformed
        chooseBillet.setArraysData(this.dataUser, this.dataMachine);
        chooseBillet.setDineroIngresado(this.totalMoney);
        setCondiciones(0);
        chooseBillet.setVisible(true);
    }//GEN-LAST:event_btnBilleteActionPerformed

    private void btnDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosActionPerformed
        metodoPadNumerico("2");
    }//GEN-LAST:event_btnDosActionPerformed

    private void btnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnoActionPerformed
        metodoPadNumerico("1");
    }//GEN-LAST:event_btnUnoActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
        metodoPadNumerico("3");
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOchoActionPerformed
        metodoPadNumerico("8");
    }//GEN-LAST:event_btnOchoActionPerformed

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed
        metodoPadNumerico("6");
    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAActionPerformed
        
        metodoPadNumerico("A");
    }//GEN-LAST:event_btnAActionPerformed

    private void btnNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNueveActionPerformed
        metodoPadNumerico("9");
    }//GEN-LAST:event_btnNueveActionPerformed

    private void btnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBActionPerformed
        
        metodoPadNumerico("B");
    }//GEN-LAST:event_btnBActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        
        metodoPadNumerico("C");
    }//GEN-LAST:event_btnCActionPerformed

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        metodoPadNumericoBtnOK();
    }//GEN-LAST:event_btnEnterActionPerformed

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
        metodoPadNumerico("5");
    }//GEN-LAST:event_btnCincoActionPerformed

    private void mmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mmSalirActionPerformed

    private void mmEditMachineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmEditMachineActionPerformed
        editMachine.setVisible(true);
    }//GEN-LAST:event_mmEditMachineActionPerformed

    private void mmEditUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmEditUserActionPerformed
        editUser.setVisible(true);
    }//GEN-LAST:event_mmEditUserActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        if(!lblDisplay2.getText().equals("El Codigo")){
            lblDisplay2.setText("");
            auxUnoNumPad = ""; 
            auxDosNumPad = ""; 
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolverActionPerformed
       metodoDevolverDinero();
    }//GEN-LAST:event_btnDevolverActionPerformed

    private void mmBtnAtascoSodaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmBtnAtascoSodaActionPerformed
        probabilidad.setVisible(true);
    }//GEN-LAST:event_mmBtnAtascoSodaActionPerformed

    private void btnDarCocaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarCocaActionPerformed
        metodoBandeja();
    }//GEN-LAST:event_btnDarCocaActionPerformed

    private void mm_VerUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mm_VerUserActionPerformed
        String ver = "Registro Actual de Usuario:\nCnatidad";
        for(int i = 0; i < MAIN_NUM.length; i++){
            if(i < 4){
            ver += "\nMonedas de $" + MAIN_NUM[i] +": "+ dataUser[i]; 
            }else{
            ver += "\nBilletes de $" + MAIN_NUM[i] +": "+ dataUser[i]; 
            }
            
        }
        showMessenge(ver, "REGISTRO", "ojo.png");
    }//GEN-LAST:event_mm_VerUserActionPerformed

    private void mm_VerMachineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mm_VerMachineActionPerformed
        String ver = "Registro Actual de Maquina:\nCantidad";
        for(int i = 0; i < dataMachine.length; i++){
            if(i < 4){
                ver += "\nMonedas de $" + MAIN_NUM[i] +": "+ dataMachine[i]; 
            }else if((i >= 4) && (i < 9)){
                ver += "\nBilletes de $" + MAIN_NUM[i] +": "+ dataMachine[i]; 
            }else if(i == 9){
                ver += "\nCosto de la Soda: $" + dataMachine[9];
            }else{
                ver += "\nSodas dentro de la Maquina: " + dataMachine[10];
            }
        }
        showMessenge(ver, "REGISTRO", "ojo.png");
    }//GEN-LAST:event_mm_VerMachineActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting CODE (optional) ">
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
            java.util.logging.Logger.getLogger(MaquinaExpendedora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MaquinaExpendedora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MaquinaExpendedora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MaquinaExpendedora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MaquinaExpendedora().setVisible(true);
                new MaquinaExpendedora().setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A1;
    private javax.swing.JLabel A2;
    private javax.swing.JLabel A3;
    private javax.swing.JLabel A4;
    private javax.swing.JLabel B5;
    private javax.swing.JLabel B6;
    private javax.swing.JLabel B7;
    private javax.swing.JLabel B8;
    private javax.swing.JLabel C10;
    private javax.swing.JLabel C11;
    private javax.swing.JLabel C12;
    private javax.swing.JLabel C9;
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnBillete;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCero;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDarCoca;
    private javax.swing.JButton btnDevolver;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnMoneda;
    private javax.swing.JButton btnNueve;
    private javax.swing.JButton btnOcho;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSiete;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUno;
    private javax.swing.JLabel imgMachine_fix;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblDisplay1;
    private javax.swing.JLabel lblDisplay2;
    private javax.swing.JLabel lblDisplay3;
    private javax.swing.JMenuItem mmBtnAtascoSoda;
    private javax.swing.JMenuItem mmEditMachine;
    private javax.swing.JMenuItem mmEditUser;
    private javax.swing.JMenuItem mmSalir;
    private javax.swing.JMenu mmVer;
    private javax.swing.JMenuItem mm_VerMachine;
    private javax.swing.JMenuItem mm_VerUser;
    // End of variables declaration//GEN-END:variables
    private void showMessenge(String texto, String titulo, String image){
        ImageIcon img = new ImageIcon(getClass().getResource("/Images/" + image));
        JOptionPane.showMessageDialog(null, texto, titulo, 1, img);
    }
    private void metodoBandeja(){
        if(contadorDeSoda == 0){
            showMessenge("Abres la Bnadeja y Te percatas que No Hay Ninguna Soda", "Primero el Dinero..", "ojo.png");
        }else{
            Random numero = new Random();
            if( numero.nextInt(101) <= valueProbabilidad){
                getToolkit().beep();
                showMessenge("Ohh tu soda se Atasco en la bandeja, lastima", "No Salio Soda", "ojo.png");
            }else{
                showMessenge("Ves tu soda en la Bandeja y la Agarras", "Hasta la proxima", "ojo.png");
            }
        }
    }
    
    private void metodoDevolverDinero(){
        String mensaje =  "Se te regreso de cambio:\n";
        if(voidMachine){
            for (Integer i : arrayBefore) {
                if(i < 4){
                    mensaje += (" " + (dataUser[i]-arrayBefore[i]) + " monedas de $" + MAIN_NUM[i] + "\n"); 
                }else{
                    mensaje += (" " + (dataUser[i]-arrayBefore[i]) + " Billetes de $" + MAIN_NUM[i] + "\n"); 
                }
            }
            showMessenge(mensaje,"Has Apretado el boton de regresa cambio", "ojo.png");
        }else{
            totalMoney = 0;
            int counter = 0;
            for(int i = 0; i < arrayBefore.length; i++){
                if(!arrayBefore[i].equals(dataUser[i])){
                    if(i < 4){
                        mensaje += (" " + (dataUser[i]-arrayBefore[i]) + " monedas de $" + MAIN_NUM[i] + "\n"); 
                    }else{
                        mensaje += (" " + (dataUser[i]-arrayBefore[i]) + " Billetes de $" + MAIN_NUM[i] + "\n"); 
                    }
                }else{
                    counter++;
                }
            }
            if(counter >= 9){
                getToolkit().beep();
                showMessenge("No has Ingresado Nada de Dinero","Are You Okay?", "ojo.png");
            }else{
                showMessenge(mensaje,"Has Apretado el boton de regresa cambio", "ojo.png");
            }
        }
    }
   
    private void metodoRecursivo(int aux, int iterador ){
        for(int i = iterador ; i >= 0 ; i--){
            if((aux / MAIN_NUM[i]) >= 1 && (aux / MAIN_NUM[i]) <= dataMachine[i] && dataMachine[i] != 0){
                dataUser[i] += (aux / MAIN_NUM[i]);
                dataMachine[i] -= (aux / MAIN_NUM[i]);
                aux -= ((aux / MAIN_NUM[i]) * MAIN_NUM[i]);
            }else if(i == 0 && (aux / MAIN_NUM[0]) > dataMachine[0]){
                    voidMachine = true;
                    break;
            }else{
                if(i >= 0){
                metodoRecursivo(aux, i-1 ); 
                }
                break;
             }
        }
    }
    
    private void metodoPadNumerico(String mensaje){
    if(!setCondiciones(3)){
        contadorDeClick = 1;
        for (JButton i : btnNum) {
            lblDisplay1.setText("Index:");
            lblDisplay3.setText("Saldo: $" + totalMoney);
            if(mensaje.equals("A")){
                auxDosNumPad= mensaje;
                mensaje = "";
            }
            else if(mensaje.equals("B")){
                auxDosNumPad= mensaje;
                mensaje = "";
            }
            else if(mensaje.equals("C")){
                auxDosNumPad= mensaje;
                mensaje = "";
            }else{
                lblDisplay2.setText( auxDosNumPad + auxUnoNumPad + mensaje );
            }
        }
            auxUnoNumPad = mensaje;
                
    }
    setCondiciones(4);
    }
    
    private void metodoPadNumericoBtnOK(){
        boolean temp = false;
                lblDisplay1.setText("Prosesando..");
                for (String i : CODE) {
                    temp = i.equals(lblDisplay2.getText());
                    if(temp){
                        break;
                    }
                }
                if((temp) && (!setCondiciones(2)) && (!setCondiciones(1)) && (!voidMachine)){
                    this.totalMoney -= dataMachine[9];
                    System.arraycopy(dataUser, 0, arrayBefore, 0, arrayBefore.length);
                    metodoRecursivo(totalMoney, MAIN_NUM.length - 1);
                    if(voidMachine){
                        showMessenge("La Machina se Quedo sin Cambio", "Ingresa el dinero Exacto", "ojo.png");
                        System.arraycopy(arrayBefore, 0, dataUser, 0, dataUser.length);
                    }else{
                        dataMachine[10] -= 1;
                        lblDisplay1.setText("Hecho");
                        contadorDeSoda++;
                        JOptionPane.showMessageDialog(this, "¡Agarra tu soda!", "Todo Salio Bien", JOptionPane.INFORMATION_MESSAGE);
                    }
                }else{
                    getToolkit().beep();
                    lblDisplay1.setText("Fatal Error");
                    JOptionPane.showMessageDialog(this, "CODIGO DE COCA INCORRECTO", "ESCOJE BIEN", JOptionPane.WARNING_MESSAGE);
                }
                lblDisplay1.setText("Ingresa");
                lblDisplay2.setText("El Codigo");
                lblDisplay3.setText("De la Soda");
    }
    
    private boolean setCondiciones(int condicion){
        boolean estado = false;
        switch(condicion){
            case 0:
                if(!totalMoney.equals(0)){
                lblDisplay1.setText("Ingresa");
                lblDisplay2.setText("El Codigo");
                lblDisplay3.setText("De la Soda");
                }
                break;
            case 1:
                if(this.totalMoney < dataMachine[9]){
                    JOptionPane.showMessageDialog(this, "No Tines dinero Sufiente para Comprar la Soda", "Need More Money", JOptionPane.WARNING_MESSAGE, null);
                    estado = true;
                }
                break;
            case 2:
                if(dataMachine[10] <= 0){
                 JOptionPane.showMessageDialog(this, "Lo Sineto ya no hay sodas en la Maquina", "There are not Soda", JOptionPane.INFORMATION_MESSAGE, null);
                 estado = true;
                }
                break;
            case 3:
                if(this.totalMoney == 0){
                    getToolkit().beep();
                    lblDisplay1.setText("Primero");
                    lblDisplay2.setText("Ingresa");
                    lblDisplay3.setText("Dinero");
                    contadorDeClick++;
                    estado = true;
                }
                break;
            case 4:
                if((contadorDeClick%3) == 0){
                    JOptionPane.showMessageDialog(this, "PON A TENCION AL DISPLAY", "PAY ATENTION", JOptionPane.WARNING_MESSAGE);
                }
                break;
            case 5:
                estado = true;
                break;
            default:
                System.out.println("ERROR");
                    break;
        }
        return estado;
    }
    
    private void initArrays(){
        
        this.btnNum = new JButton[10];
        btnNum[0] = btnCero;
        btnNum[1] = btnUno;
        btnNum[2] = btnDos;
        btnNum[3] = btnTres;
        btnNum[4] = btnCuatro;
        btnNum[5] = btnCinco;
        btnNum[6] = btnSeis;
        btnNum[7] = btnSiete;
        btnNum[8] = btnOcho;
        btnNum[9] = btnNueve;
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
        this.arrayBefore = new Integer[9];
    }
    
    private ImageIcon initPresssedButton(String nameImage){
        ImageIcon icon = new ImageIcon(getClass().getResource("/Images/" + nameImage));
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(icon.getIconWidth() - 2, icon.getIconHeight() - 2, Image.SCALE_DEFAULT));
        return icono;
    }
    
    private void initAccionListeners(){
        editUser.addAccionListener(new AccionListenerEditData() {
            @Override
            public void passArrayValueUser(Integer[] data) {
                MaquinaExpendedora.this.dataUser = data;
            }

            @Override
            public void passArrayValueMachine(Integer[] data) {
            }
        });
        editMachine.addAccionListener(new AccionListenerEditData() {
            @Override
            public void passArrayValueUser(Integer[] data) {
            }

            @Override
            public void passArrayValueMachine(Integer[] data) {
                MaquinaExpendedora.this.dataMachine = data;
            }
        });
        chooseBillet.addAccionListener(new AccionListenerEditData() {
            @Override
            public void passArrayValueUser(Integer[] data) {
                MaquinaExpendedora.this.dataUser = data;
            }

            @Override
            public void passArrayValueMachine(Integer[] data) {
                MaquinaExpendedora.this.dataMachine = data;
            }
        });
        chooseCoin.addAccionListener(new AccionListenerEditData() {
            @Override
            public void passArrayValueUser(Integer[] data) {
                MaquinaExpendedora.this.dataUser = data;
            }

            @Override
            public void passArrayValueMachine(Integer[] data) {
                MaquinaExpendedora.this.dataMachine = data;
            }
        });
        chooseBillet.addAccionListener(new AccionListenerTotalMoney() {
            @Override
            public void passValueTotalMoney(Integer data) {
                MaquinaExpendedora.this.totalMoney = data;
            }
        });
        chooseCoin.addAccionListener(new AccionListenerTotalMoney() {
            @Override
            public void passValueTotalMoney(Integer data) {
                MaquinaExpendedora.this.totalMoney = data;
            }
        });
        probabilidad.addAccionListener(new AccionListenerProbability() {
            @Override
            public void passValue(Integer data) {
                MaquinaExpendedora.this.valueProbabilidad = data;
            }
        });
    }
}
