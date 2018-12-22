package com.erp.common;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LayData {

    private int code; // 状态码 200:成功、400：失败

    private String msg; // 返回的信息

    private Long count; // 总数

    private int limit; // 每页显示的数量

    private int curr; // 当前页

    private Object data; // 返回的数据集
}
