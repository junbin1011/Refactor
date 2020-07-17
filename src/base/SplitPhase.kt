package base

fun priceOrder_smellCode(product: Product, quantity: Int, shippingMethod: Shipping): Int {
    var (basePrice, discount) = calculatePricingData(product, quantity)
    var shippingPerCase = if (basePrice > shippingMethod.discountThreshold) shippingMethod.discountedFee else shippingMethod.feePerCase
    var shippingCost = quantity * shippingPerCase
    var price = basePrice - discount + shippingCost
    return price
}

fun priceOrder(product: Product, quantity: Int, shippingMethod: Shipping): Int {
    var basePrice = calculatePricingData(product, quantity)
    var price = applyShipping(basePrice, shippingMethod, quantity)
    return price
}

private fun calculatePricingData(product: Product, quantity: Int): Price {
    var basePrice = product.basePrice * quantity
    var discount = Math.max(quantity - product.discountThreshold, 0) * product.basePrice * product.discountRate
    return Price(basePrice, discount)
}

private fun applyShipping(price: Price, shippingMethod: Shipping, quantity: Int): Int {
    var shippingPerCase = if (price.basePrice > shippingMethod.discountThreshold) shippingMethod.discountedFee else shippingMethod.feePerCase
    var shippingCost = quantity * shippingPerCase
    var price = price.basePrice - price.discount + shippingCost
    return price
}

data class Product(var basePrice: Int, var discountThreshold: Int, var discountRate: Int)

data class Shipping(var discountThreshold: Int, var discountedFee: Int, var feePerCase: Int)

data class Price(var basePrice: Int, var discount: Int)