package com.wk.exception;


//用于订单取消操作中
public class SellException extends RuntimeException{

    private Integer code;

/*    public SellException (ResultEnum resultEnum){
//        super
/*/

    /*
    * 自定义SellException异常，当订单被取消时出现
    * */
    public SellException (Integer code, String message){
        super(message);
        this.code = code;
    }
}
