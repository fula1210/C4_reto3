package C4_reto_3_web.Reto3_back.interfaces;

import C4_reto_3_web.Reto3_back.modelo.User;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InterfaceUser extends MongoRepository<User, Integer> {
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
    //Optional<User> findTopByOrderByIdDesc();
}
