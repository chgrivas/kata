package com.chgrivas.kata.playground.racingcar.after.tirepressuremonitoringsystem;

public interface ThresholdEvaluator {

  boolean shouldAlarmTurnOn(double psiPressureValue);
}
