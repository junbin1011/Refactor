package base;

class POS {
    Display display;

    void displayPrice(String price) {
        showPrice(price);
    }


    void showPrice(String price) {
        display.message = price;
    }
}

class Display {
    String message;
}