package cn.plasticlove.commons;

import java.io.Serializable;

/**
 * The type Server response.
 *
 * @param <T> the type parameter
 * @author luka -seu
 * @description 通用响应返回
 * @create 2019 /3/22-19:28
 */
public class ServerResponse<T> implements Serializable {
    private T data;
    private String msg;
    private int status;

    /**
     * Gets data.
     *
     * @return the data
     */
    public T getData() {
        return data;
    }

    /**
     * Gets msg.
     *
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * Gets status.
     *
     * @return the status
     */
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


    /**
     * Create response by success code server response.
     *
     * @return the server response
     */
//成功的返回
    public static ServerResponse createResponseBySuccessCode(){
        return new ServerResponse(ResponseCode.SUCCESS.getCode());
    }

    /**
     * Create response by success msg server response.
     *
     * @param msg the msg
     * @return the server response
     */
    public static ServerResponse createResponseBySuccessMsg(String msg){
        return new ServerResponse(ResponseCode.SUCCESS.getCode(),msg);
    }

    /**
     * Create response by success data server response.
     *
     * @param <T>  the type parameter
     * @param data the data
     * @return the server response
     */
    public static <T> ServerResponse createResponseBySuccessData(T data){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(),data);
    }

    /**
     * Create response by success msg and data server response.
     *
     * @param <T>  the type parameter
     * @param msg  the msg
     * @param data the data
     * @return the server response
     */
    public static <T> ServerResponse createResponseBySuccessMsgAndData(String msg,T data){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(),msg,data);
    }


    /**
     * Create response by error code server response.
     *
     * @return the server response
     */
//错误的返回
    public static ServerResponse createResponseByErrorCode(){
        return new ServerResponse(ResponseCode.ERROR.getCode());
    }

    /**
     * Create response by error msg server response.
     *
     * @param msg the msg
     * @return the server response
     */
    public static ServerResponse createResponseByErrorMsg(String msg){
        return new ServerResponse(ResponseCode.ERROR.getCode(),msg);
    }

    /**
     * Create response by error data server response.
     *
     * @param <T>  the type parameter
     * @param data the data
     * @return the server response
     */
    public static <T> ServerResponse createResponseByErrorData(T data){
        return new ServerResponse<T>(ResponseCode.ERROR.getCode(),data);
    }

    /**
     * Create response by error msg and data server response.
     *
     * @param <T>  the type parameter
     * @param msg  the msg
     * @param data the data
     * @return the server response
     */
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
