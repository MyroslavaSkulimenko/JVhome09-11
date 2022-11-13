public class Superior extends HotelRoom{
    protected double fitnessCenter=60;
    public Superior(String roomName, MyDateTime startBooking, MyDateTime finishBooking) {
        super(roomName, startBooking, finishBooking);
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
