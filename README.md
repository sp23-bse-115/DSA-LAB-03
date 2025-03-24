
# SDA-LAB-03
                    <h2>  Code Breakdown  </h2>
 Subject Class 
<li>Maintains a list of observers that are interested in its state changes</li>
<li>Has a state variable representing some data</li>
<li>Provides methods to
Get and set state (getState(), setState(int state))
Attach observers (attach(Observer observer))
Notify all observers whenever the state changes (notifyAllObservers()) </li>


                  <h2> Abstract Class </h2>
<li>Defines a blueprint for all observers</li>
<li>Each observer must implement the update() method</li>
<li>Each observer has a reference to the Subject it is observing</li>


                <h2>Concrete Observers</h2>
<li>Each observer converts the state of the Subject into a different representation</li>
<li>BinaryObserver → Converts to Binary</li>
<li>OctalObserver → Converts to Octal</li>
<li>HexaObserver → Converts to Hexadecimal</li>
<li>Each observer registers itself with the subject in its constructor</li>


                  <h2> ObserverPatternDemo </h2>
<li>Creates a Subject instance</li>
<li>Attaches three observers (HexaObserver, OctalObserver, and BinaryObserver)</li>
<li>Updates the state of the Subject twice and observes the output.</li>

