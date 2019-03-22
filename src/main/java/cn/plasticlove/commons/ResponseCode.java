package cn.plasticlove.commons;

/**
 * @author luka-seu
 * @description 返回响应常量类
 * @create 2019/3/22-19:35
 */
public enum ResponseCode {
    //返回成功对应1
    SUCCESS(1,"success"),
    //返回失败对应0
    ERROR(0,"error");


    private final int code;
    private final String desc;

    ResponseCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
