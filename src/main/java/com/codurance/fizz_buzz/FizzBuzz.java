package com.codurance.fizz_buzz;

import java.util.Arrays;
import java.util.function.Predicate;

public class FizzBuzz {
  public String play(int number) {
    StringBuilder result = new StringBuilder();

    appendIf(p -> isDivisibleByNumber(number, p), result);
    appendIf(p -> containsNumber(number, p), result);

    if (result.length() == 0) {
      result.append(String.valueOf(number));
    }

    return result.toString();
  }

  private void appendIf(Predicate<? super Value> predicate, StringBuilder builder){
    Arrays.stream(Value.values())
            .filter(predicate)
            .forEach(p -> builder.append(p.response));
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
