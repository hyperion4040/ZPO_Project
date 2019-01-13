package com.example.demo;

import com.example.demo.model.University;
import com.example.demo.model.UniversityOfTechnology;

public class UniversityFactory {

    public University getInfo(String universityType){
        return new UniversityOfTechnology();
       /* if (universityType == "UT") {
            return new UniversityOfTechnology();
        } else if (universityType.equals("HS")) {
           return new HighSchool();
        }else
            return null;*/

    }

}
