package main;

public class CreateShoppingCart
{

   public static void main(String[] args)
   {
         Product[] products = 
            { 
               new Product("ISBN 234-1234s","Clean Code",          new Price(182.45)),
               new Product("ISBN 234-1234y","Python for dummies",  new Price(6.21)),
               new Product("ISBN 000-1234X","Learn to relax",      new Price(13.45)) 
            };

         ShoppingCart shoppingCart = new ShoppingCart();
         for(Product product:products)
            shoppingCart.add(product);
         new ShoppingCartSystemOutPrinter(shoppingCart).printTextInvoice();     
   }
}