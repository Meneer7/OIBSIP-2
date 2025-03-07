public class Reservation {
    private int pnr;
    private String name;
    private int trainNumber;
    private String trainName;
    private String classType;
    private String dateOfJourney;
    private String from;
    private String to;

    public Reservation(int pnr, String name, int trainNumber, String trainName, String classType, String dateOfJourney, String from, String to) {
        this.pnr = pnr;
        this.name = name;
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.classType = classType;
        this.dateOfJourney = dateOfJourney;
        this.from = from;
        this.to = to;
    }

    public int getPnr() {
        return pnr;
    }

    @Override
    public String toString() {
        return "PNR: " + pnr + ", Name: " + name + ", Train Number: " + trainNumber + ", Train Name: " + trainName +
                ", Class: " + classType + ", Date: " + dateOfJourney + ", From: " + from + ", To: " + to;
    }
}
