package Exception_Handling;

class LateCheckInException extends Exception {
    LateCheckInException(String msg) {
        super(msg);
    }
}

class FlightCheckIn {
    void checkIn(int minutesBeforeDeparture) throws LateCheckInException {
        if (minutesBeforeDeparture < 30) {
            throw new LateCheckInException("Check-in too late!");
        } else {
            System.out.println("Check-in successful.");
        }
    }
}
