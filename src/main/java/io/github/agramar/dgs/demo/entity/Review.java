package io.github.agramar.dgs.demo.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Review extends BaseTimeEntity {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name="MOVIE_ID")
    private Movie movie;

    @OneToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    @Column(name = "TITLE", nullable = false)
    private String title;

    @Column(name = "SCORE", nullable = false)
    private BigDecimal score;

    @Column(name = "CONTENT")
    private String content;

}
