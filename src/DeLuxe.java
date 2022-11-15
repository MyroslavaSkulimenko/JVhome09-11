public class DeLuxe extends HotelRoom{
    protected double fitnessCenter;
    public DeLuxe(int roomNumber, String roomName, MyDateTime startBooking, MyDateTime finishBooking) {
        super(roomNumber, roomName, startBooking, finishBooking);
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
