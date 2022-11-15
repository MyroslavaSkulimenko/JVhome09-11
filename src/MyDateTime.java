import java.util.Scanner;

public class MyDateTime {
        private int day=0;
        private int month=0;
        private int year=0;

        public MyDateTime(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        @Override
        public String toString() {
            return day +"-"+month +"-"+year ;
        }
        protected  MyDateTime enterDate(){
            MyDateTime dateBooking=new MyDateTime(0,0,0);
            Scanner scanner=new Scanner(System.in);
            System.out.println("Введите день ");
            setDay(scanner.nextInt());
            System.out.println("Введите месяц в числовом формате   ");
            setMonth(scanner.nextInt());
            System.out.println("Введите год хххх ");
            setYear(scanner.nextInt());
return dateBooking;
        }
    public static int deysBooking(HotelRoom hotelRoom){
        int amount=0;
        if (hotelRoom.startBooking.getMonth()!=hotelRoom.finishBooking.getMonth()){
            amount=(hotelRoom.finishBooking.getMonth()-hotelRoom.startBooking.getMonth())*30;
        }
        return (hotelRoom.finishBooking.getDay()-hotelRoom.startBooking.getDay()+amount);
    }
    protected static MyDateTime enterDateFinifhBookong(HotelRoom hotelRoom){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Изменить дату окончания бронирования");
        System.out.println("Введите день ");
        hotelRoom.finishBooking.setDay(scanner.nextInt());

        System.out.println("Введите месяц в числовом формате   ");
         hotelRoom.finishBooking.setMonth (scanner.nextInt());
        System.out.println("Введите год хххх ");
       hotelRoom.finishBooking.setYear(scanner.nextInt());
        return hotelRoom.finishBooking;
    }
    protected static MyDateTime enterDateStartBookong(HotelRoom hotelRoom){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Изменить дату  бронирования");
        System.out.println("Введите день ");
        hotelRoom.startBooking.setDay(scanner.nextInt());

        System.out.println("Введите месяц в числовом формате   ");
        hotelRoom.startBooking.setMonth (scanner.nextInt());
        System.out.println("Введите год хххх ");
        hotelRoom.startBooking.setYear(scanner.nextInt());
        return hotelRoom.startBooking;
    }

}
