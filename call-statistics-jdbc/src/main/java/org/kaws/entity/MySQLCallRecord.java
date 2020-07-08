package org.kaws.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Heiky
 * @since 2020-06-08
 */
@Getter
@Setter
public class MySQLCallRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增主键
     */
    private Long id;

    /**
     * 用户标识
     */
    private String appId;

    /**
     * 访问ip
     */
    private String accessIp;

    /**
     * 调用地址
     */
    private String abilityUri;

    /**
     * 请求时间
     */
    private LocalDateTime createTime;

    public MySQLCallRecord() {
    }

    public MySQLCallRecord(String appId, String accessIp, String abilityUri, LocalDateTime createTime) {
        this.appId = appId;
        this.accessIp = accessIp;
        this.abilityUri = abilityUri;
        this.createTime = createTime;
    }
}
