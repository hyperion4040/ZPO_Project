package com.example.demo;

import com.example.demo.model.HighSchool;
import com.example.demo.model.University;
import com.example.demo.model.UniversityOfTechnology;

public class UniversityFactory {


    public University getInfo(String universityType) {
        if (universityType.equals("UT")) {
            return new UniversityOfTechnology();
        } else if (universityType.equals("HS")) {
            return new HighSchool();
        } else {
            return null;
        }
    }


}
