package cpit252;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
class ProductTest {
    @Test
    public void shouldCountQuantityEqualThree()
    {
        Product p1 = new FoodProduct(6745, 5.50, "Penne Pasta",LocalDate.parse("2027-07-07"));
        Product p2 = new FoodProduct(8853, 6.50, "Spaghetti Pasta",LocalDate.parse("2027-07-07"));
        Product p3 = new FoodProduct(2106, 4.50, "Linguine Pasta",LocalDate.parse("2027-07-07"));
        assertEquals(p3.getTotalQuantity(), 3);
    }
    @Test
    public void shouldCountQuantityEqualTow()
    {
        Product p1 = new FoodProduct(6745, 5.50, "Penne Pasta",LocalDate.parse("2027-07-07"));
        Product p2 = new FoodProduct(8853, 6.50, "Spaghetti Pasta",LocalDate.parse("2027-07-07"));
        assertNotEquals(p2.getTotalQuantity(), 3);
        assertEquals(p2.getTotalQuantity(),2);
    }

}