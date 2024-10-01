fun hello(firstName: String, lastName: String? = null){
    if (lastName==null){
        println("Hello $firstName")
    } else {
        println("Hello $firstName $lastName")
    }
}

fun main(){
    hello("Diki")
    hello("Diki", "Fatur")
    hello("Dika")
    hello("Dika", "Rohman")
}