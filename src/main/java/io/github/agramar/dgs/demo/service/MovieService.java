package io.github.agramar.dgs.demo.service;

import io.github.agramar.dgs.demo.graphql.generated.types.Movie;
import io.github.agramar.dgs.demo.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Transactional
@RequiredArgsConstructor
@Service
public class MovieService {

    private final ModelMapper modelMapper;

    private final MovieRepository movieRepository;

    public List<Movie> findMovies(String title) {

        if (title == null) {
            return movieRepository.findAll().stream()
                    .map(movie -> modelMapper.<Movie>map(movie, new TypeToken<Movie>() {}.getType()))
                    .collect(Collectors.toList());
        }

        return movieRepository.findAllByTitleContains(title).stream()
                .map(movie -> modelMapper.<Movie>map(movie, new TypeToken<Movie>() {}.getType()))
                .collect(Collectors.toList());
    }
}
