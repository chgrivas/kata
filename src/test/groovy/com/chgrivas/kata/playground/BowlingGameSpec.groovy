package com.chgrivas.kata.playground

import spock.lang.Specification


class BowlingGameSpec extends Specification {

  BowlingGame game

  def setup() {
    game = new BowlingGame()
  }

  def "rolling 20 zeros will result to zero score"() {
    when:
      roll(20, 0)
    then:
      0 == game.calculateScore()
  }

  def "rolling 20 ones will result to 20 score"() {
    when:
      roll(20, 1)
    then:
      20 == game.calculateScore()
  }

  private void roll(int times, int rolledPins) {
    for (int i = 0; i < times; i++) {
      game.roll(rolledPins)
    }
  }
}
