package co.com.bancolombia.model.usuario;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.Getter;
//import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
//@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Usuario {
    Long idUsuario;
    String Usuario;
    String contraseña;
    String primerNombreUsuario;
    String apellidoUsuario;
    LocalDateTime creacionUsuario;
    LocalDateTime modificacionUsuario;
    boolean activo;
}
