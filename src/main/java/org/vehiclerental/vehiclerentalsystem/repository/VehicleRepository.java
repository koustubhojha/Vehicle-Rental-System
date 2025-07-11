package org.vehiclerental.vehiclerentalsystem.repository;

import org.springframework.stereotype.Repository;
import org.vehiclerental.vehiclerentalsystem.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    List<Vehicle> findByAvailableTrueAndStockGreaterThan(int stock);

    List<Vehicle> findByBrandContainingIgnoreCaseOrModelContainingIgnoreCase(String brand, String model);

}
