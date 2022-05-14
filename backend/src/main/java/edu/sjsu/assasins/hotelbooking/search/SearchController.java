package edu.sjsu.assasins.hotelbooking.search;

import edu.sjsu.assasins.hotelbooking.models.Customer;
import edu.sjsu.assasins.hotelbooking.models.Search;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {

    @Autowired
    private SearchService searchService;

    @Autowired
    public SearchController( SearchService searchService ) { this.searchService = searchService;}

    @RequestMapping(value = "getAvailableHotels", method = RequestMethod.POST)
    public ResponseEntity<Object> getAvailableHotels(@RequestBody Search search) {
        return searchService.getAvailableHotels(search);
    }

    @RequestMapping(value = "getAvailableRooms", method = RequestMethod.POST)
    public ResponseEntity<Object> getAvailableRooms(@RequestBody Search search) {
        return searchService.getAvailableRooms(search);
    }

    @RequestMapping(value = "getRewardPointsByEmail", method = RequestMethod.POST)
    public ResponseEntity<Object> getRewardPointsByEmail(@RequestBody Customer customer) {
        return searchService.getRewardPointsByEmail(customer);
    }
}