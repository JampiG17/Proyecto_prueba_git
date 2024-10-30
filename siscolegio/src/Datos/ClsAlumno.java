package Datos;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ClsAlumno {
   public int idalumno;
   public String apellidos;
   public String nombres;
   public Date fechaNacimiento;
   public String sexo;
   public String direccion;
   public String telefono;
   public String email;
   public String password;
   public String grado;
   public String seccion;
   
   /**Constructor*/
   public ClsAlumno(){
   }
  
/**Datos - Metodo para registrar persona*/
public boolean RegistrarAlumno(){
     boolean respuesta=true;
    try {
          this.idalumno=GenerarIDAlumno();
          operaciones consulta=new operaciones(); //crea un objeto de la clase consulta
          respuesta=consulta.InsercionBase("insert into alumno values ( '" + this.idalumno +"','"+this.apellidos +"','"+this.nombres+"','"+this.fechaNacimiento+"','"+this.sexo+"','"+this.direccion+"','"+this.telefono+"','"+this.email+"','"+this.password+"','"+this.grado+"','"+this.seccion+"')"); //     
          consulta.getStmt().close(); 
        } catch (SQLException ex) {
               System.out.println(ex);
        }
    return respuesta;
}

/**Datos - Metodo para actualizar persona*/
public boolean ActualizarAlumno(){
     boolean respuesta=true;
    try {

          operaciones consulta=new operaciones(); //crea un objeto de la clase consulta
          //UPDATE persona set apellidos='',nombres='',fechanacimiento='12/12/2010',sexo='',estadocivil='' where idpersona=1;
          respuesta=consulta.ActualizacionBase("UPDATE alumno set Apellidos='" + this.apellidos+"',Nombres='"+this.nombres +"',Fechanacimiento='"+this.fechaNacimiento+"',Sexo='"+this.sexo+"',Direccion='"+this.direccion+"',Telefono='"+this.telefono+"',Email='"+this.email+"',Password='"+this.password+"',Grado='"+this.grado+"',Seccion='"+this.seccion+"' where  Idalumno="+this.idalumno+"");    
          consulta.getStmt().close(); 
        } catch (SQLException ex) {
               System.out.println(ex);
        }
    return respuesta;
}

/**Datos - Metodo para Eliminar persona*/
public boolean EliminarAlumno(int idAlumno){
     boolean respuesta=true;
    try {

          operaciones consulta=new operaciones(); //crea un objeto de la clase consulta
          //delete from persona where idpersona=13;
          respuesta=consulta.ActualizacionBase("delete from alumno where Idalumno="+idAlumno+"");    
          consulta.getStmt().close(); 
        } catch (SQLException ex) {
               System.out.println(ex);
        }
    return respuesta;
}


   /**Datos - Genera la secuancia de ID de pérsona*/
   public static int GenerarIDAlumno(){
    int IDGenerado=0;
    
    try {
            operaciones consulta=new operaciones(); //crea un objeto de la clase consulta
            ResultSet resultado=consulta.ConsultaBase("select max(Idalumno) as id from alumno"); //
                        
            //Recorremos los resultados y se imprime campo por campo
            while (resultado.next()){
                //Concatenamos el texto
                System.out.println(resultado.getInt("id"));
                IDGenerado=resultado.getInt("id");
            }
            //Cierra la declaración que sirve para pasar la consulta
            consulta.getStmt().close(); 
            
        } catch (SQLException ex) {
             System.out.println(ex);
        }
    
    return IDGenerado+1;
   }
   
   /**Datos-Metodo para Listar Personas*/
   //select * from persona where apellidos ||' ' || nombres like 'Diaz Perez Jo%'
   public TableModel ListarAlumnos(){
        DefaultTableModel modelo = new DefaultTableModel();
        try {
             //Para ejecutar la consulta
             operaciones consulta=new operaciones(); //crea un objeto de la clase consulta
             ResultSet resultado=consulta.ConsultaBase("select * from alumno"); //
                                    
             //Obteniendo la informacion de las columnas que estan siendo consultadas
             ResultSetMetaData Columnas = resultado.getMetaData();
             //La cantidad de columnas que tiene la consulta
             int cantidadColumnas = Columnas.getColumnCount();
             
             //Establecer como cabezeras el nombre de las columnas
             for (int i = 1; i <= cantidadColumnas; i++) {
                    modelo.addColumn(Columnas.getColumnLabel(i)); //Agrega columnas al modelo con el titulo extraido de la metadata
             }
             //Extrae las filas del resultSet y los para al modelo
                while (resultado.next()) {
                       Object[] fila = new Object[cantidadColumnas];
                        for (int i = 0; i < cantidadColumnas; i++) {
                                 fila[i]=resultado.getObject(i+1);
                        }
                 modelo.addRow(fila); //agregamos al modelo la fila extraida.
                }
                consulta.getStmt().close(); //Cierra el preparador  de sentencias SQL
                return modelo; 
        }
        //
        catch (SQLException ex) {
             System.out.println(ex);
        }
    return modelo;
  }
   
   
   public TableModel ListarAlumnosvista(){
        DefaultTableModel modelo = new DefaultTableModel();
        try {
             //Para ejecutar la consulta
             operaciones consulta=new operaciones(); //crea un objeto de la clase consulta
             ResultSet resultado=consulta.ConsultaBase("select Idalumno,Nombres,Apellidos from alumno"); //
                                    
             //Obteniendo la informacion de las columnas que estan siendo consultadas
             ResultSetMetaData Columnas = resultado.getMetaData();
             //La cantidad de columnas que tiene la consulta
             int cantidadColumnas = Columnas.getColumnCount();
             
             //Establecer como cabezeras el nombre de las columnas
             for (int i = 1; i <= cantidadColumnas; i++) {
                    modelo.addColumn(Columnas.getColumnLabel(i)); //Agrega columnas al modelo con el titulo extraido de la metadata
             }
             //Extrae las filas del resultSet y los para al modelo
                while (resultado.next()) {
                       Object[] fila = new Object[cantidadColumnas];
                        for (int i = 0; i < cantidadColumnas; i++) {
                                 fila[i]=resultado.getObject(i+1);
                        }
                 modelo.addRow(fila); //agregamos al modelo la fila extraida.
                }
                consulta.getStmt().close(); //Cierra el preparador  de sentencias SQL
                return modelo; 
        }
        //
        catch (SQLException ex) {
             System.out.println(ex);
        }
    return modelo;
  }
   
   
   
   
   
   
    /**Datos-Metodo para Buscar Personas*/
   public TableModel BusquedaAlumnos(String ApellidosNombres){
        DefaultTableModel modelo = new DefaultTableModel();
        try {
             //Para ejecutar la consulta
               //select * from persona where apellidos ||' ' || nombres like 'Diaz Perez Jo%'
             operaciones consulta=new operaciones(); //crea un objeto de la clase consulta
             ResultSet resultado=consulta.ConsultaBase("select * from alumno where Apellidos like '" +ApellidosNombres +"%'"); 
                                    
             //Obteniendo la informacion de las columnas que estan siendo consultadas
             ResultSetMetaData Columnas = resultado.getMetaData();
             //La cantidad de columnas que tiene la consulta
             int cantidadColumnas = Columnas.getColumnCount();
             
             //Establecer como cabezeras el nombre de las columnas
             for (int i = 1; i <= cantidadColumnas; i++) {
                    modelo.addColumn(Columnas.getColumnLabel(i)); //Agrega columnas al modelo con el titulo extraido de la metadata
             }
             //Extrae las filas del resultSet y los para al modelo
                while (resultado.next()) {
                       Object[] fila = new Object[cantidadColumnas];
                        for (int i = 0; i < cantidadColumnas; i++) {
                                 fila[i]=resultado.getObject(i+1);
                        }
                 modelo.addRow(fila); //agregamos al modelo la fila extraida.
                }
                consulta.getStmt().close(); //Cierra el preparador  de sentencias SQL
                return modelo; 
        }
        //
        catch (SQLException ex) {
             System.out.println(ex);
        }
    return modelo;
  }
   
   
   
   
   
   public TableModel BusquedaAlumnosvista(String ApellidosNombres){
        DefaultTableModel modelo = new DefaultTableModel();
        try {
             //Para ejecutar la consulta
               //select * from persona where apellidos ||' ' || nombres like 'Diaz Perez Jo%'
             operaciones consulta=new operaciones(); //crea un objeto de la clase consulta
             ResultSet resultado=consulta.ConsultaBase("select Idalumno,Nombres,Apellidos from alumno where Apellidos like '" +ApellidosNombres +"%'"); 
                                    
             //Obteniendo la informacion de las columnas que estan siendo consultadas
             ResultSetMetaData Columnas = resultado.getMetaData();
             //La cantidad de columnas que tiene la consulta
             int cantidadColumnas = Columnas.getColumnCount();
             
             //Establecer como cabezeras el nombre de las columnas
             for (int i = 1; i <= cantidadColumnas; i++) {
                    modelo.addColumn(Columnas.getColumnLabel(i)); //Agrega columnas al modelo con el titulo extraido de la metadata
             }
             //Extrae las filas del resultSet y los para al modelo
                while (resultado.next()) {
                       Object[] fila = new Object[cantidadColumnas];
                        for (int i = 0; i < cantidadColumnas; i++) {
                                 fila[i]=resultado.getObject(i+1);
                        }
                 modelo.addRow(fila); //agregamos al modelo la fila extraida.
                }
                consulta.getStmt().close(); //Cierra el preparador  de sentencias SQL
                return modelo; 
        }
        //
        catch (SQLException ex) {
             System.out.println(ex);
        }
    return modelo;
  }
   
   
   public TableModel BusquedaAlumnosgrado(String Grado){
        DefaultTableModel modelo = new DefaultTableModel();
        try {
             //Para ejecutar la consulta
               //select * from persona where apellidos ||' ' || nombres like 'Diaz Perez Jo%'
             operaciones consulta=new operaciones(); //crea un objeto de la clase consulta
             ResultSet resultado=consulta.ConsultaBase("select * from alumno where Grado like '" +Grado +"%'"); 
                                    
             //Obteniendo la informacion de las columnas que estan siendo consultadas
             ResultSetMetaData Columnas = resultado.getMetaData();
             //La cantidad de columnas que tiene la consulta
             int cantidadColumnas = Columnas.getColumnCount();
             
             //Establecer como cabezeras el nombre de las columnas
             for (int i = 1; i <= cantidadColumnas; i++) {
                    modelo.addColumn(Columnas.getColumnLabel(i)); //Agrega columnas al modelo con el titulo extraido de la metadata
             }
             //Extrae las filas del resultSet y los para al modelo
                while (resultado.next()) {
                       Object[] fila = new Object[cantidadColumnas];
                        for (int i = 0; i < cantidadColumnas; i++) {
                                 fila[i]=resultado.getObject(i+1);
                        }
                 modelo.addRow(fila); //agregamos al modelo la fila extraida.
                }
                consulta.getStmt().close(); //Cierra el preparador  de sentencias SQL
                return modelo; 
        }
        //
        catch (SQLException ex) {
             System.out.println(ex);
        }
    return modelo;
  }
   
   
   
   public TableModel BusquedaAlumnosseccion(String seccion){
        DefaultTableModel modelo = new DefaultTableModel();
        try {
             //Para ejecutar la consulta
               //select * from persona where apellidos ||' ' || nombres like 'Diaz Perez Jo%'
             operaciones consulta=new operaciones(); //crea un objeto de la clase consulta
             ResultSet resultado=consulta.ConsultaBase("select * from alumno where seccion like '" +seccion +"%'"); 
                                    
             //Obteniendo la informacion de las columnas que estan siendo consultadas
             ResultSetMetaData Columnas = resultado.getMetaData();
             //La cantidad de columnas que tiene la consulta
             int cantidadColumnas = Columnas.getColumnCount();
             
             //Establecer como cabezeras el nombre de las columnas
             for (int i = 1; i <= cantidadColumnas; i++) {
                    modelo.addColumn(Columnas.getColumnLabel(i)); //Agrega columnas al modelo con el titulo extraido de la metadata
             }
             //Extrae las filas del resultSet y los para al modelo
                while (resultado.next()) {
                       Object[] fila = new Object[cantidadColumnas];
                        for (int i = 0; i < cantidadColumnas; i++) {
                                 fila[i]=resultado.getObject(i+1);
                        }
                 modelo.addRow(fila); //agregamos al modelo la fila extraida.
                }
                consulta.getStmt().close(); //Cierra el preparador  de sentencias SQL
                return modelo; 
        }
        //
        catch (SQLException ex) {
             System.out.println(ex);
        }
    return modelo;
  }
   
   
   
   
   
   
   
 

    /**Datos-Metodo para Buscar Personas*/
   public ComboBoxModel ListarGrado(){
        //DefaultTableModel modelo = new DefaultTableModel();
        DefaultComboBoxModel modelo=new DefaultComboBoxModel();
        try {
             //Para ejecutar la consulta
             operaciones consulta=new operaciones(); //crea un objeto de la clase consulta
             ResultSet resultado=consulta.ConsultaBase("select * from alumno"); 
                                    
             //Obteniendo la informacion de las columnas que estan siendo consultadas
             ResultSetMetaData Columnas = resultado.getMetaData();
             //La cantidad de columnas que tiene la consulta
             int cantidadColumnas = Columnas.getColumnCount();
             
             //Establecer como cabezeras el nombre de las columnas
//             for (int i = 1; i <= cantidadColumnas; i++) {
//                    modelo.addColumn(Columnas.getColumnLabel(i)); //Agrega columnas al modelo con el titulo extraido de la metadata
//             }
             //Extrae las filas del resultSet y los para al modelo
                while (resultado.next()) {
                       Object[] fila = new Object[cantidadColumnas];
                        for (int i = 0; i < cantidadColumnas; i++) {
                                 fila[i]=resultado.getObject(i+1);
                        }
                 modelo.addElement(fila); //agregamos al modelo el item extraida.
                }
                consulta.getStmt().close(); //Cierra el preparador  de sentencias SQL
                return modelo; 
        }
        //
        catch (SQLException ex) {
             System.out.println(ex);
        }
    return modelo;
  }   
   
   
}

