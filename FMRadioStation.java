public class FMRadioStation {
    public static void main(String[] args) {
        try {
            System.out.println("Enter the frequency of the radio station: ");
            Scanner input = new Scanner(System.in);
            double frequency = input.nextDouble();
            if (frequency < 88.0 || frequency > 108.0) {
                throw new FMRadioStationException();
            }
            System.out.println("The frequency is " + frequency);
        } catch (FMRadioStationException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}