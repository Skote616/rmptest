import kotlin.math.pow

fun main(){
    try{
    var x= readLine()!!.toDouble()
    when {
        (x <= 3) -> println((x.pow(2) - 3 * x + 9))
        else -> println((1 / (x.pow(3) + 6)))
    }
    }catch (e:Exception){
        println("Ошибка")}
}