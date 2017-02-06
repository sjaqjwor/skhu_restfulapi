package com.skhu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by seungki on 2017-02-04.
 */
@RestController
public class TestController {
    @Autowired
    StudentRepository Student;
    @RequestMapping("/")
    public @ResponseBody List<Student> test(){
        return Student.findAll();
    }
}
