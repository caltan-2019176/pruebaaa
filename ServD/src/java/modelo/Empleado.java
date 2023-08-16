package modelo;

/**
 *Modelo Empleado
 * @author Ricardo Adrián Colindres Franco - 2019169
 */
public class Empleado {
    private int codigoEmpleado;
    private String usuario;
    private String DPIEmpleado;
    private String nombresEmpleado;
    private String apellidosEmpleado;
    private String telefonoContacto;
    private int codigoTipoEmpleado;
    private int codigoTransporte;
    private int codigoEquipo;

    /*
    * Constructor vacío
    */
    public Empleado() {
    }
    
    /*
    *Constructor con argumentos
    *
    */
    public Empleado(int codigoEmpleado, String usuario, String DPIEmpleado, String nombresEmpleado, String apellidosEmpleado, String telefonoContacto, int codigoTipoEmpleado, int codigoTransporte, int codigoEquipo) {
        this.codigoEmpleado = codigoEmpleado;
        this.usuario = usuario;
        this.DPIEmpleado = DPIEmpleado;
        this.nombresEmpleado = nombresEmpleado;
        this.apellidosEmpleado = apellidosEmpleado;
        this.telefonoContacto = telefonoContacto;
        this.codigoTipoEmpleado = codigoTipoEmpleado;
        this.codigoTransporte = codigoTransporte;
        this.codigoEquipo = codigoEquipo;
    }
    
    /*
    *getters y setters
    */
    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getDPIEmpleado() {
        return DPIEmpleado;
    }

    public void setDPIEmpleado(String DPIEmpleado) {
        this.DPIEmpleado = DPIEmpleado;
    }

    public String getNombresEmpleado() {
        return nombresEmpleado;
    }

    public void setNombresEmpleado(String nombresEmpleado) {
        this.nombresEmpleado = nombresEmpleado;
    }

    public String getApellidosEmpleado() {
        return apellidosEmpleado;
    }

    public void setApellidosEmpleado(String apellidosEmpleado) {
        this.apellidosEmpleado = apellidosEmpleado;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public int getCodigoTipoEmpleado() {
        return codigoTipoEmpleado;
    }

    public void setCodigoTipoEmpleado(int codigoTipoEmpleado) {
        this.codigoTipoEmpleado = codigoTipoEmpleado;
    }

    public int getCodigoTransporte() {
        return codigoTransporte;
    }

    public void setCodigoTransporte(int codigoTransporte) {
        this.codigoTransporte = codigoTransporte;
    }

    public int getCodigoEquipo() {
        return codigoEquipo;
    }

    public void setCodigoEquipo(int codigoEquipo) {
        this.codigoEquipo = codigoEquipo;
    }
    
    
    
}
