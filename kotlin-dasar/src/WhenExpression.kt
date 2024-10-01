fun main(){
    // when lebih sederhana dari if expression
    val nilaiUjian = "A"

    when(nilaiUjian){
        "A" -> {
            println("Amazing")
        }
        "B" -> {
            println("Good")
        }
        "C" -> {
            println("Not Bad")
        }
        "D" -> {
            println("Bad")
        }
        else -> {
            println("Ups")
        }
    }

    when(nilaiUjian){ // jika opsi lebih dari satu
        "A", "B", "C" -> {
            println("Pass")
        }
        else -> {
            println("Not Pass")
        }
    }

    // when expression digabung dengan array
    val nilaiLulus: Array<String> = arrayOf("A","B","C")
    when (nilaiUjian){
        in  nilaiLulus -> println("You Pass!")
        !in nilaiLulus -> println("Sorry, You not Pass")
    }

    // 'is' untuk mengecek tipe data, berguna di OOP
    val name = "Diki"
    when (name) {
        is String -> println("Name is String")
        !is String -> println("Name is not String")

    }
}


