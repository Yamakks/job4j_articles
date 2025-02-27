package ru.job4j.articles.kiss.fool;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoolTest {

    @Test
    void whenNumberIsMultipleOf3And5ThenReturnFizzBuzz() {
        assertEquals("FizzBuzz", Fool.systemAnswers(15));
        assertEquals("FizzBuzz", Fool.systemAnswers(30));
        assertEquals("FizzBuzz", Fool.systemAnswers(45));
    }

    @Test
    void whenNumberIsMultipleOf3ThenReturnFizz() {
        assertEquals("Fizz", Fool.systemAnswers(3));
        assertEquals("Fizz", Fool.systemAnswers(6));
        assertEquals("Fizz", Fool.systemAnswers(9));
    }

    @Test
    void whenNumberIsMultipleOf5ThenReturnBuzz() {
        assertEquals("Buzz", Fool.systemAnswers(5));
        assertEquals("Buzz", Fool.systemAnswers(10));
        assertEquals("Buzz", Fool.systemAnswers(20));
    }

    @Test
    void whenNumberIsNotMultipleOf3Or5ThenReturnNumber() {
        assertEquals("1", Fool.systemAnswers(1));
        assertEquals("2", Fool.systemAnswers(2));
        assertEquals("4", Fool.systemAnswers(4));
    }
}