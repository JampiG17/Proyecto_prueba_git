package Presentacion;

import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class FRMProfesores extends javax.swing.JFrame {
    private int idprofesor=0;
    
    /** Constructor de carga de la ventana*/
    public FRMProfesores() {
        super("Registro de Profesores");
        initComponents();
        
        ListarProfesores();

  
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
        Registrar = new javax.swing.JButton();
        javax.swing.JButton Nuevo = new javax.swing.JButton();
        BTNEliminar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        TxtDireccion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TxtDni = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TxtEmail = new javax.swing.JTextField();
        TxtPassword = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TxtTelefono = new javax.swing.JTextField();
        Cerrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabLista = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        TXTBuscar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Registro de Personas"); // NOI18N
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Profesor"));

        TxtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombresActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombres");

        jLabel2.setText("Apellidos");

        Registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/postcategoryicon.png"))); // NOI18N
        Registrar.setText("Registrar");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });

        Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit.png"))); // NOI18N
        Nuevo.setText("Nuevo");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });

        BTNEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/elim.png"))); // NOI18N
        BTNEliminar.setText("Eliminar");
        BTNEliminar.setEnabled(false);
        BTNEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEliminarActionPerformed(evt);
            }
        });

        jLabel8.setText("Direccion");

        jLabel9.setText("Telefono");

        jLabel10.setText("Password");

        jLabel11.setText("Email");

        jLabel12.setText("Dni");

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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TxtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(TxtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(BTNEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(Registrar, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(Cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTNEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(TxtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(TxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TxtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addGap(9, 9, 9)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Profesores Registrados"), "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda de Profesores"));

        TXTBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TXTBuscarKeyPressed(evt);
            }
        });

        jLabel6.setText("Nombre y apellidos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TXTBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(291, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /** Método para seleccionar una profesor para editarlo*/
    private void TabListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabListaMouseClicked
       //activa los botones 
       this.Registrar.setText("Actualizar");
       this.BTNEliminar.setEnabled(true);
        
        //Creación de una fila de JTable y captura la fila, con el evento clic
        int fila=TabLista.rowAtPoint(evt.getPoint());
        Logica.ClsProfesor profesor=new Logica.ClsProfesor();
        //Captura de los datos de la profesor para editarlo
         this.idprofesor=Integer.parseInt(TabLista.getValueAt(fila, 0).toString());
         this.TxtNombres.setText(TabLista.getValueAt(fila, 2).toString());
         this.TxtApellidos.setText(TabLista.getValueAt(fila, 1).toString());
         this.TxtDni.setText(TabLista.getValueAt(fila, 3).toString());
         this.TxtDireccion.setText(TabLista.getValueAt(fila, 4).toString());
         this.TxtTelefono.setText(TabLista.getValueAt(fila, 5).toString());
         this.TxtEmail.setText(TabLista.getValueAt(fila, 6).toString());
         this.TxtPassword.setText(TabLista.getValueAt(fila, 7).toString());

    }//GEN-LAST:event_TabListaMouseClicked

    /**  Método para buscar Personas */
    private void TXTBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTBuscarKeyPressed
      
        //Creamos un modelo de tabla
        TableModel modelo = new DefaultTableModel();
        Logica.ClsProfesor profe=new  Logica.ClsProfesor();
                //Extraemos la lista de personas dentro de un modelo
        modelo=profe.BusquedaProfesor(this.TXTBuscar.getText().trim());
        
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

        if (this.idprofesor==0){
            JOptionPane.showMessageDialog(rootPane, "Seleccione un Alumno");
            return;
        }
        //Captura la confirmacion
        int confirmacion= JOptionPane.showConfirmDialog(rootPane, "¿Estas seguro de eliminar?", "Confirma la acción", 2);

        if (confirmacion==0){ //evaluamos la confirmación
            boolean confirmacion2=true;
            Logica.ClsProfesor profe=new Logica.ClsProfesor();
            confirmacion2=profe.EliminarProfesor( this.idprofesor);
            if (confirmacion2==false){ //Evaluamos el resultado de la operacion
                JOptionPane.showMessageDialog(rootPane, "Eliminación correcta");
                Limpiarcampos();  //Limpiamos los campos
                this.BTNEliminar.setEnabled(false); //Deshabilitamos el botón
                this.ListarProfesores(); //recargamos la lista
            }else{
                JOptionPane.showMessageDialog(rootPane, "No se pudo Eliminar");
            }
        }
    }//GEN-LAST:event_BTNEliminarActionPerformed

    /**Método para registrar una nueva profesor*/
    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        this.Registrar.setText("Registrar");
        this.Limpiarcampos();
        this.idprofesor=0;
        this.BTNEliminar.setEnabled(false);
    }//GEN-LAST:event_NuevoActionPerformed

    /** Método para Registrar una profesor*/
    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        //Validación de campos

        if (this.TxtNombres.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar el nombre del Profesor");
            TxtNombres.requestFocus();//rabFocus();
            return ;
        }
        if (this.TxtApellidos.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar apellidos del Profesor");
            TxtApellidos.requestFocus();
            return ;
        }
      
           if (this.TxtDni.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar El Dni del profesor");
            TxtDni.requestFocus();
            return ;
        }
      
        
        if (this.TxtDireccion.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Debe Ingresar la Direccion Del Profesor");
            TxtDireccion.requestFocus();
            return ;
        }
            if (this.TxtTelefono.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Debes Ingresar el telefono");
            TxtTelefono.requestFocus();
            return ;
        }
            
            if (this.TxtEmail.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Debes Ingresar el Email");
            TxtEmail.requestFocus();
            return ;
        }
            if (this.TxtPassword.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Debes Ingresar el password de acceso al sitema");
            TxtPassword.requestFocus();
            return ;
        }
            
        Logica.ClsProfesor profesor=new Logica.ClsProfesor();  //objeto tipo profesor
        profesor.idprofesor=this.idprofesor;
        profesor.nombres=this.TxtNombres.getText();
        profesor.apellidos=this.TxtApellidos.getText();
        profesor.dni=this.TxtDni.getText();
        profesor.direccion=this.TxtDireccion.getText();
        profesor.telefono=this.TxtTelefono.getText();
        profesor.email=this.TxtEmail.getText();
        profesor.password=this.TxtPassword.getText();
       
        //Evaluamos si el usuario esta Registrando una nueva profesor o esta actualizando
        if(this.idprofesor==0){
            boolean respuesta=true; //bandera
            respuesta=profesor.RegistrarProfesor(); //ejecuta el método que registra profesor
            ListarProfesores(); //actualiza la tabla

            //lanza el aviso
            if (respuesta==false)
            {
                JOptionPane.showMessageDialog(rootPane, "Se ha registrado correctamente");
                Limpiarcampos();
                this.BTNEliminar.setEnabled(false);
            }
            else{  JOptionPane.showMessageDialog(rootPane, "Persona No registrada"); }

        }
        else //actualiza los datos de la profesor
        {
            boolean respuesta2=true; //bandera
            respuesta2=profesor.ActualizarProfesor(); //ejecuta el método que Actualiza profesor
            ListarProfesores(); //actualiza la tabla

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

    private void TxtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombresActionPerformed

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
            java.util.logging.Logger.getLogger(FRMProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater
        (
                new Runnable() 
                       {
                              public void run() 
                              {
                                       new FRMProfesores().setVisible(true);  
                              }
                     }
           );
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNEliminar;
    private javax.swing.JButton Cerrar;
    private javax.swing.ButtonGroup GrupoSexo;
    private javax.swing.JButton Registrar;
    private javax.swing.JTextField TXTBuscar;
    private javax.swing.JTable TabLista;
    private javax.swing.JTextField TxtApellidos;
    private javax.swing.JTextField TxtDireccion;
    private javax.swing.JTextField TxtDni;
    private javax.swing.JTextField TxtEmail;
    private javax.swing.JTextField TxtNombres;
    private javax.swing.JTextField TxtPassword;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    
 /**Métodos Auxiliares*/
    private void ListarProfesores(){ //Cargamos la tabla con la lista de personas
         //Creamos un objeto profesor
        Logica.ClsProfesor profesor=new Logica.ClsProfesor();
        //Creamos un modelo de tabla
        TableModel modelo = new DefaultTableModel();
        //Extraemos la lista de personas dentro de un modelo
        modelo=profesor.ListarProfesor();

        //Asociamos el modelo al JTable
        this.TabLista.setModel(modelo);
        
        //Oculta la primera columna
        OcultarColumnaTabla();
    }

    public void Limpiarcampos(){
       
       this.TxtNombres.setText("");
       this.TxtApellidos.setText("");
       this.TxtDireccion.setText("");
       this.TxtDni.setText("");
       this.TxtEmail.setText("");
       this.TxtPassword.setText("");
       this.TxtTelefono.setText("");
    }
    
    private  void OcultarColumnaTabla(){
            //Oculta la primera columna de la tabla
       this.TabLista.getColumnModel().getColumn(0).setMaxWidth(0);
       this.TabLista.getColumnModel().getColumn(0).setMinWidth(0);
       this.TabLista. getColumnModel().getColumn(0).setPreferredWidth(0);
    }
}
