fun main(){
    // range berguna untuk membuat data angka yang berurutan banyak
    // val range = 1 .. 100 // range tidak untuk menampung, tapi untuk perulangan
    val range = 100 downTo 1 step 2


    println(range.count())
    println(range.contains(50))
    println(range.contains(200))
    println(range.first)
    println(range.last)
    println(range.step)
}