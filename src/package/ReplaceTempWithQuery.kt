package `package`


class ReplaceTempWithQuery {
    fun smellCode(): Double {
        var basePrice = getPrice()

        if (basePrice > 1000)
            return basePrice * 0.95
        else
            return basePrice * 0.98
    }

    fun refactor(): Double {
        var basePrice = getPrice()

        if (basePrice > 1000)
            return basePrice * 0.95
        else
            return basePrice * 0.98
    }

    private fun getPrice(): Int {
        var quantity = 1
        val itemPrice = 1
        var basePrice = quantity * itemPrice
        return basePrice
    }
}