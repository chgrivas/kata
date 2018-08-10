Design smells

- Sensor instantiation using **new**
- public fields that could be private (alarm could be immutable)

What about SOLID priciples?

- OCP violated as a new sensor would mean changes in the alarm to use it
- DIP violated as there seems to be dependency between concrete classes and no abstraction in between
