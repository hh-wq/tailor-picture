package com.tailor.picturebackend.common;

import com.tailor.picturebackend.exception.ErrorCode;
import lombok.Data;

import java.io.Serializable;

@Data
public class BaseResponse<T> implements Serializable {
    private int code;
    private T date;
    private String message;

    public BaseResponse(int code,T date,String message){
        this.code=code;
        this.date=date;
        this.message=message;
    }

    public BaseResponse(int code, T date){
        this(code,date,"");
    }

    public BaseResponse(ErrorCode errorCode){
        this(errorCode.getCode(),null);
    }
}
