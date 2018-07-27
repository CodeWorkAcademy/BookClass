package com.company;

public class BookApplication {

    public static void main(String[] args) {
	// write your code here
        Book myBook = new Book();
        myBook.setBookTitle("This book needs a title.");

        String bookSku="Zombie1005";
        myBook.setSku(bookSku);

    }
}
