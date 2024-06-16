package ec.edu.uce.Persistence.Repository;


import ec.edu.uce.Persistence.Models.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {

    List<Libro> findByTitle(String title);

    List<Libro> findByCategoryName(String categoryName);

    List<Libro> findByAuthorsName(String authorName);
}