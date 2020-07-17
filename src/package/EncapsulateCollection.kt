package `package`

class Person_SmellCode {
    val organization = mutableListOf<Organization>()
}


class Person {
    private val organizations = mutableListOf<Organization>()

    fun addOragnization(organization: Organization) {
        organizations.add(organization)
    }

    fun removeOragnization(organization: Organization) {
        organizations.remove(organization)
    }
}

