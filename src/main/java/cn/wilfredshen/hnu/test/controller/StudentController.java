package cn.wilfredshen.hnu.test.controller;

import cn.wilfredshen.hnu.test.entity.Student;
import cn.wilfredshen.hnu.test.result.Result;
import cn.wilfredshen.hnu.test.result.ResultFactory;
import cn.wilfredshen.hnu.test.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("/api/add/student")
    @ResponseBody
    public Result addStudent(@RequestBody Student student) {
        boolean success = studentService.insertWithoutId(student);
        if (success) {
            return ResultFactory.buildSuccessResult();
        } else {
            return ResultFactory.buildFailResult("Insert failed.");
        }
    }

    @PostMapping("/api/del/student")
    @ResponseBody
    public Result deleteScore(@RequestBody Integer id) {
        boolean success = studentService.deleteById(id);
        if (success) {
            return ResultFactory.buildSuccessResult();
        } else {
            return ResultFactory.buildFailResult("Delete failed.");
        }
    }

    @PostMapping("/api/upd/student")
    @ResponseBody
    public Result update(@RequestBody Student student) {
        boolean success = studentService.updateById(student);
        if (success) {
            return ResultFactory.buildSuccessResult();
        } else {
            return ResultFactory.buildFailResult("Update failed.");
        }
    }

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
