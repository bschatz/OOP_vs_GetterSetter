package main;

public class Product
{
   private String title;
   private String isbn;
   private Price price;

   public Product(String title, String isbn, Price price)
   {
      this.title = title;
      this.isbn = isbn;
      this.price = price;
   }

   public double getPrice()
   {
      return price.getValue();
   }

   public String getTitle()
   {
      return title;
   }

   public String getIsbn()
   {
      return isbn;
   }

}
