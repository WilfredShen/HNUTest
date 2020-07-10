package cn.wilfredshen.hnu.test.result;

/**
 * @author WilfredShen
 */
public enum ResultCodeEnum {
    /**
     * 操作成功
     */
    SUCCESS(200),
    /**
     * 操作失败
     */
    FAIL(400),
    /**
     * 请求的资源不存在
     */
    NOT_FOUND(404),
    /**
     * 服务器错误
     */
    INTERNAL_SERVER_ERROR(500);

    public int code;

    ResultCodeEnum(int code) {
        this.code = code;
    }
}
