package com.khaidevcode.exercise;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import javax.swing.*;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class Exercise1Test {

    private final Exercise1 underTest = new Exercise1();

    @ParameterizedTest
    @CsvSource({
            "90, A",
            "91, A",
            "100, A",
            "80, B",
            "81, B",
            "89, B",
            "70, C",
            "71, C",
            "79, C",
            "60, D",
            "61, D",
            "69, D",
            "50, E",
            "51, E",
            "59, E",
            "49, F",
            "0, F",
            "1, F"
    })
    void canGetTheCorrectGrade(int grade, String expected) {
        //given
        var actual = underTest.getGrade(grade);
        //then
        assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({
            "-1",
            "101",
            "105",
            "-101"
    })
    void willThrowWhenInvalidGrade(int grade) {
        assertThatThrownBy(() -> underTest.getGrade(grade))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Score must be between 0 and 100");

    }

    @ParameterizedTest
    @CsvSource({
            "Aurelio, 5",
            "Isabella, 4",
            "Ng, 0",
            "Mary-Anne, 3",
            "Élodie, 3"

    })
    void canCountVowels(String name, int expectedVowels) {
        //given
        var actual = underTest.countVowels(name);

        //then
        assertThat(actual).isEqualTo(expectedVowels);
    }

    @Test
    void canCountVowelsIfNameIsNull() {
        String name = null;
        //given
        var actual = underTest.countVowels(name);

        var expectedVowels = 0;
        //then
        assertThat(actual).isEqualTo(expectedVowels);
    }

    @ParameterizedTest
    @CsvSource({
            "S123, false",      // Too few digits
            "S12345, false",    // Too many digits
            "A1234, false",     // Incorrect prefix
            "S123A, false",     // Contains a letter instead of a digit
            "S 1234, false",    // Contains a space
            "s1234, false",     // Lowercase 's'
            "'', false",           // Empty string
            "S1234, true"
    })
    void canCheckValidStudentId(String studentID, boolean expected) {
        //given
        var actual = underTest.isValidStudentId(studentID);
        //when
        assertThat(actual).isEqualTo(expected);
        //then
    }


    @Test
    void canCheckIfStudentIdNull() {
        String studentId = null;

        var actual = underTest.isValidStudentId(studentId);

        boolean expected = false;

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canCalculateAverage() {
        //given
        var scores = List.of(1,2,3,4,5);
        //when
        double actual = underTest.calculateAverage(scores);
        //then
        int expected = 3;

        assertThat(actual).isEqualTo(expected);
    }


    @Test
    void canCalculateAverageWhenScoreIsNull() {
        //given
        List<Integer> scores = null;
        //when
        double actual = underTest.calculateAverage(scores);
        //then
        double expected = 0.0;

        assertThat(actual).isEqualTo(expected);
    }


    @Test
    void canCalculateAverageWhenScoreIsEmpty() {
        //given
        List<Integer> scores = List.of();
        //when
        double actual = underTest.calculateAverage(scores);
        //then
        double expected = 0.0;

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void generateUsername() {
        //given
        //when
        //then
    }

    @Test
    void canGetTopStudents() {
        //given
        var students = List.of(
                new Student("Alex", 10),
                new Student("Jamila", 80),
                new Student("Anna", 7),
                new Student("George", 18),
                new Student("Sally", 54)
        );

        var threshold = 50;
        //when
        var actual =  underTest.getTopStudents(students, threshold);

        //then
        var expected = List.of(
                new Student("Jamila", 80),
                new Student("Sally", 54)

                );
        assertThat(actual).isEqualTo(expected);

    }

    @Test
    void willReturnEmptyListWhenListOfStudentAreNull() {
        //given
        List<Student> students = null;
        var threshold = 50;
        //when
        var actual =  underTest.getTopStudents(students, threshold);

        //then
        var expected = List.of();
        assertThat(actual).isEqualTo(expected);

    }

    @Test
    void hasDuplicateNames() {
        //given
        //when
        //then
    }

    @Test
    void reverseCourses() {
        //given
        //when
        //then
    }

    @Test
    void hasPassed() {
        //given
        //when
        //then
    }

    @Test
    void assignBadge() {
        //given
        //when
        //then
    }
}