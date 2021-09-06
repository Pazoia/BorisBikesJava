public class Main {
    public static void main(String[] args) {
        DockingStation dockingStation = new DockingStation();
        Object bike = dockingStation.releaseBike();
        System.out.println(bike);
    }
}
