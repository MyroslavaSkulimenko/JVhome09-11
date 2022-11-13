public class DeLuxe extends HotelRoom{
    protected double fitnessCenter;
    public DeLuxe(String roomName, MyDateTime startBooking, MyDateTime finishBooking) {
        super(roomName, startBooking, finishBooking);
    }

    @Override
    public String toString() {
        return "DeLuxe{" +
                "roomName='" + roomName + '\'' +
                ", startBooking=" + startBooking +
                ", finishBooking=" + finishBooking +
                ", fitnessCenter=" + fitnessCenter +
                '}';
    }
}
