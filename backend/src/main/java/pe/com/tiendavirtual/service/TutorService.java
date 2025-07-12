package pe.com.tiendavirtual.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.com.tiendavirtual.modelo.Tutor;
import pe.com.tiendavirtual.repositorio.TutorRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TutorService {
    private final TutorRepository tutorRepository;

    public TutorService(TutorRepository tutorRepository) {
        this.tutorRepository = tutorRepository;
    }

    public List<Tutor> listarTodos() {
        return tutorRepository.findAll();
    }

    public Optional<Tutor> obtenerPorId(Long id) {
        return tutorRepository.findById(id);
    }

    public Tutor guardar(Tutor tutor) {
        return tutorRepository.save(tutor);
    }

    public void eliminar(Long id) {
        tutorRepository.deleteById(id);
    }
}
