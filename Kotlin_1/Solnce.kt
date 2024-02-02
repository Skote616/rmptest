import kotlin.math.pow

fun main(){
    try{
    var num1=readLine()!!.toDouble()
    var num2= readLine()!!.toDouble()
    when{
        (num1>num2)-> println(num1+1)
        (num1<num2)-> println(num2+1)
        (num1==num2)->println(num1.pow(3))
    }
    }catch (e:Exception){
        println("Ошибка")}
}