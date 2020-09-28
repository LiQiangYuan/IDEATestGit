package com.qq.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @Auther: Lee
 * @Date: 2020/9/28 0028 17:24
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Items implements Serializable {
    private Integer id;
    private String name;
    private Float price;
    private String pic;
    private Date createtime;
    private String detail;

}
