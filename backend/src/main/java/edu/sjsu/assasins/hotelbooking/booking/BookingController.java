package edu.sjsu.assasins.hotelbooking.booking;

import edu.sjsu.assasins.hotelbooking.models.Booking;
import edu.sjsu.assasins.hotelbooking.models.ErrorMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping(path = "/api/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @Autowired
    public BookingController( BookingService bookingService ) {
        this.bookingService = bookingService;
    }

    @RequestMapping(value = "main" , method = RequestMethod.GET)
    public ResponseEntity<Object> main(){
        return ResponseEntity.ok().body(new ErrorMessage("The Booking application is up and running..."));
    }

//    @RequestMapping(value = "/getallbookings", method = RequestMethod.POST)
//    public ResponseEntity<Object> getallBooking(){
//        return bookingService.createBooking(booking);
//    }

    @RequestMapping(value = "createbooking", method = RequestMethod.POST)
    public ResponseEntity<Object> createBooking(@RequestBody Booking booking){
        return bookingService.createBooking(booking);
    }

    @RequestMapping(value = "readbooking", method = RequestMethod.GET)
    public ResponseEntity<Object> readBooking() {
        return bookingService.readBooking();
    }

    @RequestMapping(value = "updatebooking", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateBooking(@RequestBody Booking booking){
        return bookingService.updateBooking(booking);
    }

    @RequestMapping(value = "deletebooking", method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteBooking(@RequestBody Booking booking){
        return bookingService.deleteBooking(booking);
    }

    @RequestMapping(value = "searchbooking", method = RequestMethod.POST)
    public ResponseEntity<Object> searchBooking(@RequestBody Booking booking) {
        return bookingService.searchBooking(booking);
    }

    @RequestMapping(value = "getBookingByEmail", method = RequestMethod.POST)
    public ResponseEntity<HashMap<String, Object>> getBookingByEmail(@RequestBody Booking booking) {
        return bookingService.getBookingByEmail(booking);
    }
}
