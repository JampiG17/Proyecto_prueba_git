package Logica;
import java.text.SimpleDateFormat;
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
   //Constructor
   public ClsProfesor(){
   }
   
   /**Lógica-Método para Registrar Persona*/
public boolean RegistrarProfesor(){
     boolean respuesta=true;
     
    try {
         Datos.ClsProfesor profesor=new Datos.ClsProfesor();
         profesor.idprofesor=this.idprofesor;
         profesor.apellidos=this.apellidos;
         profesor.nombres=this.nombres;
         profesor.dni=this.dni;
         profesor.direccion=this.direccion;
         profesor.telefono=this.telefono;
         profesor.email=this.email;
         profesor.password=this.password;
        respuesta=profesor.RegistrarProfesor(); //ejecuta el método que registra profesor
                 
    }catch(Exception ex){
        System.out.println("Se ha presentado el siguiente Error: "+ex);
    }

    return respuesta;
}
   /**Lógica-Método para Actualizar Persona*/
public boolean ActualizarProfesor(){
     boolean respuesta=true;
     
    try {
         Datos.ClsProfesor profesor=new Datos.ClsProfesor();
         profesor.idprofesor=this.idprofesor;
         profesor.apellidos=this.apellidos;
         profesor.nombres=this.nombres;
         profesor.dni=this.dni;
         profesor.direccion=this.direccion;
         profesor.telefono=this.telefono;
         profesor.email=this.email;
         profesor.password=this.password;

        respuesta=profesor.ActualizarProfesor(); //ejecuta el método que actualiza profesor
                 
    }catch(Exception ex){
        System.out.println("Se ha presentado el siguiente Error: "+ex);
    }

    return respuesta;
}

public boolean EliminarProfesor(int idProfesor){
     boolean respuesta=true;
     
    try {
         Datos.ClsProfesor profesor=new Datos.ClsProfesor();
         respuesta=profesor.EliminarProfesor(idProfesor); //ejecuta el método que elimina profesor         
    }catch(Exception ex){
        System.out.println("Se ha presentado el siguiente Error: "+ex);
    }

    return respuesta;
}


     /**Lógica- Listar Personas*/
       public TableModel ListarProfesor(){
        TableModel modelo = new DefaultTableModel();

        try {
                       Datos.ClsProfesor profesor=new Datos.ClsProfesor();
                       modelo=profesor.ListarProfesor();
            
        } catch(Exception ex) {
             System.out.println(ex);        
        }
        return modelo;
       }
       
       
       
        public TableModel ListarProfesorvista(){
        TableModel modelo = new DefaultTableModel();

        try {
                       Datos.ClsProfesor profesor=new Datos.ClsProfesor();
                       modelo=profesor.ListarProfesorvista();
            
        } catch(Exception ex) {
             System.out.println(ex);        
        }
        return modelo;
       }
       
       
       
       
       
       
       

      /**Lógica- Busca Personas*/
       public TableModel BusquedaProfesor(String ApellidosNombres){
        TableModel modelo = new DefaultTableModel();

        try {
                       Datos.ClsProfesor profesor=new Datos.ClsProfesor();
                       modelo=profesor.BusquedaProfesores(ApellidosNombres);
            
        } catch(Exception ex) {
             System.out.println(ex);        
        }
        return modelo;
       }
       
       public TableModel BusquedaProfesoresvista(String ApellidosNombres){
        TableModel modelo = new DefaultTableModel();

        try {
                       Datos.ClsProfesor profe=new Datos.ClsProfesor();
                       modelo=profe.BusquedaProfesorvista(ApellidosNombres);
            
        } catch(Exception ex) {
             System.out.println(ex);        
        }
        return modelo;
       }
       
       
       
       
       
   
}
