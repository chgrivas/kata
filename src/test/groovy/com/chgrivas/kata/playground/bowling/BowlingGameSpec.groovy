package com.chgrivas.kata.playground.bowling

import com.chgrivas.kata.playground.bowling.BowlingGame
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

  def "rolling a spare and a 3 and all other zero results to 16"() {
    when:
      game.roll(5,5, 3,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0)
    then:
      game.calculateScore() == 16
  }

  def "rolling a strike and then two threes results to 22"() {
    when:
      game.roll(10, 3,3, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0)
    then:
      game.calculateScore() == 22
  }

  def "Can score a perfect game"() {
    when:
      game.roll(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10)
    then:
      game.calculateScore() == 300
  }
}
