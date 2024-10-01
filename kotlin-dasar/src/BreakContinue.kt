fun main(){
    // break berguna menghentikan perulangan
    // continue menghentikan perulangan yang sedang berjalan
    var i = 0
    while (true){
        println("Break")
        i++
        if (i > 10) {
            break
        }
    }

    for (i in 1..100){ //disaat menemukan angka genap maka perulangan dihentikan
        if(i%2==0){
            continue
        }
        println(i)
    }
}