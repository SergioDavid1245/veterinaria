package pe.com.tiendavirtual.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.com.tiendavirtual.modelo.Medico;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Long> {
}
