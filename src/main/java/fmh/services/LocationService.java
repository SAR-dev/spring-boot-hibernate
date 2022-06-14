package fmh.services;

import fmh.models.Account;
import fmh.models.Location;
import fmh.repositories.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationService {

    @Autowired
    private LocationRepository locationRepository;

    public List<Location> getAllLocations() {
        return (List<Location>) locationRepository.findAll();
   }

    public Optional<Location> getLocationById(Integer id) {
        return locationRepository.findById(id);
    }
}
