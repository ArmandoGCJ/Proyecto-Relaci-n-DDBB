package ec.edu.uce.Persistence.Repository;


import ec.edu.uce.Persistence.Models.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrestamoRepository extends JpaRepository<Prestamo, Long> {

    List<Prestamo> findByUsuarioId(Long usuarioId);

    List<Prestamo> findByBookId(Long bookId);

    List<Prestamo> findByDevuelto(Boolean devuelto);
}
