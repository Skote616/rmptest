fun main(){
    try {
        var x = readLine()!!.toInt()
        when {
            (x % 10 == 8) || (x / 10 == 8) -> println("Есть")
            else -> println("Нет")
        }
    }catch (e:Exception){println("Ошибка")}
}