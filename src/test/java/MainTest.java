import org.example.Main;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void testYamsSucces(){
        int resultat = Main.yamsGame(1,1,1,1,1);
        assertEquals(50, resultat);
    }
    @Test
    public void testYamsEchec(){
        int resultat = Main.yamsGame(1,2,3,1,1);
        assertEquals(0, resultat);
    }
}
