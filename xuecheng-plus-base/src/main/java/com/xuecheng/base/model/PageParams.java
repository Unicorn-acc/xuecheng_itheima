package com.xuecheng.base.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 分页查询通用参数
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageParams {

    private Long pageNo = 1L;

    private Long pageSize = 10L;

}
