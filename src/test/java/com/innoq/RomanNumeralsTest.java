package com.innoq;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsTest {

  @Test
  void toRoman() {
    assertThrows(IllegalArgumentException.class, () -> RomanNumerals.toRoman(0));
  }
}