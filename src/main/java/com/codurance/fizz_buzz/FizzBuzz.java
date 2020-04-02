package com.codurance.fizz_buzz;

import java.util.Arrays;

public class FizzBuzz {
  public String play(int number) {
    StringBuilder result = new StringBuilder();

    Arrays.stream(Value.values())
            .filter(p -> isDivisibleByNumber(number, p))
            .forEach(p -> result.append(p.response));

    Arrays.stream(Value.values())
            .filter(p -> containsNumber(number, p))
            .forEach(p -> result.append(p.response));

    if (result.length() == 0) {
      result.append(String.valueOf(number));
    }

    return result.toString();
  }

  private boolean isDivisibleByNumber(int number, Value value) {
    return number % value.number == 0;
  }

  private boolean containsNumber(int number, Value value) {
    return String.valueOf(number).contains(String.valueOf(value.number));
  }

  private enum Value {
    THREE(3, "Fizz"),
    FIVE(5, "Buzz");

    public int number;
    public String response;

    Value(int number, String response) {
      this.number = number;
      this.response = response;
    }
  }
}
