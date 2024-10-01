// operasi matematika terhadap dua data
// hampir semua operasi matematika adalah infix notation
// tidak wajib menggunakan tanda .(titik)
// di java tidak bisa
// harus memiliki satu parameter, harus sebagai function extension
// parameter tidak boleh varargs dan tidak boleh nilai default

infix fun String.to(type: String): String {
    if (type == "UP"){
        return this.toUpperCase()
    } else{
        return this.toLowerCase()
    }
}

fun main (){
    val result = "Diki" to "UP"
    println(result)
}