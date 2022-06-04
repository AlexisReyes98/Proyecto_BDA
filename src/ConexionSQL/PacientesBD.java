
package ConexionSQL;

import Model.Pacientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author alexis
 */
public class PacientesBD {
    
    // Código para VER las tablas de la BD
    public ArrayList<Pacientes> ListPacientes20k() {
        ArrayList<Pacientes> pacientes = new ArrayList();
        Connection cnx = DataBaseConexion.getConnection();
        try {
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT ID_REGISTRO,SEXO,ENTIDAD_RES,"
                    + "TIPO_PACIENTE,FECHA_INGRESO,FECHA_SINTOMAS,EDAD,RESULTADO_LAB,"
                    + "RESULTADO_ANTIGENO,CLASIFICACION_FINAL FROM PACIENTES20K ");
            while (rs.next()) {
                Pacientes paciente = new Pacientes();
                paciente.setID_REGISTRO(rs.getString("ID_REGISTRO"));
                paciente.setSEXO(rs.getInt("SEXO"));
                paciente.setENTIDAD_RES(rs.getInt("ENTIDAD_RES"));
                paciente.setTIPO_PACIENTE(rs.getInt("TIPO_PACIENTE"));
                paciente.setFECHA_INGRESO(rs.getString("FECHA_INGRESO"));
                paciente.setFECHA_SINTOMAS(rs.getString("FECHA_SINTOMAS"));
                paciente.setEDAD(rs.getInt("EDAD"));
                paciente.setRESULTADO_LAB(rs.getInt("RESULTADO_LAB"));
                paciente.setRESULTADO_ANTIGENO(rs.getInt("RESULTADO_ANTIGENO"));
                paciente.setCLASIFICACION_FINAL(rs.getInt("CLASIFICACION_FINAL"));
                pacientes.add(paciente);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al mostrar los datos de la tabla");
        } finally {
            try {
                cnx.close();
            } catch (SQLException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
        
        return pacientes;
    }
    
    public ArrayList<Pacientes> ListPacientes50k() {
        ArrayList<Pacientes> pacientes = new ArrayList();
        Connection cnx = DataBaseConexion.getConnection();
        try {
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT ID_REGISTRO,SEXO,ENTIDAD_RES,"
                    + "TIPO_PACIENTE,FECHA_INGRESO,FECHA_SINTOMAS,EDAD,RESULTADO_LAB,"
                    + "RESULTADO_ANTIGENO,CLASIFICACION_FINAL FROM PACIENTES50K ");
            while (rs.next()) {
                Pacientes paciente = new Pacientes();
                paciente.setID_REGISTRO(rs.getString("ID_REGISTRO"));
                paciente.setSEXO(rs.getInt("SEXO"));
                paciente.setENTIDAD_RES(rs.getInt("ENTIDAD_RES"));
                paciente.setTIPO_PACIENTE(rs.getInt("TIPO_PACIENTE"));
                paciente.setFECHA_INGRESO(rs.getString("FECHA_INGRESO"));
                paciente.setFECHA_SINTOMAS(rs.getString("FECHA_SINTOMAS"));
                paciente.setEDAD(rs.getInt("EDAD"));
                paciente.setRESULTADO_LAB(rs.getInt("RESULTADO_LAB"));
                paciente.setRESULTADO_ANTIGENO(rs.getInt("RESULTADO_ANTIGENO"));
                paciente.setCLASIFICACION_FINAL(rs.getInt("CLASIFICACION_FINAL"));
                pacientes.add(paciente);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al mostrar los datos de la tabla");
        } finally {
            try {
                cnx.close();
            } catch (SQLException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
        
        return pacientes;
    }
    
    public ArrayList<Pacientes> ListPacientes100k() {
        ArrayList<Pacientes> pacientes = new ArrayList();
        Connection cnx = DataBaseConexion.getConnection();
        try {
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT ID_REGISTRO,SEXO,ENTIDAD_RES,"
                    + "TIPO_PACIENTE,FECHA_INGRESO,FECHA_SINTOMAS,EDAD,RESULTADO_LAB,"
                    + "RESULTADO_ANTIGENO,CLASIFICACION_FINAL FROM PACIENTES100K ");
            while (rs.next()) {
                Pacientes paciente = new Pacientes();
                paciente.setID_REGISTRO(rs.getString("ID_REGISTRO"));
                paciente.setSEXO(rs.getInt("SEXO"));
                paciente.setENTIDAD_RES(rs.getInt("ENTIDAD_RES"));
                paciente.setTIPO_PACIENTE(rs.getInt("TIPO_PACIENTE"));
                paciente.setFECHA_INGRESO(rs.getString("FECHA_INGRESO"));
                paciente.setFECHA_SINTOMAS(rs.getString("FECHA_SINTOMAS"));
                paciente.setEDAD(rs.getInt("EDAD"));
                paciente.setRESULTADO_LAB(rs.getInt("RESULTADO_LAB"));
                paciente.setRESULTADO_ANTIGENO(rs.getInt("RESULTADO_ANTIGENO"));
                paciente.setCLASIFICACION_FINAL(rs.getInt("CLASIFICACION_FINAL"));
                pacientes.add(paciente);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al mostrar los datos de la tabla");
        } finally {
            try {
                cnx.close();
            } catch (SQLException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
        
        return pacientes;
    }
    
    public ArrayList<Pacientes> ListPacientes250k() {
        ArrayList<Pacientes> pacientes = new ArrayList();
        Connection cnx = DataBaseConexion.getConnection();
        try {
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT ID_REGISTRO,SEXO,ENTIDAD_RES,"
                    + "TIPO_PACIENTE,FECHA_INGRESO,FECHA_SINTOMAS,EDAD,RESULTADO_LAB,"
                    + "RESULTADO_ANTIGENO,CLASIFICACION_FINAL FROM PACIENTES250K ");
            while (rs.next()) {
                Pacientes paciente = new Pacientes();
                paciente.setID_REGISTRO(rs.getString("ID_REGISTRO"));
                paciente.setSEXO(rs.getInt("SEXO"));
                paciente.setENTIDAD_RES(rs.getInt("ENTIDAD_RES"));
                paciente.setTIPO_PACIENTE(rs.getInt("TIPO_PACIENTE"));
                paciente.setFECHA_INGRESO(rs.getString("FECHA_INGRESO"));
                paciente.setFECHA_SINTOMAS(rs.getString("FECHA_SINTOMAS"));
                paciente.setEDAD(rs.getInt("EDAD"));
                paciente.setRESULTADO_LAB(rs.getInt("RESULTADO_LAB"));
                paciente.setRESULTADO_ANTIGENO(rs.getInt("RESULTADO_ANTIGENO"));
                paciente.setCLASIFICACION_FINAL(rs.getInt("CLASIFICACION_FINAL"));
                pacientes.add(paciente);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al mostrar los datos de la tabla");
        } finally {
            try {
                cnx.close();
            } catch (SQLException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
        
        return pacientes;
    }
    
    // Código para BUSCAR en las tablas de la BD
    public Pacientes buscarPaciente20k(String id_p){
        Pacientes paciente = new Pacientes();
        Connection cnx = DataBaseConexion.getConnection();
        try {
            PreparedStatement pst = cnx.prepareStatement("SELECT * FROM PACIENTES20K WHERE ID_REGISTRO = ? ");
            pst.setString(1, id_p);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                paciente.setID_REGISTRO(rs.getString("ID_REGISTRO"));
                paciente.setSEXO(rs.getInt("SEXO"));
                paciente.setENTIDAD_RES(rs.getInt("ENTIDAD_RES"));
                paciente.setTIPO_PACIENTE(rs.getInt("TIPO_PACIENTE"));
                paciente.setFECHA_INGRESO(rs.getString("FECHA_INGRESO"));
                paciente.setFECHA_SINTOMAS(rs.getString("FECHA_SINTOMAS"));
                paciente.setEDAD(rs.getInt("EDAD"));
                paciente.setRESULTADO_LAB(rs.getInt("RESULTADO_LAB"));
                paciente.setRESULTADO_ANTIGENO(rs.getInt("RESULTADO_ANTIGENO"));
                paciente.setCLASIFICACION_FINAL(rs.getInt("CLASIFICACION_FINAL"));
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al mostrar al paciente en la tabla");
        } finally {
            try {
                cnx.close();
            } catch (SQLException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
        
        return paciente;
    }
    
    public Pacientes buscarPaciente50k(String id_p){
        Pacientes paciente = new Pacientes();
        Connection cnx = DataBaseConexion.getConnection();
        try {
            PreparedStatement pst = cnx.prepareStatement("SELECT * FROM PACIENTES50K WHERE ID_REGISTRO = ? ");
            pst.setString(1, id_p);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                paciente.setID_REGISTRO(rs.getString("ID_REGISTRO"));
                paciente.setSEXO(rs.getInt("SEXO"));
                paciente.setENTIDAD_RES(rs.getInt("ENTIDAD_RES"));
                paciente.setTIPO_PACIENTE(rs.getInt("TIPO_PACIENTE"));
                paciente.setFECHA_INGRESO(rs.getString("FECHA_INGRESO"));
                paciente.setFECHA_SINTOMAS(rs.getString("FECHA_SINTOMAS"));
                paciente.setEDAD(rs.getInt("EDAD"));
                paciente.setRESULTADO_LAB(rs.getInt("RESULTADO_LAB"));
                paciente.setRESULTADO_ANTIGENO(rs.getInt("RESULTADO_ANTIGENO"));
                paciente.setCLASIFICACION_FINAL(rs.getInt("CLASIFICACION_FINAL"));
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al mostrar al paciente en la tabla");
        } finally {
            try {
                cnx.close();
            } catch (SQLException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
        
        return paciente;
    }
    
    public Pacientes buscarPaciente100k(String id_p){
        Pacientes paciente = new Pacientes();
        Connection cnx = DataBaseConexion.getConnection();
        try {
            PreparedStatement pst = cnx.prepareStatement("SELECT * FROM PACIENTES100K WHERE ID_REGISTRO = ? ");
            pst.setString(1, id_p);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                paciente.setID_REGISTRO(rs.getString("ID_REGISTRO"));
                paciente.setSEXO(rs.getInt("SEXO"));
                paciente.setENTIDAD_RES(rs.getInt("ENTIDAD_RES"));
                paciente.setTIPO_PACIENTE(rs.getInt("TIPO_PACIENTE"));
                paciente.setFECHA_INGRESO(rs.getString("FECHA_INGRESO"));
                paciente.setFECHA_SINTOMAS(rs.getString("FECHA_SINTOMAS"));
                paciente.setEDAD(rs.getInt("EDAD"));
                paciente.setRESULTADO_LAB(rs.getInt("RESULTADO_LAB"));
                paciente.setRESULTADO_ANTIGENO(rs.getInt("RESULTADO_ANTIGENO"));
                paciente.setCLASIFICACION_FINAL(rs.getInt("CLASIFICACION_FINAL"));
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al mostrar al paciente en la tabla");
        } finally {
            try {
                cnx.close();
            } catch (SQLException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
        
        return paciente;
    }
    
    public Pacientes buscarPaciente250k(String id_p){
        Pacientes paciente = new Pacientes();
        Connection cnx = DataBaseConexion.getConnection();
        try {
            PreparedStatement pst = cnx.prepareStatement("SELECT * FROM PACIENTES250K WHERE ID_REGISTRO = ? ");
            pst.setString(1, id_p);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                paciente.setID_REGISTRO(rs.getString("ID_REGISTRO"));
                paciente.setSEXO(rs.getInt("SEXO"));
                paciente.setENTIDAD_RES(rs.getInt("ENTIDAD_RES"));
                paciente.setTIPO_PACIENTE(rs.getInt("TIPO_PACIENTE"));
                paciente.setFECHA_INGRESO(rs.getString("FECHA_INGRESO"));
                paciente.setFECHA_SINTOMAS(rs.getString("FECHA_SINTOMAS"));
                paciente.setEDAD(rs.getInt("EDAD"));
                paciente.setRESULTADO_LAB(rs.getInt("RESULTADO_LAB"));
                paciente.setRESULTADO_ANTIGENO(rs.getInt("RESULTADO_ANTIGENO"));
                paciente.setCLASIFICACION_FINAL(rs.getInt("CLASIFICACION_FINAL"));
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al mostrar al paciente en la tabla");
        } finally {
            try {
                cnx.close();
            } catch (SQLException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
        
        return paciente;
    }
    
}
