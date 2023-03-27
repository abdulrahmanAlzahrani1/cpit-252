package cpit252;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    @Test
    public void shouldCountQuantityEqualThree()
    {
        Product p1 = new Product(6745, 5.50, "Penne Pasta");
        Product p2 = new Product(8853, 6.50, "Spaghetti Pasta");
        Product p3 = new Product(2106, 4.50, "Linguine Pasta");
        assertEquals(p3.getTotalQuantity(), 3);
    }
    public void shouldCountQuantityEqualTow()
    {
        Product p1 = new Product(6745, 5.50, "Penne Pasta");
        Product p2 = new Product(8853, 6.50, "Spaghetti Pasta");
        assertNotEquals(p2.getTotalQuantity(), 3);
        assertEquals(p2.getTotalQuantity(),2);
    }

}