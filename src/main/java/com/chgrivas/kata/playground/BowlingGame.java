package com.chgrivas.kata.playground;

public class BowlingGame {

  private int score;

  public BowlingGame() {
    this.score = 0;
  }

  public void roll(int rolledPins) {
    score += rolledPins;
  }

  public int calculateScore() {
    return score;
  }
}
