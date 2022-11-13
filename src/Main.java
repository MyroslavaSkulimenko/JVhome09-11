import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*Необходимо написать программу для сохранения данных о бронирование номеров гостиницы. В вашей программе должно быть несколько типов номеров, например: standard, superior, de luxe, president. Естественно, номера отличаются ценой проживания. Кроме того, номера категории de luxe, president предполагают доступ в fitness center, для остальных категорий номеров доступ в fitness center оплачивается как отдельная услуга. Ваша программа должна позволять сотрудникам отеля сохранить и просмотреть данные о бронирование, отменить бронирование, посмотреть все бронирования.
        Данные о бронирование если хотите, можно задать в программе константно или ввести через Scanner
        Для отражения дат бронирования необходимо использовать написанный ранее класс MyDate ( в данной задаче не используем стандартные Java классы для работы с датой). В качестве дополнительных задач: в классе MyDate реализовать методы:
        -подсчета количества дней в заданном интервале дат
        -определения пересечения интервалов*/


        ArrayList<HotelRoom> rooms=new ArrayList<>();
        rooms.add(new Standard("standart",new MyDateTime(4,5,2022),new MyDateTime(8,5,2022)));
        rooms.add(new Standard("standart",new MyDateTime(12,5,2022),new MyDateTime(13,5,2022)));
        rooms.add(new Standard("standart",new MyDateTime(22,5,2022),new MyDateTime(30,5,2022)));
        rooms.add(new Standard("standart",new MyDateTime(4,5,2022),new MyDateTime(8,6,2022)));
        rooms.add(new DeLuxe("deluxe",new MyDateTime(14,6,2022),new MyDateTime(17,6,2022)));
        rooms.add(new President("president",new MyDateTime(14,6,2022),new MyDateTime(17,6,2022)));

        System.out.println(rooms);
        for (HotelRoom h:rooms){
            System.out.println(h.roomName+" бронь "+MyDateTime.deysBooking(h)+" дней"+ " c "+h.startBooking + " по "+h.finishBooking );
        }
        System.out.println(MyDateTime.deysBooking(rooms.get(0)));
        System.out.println(MyDateTime.enterDateStartBookong(rooms.get(0)));
        System.out.println(MyDateTime.enterDateFinifhBookong(rooms.get(0)));
        for (HotelRoom h:rooms){
            System.out.println(h.roomName+" бронь "+MyDateTime.deysBooking(h)+" дней"+ " c "+h.startBooking + " по "+h.finishBooking );
        }


    }
}

