package com.codurance.fizz_buzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static junit.framework.Assert.assertEquals;

public class FizzBuzzShould {
  @ParameterizedTest
  @CsvSource({
          "1, 1",
          "3, Fizz",
          "6, Fizz",
          "9, Fizz",
          "5, Buzz",
          "10, Buzz",
  })
  void play_returns_correct_result(int input, String expected) {
    // Arrange

    // Act
    String output = new FizzBuzz().play(input);

    // Assert
    assertEquals(expected, output);
  }

}
