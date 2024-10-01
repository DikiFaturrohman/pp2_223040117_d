fun jumlah(a:Int,b:Int):Int{
    val total=a+b
    return total
}

fun bagi(a: Int,b: Int):Int{
    if (b == 0){
        return 0
    }else {
        val result = a / b
        return result
    }
}

fun main(){
    println(jumlah(10,10))
    println(jumlah(200,200))

    val result = jumlah(100,100)
    println(result)

    println(bagi(100,10))
    println(bagi(100, 0 ))
}