package ec.edu.uce.Persistence.Models;


import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "authors")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "authors")
    private List<Libro> books;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Libro> getLibro() {
        return books;
    }

    public void setLibros(List<Libro> books) {
        this.books = books;
    }
}
