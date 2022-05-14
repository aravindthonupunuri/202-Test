package edu.sjsu.assasins.hotelbooking.validator;


import edu.sjsu.assasins.hotelbooking.models.Booking;

public interface ValidatorInterface {

    BookingValidator next = null;
    ValidatorMessage validatorMessage = new ValidatorMessage(false, null);

    BookingValidator linkWith(BookingValidator next);

    /**
     * Subclasses will implement this method with concrete checks.
     */
    ValidatorMessage checkAndSet(Booking inputBooking, Booking outputBooking);

    /**
     * Runs check on the next object in chain or ends traversing if we're in
     * last object in chain.
     */
    ValidatorMessage checkAndSetNext(Booking inputBooking, Booking outputBooking);
}
