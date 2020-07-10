package cn.wilfredshen.hnu.test.service.impl;

import cn.wilfredshen.hnu.test.entity.Student;
import cn.wilfredshen.hnu.test.mapper.StudentMapper;
import cn.wilfredshen.hnu.test.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author WilfredShen
 */
@Service("StudentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public Student getByStuNo(String stuNo) {
        try {
            return studentMapper.findByStuNo(stuNo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
