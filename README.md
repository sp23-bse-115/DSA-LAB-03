# SDA-LAB-03
<h1>  Code Breakdown  </h1>
 Subject Class 
<li>Maintains a list of observers that are interested in its state changes</li>
<li>Has a state variable representing some data</li>

<li>Provides methods to

Get and set state (getState(), setState(int state))

Attach observers (attach(Observer observer))

Notify all observers whenever the state changes (notifyAllObservers()) </li>


<h1> Abstract Class </h1>
<li>Defines a blueprint for all observers</li>
<li>Each observer must implement the update() method</li>
<li></li>Each observer has a reference to the Subject it is observing</li>
