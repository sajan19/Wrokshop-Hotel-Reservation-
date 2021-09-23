import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotelReservationSystemTest {
    //Test to check Hotel Name
    @Test
    void addGivenHotelName() throws Exception {
        ListOfHotel hotelRes = new ListOfHotel();
        try {
            ListOfHotel hotel1 = hotelRes.addHotel("LakeWood");
            Assertions.assertEquals("LakeWood", hotel1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}