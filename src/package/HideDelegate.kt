package `package`

//Smell Code
//manager = aPerson.department.manager;


var manager = HideDelegatePerson().manager()

class Department {
    var manager = ""
}

class HideDelegatePerson {

    private var department = Department()
    fun manager(): String {
        return this.department.manager
    }
}