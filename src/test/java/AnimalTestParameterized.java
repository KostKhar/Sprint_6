import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalTestParameterized {
    private final String animalKind;

    private final List<String> eats;

    private final boolean hisFood;


    public AnimalTestParameterized(String animalKind, List<String> eats, boolean hisFood) {
        this.animalKind = animalKind;
        this.eats = eats;
        this.hisFood = hisFood;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getAnimalKind() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения"), true},
                {"Хищник", List.of("Животные", "Птицы", "Рыба"), true},
                {"Хищник", List.of("Трава", "Различные растения"), false}
        };
    }

    @Test
    public void checkGetFood() throws Exception {
        Animal animal = new Animal();
        assertEquals(hisFood, animal.getFood(animalKind).equals(eats));
    }

}
