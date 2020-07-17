package `package`


class Human_SmellCode {

    var officeAreaCode = "2000"
    var officeNumber = "10806"

    fun officeAreaCode(): String {
        return officeAreaCode
    }

    fun officeNumber(): String {
        return officeNumber
    }
}


class Human {



    var phone = Phone()
    fun officeAreaCode(): String {
        return phone.areaCode()
    }

    fun officeNumber(): String {
        return phone.number()
    }

}

class Phone {
    private var officeAreaCode = "2000"
    private var officeNumber = "10806"

    fun areaCode(): String {
        return officeAreaCode
    }

    fun number(): String {
        return officeNumber
    }

}
