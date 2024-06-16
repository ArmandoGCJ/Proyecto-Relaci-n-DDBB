package ec.edu.uce.Persistence.Repository;


import ec.edu.uce.Persistence.Models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    List<Usuario> findByName(String name);

    Usuario findByEmail(String email);

    List<Usuario> findByNameContaining(String name);

    List<Usuario> findByNombre(String nombre);
}
