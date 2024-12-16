package vn.iostar.authservice.model.entity;


import jakarta.persistence.*;
import lombok.*;
import vn.iostar.AbstractMappedEntity;
import vn.iostar.authservice.util.Constants;
import vn.iostar.authservice.util.TokenType;

import java.io.Serializable;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Token extends AbstractMappedEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = Constants.TOKEN_ID)
    private String id;

    @Column(name = Constants.TOKEN, unique = true, length = 700)
    private String tokenValue;

    @Column(name = Constants.USER_ID)
    private String userId;

    @Enumerated(EnumType.STRING)
    @Column(name = Constants.TOKEN_TYPE)
    private TokenType type;

    @Builder.Default
    @Column(name = Constants.IS_REVOKED)
    private Boolean isRevoked = false;

    @Column(name = Constants.ISSUED_AT)
    private Date issuedAt;

    @Column(name = Constants.EXPIRED_AT)
    private Date expiredAt;

    @Column(name = Constants.IP_ADDRESS)
    private String ipAddress;
}
