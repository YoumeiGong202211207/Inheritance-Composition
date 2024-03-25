public class MusicConcertEvent {
    private String eventID;
    private String eventName;
    private String eventLocation;
    private String pointOfContact;
    private boolean merchandiseRequired;
    private double merchandiseCost;
    private CalculateEventCostClass calculateEventCostObject;

    public MusicConcertEvent(String eventID, String eventName, String eventLocation, String eventPointOfContact,
                             double eventCost, int totalParticipants, int totalEventDays,
                             boolean merchandiseRequired, double merchandiseCost) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.pointOfContact = eventPointOfContact;
        this.merchandiseRequired = merchandiseRequired;
        this.merchandiseCost = merchandiseCost;
        this.calculateEventCostObject = new CalculateEventCostClass();
    }

    public double calculateEventCost() {
        double eventCost = calculateEventCostObject.calculateEventCost();

        if (merchandiseRequired) {
            eventCost += merchandiseCost;
        }

        return eventCost;
    }

    @Override
    public String toString() {
        String eventDetails = "";

        eventDetails += "Event ID: " + eventID + "\n";
        eventDetails += "Event Name: " + eventName + "\n";
        eventDetails += "Event Location: " + eventLocation + "\n";
        eventDetails += "Point of Contact: " + pointOfContact + "\n";
        eventDetails += "Merchandise Required: " + merchandiseRequired + "\n";
        eventDetails += "Merchandise Cost: " + merchandiseCost + "\n";

        return eventDetails;
    }
}

