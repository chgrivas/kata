Design smells

- Sensor instantiation using **new**
- public fields that could be private (alarm could be immutable)

What about SOLID priciples?

- SRP violated somehow as the alarm class checks the sensors threshold and also indicates if the alarm is in or off
- OCP violated as a new sensor would mean changes in the alarm to use it
- DIP violated as there seems to be dependency between concrete classes and no abstraction in between

Solution

- Use an abstraction to remove coupling of the alarm and the sensor
- Use a constructor to compose the alarm using any sensor derived implementation
- Separate concerns by letting alarm only indicating the tha alarm value and moving checking in another class
