package net.bobdb.funwithgraphql;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Author(Integer id, String name) {
    public static List<Author> authors = Arrays.asList(
            new Author(1, "James Joyce")
    );

    public static Optional<Author> getAuthorById(Integer id) {
        return authors.stream()
                .filter(a -> a.id.equals((id)))
                .findFirst();
    }
}
