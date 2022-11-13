public class President  extends HotelRoom{
    protected double fitnessCenter;
    private String roomName="President";
    public President(String roomName, MyDateTime startBooking, MyDateTime finishBooking) {
        super(roomName, startBooking, finishBooking);
    }

    @Override
    public String toString() {
        return "President{" +
                "roomName='" + roomName + '\'' +
                ", startBooking=" + startBooking +
                ", finishBooking=" + finishBooking +
                ", fitnessCenter=" + fitnessCenter +
                '}';
    }
}
