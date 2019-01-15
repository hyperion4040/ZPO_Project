package com.example.demo.model;

public class UniversityOfTechnology implements University {


    @Override
    public String printUniversityInfo() {
        return "This is the info about University of Technology";
    }

    @Override
    public String printFoundingYear() {
        return "1900";
    }
}
