
package com.porfolio.afe.Service;

import com.porfolio.afe.Entity.Experiencia;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.porfolio.afe.Repository.Rexperiencia;

@Service
@Transactional
public class SExperiencia {
    @Autowired
    Rexperiencia rexplab;
    
    public List<Experiencia> list(){
        return rexplab.findAll();
    }
    
    public Optional<Experiencia> getOne(int id){
        return rexplab.findById(id);
    }
    public Optional<Experiencia> getByNombreE(String nombreE){
        return rexplab.findByNombreE(nombreE);
    }
    public void save(Experiencia exp){
        rexplab.save(exp);
    }
    
    public void delete(int id){
        rexplab.deleteById(id);
    }
    public boolean existsById(int id){
        return rexplab.existsById(id);
    }
    public boolean existsByNombreE(String nombreE){
        return rexplab.existsByNombreE(nombreE);
    }
    
    
}
