import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Bike")
public class BikeTest {
    @Test
    @DisplayName("checks if a Bike is working")
    void itChecksIfABikeIsWorking() {
        Bike bike = new Bike();
        Boolean bikeCondition = bike.isWorking();
        assertEquals(true, bikeCondition);
    }
}
