package edu.sjsu.assasins.hotelbooking.room;

import edu.sjsu.assasins.hotelbooking.models.Room;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository  extends MongoRepository<Room, Integer> {


    @Query("{'hotelId': ?0}")
    List<Room> findRoomByHotelId(int hotelId);
}

