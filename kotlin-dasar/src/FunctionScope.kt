// lingkup function bisa diakses
// saat membuat function, secara otomatis function tersebut bisa diakses dari file manapun
// untuk membatasi function tertentu, maka bisa membuat function di dalam function
// di java membuat function harus didalam kelas
fun HelloWorld(){}

fun satu(){
    helloWorld() // bisa diakses
}

fun dua(){
    //contohHelloWorld(){}
        // error karena lingkup function dibatasi

}


fun main(){
    fun contohHelloWorld(){

    }
}