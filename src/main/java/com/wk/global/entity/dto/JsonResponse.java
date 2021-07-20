package com.wk.global.entity.dto;

import com.wk.global.enums.ResultCode;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JsonResponse {

    private ResultCode code;

    private String message;

    private Object data;


    /**
     * @description 默认状态为OK
     * @author 李宏鑫
     * @param
     * @return
     * @updateTime 2020/11/28 17:48
     * @throws
     */
    public JsonResponse() {
        this.code = ResultCode.OK;
    }


    /**
     * @description 设置状态码，流式
     * @author 李宏鑫
     * @param
     * @return
     * @updateTime 2020/11/28 17:48
     * @throws
     */
    public JsonResponse code(ResultCode code) {
        this.code = code;
        return this;
    }



    /**
     * @description 设置状态码
     * @author 李宏鑫
     * @param
     * @return
     * @updateTime 2020/11/28 17:49
     * @throws
     */
    public JsonResponse badRequest() {
        this.code = ResultCode.BAD_REQUEST;
        return this;
    }

    public JsonResponse unauthorized() {
        this.code = ResultCode.UNAUTHORIZED;
        return this;
    }

    public JsonResponse forbidden() {
        this.code = ResultCode.FORBIDDEN;
        return this;
    }

    public JsonResponse notFound() {
        this.code = ResultCode.NOT_FOUND;
        return this;
    }

    public JsonResponse gone() {
        this.code = ResultCode.GONE;
        return this;
    }

    public JsonResponse unprocessableEntity() {
        this.code = ResultCode.UNPROCESSABLE_ENTITY;
        return this;
    }

    public JsonResponse tooManyRequest() {
        this.code = ResultCode.TOO_MANY_REQUEST;
        return this;
    }

    public JsonResponse internalServerError() {
        this.code = ResultCode.INTTERNAL_SERVER_ERROR;
        return this;
    }


    /**
     * @description 设置信息，流式
     * @author 李宏鑫
     * @param message 信息
     * @return
     * @updateTime 2020/11/28 17:49
     * @throws
     */
    public JsonResponse message(String message) {
        this.message = message;
        return this;
    }


    public JsonResponse data(Object data) {
        this.data = data;
        return this;
    }
}
