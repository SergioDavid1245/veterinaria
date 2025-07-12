package pe.com.tiendavirtual.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.com.tiendavirtual.modelo.CitaMedica;
import pe.com.tiendavirtual.modelo.Medico;
import pe.com.tiendavirtual.service.CitaMedicaService;
import pe.com.tiendavirtual.service.MedicoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/citasmedicas")
public class CitaMedicaController {
    private final CitaMedicaService citaMedicaService;

    public CitaMedicaController(CitaMedicaService citaMedicaService) {
        this.citaMedicaService = citaMedicaService;
    }

    @GetMapping
    public List<CitaMedica> listarTodos() {
        return citaMedicaService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CitaMedica> obtenerPorId(@PathVariable Long id) {
        Optional<CitaMedica> citaMedica = citaMedicaService.obtenerPorId(id);
        return citaMedica.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public CitaMedica crear(@RequestBody CitaMedica citaMedica) {
        return citaMedicaService.guardar(citaMedica);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        citaMedicaService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
