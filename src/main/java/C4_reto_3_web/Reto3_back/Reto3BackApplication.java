package C4_reto_3_web.Reto3_back;

import C4_reto_3_web.Reto3_back.interfaces.InterfaceOrder;
import C4_reto_3_web.Reto3_back.interfaces.InterfacePeripherals;
import C4_reto_3_web.Reto3_back.interfaces.InterfaceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class Reto3BackApplication implements CommandLineRunner {
    
    @Autowired
    private InterfacePeripherals  crudRepository;
    @Autowired
    private InterfaceUser userCrudRepository;
    @Autowired
    private InterfaceOrder orderCrudRepository;

	public static void main(String[] args) {
		SpringApplication.run(Reto3BackApplication.class, args);
	}
@Override
    public void run(String... args) throws Exception {
        
//      SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        crudRepository.deleteAll();
        userCrudRepository.deleteAll();
        orderCrudRepository.deleteAll();
    }
}
