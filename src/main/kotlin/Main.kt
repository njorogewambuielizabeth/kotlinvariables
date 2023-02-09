fun main(){
    printName("joy")
    var nudus= divide(34,5)
    println(nudus)
    comment()
    var num= addition(1,2,3,5)
    println(num)

}

fun printName(name: String) {
    var name="joy"
    println("hello"+ " "+name)
}
fun divide (num1: Int, num2: Int):Int{
    var mudus =num1%num2
    return(mudus)

}

    fun addition (num1: Int, num2: Int, num3: Int, num4:Int):Int{
            var sum =num1+num2+num3+num4
            return sum
        }
fun comment() {
    var statement = "i love joking "
    println(statement)
}




