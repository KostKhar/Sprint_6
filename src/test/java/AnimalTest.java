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
        Animal animal = Mockito.spy(Animal.class);
        assertThrows(Exception.class, () -> {
            animal.getFood("Всеядное");
        });
    }

    @Test
    public void checkGetFamily() {
        Animal animal = Mockito.spy(Animal.class);
        Mockito.when(animal.getFamily()).thenReturn("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи");
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }

}
