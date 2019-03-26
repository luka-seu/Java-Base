package cn.plasticlove.commons;

import java.io.Serializable;

/**
 * @author luka-seu
 * @description 通用响应返回
 * @create 2019/3/22-19:28
 */
public class ServerResponse<T> implements Serializable {
    private T data;
    private String msg;
    private int status;

    public T getData() {
        return data;
    }

    public String getMsg() {
        return msg;
    }

    public int getStatus() {
        return status;
    }

    private ServerResponse(int status) {
        this.status = status;
    }

    private ServerResponse(String msg,T data) {
        this.data = data;
        this.msg = msg;
    }

    private ServerResponse(int status,String msg,T data) {
        this.data = data;
        this.msg = msg;
        this.status = status;
    }

    private ServerResponse(int status,String msg) {
        this.msg = msg;
        this.status = status;
    }

    private ServerResponse(int status,T data) {
        this.data = data;
        this.status = status;
    }


    //成功的返回
    public static ServerResponse createResponseBySuccessCode(){
        return new ServerResponse(ResponseCode.SUCCESS.getCode());
    }

    public static ServerResponse createResponseBySuccessMsg(String msg){
        return new ServerResponse(ResponseCode.SUCCESS.getCode(),msg);
    }

    public static <T> ServerResponse createResponseBySuccessData(T data){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(),data);
    }

    public static <T> ServerResponse createResponseBySuccessMsgAndData(String msg,T data){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(),msg,data);
    }




    //错误的返回
    public static ServerResponse createResponseByErrorCode(){
        return new ServerResponse(ResponseCode.ERROR.getCode());
    }

    public static ServerResponse createResponseByErrorMsg(String msg){
        return new ServerResponse(ResponseCode.ERROR.getCode(),msg);
    }

    public static <T> ServerResponse createResponseByErrorData(T data){
        return new ServerResponse<T>(ResponseCode.ERROR.getCode(),data);
    }

    public static <T> ServerResponse createResponseByErrorMsgAndData(String msg,T data){
        return new ServerResponse(ResponseCode.ERROR.getCode(),msg,data);
    }


    @Override
    public String toString() {
        return "ServerResponse{" +
                "data=" + data +
                ", msg='" + msg + '\'' +
                ", status=" + status +
                '}';
    }
}
