package io.github.agramar.dgs.demo.service;

import io.github.agramar.dgs.demo.entity.Movie;
import io.github.agramar.dgs.demo.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@RequiredArgsConstructor
@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public List<Movie> findMovies(String title) {
        if (title == null) {
            return movieRepository.findAll();
        }
//        if (title == null) {
//            return movieRepository.findAllJoinFetch();
//        }

        return movieRepository.findAllByTitleContains(title);
    }
}
