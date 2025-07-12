package pe.com.tiendavirtual.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.com.tiendavirtual.modelo.CitaMedica;

import java.util.List;

public interface CitaMedicaRepository extends JpaRepository<CitaMedica, Long> {
    List<CitaMedica> findByIdMedico(Long idMedico);
    List<CitaMedica> findByIdPaciente(Long idPaciente);
}