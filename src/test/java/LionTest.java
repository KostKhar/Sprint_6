import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Test
    public void checkHasManeException() throws Exception {
        assertThrows(Exception.class, () -> {
            new Lion("Трансгендер");
        });
    }

    @Test
    public void lionGetKittensTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline);
        Lion lionSpy = Mockito.spy(lion);
        Mockito.when(lionSpy.getKittens()).thenReturn(1);
        assertEquals(1, lionSpy.getKittens());
    }

    @Test
    public void checkGetFood() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline);
        Lion lionSpy = Mockito.spy(lion);
        Mockito.when(lionSpy.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lionSpy.getFood());
    }

}
