package C4_reto_3_web.Reto3_back.interfaces;

import C4_reto_3_web.Reto3_back.modelo.Peripherals;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InterfacePeripherals extends MongoRepository<Peripherals, String> {
    
}
