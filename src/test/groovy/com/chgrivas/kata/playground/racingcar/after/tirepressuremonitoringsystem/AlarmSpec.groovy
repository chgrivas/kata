package com.chgrivas.kata.playground.racingcar.after.tirepressuremonitoringsystem

import spock.lang.Specification


class AlarmSpec extends Specification {

  Alarm alarm

  def "alarm is false initially without checking it"() {
    when:
      alarm = new Alarm(new PressureSensor(), new PressureThresholdEvaluator())
    then:
      !alarm.alarmOn
  }

  def "when a sensor returns value above the threshold the alarm is on"() {
    given:
      Sensor sensor = Mock(Sensor)
      ThresholdEvaluator thresholdEvaluator = Mock(ThresholdEvaluator)
      alarm = new Alarm(sensor, thresholdEvaluator)
    when:
      alarm.check()
    then:
      sensor.popNextPressurePsiValue() >> 100
      thresholdEvaluator.isOutOfThresholds(100) >> true
      alarm.isAlarmOn()
  }

  def "when a sensor returns value NOT above the threshold the alarm is off"() {
    given:
      Sensor sensor = Mock(Sensor)
      ThresholdEvaluator thresholdEvaluator = Mock(ThresholdEvaluator)
      alarm = new Alarm(sensor, thresholdEvaluator)
    when:
      alarm.check()
    then:
      sensor.popNextPressurePsiValue() >> 20
      thresholdEvaluator.isOutOfThresholds(20) >> false
      !alarm.isAlarmOn()
  }
}
