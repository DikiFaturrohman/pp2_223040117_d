fun main(){
    val array = arrayOf("Diki", "Diko", "Dika", "Daki", "Doki", "Daka")

    var total = 0

    for (name in array){ // name tidak bisa diubah
        println(name)
        total++
    }
    println("Total Perulangan = $total")

    val arrayLength = array.size - 1
    for (i in 0..arrayLength){
        println("Index $i = ${array.get(i)}")
    }

}