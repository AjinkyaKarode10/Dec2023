package com.example.dec;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class JwtToken {
    /**
     * access_token
     */
    @JsonProperty("access_token")
    private String accessToken;
    /**
     * token类型
     */
    @JsonProperty("token_type")
    private String tokenType;
    /**
     * refresh_token
     */
    @JsonProperty("refresh_token")
    private String refresh_token;
    /**
     * 过期时间
     */
    @JsonProperty("expires_in")
    private Long expires_in;
    /**
     * token 的范围
     */
    private String scope;
    /**
     * 颁发的凭证
     */
    private String jti;
}
