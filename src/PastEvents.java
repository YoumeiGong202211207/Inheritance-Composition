import java.time.LocalDate;

public class PastEvents {
    private LocalDate eventStartDate;
    private LocalDate eventEndDate;
    private String paymentStatus;
    private boolean requiresExtension;
    private static final double eventCost = 10_000;

    public PastEvents(String eventID, String eventName, String eventLocation, String eventPointOfContact,
                      int totalParticipants, int totalEventDays, LocalDate eventStartDate,
                      LocalDate eventEndDate, String paymentStatus, boolean requiresExtension) {
        this.eventStartDate = eventStartDate;
        this.eventEndDate = eventEndDate;
        this.paymentStatus = paymentStatus;
        this.requiresExtension = requiresExtension;
    }

    public String paymentDetails() {
        return "The event cost was " + eventCost + " and the payment status is " + paymentStatus +
                ". The Customer requires an extension?: " + requiresExtension + ".";
    }

    @Override
    public String toString() {
        String eventDetails = "";
        eventDetails += "Event Start Date: " + eventStartDate + "\n";
        eventDetails += "Event End Date: " + eventEndDate + "\n";
        eventDetails += "Payment Details: " + paymentDetails() + "\n";

        return eventDetails;
    }
}
