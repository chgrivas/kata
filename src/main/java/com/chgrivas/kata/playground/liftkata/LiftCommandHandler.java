package com.chgrivas.kata.playground.liftkata;

public interface LiftCommandHandler {
  void execute(Lift lift);
  void schedule(Command command);
}
