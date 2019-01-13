package com.example.demo.model;

public class HighSchool implements University {
    @Override
    public String printUniversityInfo() {
        return "This is an info about High School";
    }
}
