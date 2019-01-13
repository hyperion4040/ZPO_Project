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



    @GetMapping("/hello")
    public String getText() {
        return "cos";
    }

    @GetMapping("/**")
    public String getReg(HttpServletRequest request) {

        String query = request.getRequestURI().split("/")[1];
      final Map<String, String> map = Splitter.on('&').trimResults().withKeyValueSeparator("=").split(query);

//        Map<String,String> mapToCompare = Map.of("ciekawe","1","cios","2","cos","3");

//        boolean t =  mapToCompare.entrySet().containsAll(map.entrySet());
        Expression isHighSchool = InterpreterDemo.isHighSchool();
        for (String s : map.keySet()) {
            return String.valueOf(isHighSchool.interpret(s));
        }
            return map.keySet().toString();
//        return String.valueOf(t);
//        return map.entrySet().toString();
//        return new UniversityMaker().printUniversityOfTechnologyInfo();
    }

}
