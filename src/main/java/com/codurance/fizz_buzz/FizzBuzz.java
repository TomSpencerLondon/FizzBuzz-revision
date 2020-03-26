package com.codurance.fizz_buzz;

public class FizzBuzz {
  public static void main (String[] Args){

  }
  public String play(int number) {
    String result = String.valueOf(number);

    for (Value value : Value.values()){
      if (number % value.number == 0){
        result = value.response;
      }
    }

    return result;
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
