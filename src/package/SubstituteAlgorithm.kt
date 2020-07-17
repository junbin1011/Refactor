package `package`

fun foundPerson_smellCode(phones: List<String>): String {
    for (phone in phones) {
        if (phone == "Don") {
            return "Don"
        }
        if (phone == "John") {
            return "John"
        }
        if (phone == "Kent") {
            return "Kent"
        }
    }
    return ""
}

fun foundPerson(phones: List<String>): String {


    var lists = arrayOf("Don", "John", "kent")
    return phones.find { it in lists }.toString()
}