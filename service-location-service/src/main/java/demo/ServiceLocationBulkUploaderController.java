package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ServiceLocationBulkUploaderController {
    private ServiceLocationRepository repository;

    @Autowired
    public ServiceLocationBulkUploaderController(ServiceLocationRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(value = "/bulk/serviceLocations", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void upload(@RequestBody List<ServiceLocation> locations) {
        this.repository.save(locations);
    }

    @RequestMapping(value = "/purge", method = RequestMethod.POST)
    public void purge() {
        this.repository.deleteAll();;
    }
}
