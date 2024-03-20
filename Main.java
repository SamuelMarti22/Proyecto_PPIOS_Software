import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa tu usuario");
        String usuarioString =  entrada.nextLine();//Lee el usuario
        System.out.println("Ingresa tu contraseña");
        String contrasenaString = entrada.nextLine();//Lee la contraseña
        boolean registrado = verificarUsuario(usuarioString, contrasenaString); //Verifica si el usuario ya existe en la base de datos
        if (registrado){
            System.out.println("Hola "+usuarioString +". Se ha iniciado sesión con éxito");
        } else {
            System.out.println("No tienes un usuario creado, vamos a crearte uno");
            System.out.println("Ingrese el correo: ");
            String correoString = entrada.nextLine(); // Lee el correo electronico
            System.out.println("Ingrese el número de la comuna en que vive");
            int  comunaInt=entrada.nextInt(); // Lee la comuna como entero
            System.out.println("Cuántas personas viven en su hogar?");
            int personasInt=entrada.nextInt();
            registrarse(usuarioString, contrasenaString, correoString, comunaInt, personasInt);
            System.out.println("Se ha creado su perfil con éxito");
        }
        obtenerUsuarios();
        ingresarBasuras(usuarioString,contrasenaString);
        entrada.close();
    }
    //Método para registrar usuarios y contraseñas
    public static void registrarse(String usuario, String  contrasena, String correo, int comuna,int personasHogar){
        BaseDatosUsuarios baseDatos = new BaseDatosUsuarios("usuarios.txt");
        baseDatos.agregarUsuario(new Usuario(usuario, contrasena, correo, comuna,personasHogar,0,1));
    }
    //Método para obtener la lista de usuarios
    public static void obtenerUsuarios(){
        BaseDatosUsuarios baseDatos = new BaseDatosUsuarios("usuarios.txt");
        List<Usuario> usuarios = baseDatos.obtenerUsuarios();
        for (Usuario usuario : usuarios) {
            System.out.println("Usuario: " + usuario.getNombreUsuario() + ", Contraseña: " + usuario.getContrasena() + ", Correo: "+usuario.getCorreoElectronico() + ", Comuna: " + usuario.getComuna()+", Personas: "+usuario.getPersonasHogar());
        }
    }

    public static boolean verificarUsuario(String usuarioString, String contrasenaString){
        BaseDatosUsuarios baseDatos = new BaseDatosUsuarios("usuarios.txt");
        boolean credencialesCorrectas = false;
        List<Usuario> usuarios = baseDatos.obtenerUsuarios();
        for (Usuario usuario : usuarios) {
            if (usuario.getNombreUsuario().equals(usuarioString) && usuario.getContrasena().equals(contrasenaString)) {
                credencialesCorrectas = true;
                break;
            }
        }
         return credencialesCorrectas;
    }

    public static void ingresarBasuras(String usuarioString, String contrasenaString){
        Scanner entrada = new Scanner(System.in);
        BaseDatosUsuarios baseDatos = new BaseDatosUsuarios("usuarios.txt");
        double huella = 0.1;
        System.out.println("Cuántos kg de basura has desechado?");
        double cantidad =  entrada.nextDouble();
        System.out.println("Has separado tus basuras? \n1.SI 2. NO");
        int respuesta = entrada.nextInt();
        if(respuesta == 2){
            huella += 0.1;
        }
        System.out.println("Has hecho una correcta disposición de tus basuras? \n1.SI 2.NO");
        respuesta = entrada.nextInt();
        if(respuesta == 2){
            huella += 0.1;
        }
        System.out.println("Has desechado basuras peligrosas en lugares autorizados? \n1.SI 2.NO");
        respuesta = entrada.nextInt();
        if(respuesta == 2){
            huella += 0.1;
        }
        System.out.println("Sacaste la basura el día de recolecta de basuras? \n1.SI 2.NO");
        respuesta = entrada.nextInt();
        if(respuesta == 2){
            huella += 0.1;
        }
        List<Usuario> usuarios = baseDatos.obtenerUsuarios();
        for (Usuario usuario : usuarios) {
            if (usuario.getNombreUsuario().equals(usuarioString) && usuario.getContrasena().equals(contrasenaString)) {
                Usuario usuarioAActualizar = new Usuario(usuario.getNombreUsuario(), usuario.getContrasena(), usuario.getCorreoElectronico(), usuario.getComuna(),usuario.getPersonasHogar(), usuario.getHuellaCarbono(), usuario.getValorBase());
                usuarioAActualizar.setHuellaCarbono(usuario.getValorBase()+(huella*cantidad));
                usuarioAActualizar.setValorBase((usuario.getValorBase()+(huella*5))/2);
                baseDatos.actualizarUsuario(usuarioAActualizar);
                break;
            }
        }
        entrada.close();
    }
}