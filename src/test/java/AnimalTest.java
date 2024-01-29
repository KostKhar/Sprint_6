import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class AnimalTest {
    @Test
    public void checkGetFoodException() throws Exception {
        assertThrows(Exception.class, () -> {
           new Animal().getFood("Всеядное");
        });
    }
    @Test
    public void checkGetFamily() {
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", new Animal().getFamily());
    }

}
