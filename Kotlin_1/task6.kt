
fun main(){
    try{
    println("Введите два возраста")
    var x= readLine()!!.toInt()
    var y= readLine()!!.toInt()
    when {
        (x >= 7 && x <= 16) && (y >= 7 && y <= 16) -> println("Оба школьного возраста")
        (x >= 7 && x <= 16) -> println("Первый школьного возроста")
        (y >= 7 && y <= 16) -> println("Второй школьного возроста")
        else -> println("Никто")
    }
    }catch (e:Exception){
        println("Ошибка")}
}