package main;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart
{
   private double sumPrice = 0;
   private List<Product> productList = new ArrayList<>();

   public void add(final Product product)
   {
      productList.add(product);
      sumPrice += product.getPrice();
   }

   public double getPrice()
   {
      return sumPrice;
   }

   public Product get(int i)
   {
      return productList.get(i);
   }

   public double size()
   {
      return productList.size();
   }
}
