import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeTest {
    @Test
    @DisplayName("It checks if a Bike is working")
    void itChecksIfABikeIsWorking() {
        Bike bike = new Bike();
        Boolean bikeCondition = bike.isWorking();
        assertEquals(true, bikeCondition);
    }
}
