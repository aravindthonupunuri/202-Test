package edu.sjsu.assasins.hotelbooking.booking;

import edu.sjsu.assasins.hotelbooking.models.Booking;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BookingRepository extends MongoRepository<Booking, Integer> {
    @Query("{'hotelId':?0,'roomId':?1}")
    List<Booking> findBookingByHotelIdRoomId(int hotelId, int roomId);

    @Query("{customerEmail:'?0'}")
    List<Booking> findByEmail(String customerEmail);
}