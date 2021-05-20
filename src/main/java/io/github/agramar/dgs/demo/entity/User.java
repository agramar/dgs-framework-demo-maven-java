package io.github.agramar.dgs.demo.entity;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Data
@Entity
@Table(name = "USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "ACCOUNT_NAME", length = 100, nullable = false)
    private String accountName;

    @Column(name = "USER_NAME", length = 100, nullable = false)
    private String userName;

}
