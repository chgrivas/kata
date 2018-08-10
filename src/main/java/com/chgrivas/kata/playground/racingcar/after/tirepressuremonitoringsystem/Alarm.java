package com.chgrivas.kata.playground.racingcar.after.tirepressuremonitoringsystem;

public class Alarm
{
  private final double LowPressureThreshold = 17;
  private final double HighPressureThreshold = 21;

  private Sensor sensor = new PressureSensor();

  private boolean alarmOn = false;

  public void check()
  {
    double psiPressureValue = sensor.popNextPressurePsiValue();

    if (psiPressureValue < LowPressureThreshold || HighPressureThreshold < psiPressureValue)
    {
      alarmOn = true;
    }
  }

  public boolean isAlarmOn()
  {
    return alarmOn;
  }
}
