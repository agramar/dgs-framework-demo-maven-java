package io.github.agramar.dgs.demo.graphql.type;

import io.github.agramar.dgs.demo.entity.User;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
@Getter
public class UserDto {

    private Long id;
    private String accountName;
    private String userName;

    public static UserDto of(User user) {
        return UserDto.builder()
                .id(user.getId())
                .accountName(user.getAccountName())
                .userName(user.getUserName())
                .build();
    }
}
