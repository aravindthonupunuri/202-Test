package edu.sjsu.assasins.hotelbooking.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "roomtype")
public class RoomType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String roomId;
    private String roomType;
    private long rewardPoints;
    private int price;
    @OneToMany(mappedBy = "roomtype")
    private List<HotelRoom> hotelRoom=new ArrayList<>();
    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setRewardPoints(long rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @JsonManagedReference
    public void setHotelRoom(List<HotelRoom> hotelRoom) {
        this.hotelRoom = hotelRoom;
    }

    public String getRoomId() {
        return roomId;
    }

    public String getRoomType() {
        return roomType;
    }

    public long getRewardPoints() {
        return rewardPoints;
    }

    public int getPrice() {
        return price;
    }

    public List<HotelRoom> getHotelRoom() {
        return hotelRoom;
    }

    public RoomType() {
    }

    public RoomType(String roomId, String roomType, long rewardPoints, int price, List<HotelRoom> hotelRoom) {
        this.roomId = roomId;
        this.roomType = roomType;
        this.rewardPoints = rewardPoints;
        this.price = price;
        this.hotelRoom = hotelRoom;
    }
}
