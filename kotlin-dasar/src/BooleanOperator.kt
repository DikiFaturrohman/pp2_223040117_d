fun main(){
    val nilaiUjian = 80
    val nilaiPresensi = 80
    val nilaiEkstra = 80

    val apakahLulusUjian = nilaiUjian > 75
    val apakahLulusPresensi = nilaiPresensi > 75
    val apakahLulusEkstra = nilaiEkstra > 75

        // operasi boolean dari kiri terlebih dahulu
    val apakahLulus = apakahLulusUjian && apakahLulusPresensi && apakahLulusEkstra
    println(apakahLulus)

}