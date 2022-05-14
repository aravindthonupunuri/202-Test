package edu.sjsu.assasins.hotelbooking.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity

public class HotelRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "hotelroom_id")
    private int id;
    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;
    @ManyToOne
    @JoinColumn(name = "roomtype_id")
    private RoomType roomtype;

    private int numberofrooms;
    private int availability;

    public HotelRoom() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHotelid(Hotel hotel) {
        this.hotel = hotel;
    }

    public void setRoomtype(RoomType roomtype) {
        this.roomtype = roomtype;
    }

    public void setNumberofrooms(int numberofrooms) {
        this.numberofrooms = numberofrooms;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public int getId() {
        return id;
    }
    @JsonBackReference
    public Hotel getHotel() {
        return hotel;
    }
    @JsonBackReference
    public RoomType getRoomtype() {
        return roomtype;
    }

    public int getNumberofrooms() {
        return numberofrooms;
    }

    public int getAvailability() {
        return availability;
    }

    public HotelRoom(int id, Hotel hotel, RoomType roomtype, int numberofrooms, int availability) {
        this.id = id;
        this.hotel = hotel;
        this.roomtype = roomtype;
        this.numberofrooms = numberofrooms;
        this.availability = availability;
    }
}
