package fmh.controller;

import fmh.models.Account;
import fmh.models.Location;
import fmh.models.Post;
import fmh.services.LocationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class LocationController {

    private LocationService locationService;

    @GetMapping("/location/list")
    public List<Location> getAllLocations(){
        return locationService.getAllLocations();
    }

    @GetMapping("/location/{id}")
    public Optional<Location> getLocationById(@PathVariable Integer id){
        return locationService.getLocationById(id);
    }

    @GetMapping("/location/{id}/accounts")
    public List<Account> getPostsByAccountId(@PathVariable Integer id){
        Optional<Location> location = locationService.getLocationById(id);
        if(location.isPresent()) {
            return  location.get().getAccounts();
        }
        return null;
    }
}
