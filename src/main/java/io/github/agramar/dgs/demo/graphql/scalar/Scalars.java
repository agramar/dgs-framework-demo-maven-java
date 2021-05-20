package io.github.agramar.dgs.demo.graphql.scalar;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsRuntimeWiring;
import graphql.scalars.ExtendedScalars;
import graphql.schema.idl.RuntimeWiring;

/**
 * graphql-java provides optional scalars in the graphql-java-extended-scalars library.
 * We can wire a scalar from this library by adding the scalar to the RuntimeWiring.
 */
@DgsComponent
public class Scalars {

    @DgsRuntimeWiring
    public RuntimeWiring.Builder addDateTimeScalar(RuntimeWiring.Builder builder) {
        return builder.scalar(ExtendedScalars.DateTime);
    }

    @DgsRuntimeWiring
    public RuntimeWiring.Builder addDateScalar(RuntimeWiring.Builder builder) {
        return builder.scalar(ExtendedScalars.Date);
    }

    @DgsRuntimeWiring
    public RuntimeWiring.Builder addLongScalar(RuntimeWiring.Builder builder) {
        return builder.scalar(ExtendedScalars.GraphQLLong);
    }
}
