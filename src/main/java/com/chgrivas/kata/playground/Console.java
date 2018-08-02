package com.chgrivas.kata.playground;

import java.util.List;

public class Console {

  List<String> values;

  public Console(List<String> values) {
    this.values = values;
  }

  public void println(String s) {
    this.values.add(s);
  }
}
