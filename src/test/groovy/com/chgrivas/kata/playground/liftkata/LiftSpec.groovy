package com.chgrivas.kata.playground.liftkata

import spock.lang.Specification


class LiftSpec extends Specification {

  Building building
  LiftCommandHandler commandHandler
  LiftCommandHandler mockCommandHandler = Mock(LiftCommandHandler)

  def setup() {
    mockCommandHandler = Mock(LiftCommandHandler)
    commandHandler = new GreedyLiftCommandHandler()
    building = new Building(-2, 6)
  }

  def "A turned off lift can not operate"() {
    given:
      Lift lift = new Lift(building, mockCommandHandler)
    and:
      lift.turnOff()
    when:
      lift.operate()
    then:
      0 * mockCommandHandler.execute(lift)
  }

  def "A turned on lift can operate"() {
    given:
      Lift lift = new Lift(building, mockCommandHandler)
    and:
      lift.turnOn()
    when:
      lift.operate()
    then:
      1 * mockCommandHandler.execute(lift)
  }

  def "A lift is always installed on the ground floor"() {
    when:
      Lift lift = new Lift(building, commandHandler)
    then:
      0 == lift.getCurrentFloor();
  }

  def "lift delivers to requested floor in a greedy way"() {
    given:
      Lift lift = new Lift(building, commandHandler)
    and:
      lift.turnOn()
    and:
      lift.go(3)
      lift.go(4)
    when:
      lift.operate()
    then:
      lift.getCurrentFloor() == 3
    when:
      lift.operate()
    then:
      lift.getCurrentFloor() == 4
  }



}
