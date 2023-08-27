package ku.cs.resturant.controller;

import ku.cs.resturant.entity.Restaurant;
import ku.cs.resturant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class ResturantController {
    @Autowired
    private RestaurantService service;

    @GetMapping("/restaurant")
    public List<Restaurant> getAllRestaurant() {
        return service.getAll();
    }

    @GetMapping("/restaurant/{id}")
    public Restaurant getRestaurantById(UUID id) {
        return service.getRestaurantById(id);
    }

    @PostMapping("/restaurant")
    public Restaurant createRestaurant(@RequestBody Restaurant resturant) {
        return service.create(resturant);
    }

    @PutMapping("/restaurant")
    public Restaurant update(@RequestBody Restaurant resturant) {
        return service.update(resturant);
    }

    @DeleteMapping("/restaurant/{id}")
    public Restaurant delete(@PathVariable UUID id) {
        return service.delete(id);
    }

    @GetMapping("/restaurant/name/{name}")
    public Restaurant getRestaurantByName(@PathVariable String name) {
        return service.getRestaurantByName(name);
    }

    @GetMapping("/restaurant/location/{location}")
    public Restaurant getRestaurantByLocation(@PathVariable String location) {
        return service.getRestaurantByLocation(location);
    }
}
