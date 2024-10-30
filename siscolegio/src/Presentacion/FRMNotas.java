package Presentacion;

import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class FRMNotas extends javax.swing.JFrame {
    private int idnota=0;
    
    /** Constructor de carga de la ventana*/
    public FRMNotas() {
        super("Registro de Notas");
        initComponents();
        ListarNotas();
        ListarCursos();
        ListarAlumnos();

  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoSexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        TxtCodCurso = new javax.swing.JTextField();
        TxtCodAlumno = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CBXUnidad = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        Registrar = new javax.swing.JButton();
        javax.swing.JButton Nuevo = new javax.swing.JButton();
        BTNEliminar = new javax.swing.JButton();
        TxtPromedio = new javax.swing.JTextField();
        TxtNombrecurso = new javax.swing.JTextField();
        TxtNombreAlumno = new javax.swing.JTextField();
        Cerrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabLista = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        TXTBuscar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        PanelCurso = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabListacurso = new javax.swing.JTable();
        Curso = new javax.swing.JLabel();
        TXTCurso = new javax.swing.JTextField();
        CmdCursoRegistrar = new javax.swing.JButton();
        PanelCurso2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TabListaalumno = new javax.swing.JTable();
        Curso2 = new javax.swing.JLabel();
        TXTAlumno = new javax.swing.JTextField();
        CmdAlumnoRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setName("Registro de Personas"); // NOI18N
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de Los Alumnos"));

        TxtCodCurso.setEnabled(false);

        TxtCodAlumno.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Cod Curso");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Cod Alumno");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Promedio");

        CBXUnidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Bimestre");

        Registrar.setBackground(new java.awt.Color(0, 102, 102));
        Registrar.setForeground(new java.awt.Color(255, 255, 255));
        Registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/postcategoryicon.png"))); // NOI18N
        Registrar.setText("Registrar");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });

        Nuevo.setBackground(new java.awt.Color(0, 102, 102));
        Nuevo.setForeground(new java.awt.Color(255, 255, 255));
        Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit.png"))); // NOI18N
        Nuevo.setText("Nuevo");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });

        BTNEliminar.setBackground(new java.awt.Color(0, 102, 102));
        BTNEliminar.setForeground(new java.awt.Color(255, 255, 255));
        BTNEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/elim.png"))); // NOI18N
        BTNEliminar.setText("Eliminar");
        BTNEliminar.setEnabled(false);
        BTNEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEliminarActionPerformed(evt);
            }
        });

        TxtNombrecurso.setEnabled(false);

        TxtNombreAlumno.setEnabled(false);

        Cerrar.setBackground(new java.awt.Color(0, 102, 102));
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
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TxtCodAlumno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(TxtCodCurso, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtNombreAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                            .addComponent(TxtNombrecurso)))
                    .addComponent(TxtPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBXUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTNEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCodCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(TxtNombrecurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCodAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(TxtNombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CBXUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Alumnos Registrados"), "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        TabLista.setForeground(new java.awt.Color(102, 51, 0));
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
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Alumnos"));

        TXTBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTBuscarActionPerformed(evt);
            }
        });
        TXTBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TXTBuscarKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Apellidos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TXTBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        PanelCurso.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Cursos"), "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        TabListacurso.setForeground(new java.awt.Color(102, 51, 0));
        TabListacurso.setModel(new javax.swing.table.DefaultTableModel(
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
        TabListacurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabListacursoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TabListacurso);

        Curso.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Curso.setForeground(new java.awt.Color(0, 102, 102));
        Curso.setText("Curso");

        TXTCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTCursoActionPerformed(evt);
            }
        });
        TXTCurso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TXTCursoKeyPressed(evt);
            }
        });

        CmdCursoRegistrar.setBackground(new java.awt.Color(0, 102, 102));
        CmdCursoRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        CmdCursoRegistrar.setText("Registrar");
        CmdCursoRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CmdCursoRegistrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelCursoLayout = new javax.swing.GroupLayout(PanelCurso);
        PanelCurso.setLayout(PanelCursoLayout);
        PanelCursoLayout.setHorizontalGroup(
            PanelCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCursoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(PanelCursoLayout.createSequentialGroup()
                        .addComponent(Curso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXTCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(CmdCursoRegistrar)))
                .addContainerGap())
        );
        PanelCursoLayout.setVerticalGroup(
            PanelCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCursoLayout.createSequentialGroup()
                .addGroup(PanelCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Curso)
                    .addComponent(TXTCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CmdCursoRegistrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        PanelCurso2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Alumnos"), "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        TabListaalumno.setForeground(new java.awt.Color(102, 51, 0));
        TabListaalumno.setModel(new javax.swing.table.DefaultTableModel(
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
        TabListaalumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabListaalumnoMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(TabListaalumno);

        Curso2.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Curso2.setForeground(new java.awt.Color(0, 102, 102));
        Curso2.setText("Alumno");

        TXTAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTAlumnoActionPerformed(evt);
            }
        });
        TXTAlumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TXTAlumnoKeyPressed(evt);
            }
        });

        CmdAlumnoRegistrar.setBackground(new java.awt.Color(0, 102, 102));
        CmdAlumnoRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        CmdAlumnoRegistrar.setText("Registrar");
        CmdAlumnoRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CmdAlumnoRegistrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelCurso2Layout = new javax.swing.GroupLayout(PanelCurso2);
        PanelCurso2.setLayout(PanelCurso2Layout);
        PanelCurso2Layout.setHorizontalGroup(
            PanelCurso2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCurso2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCurso2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(PanelCurso2Layout.createSequentialGroup()
                        .addComponent(Curso2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXTAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CmdAlumnoRegistrar)))
                .addContainerGap())
        );
        PanelCurso2Layout.setVerticalGroup(
            PanelCurso2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCurso2Layout.createSequentialGroup()
                .addGroup(PanelCurso2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Curso2)
                    .addComponent(TXTAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CmdAlumnoRegistrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PanelCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PanelCurso2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PanelCurso2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Notas Del Alumno");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /** Método para Registrar una nota*/
    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        //Validación de campos
             
        if (this.TxtCodCurso.getText().length()==0){
             JOptionPane.showMessageDialog(rootPane, "Debes Seleccionar el curso");
             TxtCodCurso.requestFocus();//rabFocus(); 
             return ;
        }
        if (this.TxtCodAlumno.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Debes Seleccionar el Alumno");
            TxtCodAlumno.requestFocus(); 
        return ;
        }
        
         if (this.TxtPromedio.getText().length()==0 ){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar el Promedio del Alumno");
            TxtPromedio.requestFocus(); 
        return ;
        }
         
          if (Integer.parseInt(this.TxtPromedio.getText())<0 || Integer.parseInt(this.TxtPromedio.getText())>20 ){
            JOptionPane.showMessageDialog(rootPane, "Ingrese Un promedio valido");
            TxtPromedio.requestFocus(); 
        return ;
        }
      
        Logica.ClsNotas nota=new Logica.ClsNotas();  //objeto tipo nota
        nota.idnota=this.idnota;
        nota.idcurso=Integer.parseInt(this.TxtCodCurso.getText());
        nota.idalumno=Integer.parseInt(this.TxtCodAlumno.getText());
        nota.promedio=Integer.parseInt(this.TxtPromedio.getText());
        //Selecciona el item
        int seleccionado=CBXUnidad.getSelectedIndex();
        nota.unidad=(String)this.CBXUnidad.getItemAt(seleccionado);//texto del Item seleccionado
       
  //Evaluamos si el usuario esta Registrando una nueva nota o esta actualizando
  if(this.idnota==0){
       boolean respuesta=true; //bandera
       respuesta=nota.RegistrarNota(); //ejecuta el método que registra nota
       ListarNotas(); //actualiza la tabla
       
       //lanza el aviso
       if (respuesta==false)
           { 
           JOptionPane.showMessageDialog(rootPane, "Se ha registrado correctamente");
            Limpiarcampos();
            this.BTNEliminar.setEnabled(false);
           }
       else{  JOptionPane.showMessageDialog(rootPane, "Nota No Registrada"); }
         
  }
  else //actualiza los datos de la nota
  {
           boolean respuesta2=true; //bandera
            respuesta2=nota.ActualizarNota(); //ejecuta el método que Actualiza nota
            ListarNotas(); //actualiza la tabla
       
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

    /** Método para seleccionar una nota para editarlo*/
    private void TabListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabListaMouseClicked
       //activa los botones 
       this.Registrar.setText("Actualizar");
       this.BTNEliminar.setEnabled(true);
        
        //Creación de una fila de JTable y captura la fila, con el evento clic
        int fila=TabLista.rowAtPoint(evt.getPoint());
        Logica.ClsAlumno alum=new Logica.ClsAlumno();
        //Captura de los datos de la nota para editarlo
         this.idnota=Integer.parseInt(TabLista.getValueAt(fila, 0).toString());
         this.CBXUnidad.setSelectedItem(TabLista.getValueAt(fila, 7).toString());
         this.TxtCodCurso.setText(TabLista.getValueAt(fila, 1).toString());
         this.TxtCodAlumno.setText(TabLista.getValueAt(fila, 3).toString());
         this.TxtPromedio.setText(TabLista.getValueAt(fila, 6).toString());
         this.TxtNombrecurso.setText(TabLista.getValueAt(fila, 2).toString());
         this.TxtNombreAlumno.setText(TabLista.getValueAt(fila, 4).toString()+" "+TabLista.getValueAt(fila, 5).toString());
         
                
         
    }//GEN-LAST:event_TabListaMouseClicked

    /**Método para registrar una nueva nota*/
    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        this.Registrar.setText("Registrar");
        this.Limpiarcampos();
        this.idnota=0;
        this.BTNEliminar.setEnabled(false);
    }//GEN-LAST:event_NuevoActionPerformed

    private void BTNEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEliminarActionPerformed
        // TODO add your handling code here:

        if (this.idnota==0){
            JOptionPane.showMessageDialog(rootPane, "Seleccione una Nota");
            return;
        }
       //Captura la confirmacion
        int confirmacion= JOptionPane.showConfirmDialog(rootPane, "¿Estas seguro de eliminar?", "Confirma la acción", 2);
                    
       if (confirmacion==0){ //evaluamos la confirmación
           boolean confirmacion2=true;
            Logica.ClsNotas nota=new Logica.ClsNotas();
            confirmacion2=nota.EliminarNota( this.idnota);
                if (confirmacion2==false){ //Evaluamos el resultado de la operacion
                     JOptionPane.showMessageDialog(rootPane, "Eliminación correcta");
                     Limpiarcampos();  //Limpiamos los campos
                    this.BTNEliminar.setEnabled(false); //Deshabilitamos el botón
                    this.ListarNotas(); //recargamos la lista
                }else{
                     JOptionPane.showMessageDialog(rootPane, "No se pudo Eliminar");
                }
       }    
    }//GEN-LAST:event_BTNEliminarActionPerformed

    /**  Método para buscar Personas */
    private void TXTBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTBuscarKeyPressed
      
        //Creamos un modelo de tabla
        TableModel modelo = new DefaultTableModel();
        Logica.ClsNotas nota=new  Logica.ClsNotas();
                //Extraemos la lista de personas dentro de un modelo
        modelo=nota.BusquedaNotas(this.TXTBuscar.getText().trim());
        
        //Asociamos el modelo al JTable
        this.TabLista.setModel(modelo);
        
         //Oculta la primera columna
        OcultarColumnaTablaNotas();
        
    }//GEN-LAST:event_TXTBuscarKeyPressed

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_CerrarActionPerformed

    private void TabListacursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabListacursoMouseClicked
        // TODO add your handling code here:
                
        //Creación de una fila de JTable y captura la fila, con el evento clic
        int fila=TabLista.rowAtPoint(evt.getPoint());
        
        //Captura de los datos de la nota para editarlo
         this.TxtCodCurso.setText(TabListacurso.getValueAt(fila, 0).toString());
         this.TxtNombrecurso.setText(TabListacurso.getValueAt(fila, 1).toString());
         
    }//GEN-LAST:event_TabListacursoMouseClicked

    private void TXTCursoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTCursoKeyPressed
        // TODO add your handling code here:
        //Creamos un modelo de tabla
        TableModel modelo = new DefaultTableModel();
        Logica.ClsCurso curso=new  Logica.ClsCurso();
                //Extraemos la lista de personas dentro de un modelo
        modelo=curso.BusquedaCursos(this.TXTCurso.getText().trim());
        
        //Asociamos el modelo al JTable
        this.TabListacurso.setModel(modelo);
        
         //Oculta la primera columna
        OcultarColumnaTabla();
    }//GEN-LAST:event_TXTCursoKeyPressed

    private void TXTBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTBuscarActionPerformed

    private void TXTCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTCursoActionPerformed

    private void TabListaalumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabListaalumnoMouseClicked
        // TODO add your handling code here:
        int fila=TabLista.rowAtPoint(evt.getPoint());
        
        //Captura de los datos de la nota para editarlo
         this.TxtCodAlumno.setText(TabListaalumno.getValueAt(fila, 0).toString());
         this.TxtNombreAlumno.setText(TabListaalumno.getValueAt(fila, 1).toString()+" "+TabListaalumno.getValueAt(fila, 2).toString());
    }//GEN-LAST:event_TabListaalumnoMouseClicked

    private void TXTAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTAlumnoActionPerformed

    private void TXTAlumnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTAlumnoKeyPressed
        // TODO add your handling code here:
        TableModel modelo = new DefaultTableModel();
        Logica.ClsAlumno alumno=new  Logica.ClsAlumno();
                //Extraemos la lista de personas dentro de un modelo
        modelo=alumno.BusquedaAlumnosvista(this.TXTAlumno.getText().trim());
        
        //Asociamos el modelo al JTable
        this.TabListaalumno.setModel(modelo);
        
         //Oculta la primera columna
        OcultarColumnaTabla();
    }//GEN-LAST:event_TXTAlumnoKeyPressed

    private void CmdCursoRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CmdCursoRegistrarMouseClicked
        // TODO add your handling code here:
        FRMCursos f=new FRMCursos();
        f.show();
    }//GEN-LAST:event_CmdCursoRegistrarMouseClicked

    private void CmdAlumnoRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CmdAlumnoRegistrarMouseClicked
        // TODO add your handling code here:
        FRMAlumnos f=new FRMAlumnos();
        f.show();
    }//GEN-LAST:event_CmdAlumnoRegistrarMouseClicked

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
            java.util.logging.Logger.getLogger(FRMNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater
        (
                new Runnable() 
                       {
                              public void run() 
                              {
                                       new FRMNotas().setVisible(true);  
                              }
                     }
           );
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNEliminar;
    private javax.swing.JComboBox CBXUnidad;
    private javax.swing.JButton Cerrar;
    private javax.swing.JButton CmdAlumnoRegistrar;
    private javax.swing.JButton CmdCursoRegistrar;
    private javax.swing.JLabel Curso;
    private javax.swing.JLabel Curso2;
    private javax.swing.ButtonGroup GrupoSexo;
    private javax.swing.JPanel PanelCurso;
    private javax.swing.JPanel PanelCurso2;
    private javax.swing.JButton Registrar;
    private javax.swing.JTextField TXTAlumno;
    private javax.swing.JTextField TXTBuscar;
    private javax.swing.JTextField TXTCurso;
    private javax.swing.JTable TabLista;
    private javax.swing.JTable TabListaalumno;
    private javax.swing.JTable TabListacurso;
    private javax.swing.JTextField TxtCodAlumno;
    private javax.swing.JTextField TxtCodCurso;
    private javax.swing.JTextField TxtNombreAlumno;
    private javax.swing.JTextField TxtNombrecurso;
    private javax.swing.JTextField TxtPromedio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables

    
 /**Métodos Auxiliares*/
    private void ListarNotas(){ //Cargamos la tabla con la lista de personas
         //Creamos un objeto nota
        Logica.ClsNotas nota=new Logica.ClsNotas();
        //Creamos un modelo de tabla
        TableModel modelo = new DefaultTableModel();
        //Extraemos la lista de personas dentro de un modelo
        modelo=nota.ListarNota();

        //Asociamos el modelo al JTable
        this.TabLista.setModel(modelo);
        
        //Oculta lascolumnas codigo
        OcultarColumnaTablaNotas();
    }
    
    
        private void ListarCursos(){ //Cargamos la tabla con la lista de personas
         //Creamos un objeto nota
        Logica.ClsCurso nota=new Logica.ClsCurso();
        //Creamos un modelo de tabla
        TableModel modelo = new DefaultTableModel();
        //Extraemos la lista de personas dentro de un modelo
        modelo=nota.ListarCursos();

        //Asociamos el modelo al JTable
        this.TabListacurso.setModel(modelo);
        
        //Oculta la primera columna
        OcultarColumnaTabla();
    }
        
             private void ListarAlumnos(){ //Cargamos la tabla con la lista de personas
         //Creamos un objeto nota
        Logica.ClsAlumno alumnito=new Logica.ClsAlumno();
        //Creamos un modelo de tabla
        TableModel modelo = new DefaultTableModel();
        //Extraemos la lista de personas dentro de un modelo
        modelo=alumnito.ListarAlumnosvista();

        //Asociamos el modelo al JTable
        this.TabListaalumno.setModel(modelo);
        
        //Oculta la primera columna
        OcultarColumnaTabla();
    }
        
        
    
    

    public void Limpiarcampos(){
       this.CBXUnidad.setSelectedIndex(0);
       this.TxtCodCurso.setText("");
       this.TxtCodAlumno.setText("");
       this.TxtPromedio.setText("");
       this.TxtNombreAlumno.setText("");
       this.TxtNombrecurso.setText("");
    }
    
    private  void OcultarColumnaTabla(){
            //Oculta la primera columna de la tabla
       this.TabListaalumno.getColumnModel().getColumn(0).setMaxWidth(0);
       this.TabListaalumno.getColumnModel().getColumn(0).setMinWidth(0);
       this.TabListaalumno. getColumnModel().getColumn(0).setPreferredWidth(0);
       
       this.TabListacurso.getColumnModel().getColumn(0).setMaxWidth(0);
       this.TabListacurso.getColumnModel().getColumn(0).setMinWidth(0);
       this.TabListacurso. getColumnModel().getColumn(0).setPreferredWidth(0);
    }
    
    private  void OcultarColumnaTablaNotas(){
            //Oculta la primera columna de la tabla
       this.TabLista.getColumnModel().getColumn(0).setMaxWidth(0);
       this.TabLista.getColumnModel().getColumn(0).setMinWidth(0);
       this.TabLista. getColumnModel().getColumn(0).setPreferredWidth(0);
       
       this.TabLista.getColumnModel().getColumn(1).setMaxWidth(0);
       this.TabLista.getColumnModel().getColumn(1).setMinWidth(0);
       this.TabLista. getColumnModel().getColumn(1).setPreferredWidth(0);
       
       this.TabLista.getColumnModel().getColumn(3).setMaxWidth(0);
       this.TabLista.getColumnModel().getColumn(3).setMinWidth(0);
       this.TabLista. getColumnModel().getColumn(3).setPreferredWidth(0);
    }
}
