// jika function memanggil fuction dirinya terlalu dalam, maka berkemungkinan stack overflow
// solusinya menggunakan tail recursive

// saat memanggil function dirinya sendiri tidak boleh ada embel - embel operasi data

fun main(){
    /*
    tailrec fun display(value: Int){
        println("Recursive $value")
        if (value > 0){
            display(value - 1)
        }
    }
    display(10000)

     */
    tailrec fun factorialRecursive(value: Int, total:Int = 1):Int{
        return when(value){
            1-> total
            else -> factorialRecursive(value -1, total * value)
        }

    }
    println(factorialRecursive(10))
}