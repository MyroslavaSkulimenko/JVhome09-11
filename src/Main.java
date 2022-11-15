import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*Необходимо написать программу для сохранения данных о бронирование номеров гостиницы. В вашей программе должно быть несколько типов номеров, например: standard, superior, de luxe, president. Естественно, номера отличаются ценой проживания. Кроме того, номера категории de luxe, president предполагают доступ в fitness center, для остальных категорий номеров доступ в fitness center оплачивается как отдельная услуга. Ваша программа должна позволять сотрудникам отеля сохранить и просмотреть данные о бронирование, отменить бронирование, посмотреть все бронирования.
        Данные о бронирование если хотите, можно задать в программе константно или ввести через Scanner
        Для отражения дат бронирования необходимо использовать написанный ранее класс MyDate ( в данной задаче не используем стандартные Java классы для работы с датой). В качестве дополнительных задач: в классе MyDate реализовать методы:
        -подсчета количества дней в заданном интервале дат
        -определения пересечения интервалов*/


        ArrayList<HotelRoom> rooms = new ArrayList<>();
        rooms.add(new President(1, "president", new MyDateTime(14, 6, 2022), new MyDateTime(17, 6, 2022)));
        rooms.add(new President(2, "President", new MyDateTime(4, 4, 2022), new MyDateTime(6, 4, 2022)));
        rooms.add(new DeLuxe(3, "deluxe", new MyDateTime(14, 6, 2022), new MyDateTime(17, 6, 2022)));

        rooms.add(new Superior(4, "Superior", new MyDateTime(10, 4, 2022), new MyDateTime(15, 4, 2022)));
        rooms.add(new Superior(5, "Superior", new MyDateTime(10, 4, 2022), new MyDateTime(15, 4, 2022)));
        rooms.add(new Superior(6, "Superior", new MyDateTime(10, 4, 2022), new MyDateTime(15, 4, 2022)));
        rooms.add(new Superior(7, "Superior", new MyDateTime(10, 4, 2022), new MyDateTime(15, 4, 2022)));
        rooms.add(new Standard(8, "standart", new MyDateTime(4, 5, 2022), new MyDateTime(8, 5, 2022)));
        rooms.add(new Standard(9, "standart", new MyDateTime(12, 5, 2022), new MyDateTime(13, 5, 2022)));
        rooms.add(new Standard(10, "standart", new MyDateTime(22, 5, 2022), new MyDateTime(30, 5, 2022)));
        rooms.add(new Standard(11, "standart", new MyDateTime(4, 5, 2022), new MyDateTime(8, 6, 2022)));

        System.out.println(rooms.get(1));
      HotelRoom president=new President(2,"",new MyDateTime(3,4,2022),new MyDateTime(5,4,2022));
        wwwww(rooms.get(1),president);
        System.out.println(arrDate(rooms.get(1)) );
    /*    for (HotelRoom h : rooms) {
            System.out.println("номер - " + h.roomNumber + "  " + h.roomName + " бронь " + MyDateTime.deysBooking(h) + " дней" + " c " + h.startBooking + " по " + h.finishBooking);
        }
        System.out.println(MyDateTime.deysBooking(rooms.get(0)));
        System.out.println(MyDateTime.enterDateStartBookong(rooms.get(0)));
        System.out.println(MyDateTime.enterDateFinifhBookong(rooms.get(0)));
        for (HotelRoom h : rooms) {
            System.out.println(h.roomName + " бронь " + MyDateTime.deysBooking(h) + " дней" + " c " + h.startBooking + " по " + h.finishBooking);
        }*/
if (rooms.get(1).startBooking==rooms.get(1).startBooking){
    System.out.println("+");} else System.out.println("-");

    }
public static MyDateTime[] arrDate(HotelRoom h){
    MyDateTime [] date=new MyDateTime[MyDateTime.deysBooking(h)+1];
    date[0]=h.startBooking;
    for (int i = 1; i <date.length ; i++) {
        date[i]= new MyDateTime(h.startBooking.getDay()+i,h.startBooking.getMonth(),h.startBooking.getYear());
    }
    System.out.println(Arrays.toString(date));
    return date;
}

    public static void wwwww(HotelRoom hotelRoom, HotelRoom rooms){
      if (hotelRoom.roomNumber==rooms.roomNumber){
MyDateTime[] t1=arrDate(hotelRoom);
MyDateTime[] t2=arrDate(rooms);
if (t1.length<=t2.length){
          for (int i = 0; i <t1.length ; i++) {
              for (int j = 0; j <t2.length ; j++) {
                  System.out.println(i);
               if (t1[i]!=t2[j]) {
                   System.out.println(j);
                    System.out.println("ok");

                }

              }
              }
          }

      }

    }
}

