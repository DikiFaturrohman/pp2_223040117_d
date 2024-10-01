// parameter posisi terakhir bisa jadi varargs
// varargs artinya bisa menerima lebih dari satu input seperti array
fun hitungTotal(name: String, vararg values: Int): Int {
    var total = 0

    for (value in values){
        total += value

    }
    return total;
}

fun main(){
    val result = hitungTotal("Diki",10,10)
    println(result)
}