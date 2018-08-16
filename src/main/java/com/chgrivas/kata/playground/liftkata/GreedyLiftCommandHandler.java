package com.chgrivas.kata.playground.liftkata;

import java.util.LinkedList;
import java.util.Optional;
import java.util.PriorityQueue;
import java.util.Queue;

public class GreedyLiftCommandHandler implements LiftCommandHandler {

  Queue<Command> commandQueue;

  public GreedyLiftCommandHandler() {
    commandQueue = new LinkedList<>();
  }

  public GreedyLiftCommandHandler(Queue<Command> commandQueue) {
    this.commandQueue = commandQueue;
  }

  @Override
  public void execute(Lift lift) {
    Optional.ofNullable(commandQueue.poll()).ifPresent(l -> l.execute(lift));
  }

  @Override
  public void schedule(Command command) {
    commandQueue.add(command);
  }
}
