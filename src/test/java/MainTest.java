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
        assertEquals(8, resultat);
    }
    @Test
    public void testCarreSucces(){
        int resultat = Main.yamsGame(1,1,1,1,2);
        assertEquals(40, resultat);
    }
    @Test
    public void testCarreEchec(){
        int resultat = Main.yamsGame(1,1,1,2,2);
        assertEquals(7, resultat);
    }
}
