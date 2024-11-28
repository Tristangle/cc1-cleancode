import org.example.Main;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void testYamsSucces(){
        int[] valeurs = {1,1,1,1,1};
        int resultat = Main.yamsGame(valeurs);
        assertEquals(50, resultat);
    }
    @Test
    public void testYamsEchec(){
        int[] valeurs = {1,2,3,2,1};
        int resultat = Main.yamsGame(valeurs);
        assertEquals(9, resultat);
    }
    @Test
    public void testCarreSucces(){
        int[] valeurs = {1,1,1,1,2};
        int resultat = Main.yamsGame(valeurs);
        assertEquals(40, resultat);
    }
    @Test
    public void testCarreEchec(){
        int[] valeurs = {1,4,1,2,2};
        int resultat = Main.yamsGame(valeurs);
        assertEquals(10, resultat);
    }
    @Test
    public void testBrelanSucces(){
        int[] valeurs = {1,1,1,2,2};
        int resultat = Main.yamsGame(valeurs);
        assertEquals(28, resultat);
    }
    @Test
    public void testBrelanEchec(){
        int[] valeurs = {1,2,5,3,2};
        int resultat = Main.yamsGame(valeurs);
        assertEquals(13, resultat);
    }
}
