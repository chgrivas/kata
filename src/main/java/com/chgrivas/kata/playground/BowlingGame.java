package com.chgrivas.kata.playground;

public class BowlingGame {

  private int[] rolledPinsArray;

  public BowlingGame() {
    this.rolledPinsArray = new int[21];
  }

  public void roll(int...rolledPinsArray) {
    this.rolledPinsArray = rolledPinsArray;
  }

  public int calculateScore() {
    int score = 0;
    int frameIndex = 0;
    for (int frame = 0; frame < 10; frame++) {
      if (rolledPinsArray[frameIndex] == 10) {
        score = score + 10 + rolledPinsArray[frameIndex + 1] + rolledPinsArray[frameIndex + 2];
        frameIndex++;
      } else if (rolledPinsArray[frameIndex] + rolledPinsArray[frameIndex + 1] == 10) {
        score = score + 10 + rolledPinsArray[frameIndex + 2];
        frameIndex += 2;
      } else {
        score = score + rolledPinsArray[frameIndex] + rolledPinsArray[frameIndex + 1];
        frameIndex += 2;
      }
    }
    return score;
  }
}
