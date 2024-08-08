package co.com.bancolombia.model.usuario.gateways;

import co.com.bancolombia.model.usuario.Usuario;

public interface UsuarioRepository {
    boolean crearUsuario(Usuario usuario);
    boolean modificarUsuario(Usuario usuario);
    boolean eliminarUsuario(Long id);
    Usuario obtenerUsuario(Long id);
}
