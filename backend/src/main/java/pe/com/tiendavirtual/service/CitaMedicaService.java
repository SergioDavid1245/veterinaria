package pe.com.tiendavirtual.service;

import org.springframework.stereotype.Service;
import pe.com.tiendavirtual.modelo.CitaMedica;
import pe.com.tiendavirtual.repositorio.CitaMedicaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CitaMedicaService {

    private final CitaMedicaRepository citaMedicaRepository;

    public CitaMedicaService(CitaMedicaRepository citaMedicaRepository) {
        this.citaMedicaRepository = citaMedicaRepository;
    }

    public List<CitaMedica> listarTodos() {
        return citaMedicaRepository.findAll();
    }

    public Optional<CitaMedica> obtenerPorId(Long id) {
        return citaMedicaRepository.findById(id);
    }

    public CitaMedica guardar(CitaMedica citaMedica) {
        return citaMedicaRepository.save(citaMedica);
    }

    public void eliminar(Long id) {
        citaMedicaRepository.deleteById(id);
    }
}
