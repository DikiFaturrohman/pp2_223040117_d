fun main(){

    val result = 10/3 // default nya integer maka hasil tidak akan menjadi double
    println(result)

    val result2 = 10 + 10/2 // mengutamakan pembagian karena merujuk pada kalkulator sains
    println(result2)

    var total: Int = 0

    val barang1 = 100
    total = total + barang1
    val barang2 = 200
    total = total + barang2
    val barang3 = 300
    total += barang3 // augmented assignments untuk mempersingkat

    println(total)

    total++ // total = total + 1

    println(total)

    val suhu = -5
    println(suhu)

    val sehat = true // '!' untuk boolean kebalikan
    println(!sehat)

}