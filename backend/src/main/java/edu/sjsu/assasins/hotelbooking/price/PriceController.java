package edu.sjsu.assasins.hotelbooking.price;

import edu.sjsu.assasins.hotelbooking.models.Price;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/price")
public class PriceController {

    @Autowired
    PriceService priceService;

    @RequestMapping(value = "/getallpeakprices" , method = RequestMethod.GET)
    public ResponseEntity<Object> getallPrices(){
        return priceService.getallpeakprices();
    }

    @RequestMapping(value = "/addprice" , method = RequestMethod.POST)
    public ResponseEntity<Object> addPrice(@RequestBody Price price){
        return priceService.addPrice(price);
    }

    @RequestMapping(value = "/getpricesbyid/" , method = RequestMethod.GET)
    public ResponseEntity<Object> getPricebyid(@RequestParam String id){
        return priceService.getPricebyid(id);
    }
}
