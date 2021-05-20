package io.github.agramar.dgs.demo.graphql.datafetcher;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import io.github.agramar.dgs.demo.graphql.type.MovieDto;
import io.github.agramar.dgs.demo.service.MovieService;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@DgsComponent
public class MovieDataFetcher {

    private final MovieService movieService;

    @DgsQuery
    public List<MovieDto> movies(@InputArgument("title") String title) {
        return movieService.findMovies(title).stream().map(MovieDto::of).collect(Collectors.toList());
    }
}
