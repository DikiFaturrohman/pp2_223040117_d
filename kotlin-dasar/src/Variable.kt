const val APP = "Kotlin Dasar"
const val VER = "1.0"

fun main(){

    val firstName : String = "Diki"  // val tidak dapat diubah
    var lastName : String = "Fatur"  // var dapat diubah, namun hanya untuk tipe data yang same

    lastName = "Faturrohman"

    val fullName : String = "$firstName $lastName"

    println(fullName)

    var address: String? = null // variable bisa null
    address = "Sagalaherang"

    println(address)

    println(address?.length) // gunakan juga '?' untuk akses variable null

    // variable constant bisa diakses secara global, di tandai dengan UPPER_CASE
    // constant wajib memakai val

    println("$APP : $VER")


}