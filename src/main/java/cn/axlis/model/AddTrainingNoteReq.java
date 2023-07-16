package cn.axlis.model;

import lombok.Data;

@Data
public class AddTrainingNoteReq {
    /**
     * 什么运动.
     */
    private String sport;
    /**
     * 做了多少组
     */
    private int groupCount;
    /**
     * 计量单位, 例如: 个, 米.
     */
    private String unit;
    /**
     * 每组的数量.
     */
    private int amount;
    /**
     * 备注
     */
    private String comment;
}
