package base

data class Driver(var numberOfLateDeliveries: Int)

fun getRating_smellCode(driver: Driver): Int {
    return if (driver.numberOfLateDeliveries > 5) {
        2
    } else {
        1
    }
}

fun getRating(driver: Driver): Int {
    return if (driver.numberOfLateDeliveries > 5) {
        2
    } else {
        1
    }
}
