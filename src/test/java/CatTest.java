import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;

    @Test
    public void checkGetSound() {
        Cat cat = Mockito.spy(new Cat(feline));
        Mockito.when(cat.getSound()).thenReturn("Mяу");
        assertEquals("Mяу", cat.getSound());
    }

    @Test
    public void checkGetFood() throws Exception {
        Cat cat = Mockito.spy(new Cat(feline));
        Mockito.when(cat.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }


}
