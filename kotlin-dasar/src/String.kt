fun main(){

    var firsName: String = "Diki"
    var lastName: String = "Faturrohman"
    var address: String = """ 
        >Sagalaherang,
        >Subang,
        >Jawa Barat,
    """.trimMargin(">") // trimMargin untuk meratakan teks saat di print

    var fullName: String = "$firsName $lastName" // $ berguna untuk otomatis membuat ruang pada String
    var desc: String = "$fullName length = ${fullName.length}" // sama saja namun untuk yang lebih kompleks

    println(firsName + " " + lastName)
    println(address)

    println(fullName)
    println(desc)
}