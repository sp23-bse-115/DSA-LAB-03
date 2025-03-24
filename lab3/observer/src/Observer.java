// public class Observer {
//     public abstract class Observer {
//         protected Subject subject;
//         public abstract void update();
//      }

//      public class ObserverPatternDemo {
//         public static void main(String[] args) {
//             Subject subject = new Subject();
    
//             HexaObserver hexObserver = new HexaObserver(subject);
//             OctalObserver octObserver = new OctalObserver(subject);
//             BinaryObserver binObserver = new BinaryObserver(subject);
    
//             System.out.println("First state change: 15");
//             subject.setState(15);
    
//             // Detaching an observer (e.g., BinaryObserver)
//             subject.detach(binObserver);
//             System.out.println("\nBinaryObserver detached.\n");
    
//             System.out.println("Second state change: 10");
//             subject.setState(10);  // Now, BinaryObserver should NOT be notified
    
//             // Further state changes
//             System.out.println("\nDetaching OctalObserver...");
//             subject.detach(octObserver);
            
//             System.out.println("Third state change: 25");
//             subject.setState(25);  // Now, only HexaObserver should be notified
//         }
//     }
// }
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