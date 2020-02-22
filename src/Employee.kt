class Employee(var firstname: String, var lastName: String, var employeeNumber: String, var employeeShift: Int) {

    //Let the user know an employee has been created
    init {
        println("Employee $firstname $lastName has been added")
    }

    //Print all employee information
    fun printAll() {
        println("=================\n$firstname $lastName \nEmployee ID: $employeeNumber \nShift: $employeeShift\n=================")
    }

}