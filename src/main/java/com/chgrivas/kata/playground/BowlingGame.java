package com.chgrivas.kata.playground;

public class BowlingGame {

  private int score;

  public BowlingGame() {
    this.score = 0;
  }

  public void roll(int...rolledPinsArray) {
    for (int rolledPins : rolledPinsArray) {
      score += rolledPins;
    }
  }

  public int calculateScore() {
    return score;
  }
}
