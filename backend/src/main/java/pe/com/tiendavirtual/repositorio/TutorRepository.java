package pe.com.tiendavirtual.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.com.tiendavirtual.modelo.Tutor;

@Repository
public interface TutorRepository extends JpaRepository<Tutor, Long> {
}
