package com.zp.product.vo;

import lombok.Data;

@Data
public class ResultVO<T> {

    /**
     * 错误码
     */
    private Integer code = 0;

    /**
     * 提示信息
     */
    private String msg = "成功";

    /**
     * 具体内容
     */
    private T data;
}
