import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Test
    public void checkEatMeat() throws Exception {
        Feline feline = Mockito.spy(Feline.class);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void checkGetFamily() {
        Feline feline = Mockito.spy(Feline.class);
        Mockito.when(feline.getFamily()).thenReturn("Кошачьи");
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void checkGetKittens() {
        Feline feline = Mockito.spy(Feline.class);
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void checkGetKittensCount() {
        Feline feline = Mockito.mock(Feline.class);
        Mockito.when(feline.getKittens(1)).thenReturn(1);
        assertEquals(1, feline.getKittens(1));
    }


}
