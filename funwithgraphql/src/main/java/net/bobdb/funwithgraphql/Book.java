package net.bobdb.funwithgraphql;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Book(Integer id, String name, Integer pages, Integer authorId) {

public static List<Book> books = Arrays.asList(
        new Book(1,"Ulysses",100, 1),
        new Book(2,"Portrait of the Artist as a Young Man",200, 1),
        new Book(3,"Finnegan's Wake",300,1 ));


    public static Optional<Book> getBookById(Integer id) {
        return books.stream()
                .filter(b -> b.id.equals(id))
                .findFirst();
    }
}
