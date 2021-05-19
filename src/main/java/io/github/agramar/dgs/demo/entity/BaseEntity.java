package io.github.agramar.dgs.demo.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {

    @CreatedBy
    @OneToOne
    @JoinColumn(name = "reg_user_id")
    private User regUser;

    @CreatedDate
    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private OffsetDateTime regDate;

    @LastModifiedBy
    @OneToOne
    @JoinColumn(name = "mod_user_id")
    private User modUser;

    @UpdateTimestamp
    @LastModifiedDate
    @Column(nullable = false)
    private OffsetDateTime modDate;
}
