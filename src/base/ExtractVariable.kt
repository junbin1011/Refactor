package base

import kotlin.math.max
import kotlin.math.min

data class Order(var quantity: Int, var itemPrice: Double,var basePrice:Int)

fun extractVariable_smellCode(order: Order): Double {
    return order.quantity * order.itemPrice -
            max(0, order.quantity - 500) * order.itemPrice * 0.05 + min(order.quantity * order.itemPrice * 0.1, 100.0)
}

fun extractVariable(order: Order): Double {
    val basePrice = order.quantity * order.itemPrice
    val quantityDiscount = max(0, order.quantity - 500) * order.itemPrice * 0.05
    val shipping = min(order.quantity * order.itemPrice * 0.1, 100.0)
    return basePrice - quantityDiscount + shipping
}
