package io.github.agramar.dgs.demo.graphql.type;

import io.github.agramar.dgs.demo.entity.Movie;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@ToString
@Getter
public class MovieDto extends BaseDto {

    private Long id;
    private String title;
    private String plot;
    private LocalDate releaseDate;
    private List<ReviewDto> reviews;

    public static MovieDto of(Movie movie) {
        return MovieDto.builder()
                .id(movie.getId())
                .title(movie.getTitle())
                .plot(movie.getPlot())
                .releaseDate(movie.getReleaseDate())
                .regUser(UserDto.of(movie.getRegUser()))
                .regDate(movie.getRegDate())
                .modUser(UserDto.of(movie.getRegUser()))
                .modDate(movie.getModDate())
                .reviews(movie.getReviews().stream().map(ReviewDto::of).collect(Collectors.toList()))
                .build();
    }
}
