package `package`

//Smell Code


class RemoveMiddleManDepartment {
    var manager = ""
}

class RemoveMiddleManPerson {

    var department = Department()
    fun manager(): String {
        return this.department.manager
    }
}


var refactorManager = RemoveMiddleManPerson().department.manager