package io.github.agramar.dgs.demo.repository;

import io.github.agramar.dgs.demo.entity.Movie;
import io.github.agramar.dgs.demo.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
}
