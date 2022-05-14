package edu.sjsu.assasins.hotelbooking.price;

import edu.sjsu.assasins.hotelbooking.customer.CustomerRepository;
import edu.sjsu.assasins.hotelbooking.models.Price;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceService {
    @Autowired
    private PriceRepository priceRepository;

    public ResponseEntity<Object> getallpeakprices() {
        System.out.println("***");
        List<Price> l = priceRepository.findAll();
        System.out.println(l.get(0).toString());
        return ResponseEntity.ok(priceRepository.findAll());
    }

    public ResponseEntity<Object> addPrice(Price price) {
        return ResponseEntity.ok(priceRepository.save(price));
    }

    public ResponseEntity<Object> getPricebyid(String id) {
        return ResponseEntity.ok(priceRepository.findById(id));
    }
}
