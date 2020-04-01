package com.codurance.fizz_buzz;

public class FizzBuzz {
  public String play(int number) {
    StringBuilder result = new StringBuilder();

    for (Value value : Value.values()){
      if (number % value.number == 0){
        result.append(value.response);
      }
    }

    for (Value value : Value.values()){
      if (String.valueOf(number).contains(String.valueOf(value.number))){
        result.append(value.response);
      }
    }

    if (result.length() == 0) {
      result.append(String.valueOf(number));
    }

    return result.toString();
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
