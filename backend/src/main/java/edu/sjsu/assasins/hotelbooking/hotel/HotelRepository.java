package edu.sjsu.assasins.hotelbooking.hotel;

import edu.sjsu.assasins.hotelbooking.models.Hotel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends MongoRepository<Hotel, Integer> {
    @Query("{name:'?0'}")
    List<Hotel> findHotelByName(String name);

    @Query(" {city : {$regex : ?0 ,'$options' : 'i'}}")
    public List<Hotel> findByCityRegexMatch(String city);
}
