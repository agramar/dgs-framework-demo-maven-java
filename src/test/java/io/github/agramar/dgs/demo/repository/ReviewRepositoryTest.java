package io.github.agramar.dgs.demo.repository;

import io.github.agramar.dgs.demo.entity.Review;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@DataJpaTest
@DisplayName("리뷰 레파지토리 테스트")
public class ReviewRepositoryTest {

    @Autowired
    private ReviewRepository reviewRepository;

    @Test
    @DisplayName("리뷰 조회 테스트")
    void testFindReview() {
        List<Review> reviews = reviewRepository.findAll();
        Assertions.assertNotNull(reviews);
    }
}
