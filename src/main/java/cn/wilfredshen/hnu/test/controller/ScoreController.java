package cn.wilfredshen.hnu.test.controller;

import cn.wilfredshen.hnu.test.entity.Score;
import cn.wilfredshen.hnu.test.result.Result;
import cn.wilfredshen.hnu.test.result.ResultFactory;
import cn.wilfredshen.hnu.test.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author WilfredShen
 */
@RestController
@CrossOrigin
public class ScoreController {

    @Autowired
    ScoreService scoreService;

    @GetMapping("/api/get/score")
    @ResponseBody
    public Result getScore(String stuNo) {
        List<Score> scores = scoreService.findByStuNo(stuNo);
        if (scores != null) {
            return ResultFactory.buildSuccessResult(scores);
        } else {
            return ResultFactory.buildFailResult("Query failed.");
        }
    }
}
