package ku.cs.resturant.repository;

import ku.cs.resturant.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RestaurantRepository extends JpaRepository<Restaurant, UUID> {
    Restaurant findByName(String name);
    Restaurant findByLocation(String location);
}
