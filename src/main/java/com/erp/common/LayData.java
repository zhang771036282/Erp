package com.erp.common;

import lombok.*;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LayData {
    /**
     *状态码 200:成功、400：失败
     */
    private int code;
    /**
     *返回的信息
     */
    private String msg;
    /**
     * 总数
     */
    private Long count;
    /**
     *每页显示的数量
     */
    private int limit;
    /**
     *当前页
     */
    private int curr;
    /**
     *返回的数据集
     */
    private Object data;
}
