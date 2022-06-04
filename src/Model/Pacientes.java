
package Model;

/**
 *
 * @author alexis
 */
public class Pacientes {
    private String ID_REGISTRO;
    private int SEXO;
    private int ENTIDAD_RES;
    private int TIPO_PACIENTE;
    private String FECHA_INGRESO;
    private String FECHA_SINTOMAS;
    private int EDAD;
    private int RESULTADO_LAB;
    private int RESULTADO_ANTIGENO;
    private int CLASIFICACION_FINAL;
    
    // Constructor basio
    public Pacientes() {
    }

    // Constructor
        public Pacientes(String ID_REGISTRO, int SEXO, int ENTIDAD_RES, int TIPO_PACIENTE, String FECHA_INGRESO, String FECHA_SINTOMAS, int EDAD, int RESULTADO_LAB, int RESULTADO_ANTIGENO, int CLASIFICACION_FINAL) {
        this.ID_REGISTRO = ID_REGISTRO;
        this.SEXO = SEXO;
        this.ENTIDAD_RES = ENTIDAD_RES;
        this.TIPO_PACIENTE = TIPO_PACIENTE;
        this.FECHA_INGRESO = FECHA_INGRESO;
        this.FECHA_SINTOMAS = FECHA_SINTOMAS;
        this.EDAD = EDAD;
        this.RESULTADO_LAB = RESULTADO_LAB;
        this.RESULTADO_ANTIGENO = RESULTADO_ANTIGENO;
        this.CLASIFICACION_FINAL = CLASIFICACION_FINAL;
    }

    // Getters y Setters
    public String getID_REGISTRO() {
        return ID_REGISTRO;
    }

    public void setID_REGISTRO(String ID_REGISTRO) {
        this.ID_REGISTRO = ID_REGISTRO;
    }

    public int getSEXO() {
        return SEXO;
    }

    public void setSEXO(int SEXO) {
        this.SEXO = SEXO;
    }

    public int getENTIDAD_RES() {
        return ENTIDAD_RES;
    }

    public void setENTIDAD_RES(int ENTIDAD_RES) {
        this.ENTIDAD_RES = ENTIDAD_RES;
    }

    public int getTIPO_PACIENTE() {
        return TIPO_PACIENTE;
    }

    public void setTIPO_PACIENTE(int TIPO_PACIENTE) {
        this.TIPO_PACIENTE = TIPO_PACIENTE;
    }

    public String getFECHA_INGRESO() {
        return FECHA_INGRESO;
    }

    public void setFECHA_INGRESO(String FECHA_INGRESO) {
        this.FECHA_INGRESO = FECHA_INGRESO;
    }

    public String getFECHA_SINTOMAS() {
        return FECHA_SINTOMAS;
    }

    public void setFECHA_SINTOMAS(String FECHA_SINTOMAS) {
        this.FECHA_SINTOMAS = FECHA_SINTOMAS;
    }

    public int getEDAD() {
        return EDAD;
    }

    public void setEDAD(int EDAD) {
        this.EDAD = EDAD;
    }

    public int getRESULTADO_LAB() {
        return RESULTADO_LAB;
    }

    public void setRESULTADO_LAB(int RESULTADO_LAB) {
        this.RESULTADO_LAB = RESULTADO_LAB;
    }

    public int getRESULTADO_ANTIGENO() {
        return RESULTADO_ANTIGENO;
    }

    public void setRESULTADO_ANTIGENO(int RESULTADO_ANTIGENO) {
        this.RESULTADO_ANTIGENO = RESULTADO_ANTIGENO;
    }

    public int getCLASIFICACION_FINAL() {
        return CLASIFICACION_FINAL;
    }

    public void setCLASIFICACION_FINAL(int CLASIFICACION_FINAL) {
        this.CLASIFICACION_FINAL = CLASIFICACION_FINAL;
    }
    
}
