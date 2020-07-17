package `package`


class InlineHuman {

    var phone = InlinePhone()
    fun officeAreaCode(): String {
        return phone.areaCode()
    }

    fun officeNumber(): String {
        return phone.number()
    }

}

class InlinePhone {
    private var officeAreaCode = "2000"
    private var officeNumber = "10806"

    fun areaCode(): String {
        return officeAreaCode
    }

    fun number(): String {
        return officeNumber
    }
}

class InlineHumanRefactor {

    private var officeAreaCode = "2000"
    private var officeNumber = "10806"
    fun officeAreaCode(): String {
        return officeAreaCode
    }

    fun officeNumber(): String {
        return officeNumber
    }

}