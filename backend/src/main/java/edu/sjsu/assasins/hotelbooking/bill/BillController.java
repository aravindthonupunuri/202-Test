package edu.sjsu.assasins.hotelbooking.bill;

import edu.sjsu.assasins.hotelbooking.models.Bill;
import edu.sjsu.assasins.hotelbooking.models.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillController {
    @Autowired
    private BillService billService;

    @Autowired
    public BillController( BillService billService ) { this.billService = billService;}

    @RequestMapping(value = "createBill", method = RequestMethod.POST)
    public ResponseEntity<Object> createBill(@RequestBody Booking booking){
        return billService.createBill(booking);
    }

    @RequestMapping(value = "makePayment", method = RequestMethod.POST)
    public ResponseEntity<Object> makePayment(@RequestBody Bill bill){
        return billService.makePayment(bill);
    }
}
