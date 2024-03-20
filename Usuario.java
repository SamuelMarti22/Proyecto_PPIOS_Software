public class Usuario {
    private String nombreUsuario;
    private String contrasena;
    private String correoElectronico;
    private int comuna;
    private int personasHogar;
    private double huellaCarbono;
    private double valorBase;

    public Usuario(String nombreUsuario, String contrasena, String correoElectronico, int comuna, int personasHogar, double huellaCarbono, double valorBase) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.correoElectronico = correoElectronico;
        this.comuna = comuna;
        this.personasHogar = personasHogar;
        this.huellaCarbono = huellaCarbono;
        this.valorBase = valorBase;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public int getComuna() {
        return comuna;
    }

    public void setComuna(int comuna) {
        this.comuna = comuna;
    }

    public double getHuellaCarbono() {
        return huellaCarbono;
    }

    public void setHuellaCarbono(double huellaCarbono) {
        this.huellaCarbono = huellaCarbono;
    }

    public int getPersonasHogar() {
        return personasHogar;
    }

    public void setPersonasHogar(int personasHogar) {
        this.personasHogar = personasHogar;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }
}