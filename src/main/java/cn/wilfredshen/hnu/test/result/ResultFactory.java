package cn.wilfredshen.hnu.test.result;

/**
 * @author WilfredShen
 */
public class ResultFactory {

    public static Result buildSuccessResult() {
        return new Result(ResultCodeEnum.SUCCESS, "success", null);
    }

    public static Result buildSuccessResult(Object data) {
        return new Result(ResultCodeEnum.SUCCESS, "success", data);
    }

    public static Result buildFailResult(ResultCodeEnum codeEnum, String message) {
        return new Result(codeEnum, message);
    }

    public static Result buildFailResult(String message) {
        return new Result(ResultCodeEnum.FAIL, message);
    }

    public static Result buildFailResult(ResultCodeEnum codeEnum, String message, Object data) {
        return new Result(codeEnum, message, data);
    }

    public static Result buildFailResult(String message, Object data) {
        return new Result(ResultCodeEnum.FAIL, message, data);
    }
}
