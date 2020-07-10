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

    @Override
    public List<Score> queryAll(String stuNo) {
        try {
            return scoreMapper.findScoreByStuNo(stuNo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
