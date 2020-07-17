package `package`

data class Order(var prority: String)

fun smellCode() {
    var orders = mutableListOf<Order>()
    orders.filter {
        it.prority == "high" || it.prority == "rush"
    }
}

data class Prority(var value: String) {
    fun higerThan(prority: Prority) :Boolean{
        return true
    }

}

data class NewOrder(var prority: Prority)

fun refactor() {
    var orders = mutableListOf<NewOrder>()
    orders.filter {
        it.prority.higerThan(Prority("low"))
    }
}