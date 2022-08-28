
package com.porfolio.afe.Repository;

import com.porfolio.afe.Entity.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Rexperiencia extends JpaRepository<Experiencia,Integer>{
    public Optional<Experiencia> findByNombreE(String nombreE);
    public boolean existsByNombreE(String nombreE);
    
    
    
}
