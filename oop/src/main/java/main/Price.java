package main;

public class Price
{
   private double priceValue;

   public Price(double priceValue)
   {
      this.priceValue=priceValue;
   }

   public Price add(Price price)
   {
      return new Price(priceValue+=price.priceValue);
   }

   public String toString()
   {
      return  String.format("%7.2f %2s",priceValue," €");
   }
}
