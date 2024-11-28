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
        int resultat = Main.yamsGame(1,2,3,2,1);
        assertEquals(9, resultat);
    }
    @Test
    public void testCarreSucces(){
        int resultat = Main.yamsGame(1,1,1,1,2);
        assertEquals(40, resultat);
    }
    @Test
    public void testCarreEchec(){
        int resultat = Main.yamsGame(1,4,1,2,2);
        assertEquals(10, resultat);
    }
    @Test
    public void testBrelanSucces(){
        int resultat = Main.yamsGame(1,1,1,2,2);
        assertEquals(28, resultat);
    }
    @Test
    public void testBrelanEchec(){
        int resultat = Main.yamsGame(1,2,5,3,2);
        assertEquals(13, resultat);
    }
}
