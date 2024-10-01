// parameter merupakan data dari luar
// ketika memanggil function, wajib memasukkan data ke parameter
// by default data di parameter bertipe val

fun sayHello(name:String, lastName:String?){
    if (lastName==null){
        println("Hello $name")
    } else{
        println("Hello $name $lastName")
    }
}

fun main(){
    sayHello("Diki", "Fatur")
    sayHello("Dika", "Rohman")
    sayHello("Diko", null)
}