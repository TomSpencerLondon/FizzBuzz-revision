package com.codurance.fizz_buzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static junit.framework.Assert.assertEquals;

public class FizzBuzzShould {
  @Test
  void returns_the_number_if_no_rule_applies() {
    // Arrange
    int input = 1;
    String result = "1";

    // Act
    String output = new FizzBuzz().play(input);

    // Assert
    assertEquals(result, output);
  }

  @ParameterizedTest
  @CsvSource(value = {
          "3, Fizz",
          "6, Fizz",
          "9, Fizz"
  })
  void returns_fizz_if_number_is_divisible_by_three(int input, String expected) {
    // Arrange

    // Act
    String output = new FizzBuzz().play(input);

    // Assert
    assertEquals(expected, output);
  }
}
