public class FMRadioStation {
    private String callSign;
    private float frequency;

    public FMRadioStation(String callSign, float frequency) throws FMRadioStationException {
        if (callSign == null || !callSign.matches("^[AKNW][A-Z]{3}$")) {
            throw new FMRadioStationException("Invalid call sign: " + callSign + ". Call sign must consist of four capital letters and begin with A, K, N, or W.");
        }
        if (frequency < 88.0 || frequency > 108.0) {
            throw new FMRadioStationException("Invalid frequency: " + frequency + ". Frequency must be between 88.0 and 108.0 .");
        }
        this.callSign = callSign;
        this.frequency = frequency;
    }

    public String getCallSign() {
        return callSign;
    }

    public float getFrequency() {
        return frequency;
    }

    @Override
    public String toString() {
        return "FMRadioStation{callSign='" + callSign + "', frequency=" + frequency + "}";
    }
}
