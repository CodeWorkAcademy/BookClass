package com.company;

public class Book {
    String sku, bookTitle, author, description;
    double price;
    boolean isInStock;

    public Book() {
        sku = "";
        bookTitle = "";
        author  = "";
        description = "";
        price = 0.0;
        isInStock = false;
    }

    public double returnPricing(int num){
        if (isInStock) {
            return (num * price);
        } else {
            return -1;
        }

    }

    // Getters and Setters
    public String getSku(){
        return sku;
    }
    public void setSku(String sku){
        this.sku = sku;
    }
    public String getBookTitle(){
        return bookTitle;
    }
    public void setBookTitle(String bookTitle){
        this.bookTitle = bookTitle;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public boolean getInInStock(){
        return isInStock;
    }
    public void setIsInStock(boolean isInStock){
        this.isInStock = isInStock;
    }


}
