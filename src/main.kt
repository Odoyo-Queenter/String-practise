fun main(){
    sentence("codehive")
    var y = division(100,30)
    println(y)
   var x = myself("kimberly","3")
    println(x)
    var z = words("Faith")
    println(z)
    names("")

}
fun sentence(s:String):String{
    println(s[4].toString()+s[5]+s[6]+s[7])
    return s
}
fun division(a:Int,b:Int):Int{
    var modulus = a % b
    return  modulus
}
fun myself(p:String,z:String):String{
    var identity =("Hi my name is $p and i am $z years old")
    return identity

}
fun words(word:String):Int{
    var letters = word.length
    return letters
}
fun names(name:String):String{
    var identity = "programing languages"

    println(identity.uppercase())
    println(identity.capitalize())
    println(identity.lowercase())

    return identity
}