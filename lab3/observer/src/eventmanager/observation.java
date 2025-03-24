public class observation {
    import observer.eventsmanagement.EventManager;
import observer.eventsmanagement.SMSSupportListener;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        EventManager eventManager = new EventManager();

        SMSSupportListener smsListener1 = new SMSSupportListener("+1234567890");
        SMSSupportListener smsListener2 = new SMSSupportListener("+0987654321");

        eventManager.attach(smsListener1);
        eventManager.attach(smsListener2);

        System.out.println("Sending short SMS...");
        eventManager.setMessage("Hello, this is a test message!");

        System.out.println("\nSending long SMS...");
        eventManager.setMessage("This is a very long SMS message that exceeds 160 characters. " +
                                "It should trigger a warning message instead of being sent as a normal SMS. " +
                                "Users need to shorten their text before sending.");
    }
}


}
