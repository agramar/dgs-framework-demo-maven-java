package io.github.agramar.dgs.demo.repository;

import io.github.agramar.dgs.demo.entity.Movie;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.Month;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Transactional
@DataJpaTest
@DisplayName("영화 레파지토리 테스트")
class MovieRepositoryTest {

    @Autowired
    private MovieRepository movieRepository;

    @Test
    @DisplayName("영화 저장 테스트")
    void testSaveMovie() {
        Movie endGame = Movie.builder()
                .title("어벤져스: 엔드게임")
                .plot("인피니티 워 이후 절반만 살아남은 지구 마지막 희망이 된 어벤져스 먼저 떠난 그들을 위해 모든 것을 걸었다! 위대한 어벤져스 운명을 바꿀 최후의 전쟁이 펼쳐진다!")
                .releaseDate(LocalDate.of(2019, Month.APRIL, 24))
                .build();

        movieRepository.save(endGame);

        assertNotNull(endGame.getId());
    }

    @Test
    @DisplayName("영화 조회 테스트")
    void testFindMovie() {
        Optional<Movie> movieOptional = movieRepository.findById(1L);
        assertTrue(movieOptional.isPresent());
    }

}
