package com.chgrivas.kata.playground.racingcar.after.tirepressuremonitoringsystem;

public class PressureThresholdEvaluator implements ThresholdEvaluator {

  private static final double LOW_PRESSURE_THRESHOLD = 17;
  private static final double HIGH_PRESSURE_THRESHOLD = 21;

  @Override
  public boolean isOutOfThresholds(double psiPressureValue) {
    return psiPressureValue < LOW_PRESSURE_THRESHOLD || HIGH_PRESSURE_THRESHOLD < psiPressureValue;
  }
}
