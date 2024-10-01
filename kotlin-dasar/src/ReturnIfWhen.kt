fun main() {
    fun sayHello(name: String = ""): String {
        return if (name == "") { // mempermudah return jika if else nya banyak
            "Hello Bro"
        } else {
            "Hello $name"
        }
    }
    println(sayHello())
    println(sayHello("Diki" ))

    fun hello(name:String = ""): String{
        return when(name) {
            "" -> "Wassup"
            else -> "Hello $name"
        }
    }
    println(hello("Diki"))
    println(hello())
}

