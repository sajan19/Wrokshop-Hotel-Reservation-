import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOfHotel {
    public static Scanner sc = new Scanner(System.in);
    //Created a List to Store Hotel Name and Rates
    public static List<HotelReservationSystem> nameOfHotel = new ArrayList<>();
    // Method to add Hotel
    public static void addHotel(String NameOfHotel) {
        System.out.print("Enter Hotel Name : ");
//        String hotelName = sc.next();
//        HotelReservationSystem addHot = new HotelReservationSystem(hotelName);
        nameOfHotel.add(NameOfHotel);
    }
}
