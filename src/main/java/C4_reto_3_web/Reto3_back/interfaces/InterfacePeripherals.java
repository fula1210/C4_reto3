/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package C4_reto_3_web.Reto3_back.interfaces;


import C4_reto_3_web.Reto3_back.modelo.Peripherals;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author PRESTAMO
 */
public interface InterfacePeripherals extends MongoRepository<Peripherals, String> {
    
}
