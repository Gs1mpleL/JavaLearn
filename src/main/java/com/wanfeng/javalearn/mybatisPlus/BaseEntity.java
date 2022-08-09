package com.wanfeng.javalearn.mybatisPlus;

import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

@Data
public class BaseEntity {
    @TableLogic(value = "Y",delval = "N")
    private String isDelete;
}
