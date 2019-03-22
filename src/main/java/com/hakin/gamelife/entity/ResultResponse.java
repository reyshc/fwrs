package com.hakin.gamelife.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResultResponse implements Serializable {
    //返回类型
    private int code;

    private String message;

    private Object data;//返回data


    public ResultResponse() {
    }

    public ResultResponse(int code, Object data) {
        this.code = code;
        this.data = data;
    }
    public ResultResponse(int code, String message, Object data) {
        this.code = code;
        this.data = data;
        this.message=message;
    }


    public ResultResponse(int code) {
        this.code = code;
    }

    public ResultResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static ResultResponse build(int code) {
        return new ResultResponse(code);
    }


    public static ResultResponse buildSuccJoinPage(Object data) {
        return new ResultResponse(0, data);
    }


    public static ResultResponse success() {
        return new ResultResponse(0);
    }


    public static ResultResponse success(Object obj) {
        return new ResultResponse(0,"处理成功", obj);
    }


    public static ResultResponse fail(int code, String message,Object o) {
        return new ResultResponse(code, message,o);
    }
    public static ResultResponse fail(int code, String message) {
        return new ResultResponse(code, message);
    }

    public static ResultResponse message(String message) {
        return new ResultResponse(-1, message);
    }

    public static ResultResponse error() {
        return fail(-1, "未知错误!");
    }

    public static Object noSession() {
        return null;
    }

    public static ResultResponse unauthorized() {
        return fail(403, "权限不足，请联系管理员。");
    }
}
