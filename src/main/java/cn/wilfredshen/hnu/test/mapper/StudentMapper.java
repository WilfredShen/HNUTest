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

    /**
     * 安全添加一条记录：<br/>
     * 1. 如果主键重复，则添加失败，返回 false<br/>
     * 2. 如果主键没有重复，则添加记录，返回 true
     *
     * @param student 待添加记录
     * @return 添加成功则返回 true，否则返回 false
     * @throws Exception 添加操作异常
     */
    boolean insert(Student student) throws Exception;

    /**
     * 安全添加一条记录：<br/>
     * 1. id 字段使用自动生成的 id<br/>
     * 2. 如果主键重复，则添加失败，返回 false<br/>
     * 3. 如果主键没有重复，则添加记录，返回 true
     *
     * @param student 待添加记录
     * @return 添加成功则返回 true，否则返回 false
     * @throws Exception 添加操作异常
     */
    boolean insertWithoutId(Student student) throws Exception;

    /**
     * 删除一条记录，其 id 字段值为 id
     *
     * @param id 待删除记录的 id 字段值
     * @return 删除成功则返回 true，否则返回 false
     * @throws Exception 删除操作异常
     */
    boolean deleteById(Integer id) throws Exception;

    /**
     * 更新一条记录，其 id 字段值为 student.id
     *
     * @param student 更新后的记录值
     * @return 更新成功则返回 true，否则返回 false
     * @throws Exception 更新操作异常
     */
    boolean updateById(Student student) throws Exception;

    /**
     * 查找并返回 stu_no 字段值为 stuNo 的记录
     *
     * @param stuNo stu_no 字段值
     * @return 所有满足条件的记录
     * @throws Exception 查找操作异常
     */
    Student findByStuNo(String stuNo) throws Exception;
}
