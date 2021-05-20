package io.github.agramar.dgs.demo.graphql.type;

import io.github.agramar.dgs.demo.entity.Review;
import lombok.*;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@ToString
@Getter
public class ReviewDto extends BaseDto {

    private Long id;
    private String title;
    private String content;

    public static ReviewDto of(Review review) {
        return ReviewDto.builder()
                .id(review.getId())
                .title(review.getTitle())
                .content(review.getContent())
                .regUser(UserDto.of(review.getRegUser()))
                .regDate(review.getRegDate())
                .modUser(UserDto.of(review.getRegUser()))
                .modDate(review.getModDate())
                .build();
    }
}
