package io.github.agramar.dgs.demo.graphql.dataloader;


public class MovieDataLoader {

    /*
     * N+1 문제 해결을 위해 DataLoader를 사용
     * Although the DataLoader is called for each individual show ID, it will batch up the actual loading to a single method call to the "load" method in the ReviewsDataLoader.
     * For this to work correctly, the datafetcher needs to return a CompletableFuture.
     */
}
