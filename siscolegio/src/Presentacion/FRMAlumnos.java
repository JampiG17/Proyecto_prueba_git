package Presentacion;

import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class FRMAlumnos extends javax.swing.JFrame {
    private int idalumno=0;
    
    /** Constructor de carga de la ventana*/
    public FRMAlumnos() {
        super("Registro de Alumnos");
        initComponents();
        GrupoSexo.add(RBMasculino);
        RBMasculino.setSelected(true);
        GrupoSexo.add(RBFemenino);

        ListarAlumnos();

  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoSexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        TxtNombres = new javax.swing.JTextField();
        TxtApellidos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtFechaNacimiento = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        CBXGrado = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        RBMasculino = new javax.swing.JRadioButton();
        RBFemenino = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        Registrar = new javax.swing.JButton();
        javax.swing.JButton Nuevo = new javax.swing.JButton();
        BTNEliminar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        CBXSeccion = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        TxtDireccion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TxtTelefono = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TxtEmail = new javax.swing.JTextField();
        TxtPassword = new javax.swing.JTextField();
        Cerrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabLista = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        TXTBuscar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TXTBuscargrado = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        TXTBuscarseccion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setName("Registro de Personas"); // NOI18N
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Alumno"));

        TxtNombres.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        TxtNombres.setForeground(new java.awt.Color(0, 102, 102));

        TxtApellidos.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        TxtApellidos.setForeground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Nombres");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Apellidos");

        TxtFechaNacimiento.setForeground(new java.awt.Color(0, 102, 102));
        TxtFechaNacimiento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Nacimiento");

        CBXGrado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Grado");

        RBMasculino.setText("Masculino");

        RBFemenino.setText("Femenino");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Sexo");

        Registrar.setBackground(new java.awt.Color(0, 153, 153));
        Registrar.setForeground(new java.awt.Color(255, 255, 255));
        Registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/material.gif"))); // NOI18N
        Registrar.setText("Registrar");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });

        Nuevo.setBackground(new java.awt.Color(0, 153, 153));
        Nuevo.setForeground(new java.awt.Color(255, 255, 255));
        Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit.png"))); // NOI18N
        Nuevo.setText("Nuevo");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });

        BTNEliminar.setBackground(new java.awt.Color(0, 153, 153));
        BTNEliminar.setForeground(new java.awt.Color(255, 255, 255));
        BTNEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/elim.png"))); // NOI18N
        BTNEliminar.setText("Eliminar");
        BTNEliminar.setEnabled(false);
        BTNEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEliminarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Seccion");

        CBXSeccion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "F", "G", "H", "I" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("Direccion");

        TxtDireccion.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        TxtDireccion.setForeground(new java.awt.Color(0, 102, 102));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Telefono");

        TxtTelefono.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        TxtTelefono.setForeground(new java.awt.Color(0, 102, 102));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("Password");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("Email");

        TxtEmail.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        TxtEmail.setForeground(new java.awt.Color(0, 102, 102));

        TxtPassword.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        TxtPassword.setForeground(new java.awt.Color(0, 102, 102));

        Cerrar.setBackground(new java.awt.Color(0, 153, 153));
        Cerrar.setForeground(new java.awt.Color(255, 255, 255));
        Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/undo.gif"))); // NOI18N
        Cerrar.setText("Cerrar");
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(TxtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(TxtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(TxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 410, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(28, 28, 28))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10))
                                        .addGap(16, 16, 16)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TxtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                    .addComponent(TxtTelefono)
                                    .addComponent(TxtEmail))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(RBMasculino)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(RBFemenino))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(22, 22, 22)
                                                        .addComponent(jLabel4))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel7)))
                                                .addGap(41, 41, 41)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(CBXGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(CBXSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(287, 287, 287)
                                        .addComponent(BTNEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTNEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TxtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TxtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(TxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RBMasculino)
                            .addComponent(RBFemenino)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TxtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(CBXGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addComponent(CBXSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Alumnos Registradas"), "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        TabLista.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        TabLista.setForeground(new java.awt.Color(102, 153, 255));
        TabLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TabLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabListaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabLista);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Alumnos"));

        TXTBuscar.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        TXTBuscar.setForeground(new java.awt.Color(0, 102, 102));
        TXTBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TXTBuscarKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Apellidos");

        TXTBuscargrado.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        TXTBuscargrado.setForeground(new java.awt.Color(0, 102, 102));
        TXTBuscargrado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TXTBuscargradoKeyPressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("Grado");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 102));
        jLabel13.setText("Seccion");

        TXTBuscarseccion.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        TXTBuscarseccion.setForeground(new java.awt.Color(0, 102, 102));
        TXTBuscarseccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TXTBuscarseccionKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TXTBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(TXTBuscargrado, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(TXTBuscarseccion, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TXTBuscarseccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TXTBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(TXTBuscargrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /** Método para seleccionar una alumno para editarlo*/
    private void TabListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabListaMouseClicked
       //activa los botones 
       this.Registrar.setText("Actualizar");
       this.BTNEliminar.setEnabled(true);
        
        //Creación de una fila de JTable y captura la fila, con el evento clic
        int fila=TabLista.rowAtPoint(evt.getPoint());
        Logica.ClsAlumno alum=new Logica.ClsAlumno();
        //Captura de los datos de la alumno para editarlo
         this.idalumno=Integer.parseInt(TabLista.getValueAt(fila, 0).toString());
         this.TxtNombres.setText(TabLista.getValueAt(fila, 2).toString());
         this.TxtApellidos.setText(TabLista.getValueAt(fila, 1).toString());
         this.TxtDireccion.setText(TabLista.getValueAt(fila, 5).toString());
         this.TxtTelefono.setText(TabLista.getValueAt(fila, 6).toString());
         this.TxtEmail.setText(TabLista.getValueAt(fila, 7).toString());
         this.TxtPassword.setText(TabLista.getValueAt(fila, 8).toString());
         this.CBXGrado.setSelectedItem(TabLista.getValueAt(fila, 9).toString());
         this.CBXSeccion.setSelectedItem(TabLista.getValueAt(fila, 10).toString());
         //captura la fecha y le da formato correcto Dia,mes,año
         String dia=TabLista.getValueAt(fila, 3).toString().substring(8, 10);
         String mes=TabLista.getValueAt(fila, 3).toString().substring(5, 7);
         String anio=TabLista.getValueAt(fila, 3).toString().substring(0, 4);
         String FECHA=""+dia+"/"+mes+"/"+anio;
         
         this.TxtFechaNacimiento.setText(FECHA);
       
         //Captura de los datos para el Radio Buton Sexo
       if (TabLista.getValueAt(fila, 4).toString().equals("Masculino")){
           this.RBMasculino.setSelected(true);
       }else
            this.RBFemenino.setSelected(true);
    }//GEN-LAST:event_TabListaMouseClicked

    /**  Método para buscar Personas */
    private void TXTBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTBuscarKeyPressed
      
        //Creamos un modelo de tabla
        TableModel modelo = new DefaultTableModel();
        Logica.ClsAlumno alum=new  Logica.ClsAlumno();
                //Extraemos la lista de personas dentro de un modelo
        modelo=alum.BusquedaAlumnos(this.TXTBuscar.getText().trim());
        
        //Asociamos el modelo al JTable
        this.TabLista.setModel(modelo);
        
         //Oculta la primera columna
        OcultarColumnaTabla();
        
    }//GEN-LAST:event_TXTBuscarKeyPressed

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_CerrarActionPerformed

    private void BTNEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEliminarActionPerformed
        // TODO add your handling code here:

        if (this.idalumno==0){
            JOptionPane.showMessageDialog(rootPane, "Seleccione un Alumno");
            return;
        }
        //Captura la confirmacion
        int confirmacion= JOptionPane.showConfirmDialog(rootPane, "¿Estas seguro de eliminar?", "Confirma la acción", 2);

        if (confirmacion==0){ //evaluamos la confirmación
            boolean confirmacion2=true;
            Logica.ClsAlumno alum=new Logica.ClsAlumno();
            confirmacion2=alum.EliminarAlumno( this.idalumno);
            if (confirmacion2==false){ //Evaluamos el resultado de la operacion
                JOptionPane.showMessageDialog(rootPane, "Eliminación correcta");
                Limpiarcampos();  //Limpiamos los campos
                this.BTNEliminar.setEnabled(false); //Deshabilitamos el botón
                this.ListarAlumnos(); //recargamos la lista
            }else{
                JOptionPane.showMessageDialog(rootPane, "No se pudo Eliminar");
            }
        }
    }//GEN-LAST:event_BTNEliminarActionPerformed

    /**Método para registrar una nueva alumno*/
    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        this.Registrar.setText("Registrar");
        this.Limpiarcampos();
        this.idalumno=0;
        this.BTNEliminar.setEnabled(false);
    }//GEN-LAST:event_NuevoActionPerformed

    /** Método para Registrar una alumno*/
    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        //Validación de campos

        if (this.TxtNombres.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar el nombre del Alumno");
            TxtNombres.requestFocus();//rabFocus();
            return ;
        }
        if (this.TxtApellidos.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar apellidos del Alumno");
            TxtApellidos.requestFocus();
            return ;
        }
        if (this.TxtFechaNacimiento.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar la fecha de nacimiento del Alumno");
            TxtFechaNacimiento.requestFocus();
            return ;
        }
        if (this.TxtDireccion.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Debe Ingresar la Direccion Del Alumno");
            TxtDireccion.requestFocus();
            return ;
        }
            if (this.TxtTelefono.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Debes Ingresar el telefono del Alumno");
            TxtTelefono.requestFocus();
            return ;
        }
            
            if (this.TxtEmail.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Debes Ingresar el Email del Alumno");
            TxtEmail.requestFocus();
            return ;
        }
            if (this.TxtPassword.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Debes Ingresar el password de acceso al sitema");
            TxtPassword.requestFocus();
            return ;
        }
            
        Logica.ClsAlumno alumno=new Logica.ClsAlumno();  //objeto tipo alumno
        alumno.idalumno=this.idalumno;
        alumno.nombres=this.TxtNombres.getText();
        alumno.apellidos=this.TxtApellidos.getText();
        alumno.direccion=this.TxtDireccion.getText();
        alumno.telefono=this.TxtTelefono.getText();
        alumno.email=this.TxtEmail.getText();
        alumno.password=this.TxtPassword.getText();
        alumno.fechaNacimiento=this.TxtFechaNacimiento.getText();
        if (this.RBMasculino.isSelected()){alumno.sexo="Masculino";}
        if(this.RBFemenino.isSelected()){alumno.sexo="Femenino";}
        //Selecciona el item
        int seleccionado=CBXGrado.getSelectedIndex();
        alumno.grado=(String)this.CBXGrado.getItemAt(seleccionado);//texto del Item seleccionado

        int seleccionado2=CBXSeccion.getSelectedIndex();
        alumno.seccion=(String)this.CBXSeccion.getItemAt(seleccionado);
        //Evaluamos si el usuario esta Registrando una nueva alumno o esta actualizando
        if(this.idalumno==0){
            boolean respuesta=true; //bandera
            respuesta=alumno.RegistrarAlumno(); //ejecuta el método que registra alumno
            ListarAlumnos(); //actualiza la tabla

            //lanza el aviso
            if (respuesta==false)
            {
                JOptionPane.showMessageDialog(rootPane, "Se ha registrado correctamente");
                Limpiarcampos();
                this.BTNEliminar.setEnabled(false);
            }
            else{  JOptionPane.showMessageDialog(rootPane, "Persona No registrada"); }

        }
        else //actualiza los datos de la alumno
        {
            boolean respuesta2=true; //bandera
            respuesta2=alumno.ActualizarAlumno(); //ejecuta el método que Actualiza alumno
            ListarAlumnos(); //actualiza la tabla

            //lanza el aviso
            if (respuesta2==false)
            {
                JOptionPane.showMessageDialog(rootPane, "Se ha Actualizado correctamente");
                Limpiarcampos();
                this.BTNEliminar.setEnabled(false);
            }
            else{  JOptionPane.showMessageDialog(rootPane, "No se actualizó"); }

        }

    }//GEN-LAST:event_RegistrarActionPerformed

    private void TXTBuscargradoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTBuscargradoKeyPressed
        // TODO add your handling code here:
        TableModel modelo = new DefaultTableModel();
        Logica.ClsAlumno alum=new  Logica.ClsAlumno();
                //Extraemos la lista de personas dentro de un modelo
        modelo=alum.BusquedaAlumnosgrado(this.TXTBuscargrado.getText().trim());
        
        //Asociamos el modelo al JTable
        this.TabLista.setModel(modelo);
        
         //Oculta la primera columna
        OcultarColumnaTabla();
    }//GEN-LAST:event_TXTBuscargradoKeyPressed

    private void TXTBuscarseccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTBuscarseccionKeyPressed
        // TODO add your handling code here:
        
        TableModel modelo = new DefaultTableModel();
        Logica.ClsAlumno alum=new  Logica.ClsAlumno();
                //Extraemos la lista de personas dentro de un modelo
        modelo=alum.BusquedaAlumnosseccion(this.TXTBuscarseccion.getText().trim());
        
        //Asociamos el modelo al JTable
        this.TabLista.setModel(modelo);
        
         //Oculta la primera columna
        OcultarColumnaTabla();
    }//GEN-LAST:event_TXTBuscarseccionKeyPressed

    /** Método Main*/
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FRMAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater
        (
                new Runnable() 
                       {
                              public void run() 
                              {
                                       new FRMAlumnos().setVisible(true);  
                              }
                     }
           );
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNEliminar;
    private javax.swing.JComboBox CBXGrado;
    private javax.swing.JComboBox CBXSeccion;
    private javax.swing.JButton Cerrar;
    private javax.swing.ButtonGroup GrupoSexo;
    private javax.swing.JRadioButton RBFemenino;
    private javax.swing.JRadioButton RBMasculino;
    private javax.swing.JButton Registrar;
    private javax.swing.JTextField TXTBuscar;
    private javax.swing.JTextField TXTBuscargrado;
    private javax.swing.JTextField TXTBuscarseccion;
    private javax.swing.JTable TabLista;
    private javax.swing.JTextField TxtApellidos;
    private javax.swing.JTextField TxtDireccion;
    private javax.swing.JTextField TxtEmail;
    private javax.swing.JFormattedTextField TxtFechaNacimiento;
    private javax.swing.JTextField TxtNombres;
    private javax.swing.JTextField TxtPassword;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    
 /**Métodos Auxiliares*/
    private void ListarAlumnos(){ //Cargamos la tabla con la lista de personas
         //Creamos un objeto alumno
        Logica.ClsAlumno alumno=new Logica.ClsAlumno();
        //Creamos un modelo de tabla
        TableModel modelo = new DefaultTableModel();
        //Extraemos la lista de personas dentro de un modelo
        modelo=alumno.ListarAlumnos();

        //Asociamos el modelo al JTable
        this.TabLista.setModel(modelo);
        
        //Oculta la primera columna
        OcultarColumnaTabla();
    }

    public void Limpiarcampos(){
       this.CBXGrado.setSelectedIndex(0);
       this.TxtNombres.setText("");
       this.TxtApellidos.setText("");
       this.TxtDireccion.setText("");
       this.TxtTelefono.setText("");
       this.TxtEmail.setText("");
       this.TxtPassword.setText("");
       this.TxtFechaNacimiento.setText("");
    }
    
    private  void OcultarColumnaTabla(){
            //Oculta la primera columna de la tabla
       this.TabLista.getColumnModel().getColumn(0).setMaxWidth(0);
       this.TabLista.getColumnModel().getColumn(0).setMinWidth(0);
       this.TabLista. getColumnModel().getColumn(0).setPreferredWidth(0);
       
       
       
       this.TabLista.getColumnModel().getColumn(7).setMaxWidth(0);
       this.TabLista.getColumnModel().getColumn(7).setMinWidth(0);
       this.TabLista. getColumnModel().getColumn(7).setPreferredWidth(0);
       
       
       
       
       this.TabLista.getColumnModel().getColumn(8).setMaxWidth(0);
       this.TabLista.getColumnModel().getColumn(8).setMinWidth(0);
       this.TabLista. getColumnModel().getColumn(8).setPreferredWidth(0);
    }
}
