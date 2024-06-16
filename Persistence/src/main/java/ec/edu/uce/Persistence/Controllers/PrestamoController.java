package ec.edu.uce.Persistence.Controllers;

import ec.edu.uce.Persistence.Models.Prestamo;
import ec.edu.uce.Persistence.Repository.PrestamoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prestamos")
public class PrestamoController {

    @Autowired
    private PrestamoRepository prestamoRepository;

    @GetMapping
    public List<Prestamo> getAllPrestamos() {
        return prestamoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Prestamo getPrestamoById(@PathVariable Long id) {
        return prestamoRepository.findById(id).orElse(null);
    }

    @GetMapping("/usuario/{usuarioId}")
    public List<Prestamo> getPrestamosByUsuarioId(@PathVariable Long usuarioId) {
        return prestamoRepository.findByUsuarioId(usuarioId);
    }

    @GetMapping("/book/{bookId}")
    public List<Prestamo> getPrestamosByBookId(@PathVariable Long bookId) {
        return prestamoRepository.findByBookId(bookId);
    }

    @GetMapping("/devuelto/{devuelto}")
    public List<Prestamo> getPrestamosByDevuelto(@PathVariable Boolean devuelto) {
        return prestamoRepository.findByDevuelto(devuelto);
    }

    @PostMapping
    public Prestamo createPrestamo(@RequestBody Prestamo prestamo) {
        return prestamoRepository.save(prestamo);
    }

    @PutMapping("/{id}")
    public Prestamo updatePrestamo(@PathVariable Long id, @RequestBody Prestamo prestamoDetalles) {
        Prestamo prestamo = prestamoRepository.findById(id).orElse(null);
        if (prestamo != null) {
            prestamo.setUsuario(prestamoDetalles.getUsuario());
            prestamo.setBook(prestamoDetalles.getBook());
            prestamo.setFechaPrestamo(prestamoDetalles.getFechaPrestamo());
            prestamo.setFechaDevolucion(prestamoDetalles.getFechaDevolucion());
            prestamo.setDevuelto(prestamoDetalles.getDevuelto());
            return prestamoRepository.save(prestamo);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletePrestamo(@PathVariable Long id) {
        prestamoRepository.deleteById(id);
    }
}
