package cn.wilfredshen.hnu.test.service;

import cn.wilfredshen.hnu.test.entity.Score;

import java.util.List;

/**
 * @author WilfredShen
 */
public interface ScoreService {

    List<Score> findByStuNo(String stuNo);
}
