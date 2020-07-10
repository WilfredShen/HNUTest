package cn.wilfredshen.hnu.test.mapper;

import cn.wilfredshen.hnu.test.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author WilfredShen
 */
@Mapper
@Repository
public interface StudentMapper {
    Student findByStuNo(String stuNo) throws Exception;
}
