package com.framework;

/**
 * Created by cbb on 2017/12/27.
 */

/**
 *  作为返回实体的基本抽象类
 */
public class ResultDto {

    private String status;

    private String message;

    private Object data;

    public Object resultSuccess(){
        Object object = new Object();
        return object;
    }
}
