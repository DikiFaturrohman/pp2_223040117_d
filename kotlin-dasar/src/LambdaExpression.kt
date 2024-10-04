// function bisa dimasukkan ke variable, array atau parameter function itu sendiri
// lambda artinya function tanpa nama
// tidak perlu menggunakan return di dalam lambda
// "it" berfungsi jika parameter lambda nya hanya satu

fun toUpper(value: String): String = value.toUpperCase()

fun main (){
    val contohLambda : (String, String) -> String = {firstname:String,lastname:String ->
    val result = "$firstname $lastname"
        result
    }
    val result = contohLambda("Diki","Faturrohman")
    println(result)

    val sayHello :(String) -> String = {
        "Hello $it"
    }
    println(sayHello("Diki"))

    val toUpperCase : (String) -> String = :: toUpper
    println(toUpperCase("Diki Faturrohman"))
}