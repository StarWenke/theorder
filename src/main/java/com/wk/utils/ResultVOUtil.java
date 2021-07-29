package com.wk.utils;


import com.wk.global.entity.dto.JsonResponse;
import com.wk.global.enums.ResultCode;

public class ResultVOUtil {

    public static JsonResponse success(Object object){
        JsonResponse jsonResponse = new JsonResponse();
        jsonResponse.setData(object);
        jsonResponse.setCode(ResultCode.OK);
        jsonResponse.setMessage("成功");
        return jsonResponse;
    }

    public static JsonResponse success(){
        return success(null);
    }

    public static JsonResponse error (Integer code, String msg){
        JsonResponse jsonResponse = new JsonResponse();
        jsonResponse.setCode(ResultCode.OK);
        jsonResponse.setMessage(msg);
        return jsonResponse;
    }
}
