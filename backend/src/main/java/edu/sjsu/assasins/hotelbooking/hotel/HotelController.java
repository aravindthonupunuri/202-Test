package edu.sjsu.assasins.hotelbooking.hotel;

import edu.sjsu.assasins.hotelbooking.models.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @Autowired
    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @RequestMapping(value = "createhotel", method = RequestMethod.POST)
    public ResponseEntity<Object> createHotel(@RequestBody Hotel hotel) {
        return hotelService.createHotel(hotel);
    }

    @RequestMapping(value = "readhotel", method = RequestMethod.GET)
    private ResponseEntity<Object> readHotel() {
        return hotelService.readHotel();
    }

    @RequestMapping(value = "updatehotel", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateHotel(@RequestBody Hotel hotel) {
        return hotelService.updateHotel(hotel);
    }

    @RequestMapping(value = "deletehotel", method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteHotel(@RequestBody Hotel hotel) {
        return hotelService.deleteHotel(hotel);
    }

    @RequestMapping(value = "searchhotel", method = RequestMethod.POST)
    public ResponseEntity<Object> searchHotel(@RequestBody Hotel hotel){ return hotelService.searchHotel(hotel);
    }

    @RequestMapping(value = "getHotelDetails", method = RequestMethod.POST)
    public ResponseEntity<Object> getHotelDetails(@RequestBody Hotel hotel) {
        return hotelService.getHotelDetails(hotel);
    }
}