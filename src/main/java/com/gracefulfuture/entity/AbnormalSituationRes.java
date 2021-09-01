package com.gracefulfuture.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @description 异常情况响应
 * @author chenkun
 * @date 2021/4/28 10:07
 * @version 1.9
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "AbnormalSituationRes",description = "异常情况响应")
public class AbnormalSituationRes implements Serializable {
    /**
     * 异常日期
     */
    @ApiModelProperty(value = "异常日期")
    private String abnormalDate;
    /**
     * 异常类型
     */
    @ApiModelProperty(value = "异常类型")
    private String abnormalType;
    /**
     * 异常数量
     */
    @ApiModelProperty(value = "异常数量")
    private String abnormalNum;
    /**
     * 异常时长
     */
    @ApiModelProperty(value = "异常时长")
    private String abnormalDuration;
    /**
     * 异常次数
     */
    @ApiModelProperty(value = "异常次数")
    private Integer abnormalCount;

    /**
     * 数据质量
     */
    @ApiModelProperty(value = "数据质量")
    private Integer dataQuality;

    /**
     * 异常原因
     */
    @ApiModelProperty(value = "图片违法类型")
    private String dictName;
}
