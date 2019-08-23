package com.marke.marketmaker.common;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author xingkong
 * @date 19-8-22 下午2:21
 */
@Data
public class BasicDomain implements Serializable,Cloneable {
    private static final long serialVersionUID = 7349540000767188367L;
    protected Long uid;//the unique key in database
    protected String uuid;
    protected Timestamp createdTime;
    protected Timestamp updatedTime;
}
