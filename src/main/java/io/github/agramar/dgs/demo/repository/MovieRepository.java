package io.github.agramar.dgs.demo.repository;

import io.github.agramar.dgs.demo.entity.Movie;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    @Query("SELECT a FROM Movie a JOIN FETCH a.regUser JOIN FETCH a.modUser LEFT JOIN FETCH a.reviews")
    List<Movie> findAllJoinFetch();

    @Query("SELECT a FROM Movie a JOIN FETCH a.regUser JOIN FETCH a.modUser LEFT JOIN FETCH a.reviews WHERE a.title LIKE %:title%")
    List<Movie> findAllByTitleContains(String title);
}
