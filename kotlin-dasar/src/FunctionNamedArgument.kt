// fitur untuk menyebutkan nama parameter saat memanggil function
fun fullName(firstName: String,
             middleName: String,
             lastName: String){
    println("Hello $firstName $middleName $lastName")
}


fun main(){
    fullName(
        lastName = "Rohman",
        firstName = "Diki",
        middleName = "Fatur"
    )
}