public class EventManager {
    package observer.eventsmanagement;

import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private List<SMSSupportListener> listeners = new ArrayList<>();
    private String message;

    public void attach(SMSSupportListener listener) {
        listeners.add(listener);
    }

    public void detach(SMSSupportListener listener) {
        listeners.remove(listener);
    }

    public void setMessage(String message) {
        this.message = message;
        notifyListeners();
    }

    private void notifyListeners() {
        for (SMSSupportListener listener : listeners) {
            listener.update(message);
        }
    }
}


}
