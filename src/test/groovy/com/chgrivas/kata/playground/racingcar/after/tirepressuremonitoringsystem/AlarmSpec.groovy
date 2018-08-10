package com.chgrivas.kata.playground.racingcar.after.tirepressuremonitoringsystem

import spock.lang.Specification


class AlarmSpec extends Specification {

  Alarm alarm

  def "alarm is false initially without checking it"() {
    when:
      alarm = new Alarm()
    then:
      !alarm.alarmOn
  }
}
