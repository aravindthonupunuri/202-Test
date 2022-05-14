package edu.sjsu.assasins.hotelbooking.bill;
import edu.sjsu.assasins.hotelbooking.models.Bill;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Rajat Masurkar
 */
@Repository
public interface BillRepository extends MongoRepository<Bill, Integer> {
    @Query("{id:'?0'}")
    List<Bill> findById(String id);
}
