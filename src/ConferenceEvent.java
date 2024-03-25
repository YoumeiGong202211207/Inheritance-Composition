public class ConferenceEvent {
    private String eventID;
    private String eventName;
    private String eventLocation;
    private String pointOfContact;
    private boolean breakfastRequired;
    private double breakfastCost;
    private boolean lunchRequired;
    private double lunchCost;
    private boolean dinnerRequired;
    private double dinnerCost;
    private CalculateEventCostClass calculateEventCostObject;

    public ConferenceEvent(String eventID, String eventName, String eventLocation, String eventPointOfContact,
                           double eventCost, int totalParticipants, int totalEventDays,
                           boolean breakfastRequired, double breakfastCost,
                           boolean lunchRequired, double lunchCost,
                           boolean dinnerRequired, double dinnerCost) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.pointOfContact = eventPointOfContact;
        this.breakfastRequired = breakfastRequired;
        this.breakfastCost = breakfastCost;
        this.lunchRequired = lunchRequired;
        this.lunchCost = lunchCost;
        this.dinnerRequired = dinnerRequired;
        this.dinnerCost = dinnerCost;
        this.calculateEventCostObject = new CalculateEventCostClass();
    }

    public double calculateEventCost() {
        double eventCost = calculateEventCostObject.calculateEventCost() + (calculateEventCostObject.calculateEventCost() * 0.3);

        if (breakfastRequired) {
            eventCost += breakfastCost;
        }

        if (lunchRequired) {
            eventCost += lunchCost;
        }

        if (dinnerRequired) {
            eventCost += dinnerCost;
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
        eventDetails += "Breakfast Required: " + breakfastRequired + "\n";
        eventDetails += "Breakfast Cost: " + breakfastCost + "\n";
        eventDetails += "Lunch Required: " + lunchRequired + "\n";
        eventDetails += "Lunch Cost: " + lunchCost + "\n";
        eventDetails += "Dinner Required: " + dinnerRequired + "\n";
        eventDetails += "Dinner Cost: " + dinnerCost + "\n";

        return eventDetails;
    }
}

