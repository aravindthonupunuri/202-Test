package edu.sjsu.assasins.hotelbooking.validator;

import edu.sjsu.assasins.hotelbooking.models.Booking;

public class BookingValidatorForHotel extends BookingValidator{

    public BookingValidatorForHotel(BookingValidator bookingValidator){
        super(bookingValidator);
    }

    public ValidatorMessage checkAndSet(Booking inputBooking, Booking outputBooking) {
        if (hotelRepository.existsById(inputBooking.getHotelId())) {
            outputBooking.setHotelId(inputBooking.getHotelId());
            outputBooking.setHotelName(hotelRepository.findById(outputBooking.getHotelId()).get().getName());
            logger.info("Hotel id validation pass...");
            return checkAndSetNext(inputBooking, outputBooking);
        }
        else{
            logger.error("Hotel id validation fail because hotel id is invalid, empty or null");
            validatorMessage.setMessage("Hotel id is invalid, empty or null");
            validatorMessage.setResult(false);
            return validatorMessage;
        }
    }
}

