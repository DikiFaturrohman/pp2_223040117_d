fun main(){
    var age: Int = 200

    var sample : Float = 10.10F // diujung harus ada 'F' untuk tipe data float


    println(age)
    println(sample)

    var binary: Int = 0b01010101
    println(binary)

    var price: Long = 9_000_000_000L; // diujung harus ada 'L' untuk tipe data long
    println(price)                    // dapat menggunakan underscore

    var priceInt : Int = price.toInt() // akan error jika mengkonversikan tipe data jika ukuran terlalu besar
    println(priceInt)

    var doubleBinary: Double = binary.toDouble()
    println(doubleBinary)


}