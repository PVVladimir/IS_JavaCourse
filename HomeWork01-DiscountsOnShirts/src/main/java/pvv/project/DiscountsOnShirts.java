package pvv.project;

public class DiscountsOnShirts {
    public static void main(String[] args) {
        int priceOfOneShirt = 7;
        int numberOfSelectedShirts = 15;
        int numberOfShirtsToReceiveADiscount = 23;
        int numberOfShirtsAddForDiscount = numberOfShirtsToReceiveADiscount - numberOfSelectedShirts;
        int totalPriceOfSelectedShirtsWithoutDiscount = numberOfSelectedShirts * priceOfOneShirt;
        int totalPriceOfShirtsWithoutDiscountMustBuy = numberOfShirtsAddForDiscount * priceOfOneShirt;
        float discountPercentage = 7.5F;
        float discountPriceOfAllShirts = (totalPriceOfSelectedShirtsWithoutDiscount + totalPriceOfShirtsWithoutDiscountMustBuy) * (100 - discountPercentage) /100;
        float discountPriceOfOneShirt = priceOfOneShirt * (100 - discountPercentage) / 100;
        float amountOfMoneySaved = totalPriceOfSelectedShirtsWithoutDiscount + totalPriceOfShirtsWithoutDiscountMustBuy - discountPriceOfAllShirts;
        float theNumberOfShirtsReceivedForFree = amountOfMoneySaved / discountPriceOfOneShirt;
        System.out.printf(" %d", priceOfOneShirt);
        System.out.printf(" %d", numberOfSelectedShirts);
        System.out.printf(" %d", numberOfShirtsToReceiveADiscount);
        System.out.printf(" %d", numberOfShirtsAddForDiscount);
        System.out.printf(" %d", totalPriceOfSelectedShirtsWithoutDiscount);
        System.out.printf(" %d", totalPriceOfShirtsWithoutDiscountMustBuy);
        System.out.printf(" %.2f", discountPercentage);
        System.out.printf(" %.2f", discountPriceOfAllShirts);
        System.out.printf(" %.2f", discountPriceOfOneShirt);
        System.out.printf(" %.2f", amountOfMoneySaved);
        System.out.printf(" %.2f", theNumberOfShirtsReceivedForFree);
    }
}
