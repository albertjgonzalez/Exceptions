public class FMRadioStationArrayCreator {
    public static void main(String[] args) {
        String[][] stationData = {
            {"WPOW", "96.5"},
            {"WEDR", "99.1"},
            {"WHYI", "100.7"},
            {"WMFE", "90.7"},
            {"KLMN", "88.0"},
            {"AJHM", "87.9"},
            {"WFSU", "-1.0"},
            {"BQIK", "105.5"},
        };

        FMRadioStation[] stations = new FMRadioStation[stationData.length];
        for (int i = 0; i < stationData.length; i++) {
            try {
                float frequency = Float.parseFloat(stationData[i][1]);
                stations[i] = new FMRadioStation(stationData[i][0], frequency);
                System.out.println("Created: " + stations[i]);
            } catch (FMRadioStationException e) {
                System.out.println(e.getMessage());
                stations[i] = null;
            }
        }

        System.out.println("All stations:");
        for (FMRadioStation station : stations) {
            if (station != null) {
                System.out.println("Call sign: " + station.getCallSign() +
                    ", Frequency: " + station.getFrequency());
            }
        }
    }
}