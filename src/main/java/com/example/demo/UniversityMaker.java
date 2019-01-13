package com.example.demo;

import com.example.demo.model.University;

public class UniversityMaker {

    private UniversityFactory universityFactory = new UniversityFactory();
    private University university;


    public UniversityMaker() {

    }

    public String printUniversityOfTechnologyInfo() {
        university = universityFactory.getInfo("UT");
        return university.printUniversityInfo();
    }

    public String printHighSchoolInfo() {
        university = universityFactory.getInfo("HC");
        return university.printUniversityInfo();
    }
}
