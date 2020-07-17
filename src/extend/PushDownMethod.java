package extend;

public class PushDownMethod {
}


class EmployeePushDown {
    void quota() {
    }
}

class EngineerPushDown extends EmployeePushDown {
}

class SalesmanPushDown extends EmployeePushDown {
}


class EmployeePushDownRefactor {

}

class EngineerPushDownRefactor extends EmployeePushDownRefactor {
    void quota() {
    }
}

class SalesmanPushDownRefactor extends EmployeePushDownRefactor {
}

