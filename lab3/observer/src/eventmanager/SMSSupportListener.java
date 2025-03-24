public class SMSSupportListener {
    package observer.eventsmanagement;

public class SMSSupportListener {
    private String phoneNumber;

    public SMSSupportListener(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void update(String message) {
        if (message.length() > 160) {
            System.out.println("Warning: SMS exceeds 160 characters. Please shorten the message.");
        } else {
            sendSMS(phoneNumber, message);
        }
    }

    private void sendSMS(String phoneNumber, String message) {
        System.out.println("Sending SMS to " + phoneNumber + ": " + message);
    }
}


}
