package com.info.model;

import lombok.Data;

/**
 * @author yangjie
 * @date 2021/10/21 7:47 下午
 * @desc
 */
@Data
public class InfoModel {
    private Integer id;
    private String department;
    private String name;
    private String position;
    private String officePhone;
    private String departmentPhone;
    private String selfPhone;
    private String familyPhone;
}
