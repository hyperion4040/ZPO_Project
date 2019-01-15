package com.example.demo;

import com.example.demo.interpreter.Expression;
import com.example.demo.interpreter.InterpreterDemo;
import com.google.common.base.Splitter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
public class GreetingController {


    private Expression isHighSchool;
    private Expression isUniversityOfTechnology;
    private boolean isHS;
    private boolean isUT;

    @GetMapping("/{symbol:[a-zA-Z]*}")
    public String getSimple(HttpServletRequest request) {
        String query = request.getRequestURI().split("/")[1];
        isHighSchool = InterpreterDemo.isHighSchool();
        isUniversityOfTechnology = InterpreterDemo.isUniversityOfTechnology();
        isHS = isHighSchool.interpret(query);
        isUT = isUniversityOfTechnology.interpret(query);
        if (isHS) {
            return new UniversityMaker().printHighSchoolInfo();
        } else if (isUT) {
            if (query.contains("universityName")) {
                return new UniversityMaker().printUniversityOfTechnologyInfo();
            } else
                return null;
        } else
            return null;
    }


    //    @GetMapping("/{symbolicName:[a-zA-Z]*}={number:[0-9]*}")
    @GetMapping("/{pattern:[{symbol:[a-zA-Z]*}={symbolTwo:[0-9&]*}]*}")
    public String getReg(HttpServletRequest request) {

        String query = request.getRequestURI().split("/")[1];
        final Map<String, String> map = Splitter.on('&').trimResults().withKeyValueSeparator("=").split(query);


        isHighSchool = InterpreterDemo.isHighSchool();
        isUniversityOfTechnology = InterpreterDemo.isUniversityOfTechnology();
        isHS = false;
        isUT = false;
        for (String s : map.keySet()) {
            isHS = isHighSchool.interpret(s);
            isUT = isUniversityOfTechnology.interpret(s);
        }
        if (isHS) {
            return new UniversityMaker().printHighSchoolInfo();
        } else if (isUT) {
            if (map.containsKey("foundingYear")) {

                return new UniversityMaker().printUniversityOfTechnologyFoundingYear();
            } else
                return new UniversityMaker().printUniversityOfTechnologyInfo();
        } else
            return null;


    }

}
