package base

private fun calculateOutstanding(): Int {
    return 0
}

fun printBanner() {

}

data class Invoice(val customer: String)

fun printOwing_smellCode(invoice: Invoice) {
    printBanner()
    var outstanding = calculateOutstanding()
    //print details
    println("name: $invoice.customer")
    println("amount: $outstanding")
}

fun printOwing(invoice: Invoice) {
    printBanner()
    var outstanding = calculateOutstanding()
    //print details
    printDetail(invoice, outstanding)
}

private fun printDetail(invoice: Invoice, outstanding: Int) {
    println("name: $invoice.customer")
    println("amount: $outstanding")
}

//
