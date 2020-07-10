package cn.wilfredshen.hnu.test.result;

/**
 * @author WilfredShen
 */
public class Result {
    private int code = 0;
    private String message = "";
    private Object data = null;

    public Result() {
    }

    public Result(ResultCodeEnum codeEnum, String message) {
        this.code = codeEnum.code;
        this.message = message;
    }

    public Result(ResultCodeEnum codeEnum, String message, Object data) {
            this.code = codeEnum.code;
        this.message = message;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
