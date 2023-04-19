import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class FMClassworkTest {

    //@BeforeEach
    FMClasswork obj = new FMClasswork();


        @Test
        public void testPrompt() {
          obj.prompt();
            assertEquals("Enter your name: ",obj.prompt());
        }

        @Test
        public void testPrintName(){
            FMClasswork obj = new FMClasswork();
            obj.prompt();
            obj.printName("Torin");
            assertEquals("Hello,Torin",obj.printName("Torin"));



    }
}
