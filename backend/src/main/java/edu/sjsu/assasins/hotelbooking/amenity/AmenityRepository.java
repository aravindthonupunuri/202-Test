package edu.sjsu.assasins.hotelbooking.amenity;

import edu.sjsu.assasins.hotelbooking.models.Amenity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AmenityRepository extends MongoRepository<Amenity, Integer> {

//    @Query("{_id:'?0'}")
//    Amenity findItemById(int id);
}