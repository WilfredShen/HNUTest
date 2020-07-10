package cn.wilfredshen.hnu.test.mapper;

import cn.wilfredshen.hnu.test.entity.Score;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author WilfredShen
 */
@Mapper
@Repository
public interface ScoreMapper {
    List<Score> findScoreByStuNo(String stuNo) throws Exception;
}
