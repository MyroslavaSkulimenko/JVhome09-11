public abstract class HotelRoom {
    protected  String roomName;

   protected MyDateTime startBooking;
   protected MyDateTime finishBooking =null;
    protected double fitnessCenter;

    public HotelRoom(String roomName, MyDateTime startBooking, MyDateTime finishBooking) {
        this.roomName = roomName;
        this.startBooking = startBooking;
        this.finishBooking = finishBooking;
    }

    public MyDateTime getStartBooking() {
        return startBooking;
    }

    public void setStartBooking(MyDateTime startBooking) {
        this.startBooking = startBooking;
    }

    public MyDateTime getFinishBooking() {
        return finishBooking;
    }

    public void setFinishBooking(MyDateTime finishBooking) {
        this.finishBooking = finishBooking;
    }

    @Override
    public String toString() {
        return "HotelRoom{" +
                "roomName='" + roomName + '\'' +
                ", startBooking=" + startBooking +
                ", finishBooking=" + finishBooking +
                ", fitnessCenter=" + fitnessCenter +
                '}';
    }
}
