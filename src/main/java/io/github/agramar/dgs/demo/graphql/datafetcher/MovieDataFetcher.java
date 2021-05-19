package io.github.agramar.dgs.demo.graphql.datafetcher;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import io.github.agramar.dgs.demo.graphql.generated.types.Movie;
import io.github.agramar.dgs.demo.service.MovieService;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@DgsComponent
public class MovieDataFetcher {

    private final MovieService movieService;

    @DgsQuery
    public List<Movie> movies(@InputArgument("title") String title) {
        return movieService.findMovies(title);
    }
}
