package ku.cs.resturant.service;

import ku.cs.resturant.entity.Restaurant;
import ku.cs.resturant.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RestaurantService {
    @Autowired
    private RestaurantRepository repository;

    public List<Restaurant> getAll() {
        return repository.findAll();
    }

    public Restaurant create(Restaurant resturant) {
        return repository.save(resturant);
    }

    public Restaurant getRestaurantById(UUID id) {
        return repository.findById(id).get();
    }

    public Restaurant update(Restaurant restaurantBody) {
        UUID id = restaurantBody.getId();
        Restaurant record = repository.findById(id).get();
        record.setName(restaurantBody.getName());
        record.setRating(restaurantBody.getRating());
        record.setLocation(restaurantBody.getLocation());

        return repository.save(record);
    }

    public Restaurant delete(UUID id) {
        Restaurant record = repository.findById(id).get();
        repository.deleteById(id);
        return record;
    }

    public Restaurant getRestaurantByName(String name) {
        return repository.findByName(name);
    }

    public Restaurant getRestaurantByLocation(String location) {
        return repository.findByLocation(location);
    }
}
