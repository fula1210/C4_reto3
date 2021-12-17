package C4_reto_3_web.Reto3_back.repositorio;


import C4_reto_3_web.Reto3_back.interfaces.InterfacePeripherals;
import C4_reto_3_web.Reto3_back.modelo.Peripherals;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PeripheralsRepositorio {
  @Autowired
    private InterfacePeripherals repository;

    public List<Peripherals> getAll() {
        return repository.findAll();
    }
public Optional<Peripherals> getClothe(String reference) {
        return repository.findById(reference);
    }
    
    public Peripherals create(Peripherals clothe) {
        return repository.save(clothe);
    }

    public void update(Peripherals clothe) {
        repository.save(clothe);
    }
    
    public void delete(Peripherals clothe) {
        repository.delete(clothe);
    }
}
