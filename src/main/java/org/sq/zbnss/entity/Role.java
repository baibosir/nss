package org.sq.zbnss.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 角色
 */
@Data
public class Role implements Serializable {

    private static final long serialVersionUID = -80449433292135181L;

    private Integer id;

    /**
     * 角色id
     */
    private String roleId;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 角色描述
     */
    private String description;

    /**
     * 状态：1有效; 0无效
     */
    private Integer status;

    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 更新时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

}