package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {
    private int discountPercentage;
    private int basePrice;


    public DiscountedProduct(String name, String description, int basePrice, int discountPercentage) {
        super(name, description);
        if (basePrice <= 0  ) {
            throw new IllegalArgumentException("Базовая цена должна быть строго больше 0");
        }
        if (discountPercentage > 100 || discountPercentage <0){
            throw new IllegalArgumentException("Процент скидки должен быть в диапозоне 0-100.");
        }
        this.basePrice = basePrice;
        this.discountPercentage = discountPercentage;
    }

    @Override
    public int getPrice() {
        return basePrice * (100 - discountPercentage) / 100;
    }

    @Override
    public boolean isSpesial() {
        return true;
    }

    @Override
    public String toString() {
        return getName() + ": " + getPrice() + " (" + discountPercentage + "%)";
    }


}

