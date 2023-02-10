fun main(){
    printName("Marisa")
    var x = 542 % 67
    println(x)
var y = 67+83+45+60
    println(y)
aboutMe("I am Megan,from AkiraChix")

}
fun printName(Name:String){
    println("Hello $Name")


}
fun modulus(num1:Int , num2:Int): Int{
    var modulus= num1 % num2
    return modulus


}
fun addition(num1:Int, num2: Int, num3:Int, num4:Int):Int{
    var addition = num1+num2+num3+num4
    return addition

}

fun aboutMe(sentence: String){
    println("$sentence")



}