package com.chgrivas.kata.playground.liftkata;

public class Building {
  private int minFloor;
  private int maxFloor;

  public Building(int minFloor, int maxFloor) {
    this.minFloor = minFloor;
    this.maxFloor = maxFloor;
  }

  public int getMinFloor() {
    return minFloor;
  }

  public int getMaxFloor() {
    return maxFloor;
  }
}
