package Datos;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ClsProfesor {
   public int idprofesor;
   public String apellidos;
   public String nombres;
   public String dni;
   public String direccion;
   public String telefono;
   public String email;
   public String password;
   
   /**Constructor*/
   public ClsProfesor(){
   }
  
/**Datos - Metodo para registrar persona*/
public boolean RegistrarProfesor(){
     boolean respuesta=true;
    try {
          this.idprofesor=GenerarIDProfesor();
          operaciones consulta=new operaciones(); //crea un objeto de la clase consulta
          respuesta=consulta.InsercionBase("insert into profesor values ( '" + this.idprofesor +"','"+this.apellidos +"','"+this.nombres+"','"+this.dni+"','"+this.direccion+"','"+this.telefono+"','"+this.email+"','"+this.password+"')"); //     
          consulta.getStmt().close(); 
        } catch (SQLException ex) {
               System.out.println(ex);
        }
    return respuesta;
}

/**Datos - Metodo para actualizar persona*/
public boolean ActualizarProfesor(){
     boolean respuesta=true;
    try {

          operaciones consulta=new operaciones(); //crea un objeto de la clase consulta
          //UPDATE persona set apellidos='',nombres='',fechanacimiento='12/12/2010',dni='',estadocivil='' where idpersona=1;
          respuesta=consulta.ActualizacionBase("UPDATE profesor set Apellidos='" + this.apellidos+"',Nombres='"+this.nombres +"',Dni='"+this.dni+"',Direccion='"+this.direccion+"',Telefono='"+this.telefono+"',Email='"+this.email+"',Password='"+this.password+"' where  Idprofesor="+this.idprofesor+"");    
          consulta.getStmt().close(); 
        } catch (SQLException ex) {
               System.out.println(ex);
        }
    return respuesta;
}

/**Datos - Metodo para Eliminar persona*/
public boolean EliminarProfesor(int idProfesor){
     boolean respuesta=true;
    try {

          operaciones consulta=new operaciones(); //crea un objeto de la clase consulta
          //delete from persona where idpersona=13;
          respuesta=consulta.ActualizacionBase("delete from profesor where Idprofesor="+idProfesor+"");    
          consulta.getStmt().close(); 
        } catch (SQLException ex) {
               System.out.println(ex);
        }
    return respuesta;
}


   /**Datos - Genera la secuancia de ID de pérsona*/
   public static int GenerarIDProfesor(){
    int IDGenerado=0;
    
    try {
            operaciones consulta=new operaciones(); //crea un objeto de la clase consulta
            ResultSet resultado=consulta.ConsultaBase("select max(Idprofesor) as id from profesor"); //
                        
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
   public TableModel ListarProfesor(){
        DefaultTableModel modelo = new DefaultTableModel();
        try {
             //Para ejecutar la consulta
             operaciones consulta=new operaciones(); //crea un objeto de la clase consulta
             ResultSet resultado=consulta.ConsultaBase("select * from profesor"); //
                                    
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
   
   
   public TableModel ListarProfesorvista(){
        DefaultTableModel modelo = new DefaultTableModel();
        try {
             //Para ejecutar la consulta
             operaciones consulta=new operaciones(); //crea un objeto de la clase consulta
             ResultSet resultado=consulta.ConsultaBase("select Idprofesor,Nombres,Apellidos from profesor"); //
                                    
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
   public TableModel BusquedaProfesores(String ApellidosNombres){
        DefaultTableModel modelo = new DefaultTableModel();
        try {
             //Para ejecutar la consulta
               //select * from persona where apellidos ||' ' || nombres like 'Diaz Perez Jo%'
             operaciones consulta=new operaciones(); //crea un objeto de la clase consulta
             ResultSet resultado=consulta.ConsultaBase("select * from profesor where Apellidos ||' ' || Nombres like '" +ApellidosNombres +"%'"); 
                                    
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
   
   
   
   
   
   public TableModel BusquedaProfesorvista(String ApellidosNombres){
        DefaultTableModel modelo = new DefaultTableModel();
        try {
             //Para ejecutar la consulta
               //select * from persona where apellidos ||' ' || nombres like 'Diaz Perez Jo%'
             operaciones consulta=new operaciones(); //crea un objeto de la clase consulta
             ResultSet resultado=consulta.ConsultaBase("select Idprofesor,Nombres,Apellidos from profesor where Apellidos ||' ' || Nombres like '" +ApellidosNombres +"%'"); 
                                    
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
   
   
}

