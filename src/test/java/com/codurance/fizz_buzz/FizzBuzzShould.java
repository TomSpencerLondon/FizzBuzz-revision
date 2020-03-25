package com.codurance.fizz_buzz;

import org.junit.jupiter.api.Test;

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
}
