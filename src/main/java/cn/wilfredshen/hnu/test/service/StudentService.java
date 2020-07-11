package cn.wilfredshen.hnu.test.service;

import cn.wilfredshen.hnu.test.entity.Student;

/**
 * @author WilfredShen
 */
public interface StudentService {

    /**
     * 安全添加一条记录：<br/>
     * 1. 如果主键重复，则添加失败，返回 false<br/>
     * 2. 如果主键没有重复，则添加记录，返回 true
     *
     * @param student 待添加记录
     * @return 添加成功则返回 true，否则返回 false
     */
    boolean insert(Student student);

    /**
     * 安全添加一条记录：<br/>
     * 1. id 字段使用自动生成的 id<br/>
     * 2. 如果主键重复，则添加失败，返回 false<br/>
     * 3. 如果主键没有重复，则添加记录，返回 true
     *
     * @param student 待添加记录
     * @return 添加成功则返回 true，否则返回 false
     */
    boolean insertWithoutId(Student student);

    /**
     * 删除一条记录，其 id 字段值为 id
     *
     * @param id 待删除记录的 id 字段值
     * @return 删除成功则返回 true，否则返回 false
     */
    boolean deleteById(Integer id);

    /**
     * 更新一条记录，其 id 字段值为 student.id
     *
     * @param student 更新后的记录值
     * @return 更新成功则返回 true，否则返回 false
     */
    boolean updateById(Student student);

    /**
     * 查找并返回 stu_no 字段值为 stuNo 的记录
     *
     * @param stuNo stu_no 字段值
     * @return 所有满足条件的记录
     */
    Student getByStuNo(String stuNo);
}
