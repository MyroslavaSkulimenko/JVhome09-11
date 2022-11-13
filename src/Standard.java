public class Standard extends HotelRoom{
    protected double fitnessCenter=70;
    public Standard(String roomName, MyDateTime startBooking, MyDateTime finishBooking) {
        super(roomName, startBooking, finishBooking);
    }

    @Override
    public String toString() {
        return "Standard{" +
                "roomName='" + roomName + '\'' +
                ", startBooking=" + startBooking +
                ", finishBooking=" + finishBooking +
                ", fitnessCenter=" + fitnessCenter +
                '}';
    }
}
