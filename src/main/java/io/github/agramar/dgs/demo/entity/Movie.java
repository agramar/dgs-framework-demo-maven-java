package io.github.agramar.dgs.demo.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Movie extends BaseTimeEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "TITLE", nullable = false)
    private String title;

    @Column(name = "PLOT", length = 1000)
    private String plot;

    @Column(name = "RELEASE_DATE")
    private LocalDate releaseDate;

}
