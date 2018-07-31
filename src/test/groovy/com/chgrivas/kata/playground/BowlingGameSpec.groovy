package com.chgrivas.kata.playground

import spock.lang.Specification


class BowlingGameSpec extends Specification {

  BowlingGame game

  def setup() {
    game = new BowlingGame()
  }

  def "rolling 20 zeros will result to zero score"() {
    when:
      game.roll(0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0)
    then:
      game.calculateScore() == 0
  }

  def "rolling 20 ones will result to 20 score"() {
    when:
      game.roll(1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1)
    then:
      game.calculateScore() == 20
  }

  def "rolling 2 threes and all other 0 result to 9"() {
    when:
      game.roll(3,3, 3,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0)
    then:
      game.calculateScore() == 9
  }
}
