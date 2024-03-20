import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BaseDatosUsuarios {
    private String nombreArchivo;

    public BaseDatosUsuarios(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public void agregarUsuario(Usuario usuario) {
        try (FileWriter writer = new FileWriter(nombreArchivo, true);
             BufferedWriter bw = new BufferedWriter(writer);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(usuario.getNombreUsuario() + "," + usuario.getContrasena()+","+usuario.getCorreoElectronico()+","+usuario.getComuna()+","+usuario.getPersonasHogar()+","+usuario.getHuellaCarbono()+","+usuario.getValorBase());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Usuario> obtenerUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                Usuario usuario = new Usuario(partes[0], partes[1],partes[2],Integer.parseInt(partes[3]), Integer.parseInt(partes[4]),Double.parseDouble(partes[5]),Double.parseDouble(partes[6]));
                usuarios.add(usuario);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return usuarios;
    }

    public void actualizarUsuario(Usuario usuarioActualizado) {
        List<Usuario> usuarios = obtenerUsuarios();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (Usuario usuario : usuarios) {
                if (usuario.getNombreUsuario().equals(usuarioActualizado.getNombreUsuario())) {
                    // Si encontramos el usuario que estamos actualizando, escribimos sus nuevos datos
                    bw.write(usuarioActualizado.getNombreUsuario() + "," + usuarioActualizado.getContrasena() + "," + usuarioActualizado.getCorreoElectronico() + "," + usuarioActualizado.getComuna() + "," + usuarioActualizado.getPersonasHogar() + "," + usuarioActualizado.getHuellaCarbono() + "," + usuarioActualizado.getValorBase());
                } else {
                    // Si no es el usuario que estamos actualizando, simplemente escribimos sus datos sin cambios
                    bw.write(usuario.getNombreUsuario() + "," + usuario.getContrasena() + "," + usuario.getCorreoElectronico() + "," + usuario.getComuna()+ "," + usuario.getPersonasHogar() + "," + usuario.getHuellaCarbono() + "," + usuario.getValorBase());
                }
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
}