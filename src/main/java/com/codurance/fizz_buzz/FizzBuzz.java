package com.codurance.fizz_buzz;

public class FizzBuzz {
  public String play(int number) {
    if(number % 3 == 0)
      return "Fizz";

    return String.valueOf(number);
  }
}
