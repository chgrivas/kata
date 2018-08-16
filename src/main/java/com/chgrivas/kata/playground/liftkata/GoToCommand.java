package com.chgrivas.kata.playground.liftkata;

public class GoToCommand implements Command {

  private int floor;

  public GoToCommand(int floor) {
    this.floor = floor;
  }

  @Override
  public void execute(Lift lift) {
    lift.move(floor);
  }
}
