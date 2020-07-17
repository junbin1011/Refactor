package base

fun inLineVariable_codeSmell(anOrder: Order): Boolean {
    val basePrice = anOrder.basePrice
    return basePrice > 1000
}

fun inLineVariable(anOrder: Order): Boolean {
    return anOrder.basePrice > 1000
}