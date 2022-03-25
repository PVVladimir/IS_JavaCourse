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
        float discountPriceOfAllShirts = (totalPriceOfSelectedShirtsWithoutDiscount + totalPriceOfShirtsWithoutDiscountMustBuy) * (100 - discountPercentage) / 100;
        float discountPriceOfOneShirt = priceOfOneShirt * (100 - discountPercentage) / 100;
        float amountOfMoneySaved = totalPriceOfSelectedShirtsWithoutDiscount + totalPriceOfShirtsWithoutDiscountMustBuy - discountPriceOfAllShirts;
        float theNumberOfShirtsReceivedForFree = amountOfMoneySaved / discountPriceOfOneShirt;
        System.out.printf("Цена одной рубашки без скидки %d у.е.\n", priceOfOneShirt);
        System.out.printf("Количество уже выбранных рубашек %d шт\n", numberOfSelectedShirts);
        System.out.printf("Количество рубашек, которые надо купить, чтобы получить скидку %d шт\n", numberOfShirtsToReceiveADiscount);
        System.out.printf("Количество рубашек, которые надо добавить к купленным, чтобы получить скидку %d шт\n", numberOfShirtsAddForDiscount);
        System.out.printf("Общая цена уже выбранных рубашек без скидки %d у.е.\n", totalPriceOfSelectedShirtsWithoutDiscount);
        System.out.printf("Общая цена рубашек (без скидки), которые надо докупить, чтобы получить скидку %d у.е.\n", totalPriceOfShirtsWithoutDiscountMustBuy);
        System.out.printf("Процент скидки %.2f%%\n", discountPercentage);
        System.out.printf("Цена всех рубашек со скидкой %.2f у.е.\n", discountPriceOfAllShirts);
        System.out.printf("Цена одной рубашки со скидкой %.2f у.е.\n", discountPriceOfOneShirt);
        System.out.printf("Количество сэкономленных денег, если рубашки куплены со скидкой %.2f шт\n", amountOfMoneySaved);
        System.out.printf("Количество рубашек, которые из-за скидки считай получены на халяву %.2f шт\n", theNumberOfShirtsReceivedForFree);
    }
}
