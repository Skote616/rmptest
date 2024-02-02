fun main(){
    try{
    var age= readLine()!!.toInt()
    when
    {
        (age>=0)&&(age<=2)->println("Младенец")
        (age>2)&&(age<=7)->println("Ребенок")
        (age>7)&&(age<14)->println("Почти подросток")
        (age>=14)&&(age<=18)->println("подросток")
        (age>18)&&(age<=30)->println("Призывной возраст")
        (age>30)&&(age<=65)->println("Взрослый")
        (age>65)&&(age<=100)->println("Пенсия")
        else-> println("Либо не родился, либо больно много живешь")

    }
    }catch (e:Exception){
        println("Ошибка")}
}