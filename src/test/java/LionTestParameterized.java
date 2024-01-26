import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTestParameterized {
    private final String sex;

    private final boolean hasMane;

    public LionTestParameterized(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;

    }

    @Parameterized.Parameters
    public static Object[][] getAnimalKind() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void checkHasMane() throws Exception {
        Lion lion = new Lion(sex);
        assertEquals(hasMane, lion.doesHaveMane());
    }

}
