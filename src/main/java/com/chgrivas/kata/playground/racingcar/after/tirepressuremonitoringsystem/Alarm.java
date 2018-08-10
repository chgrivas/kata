package com.chgrivas.kata.playground.racingcar.after.tirepressuremonitoringsystem;

public class Alarm {

  private Sensor sensor;
  private ThresholdEvaluator thresholdEvaluator;
  private boolean alarmOn;

  public Alarm(Sensor sensor, ThresholdEvaluator thresholdEvaluator) {
    this.alarmOn = false;
    this.thresholdEvaluator = thresholdEvaluator;
    this.sensor = sensor;
  }

  public void check() {
    alarmOn = thresholdEvaluator.shouldAlarmTurnOn(sensor.popNextPressurePsiValue());
  }

  public boolean isAlarmOn() {
    return alarmOn;
  }
}
