package api;

import base.Order;

public class SeparateQueryFromModifier {

    Order order = new Order(1, 1, 1);

    int getTotalOutstandingAndSendBill() {
        int result = order.getQuantity();
        sendBill();
        return result;
    }

    private void sendBill() {
    }

    int totalOutstanding() {
        return order.getQuantity();
    }

    void main() {
        totalOutstanding();
        sendBill();
    }


}
