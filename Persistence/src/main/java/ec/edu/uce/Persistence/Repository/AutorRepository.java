package ec.edu.uce.Persistence.Repository;


import ec.edu.uce.Persistence.Models.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {

    List<Autor> findByName(String name);
}
