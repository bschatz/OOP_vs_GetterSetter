package main;

public class ShoppingCartSystemOutPrinter
{
   private ShoppingCart shoppingCart;
   private final String FORMAT = "%-6s %-20s %-20s %10s"; // Nr, Title, ISBN, Price
   private final String NR_FORMAT = "%-6s"; // Nr)

   public ShoppingCartSystemOutPrinter(ShoppingCart shoppingCart)
   {
      this.shoppingCart = shoppingCart;
   }

   public void printTextInvoice()
   {
      System.out.println(String.format(FORMAT, "Nr)", "Title", "ISBN", "Price"));
      System.out.println("=============================================================");
      for (int nr = 0; nr < shoppingCart.size(); nr++)
      {
         Product product = shoppingCart.get(nr);
         System.out.println(
               String.format(FORMAT, nr + ") ", product.getTitle(), product.getIsbn(), product.getPrice() + " €"));
      }
      System.out.println("=============================================================");
      System.out.println(String.format(NR_FORMAT + "%51.2f €", "SUM", shoppingCart.getPrice()));
   }
}