package com.wk.global.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ResultCode {
    OK("200"),
    BAD_REQUEST("400"),
    UNAUTHORIZED("401"),
    FORBIDDEN("403"),
    NOT_FOUND("404"),
    GONE("410"),
    UNPROCESSABLE_ENTITY("422"),
    TOO_MANY_REQUEST("429"),
    INTTERNAL_SERVER_ERROR("500");

    @JsonValue
    String code;

    ResultCode(String code) {
        this.code = code;
    }

}
