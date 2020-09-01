import java.util.*
import kotlin.math.ceil

fun main(){
    val reader = Scanner(System.`in`)
    print("Nama : ")
val nama: String? = reader.nextLine()
if(nama.isNullOrEmpty()){
    main()
}
print("Kelas : ")
val kelas: String? = reader.nextLine()
if(kelas.isNullOrEmpty()){
    main()
}
print("Absen : ")
val absen: String? = reader.nextLine()
if(absen.isNullOrEmpty()) {
    main()
}
println("Kamu ingin menghitung apa?")
println("1. Volume Tabung")
println("2. Volume Kerucut")
print("Pilihanmu : ")
val pilih: Int = reader.nextInt()
val pilihan : String
pilihan = (if (pilih == 1) {
    print("Masukkan jari-jari : ")
    val rad1: Double = reader.nextDouble()
    print("Masukkan tinggi : ")
    val height1: Double = reader.nextDouble()
    val cylinderV = cylinderVol(rad1!!, height1!!)
    val volumeBulatkan = ceil(cylinderV)
    println("Maka volume kerucut adalah "
            + String.format("%.2f", cylinderV )
            + "\ndan volume tabung setelah dibulatkan yaitu $volumeBulatkan")
} else if (pilih == 2) {
    print("Masukkan jari-jari : ")
    val rad2: Double = reader.nextDouble()
    print("Masukkan tinggi : ")
    val height2: Double = reader.nextDouble()
    val coneV = coneVol(rad2!!, height2!!)
    val volumeBulatkan = ceil(coneV)
    println("Maka volume kerucut adalah "
            + String.format("%.2f", coneV )
            + "\ndan volume kerucut setelah dibulatkan yaitu $volumeBulatkan")
} else {
    "Tidak Tersedia"
}).toString()
print(pilihan)
}

fun cylinderVol(rad1 : Double, height1 : Double): Double {
    return (Math.PI * rad1 * rad1 * height1)
}

fun coneVol(rad2 : Double, height2 : Double): Double {
    return (Math.PI * rad2 * rad2 * height2 / 3)
}


