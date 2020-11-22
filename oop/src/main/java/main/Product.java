package main;

public class Product
{
   private String isbn;
   private String title;
   private Price price;
   
   public Product(String isbn, String title, Price price)
   {
      this.isbn = isbn;
      this.title = title;
      this.price = price;
   }

   public Price addPrice(final Price sumPrice)
   {
      return sumPrice.add(price);
   }

   public String print2Text(String formatString)
   {
      return String.format(formatString, title, isbn, price);
   }
}
