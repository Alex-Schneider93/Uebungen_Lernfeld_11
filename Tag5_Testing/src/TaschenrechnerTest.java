import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaschenrechnerTest {
    Taschenrechner taschenrechner = new Taschenrechner();
    @Test
   void testAddition(){
        Assertions.assertEquals(5, taschenrechner.addiere(2,3));
   }

   @Test
    void testDivisionDurchNull(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> taschenrechner.dividiere(5,0));
   }

}
