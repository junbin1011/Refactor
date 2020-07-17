package api;

public class ReplaceParameterWithQuery {
    int quantity;
    int itemPrice;

    double finalPrice() {
        int basePrice = this.quantity * this.itemPrice;
        int discountLevel;
        if (this.quantity > 100) discountLevel = 2;
        else discountLevel = 1;
        return this.discountedPrice(basePrice, discountLevel);
    }

    double discountedPrice(int basePrice, int discountLevel) {
        switch (discountLevel) {
            case 1:
                return basePrice * 0.95;
            case 2:
                return basePrice * 0.9;
        }
        return 0.0;
    }

    double finalPriceRefactor() {
        int basePrice = this.quantity * this.itemPrice;
        return this.discountedPriceRefactor(basePrice);
    }


    double discountedPriceRefactor(int basePrice) {
        switch (discountLevel()) {
            case 1:
                return basePrice * 0.95;
            case 2:
                return basePrice * 0.9;
        }
        return 0.0;
    }

    private int discountLevel() {
        int discountLevel;
        if (this.quantity > 100) discountLevel = 2;
        else discountLevel = 1;
        return discountLevel;
    }
}
