package cn.wilfredshen.hnu.test.controller;

import cn.wilfredshen.hnu.test.entity.Student;
import cn.wilfredshen.hnu.test.result.Result;
import cn.wilfredshen.hnu.test.result.ResultFactory;
import cn.wilfredshen.hnu.test.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WilfredShen
 */
@RestController
@CrossOrigin
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/api/get/student")
    @ResponseBody
    public Result getStudent(String stuNo) {
        Student student = studentService.getByStuNo(stuNo);
        if (student != null) {
            return ResultFactory.buildSuccessResult(student);
        } else {
            return ResultFactory.buildFailResult("Query failed.");
        }
    }
}
