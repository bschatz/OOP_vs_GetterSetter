package main;

public class Product
{
   private String title;
   private String isbn;

   private Double price;

   public Product(String title, String isbn, double d)
   {
      this.title = title;
      this.isbn = isbn;
      this.price = d;
   }

   public double getPrice()
   {
      return price;
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
