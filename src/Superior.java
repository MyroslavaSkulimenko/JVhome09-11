public class Superior extends HotelRoom{
    protected double fitnessCenter=60;
    public Superior(int roomNumber, String roomName, MyDateTime startBooking, MyDateTime finishBooking) {
        super(roomNumber, roomName, startBooking, finishBooking);
    }

    @Override
    public String toString() {
        return "Superior{" +

                ", roomName='" + roomName + '\'' +
                ", startBooking=" + startBooking +
                ", finishBooking=" + finishBooking +
                ", fitnessCenter=" + fitnessCenter +
                '}';
    }
}
