import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OurFirstTest {

    private Integer sum(Integer a, Integer b) {
        return a + b;
    }

    @Test
    public void showSum() {
        Integer c;
        Integer d;
        Integer x;

        c = sum(15, 5);
        d = sum(25, 15);
        x = sum(10, 40);

        System.out.println("c is: " + c + " \nand D is: " + d + " \n& x >> " + x);

        Assertions.assertEquals(20, c, "Shit!");
    }
}
