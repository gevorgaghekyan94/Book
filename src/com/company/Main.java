package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Author author1 = new Author("Vahe", "Macakyan", Gender.MALE);
        Author author2 = new Author("Sona", "Apresyan", Gender.FEMALE);
        ArrayList<Author> authorsOfYerjanikner = new ArrayList<>();
        Book book = new Book("Yerjanikner", authorsOfYerjanikner, 750);

    }
}
