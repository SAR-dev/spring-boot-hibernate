package fmh.controller;

import fmh.models.Account;
import fmh.models.Location;
import fmh.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LocationController {

    @Autowired
    private LocationService locationService;

    @PostMapping("/location")
    public Location addLocation(@RequestBody Location location) {
        return locationService.addLocation(location);
    }

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
