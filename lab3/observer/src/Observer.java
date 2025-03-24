public class Observer {
    public abstract class Observer {
        protected Subject subject;
        public abstract void update();
     }

     public class ObserverPatternDemo {
        public static void main(String[] args) {
            Subject subject = new Subject();
    
            HexaObserver hexObserver = new HexaObserver(subject);
            OctalObserver octObserver = new OctalObserver(subject);
            BinaryObserver binObserver = new BinaryObserver(subject);
    
            System.out.println("First state change: 15");
            subject.setState(15);
    
            // Detaching an observer (e.g., BinaryObserver)
            subject.detach(binObserver);
            System.out.println("\nBinaryObserver detached.\n");
    
            System.out.println("Second state change: 10");
            subject.setState(10);  // Now, BinaryObserver should NOT be notified
    
            // Further state changes
            System.out.println("\nDetaching OctalObserver...");
            subject.detach(octObserver);
            
            System.out.println("Third state change: 25");
            subject.setState(25);  // Now, only HexaObserver should be notified
        }
    }
}
