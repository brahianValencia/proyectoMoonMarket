package co.edu.uniquindio.moonmarket.repositorios;

import co.edu.uniquindio.moonmarket.entidades.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComentarioRepo extends JpaRepository<Comentario,Integer> {
}
