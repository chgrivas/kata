package com.chgrivas.kata.playground.liftkata;

public class Lift {

  private final int minFloor;
  private final int maxFloor;

  private boolean isOn;
  private int currentFloor;
  private LiftCommandHandler commandHandler;

  public Lift(Building building, LiftCommandHandler commandHandler) {
    this.minFloor = building.getMinFloor();
    this.maxFloor = building.getMaxFloor();

    this.commandHandler = commandHandler;

    this.currentFloor = 0;
    this.isOn = false;
  }

  public void turnOn() {
    this.isOn = true;
  }

  public void turnOff() {
    isOn = false;
  }

  void operate() {
    if (isOn) {
      commandHandler.execute(this);
    }
  }

  public void go(int toFloor) {
    Command command = new GoToCommand(toFloor);
    commandHandler.schedule(command);
  }

  public void move(int floor) {
    this.currentFloor = floor;
  }

  public int getCurrentFloor() {
    return currentFloor;
  }
}
