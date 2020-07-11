package cn.wilfredshen.hnu.test.controller;

import cn.wilfredshen.hnu.test.entity.Score;
import cn.wilfredshen.hnu.test.result.Result;
import cn.wilfredshen.hnu.test.result.ResultFactory;
import cn.wilfredshen.hnu.test.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("/api/add/score")
    @ResponseBody
    public Result addScore(@RequestBody Score score) {
        boolean success = scoreService.insertWithoutScoreId(score);
        if (success) {
            return ResultFactory.buildSuccessResult();
        } else {
            return ResultFactory.buildFailResult("Insert failed.");
        }
    }

    @PostMapping("/api/del/score")
    @ResponseBody
    public Result deleteScore(@RequestBody Integer scoreId) {
        boolean success = scoreService.deleteByScoreId(scoreId);
        if (success) {
            return ResultFactory.buildSuccessResult();
        } else {
            return ResultFactory.buildFailResult("Delete failed.");
        }
    }

    @PostMapping("/api/upd/score")
    @ResponseBody
    public Result update(@RequestBody Score score) {
        boolean success = scoreService.updateByScoreId(score);
        if (success) {
            return ResultFactory.buildSuccessResult();
        } else {
            return ResultFactory.buildFailResult("Update failed.");
        }
    }

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
