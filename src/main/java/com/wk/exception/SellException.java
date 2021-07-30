package com.wk.exception;


import com.wk.enums.ResultEnum;

//用于订单取消操作中
public class SellException extends RuntimeException{

    private Integer code;

/*    public SellException (ResultEnum resultEnum){
//        super
/*/

    /*
    * 自定义SellException异常，当订单被取消时出现
    * */
    public SellException (ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code =resultEnum.getCode();
    }

    public SellException (Integer code, String message){
        super(message);
        this.code = code;
    }
}
