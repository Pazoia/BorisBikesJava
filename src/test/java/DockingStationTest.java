import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DockingStationTest {
    @Test
    @DisplayName("DockingStation returns a bike")
    void dockingStationReleasesABike() {
        DockingStation dockingStation = new DockingStation();
        Object bike = dockingStation.releaseBike();
        assertTrue(bike instanceof Bike);
    }
}
