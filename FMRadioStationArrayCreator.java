public class FMRadioStationArrayCreator {
    public static void main(String[] args) {
        FMRadioStation[] stations = new FMRadioStation[5];
        stations[0] = new FMRadioStation("WNYC", 93.9);
        stations[1] = new FMRadioStation("WNYC", 93.9);
        stations[2] = new FMRadioStation("WNYC", 93.9);
        stations[3] = new FMRadioStation("WNYC", 93.9);
        stations[4] = new FMRadioStation("WNYC", 93.9);
        for (int i = 0; i < stations.length; i++) {
            System.out.println(stations[i]);
        }
    }
}
