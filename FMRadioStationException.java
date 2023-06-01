public class FMRadioStationException extends Exception {
  public FMRadioStationException(String callSign, float frequency) {
        super("The call sign " + callSign + " is not valid for the frequency " + frequency);
    }

    
}
