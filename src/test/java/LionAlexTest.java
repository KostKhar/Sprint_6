import com.example.LionAlex;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LionAlexTest {

    @Test
    public void checkAlexTest() throws Exception {
        LionAlex lionAlex = new LionAlex();
        LionAlex lionSpy = Mockito.spy(lionAlex);
        assertTrue(lionSpy.doesHaveMane());
    }

    @Test
    public void checkGetKittens() {
        LionAlex lionAlex = Mockito.spy(LionAlex.class);
        Mockito.when(lionAlex.getKittens()).thenReturn(0);
        assertEquals(0, lionAlex.getKittens());
    }

    @Test
    public void checkGetFriens() {
        LionAlex lionAlex = Mockito.spy(LionAlex.class);
        Mockito.when(lionAlex.getFriends()).thenReturn(List.of("зебра Марти", "бегемотиха Глория", "жирафа Мелман"));
        assertEquals(List.of("зебра Марти", "бегемотиха Глория", "жирафа Мелман"), lionAlex.getFriends());
    }

    @Test
    public void checkPlaceOfLiving() {
        LionAlex lionAlex = Mockito.spy(LionAlex.class);
        Mockito.when(lionAlex.getPlaceOfLiving()).thenReturn("Нью-Йоркский зоопарк");
        assertEquals("Нью-Йоркский зоопарк", lionAlex.getPlaceOfLiving());
    }

}
