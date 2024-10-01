fun main(){
    // hanya bisa menampung dengan kumpulan tipe data yang sama
    val names: Array<String> = arrayOf("Diki", "Dika", "Diko")
        names.set(0,"Daki")

    println(names[0]) // isi array dapat diubah

    val nilai: Array<Int> = arrayOf(11,22,33)
    println(nilai[0])
    println(nilai[1])
    println(nilai[2])

    // gunakan arrayOfNulls jika array kosong

    val members: Array<String?> = arrayOfNulls(3)
    members[0]="Diki"
    members[1]="Dika"
    members[2]="Diko"
    println(members[0])
}