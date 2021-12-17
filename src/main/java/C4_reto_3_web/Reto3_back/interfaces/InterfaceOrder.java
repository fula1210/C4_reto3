package C4_reto_3_web.Reto3_back.interfaces;

import C4_reto_3_web.Reto3_back.modelo.Order;
import java.util.List;
// import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
// import org.springframework.data.mongodb.repository.Query;

public interface InterfaceOrder extends MongoRepository<Order, Integer>{
   
    List<Order> findBySalesManZone(String zone);
//@Query("{'salesMan.zone': ?0}")
//    List<Order> findByZone(final String country);
//    
//    //Retorna las ordenes x estado
//    @Query("{status: ?0}")
//    List<Order> findByStatus(final String status);
//    
//    //Para seleccionar la orden con el id maximo
//    Optional<Order> findTopByOrderByIdDesc();
}