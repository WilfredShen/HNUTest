package cn.wilfredshen.hnu.test.service.impl;

import cn.wilfredshen.hnu.test.entity.Score;
import cn.wilfredshen.hnu.test.mapper.ScoreMapper;
import cn.wilfredshen.hnu.test.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author WilfredShen
 */
@Service("ScoreService")
public class ScoreServiceImpl implements ScoreService {

    @Autowired
    ScoreMapper scoreMapper;

    /**
     * 安全添加一条记录：<br/>
     * 1. 如果主键重复，则添加失败，返回 false<br/>
     * 2. 如果主键没有重复，则添加记录，返回 true
     *
     * @param score 待添加记录
     * @return 添加成功则返回 true，否则返回 false
     */
    @Override
    public boolean insert(Score score){
        try {
            return scoreMapper.insert(score);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 添加一条记录，score_id 字段使用自动生成的 scoreId
     *
     * @param score 待添加记录
     * @return 添加成功则返回 true，否则返回 false
     */
    @Override
    public boolean insertWithoutScoreId(Score score) {
        try {
            return scoreMapper.insertWithoutScoreId(score);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 删除一条记录，其 score_id 字段值为 scoreId
     *
     * @param scoreId 待删除记录的 score_id 字段值
     * @return 删除成功则返回 true，否则返回 false
     */
    @Override
    public boolean deleteByScoreId(Integer scoreId) {
        try {
            return scoreMapper.deleteByScoreId(scoreId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 更新一条记录，其 score_id 字段值为 score.scoreId
     *
     * @param score 更新后的记录值
     * @return 更新成功则返回 true，否则返回 false
     */
    @Override
    public boolean updateByScoreId(Score score) {
        try {
            return scoreMapper.updateByScoreId(score);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 查询是否存在 score_id 字段值为 scoreId 的记录
     *
     * @param scoreId score_id 字段值
     * @return 若存在则返回 true，否则返回 false
     */
    @Override
    public boolean exists(Integer scoreId) {
        try {
            return scoreMapper.exists(scoreId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 查找并返回所有 stu_no 字段值为 stuNo 的记录
     *
     * @param stuNo stu_no 字段值
     * @return 所有满足条件的记录
     */
    @Override
    public List<Score> findByStuNo(String stuNo) {
        try {
            return scoreMapper.findByStuNo(stuNo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
