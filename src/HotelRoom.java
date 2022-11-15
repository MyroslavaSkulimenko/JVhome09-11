public class HotelRoom {
      int roomNumber;
String roomName;
    MyDateTime startBooking;
    MyDateTime finishBooking=null ;
     double fitnessCenter;


    public HotelRoom(int roomNumber, String roomName, MyDateTime startBooking, MyDateTime finishBooking) {
        this.roomNumber = roomNumber;
        this.roomName = roomName;
        this.startBooking = startBooking;
        this.finishBooking = finishBooking;
        this.fitnessCenter = fitnessCenter;
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
                "roomNumber=" + roomNumber +
                ", roomName='" + roomName + '\'' +
                ", startBooking=" + startBooking +
                ", finishBooking=" + finishBooking +
                ", fitnessCenter=" + fitnessCenter +
                '}';
    }
 /*   public static void wwwww(HotelRoom hotelRoom){
        HotelRoom h=new HotelRoom();

    }*/
 public static MyDateTime[] arrDate(HotelRoom h) {
     MyDateTime[] date = new MyDateTime[MyDateTime.deysBooking(h)];
     date[0] = h.startBooking;
     for (int i = 1; i < date.length - 1; i++) {
         date[i] = new MyDateTime(h.startBooking.getDay() + i, h.startBooking.getMonth(), h.startBooking.getYear());
     }
     return date;
 }

 }
