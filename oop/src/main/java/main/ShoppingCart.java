package main;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart
{
   private Price sumPrice = new Price(0);
   private List<Product> productList = new ArrayList<>();
   private final String PRODUCT_LINE_FORMAT = "%-20s %-20s %10s";  // Title, ISBN, Price
   private final String NR_FORMAT = "%-6s";  // Nr)
   
   public void add(final Product product)
   {
      productList.add(product);
      sumPrice=product.addPrice(sumPrice);
   }

   public void printTextInvoice()
   {
      System.out.println(String.format(NR_FORMAT+PRODUCT_LINE_FORMAT, "Nr)","Title","ISBN","Price"));
      System.out.println("=============================================================");
      int nr=0;
      for(Product product:productList)
      {
         nr++;
         System.out.println(String.format(NR_FORMAT+"%50s",nr+") ",product.print2Text(PRODUCT_LINE_FORMAT)));
      }
      System.out.println("=============================================================");
      System.out.println(String.format(NR_FORMAT+"%52s", "SUM",sumPrice));
   }
}