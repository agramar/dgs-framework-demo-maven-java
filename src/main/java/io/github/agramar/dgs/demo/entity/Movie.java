package io.github.agramar.dgs.demo.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
@Getter
@Entity
@Table(name = "MOVIE")
public class Movie extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "TITLE", nullable = false)
    private String title;

    @Column(name = "PLOT", length = 1000)
    private String plot;

    @Column(name = "RELEASE_DATE")
    private LocalDate releaseDate;

    @OneToMany(mappedBy = "movie", fetch = FetchType.EAGER)
    private List<Review> reviews;

    public void addReview(Review review) {
        this.reviews.add(review);
        if (review.getMovie() != this) {
            review.setMovie(this);
        }
    }

}
