import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DockingStationTest {
    @Test
    @DisplayName("DockingStation returns a bike")
    void dockingStationReleasesABike() {
        DockingStation dockingStation = new DockingStation();
        String bike = dockingStation.releaseBike();
        assertEquals("bike", bike);
    }
}
