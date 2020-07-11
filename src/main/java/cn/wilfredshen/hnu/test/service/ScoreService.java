package cn.wilfredshen.hnu.test.service;

import cn.wilfredshen.hnu.test.entity.Score;

import java.util.List;

/**
 * @author WilfredShen
 */
public interface ScoreService {

    /**
     * 安全添加一条记录：<br/>
     * 1. 如果主键重复，则添加失败，返回 false<br/>
     * 2. 如果主键没有重复，则添加记录，返回 true
     *
     * @param score 待添加记录
     * @return 添加成功则返回 true，否则返回 false
     */
    boolean insert(Score score);

    /**
     * 添加一条记录，score_id 字段使用自动生成的 scoreId
     *
     * @param score 待添加记录
     * @return 添加成功则返回 true，否则返回 false
     */
    boolean insertWithoutScoreId(Score score);

    /**
     * 删除一条记录，其 score_id 字段值为 scoreId
     *
     * @param scoreId 待删除记录的 score_id 字段值
     * @return 删除成功则返回 true，否则返回 false
     */
    boolean deleteByScoreId(Integer scoreId);

    /**
     * 更新一条记录，其 score_id 字段值为 score.scoreId
     *
     * @param score 更新后的记录值
     * @return 更新成功则返回 true，否则返回 false
     */
    boolean updateByScoreId(Score score);

    /**
     * 查询是否存在 score_id 字段值为 scoreId 的记录
     *
     * @param scoreId 待查询记录的 score_id 字段值
     * @return 若存在则返回 true，否则返回 false
     */
    boolean exists(Integer scoreId);

    /**
     * 查找并返回所有 stu_no 字段值为 stuNo 的记录
     *
     * @param stuNo 待查询记录的 stu_no 字段值
     * @return 所有满足条件的记录
     */
    List<Score> findByStuNo(String stuNo);
}
