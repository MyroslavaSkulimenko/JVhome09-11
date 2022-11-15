public class President  extends HotelRoom{
    double fitnessCenter=0;
    public President(int roomNumber, String roomName, MyDateTime startBooking, MyDateTime finishBooking) {
        super(roomNumber, roomName, startBooking, finishBooking);

    }


    @Override
    public String toString() {
        return "President{" +
                "roomNumber=" + roomNumber +
                ", roomName='" + roomName + '\'' +
                ", startBooking=" + startBooking +
                ", finishBooking=" + finishBooking +
                ", fitnessCenter=" + fitnessCenter +
                '}';
    }
}

