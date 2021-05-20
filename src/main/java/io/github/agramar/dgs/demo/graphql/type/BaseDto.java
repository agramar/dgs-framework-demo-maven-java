package io.github.agramar.dgs.demo.graphql.type;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.OffsetDateTime;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString
@Getter
public abstract class BaseDto {
    private UserDto regUser;
    private OffsetDateTime regDate;
    private UserDto modUser;
    private OffsetDateTime modDate;
}
