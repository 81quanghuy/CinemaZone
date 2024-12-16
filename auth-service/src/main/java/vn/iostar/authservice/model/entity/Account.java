package vn.iostar.authservice.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;
import vn.iostar.AbstractMappedEntity;
import vn.iostar.authservice.util.Constants;

import java.io.Serial;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = Constants.ACCOUNT_TABLE)
public class Account extends AbstractMappedEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = Constants.ACCOUNT_ID)
    private String id;

    @Column(name = Constants.USER_ID)
    private String userId;

    @Email
    @Column(name = Constants.EMAIL, unique = true)
    private String email;

    @Column(name = Constants.PASSWORD)
    private String password;

    @Column(name = Constants.IS_ACTIVE)
    private Boolean isActive;
}
