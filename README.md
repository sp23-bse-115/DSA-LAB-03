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


                  <h2> Abstract Class </h2>
<li>Defines a blueprint for all observers</li>
<li>Each observer must implement the update() method</li>
<li>Each observer has a reference to the Subject it is observing</li>

