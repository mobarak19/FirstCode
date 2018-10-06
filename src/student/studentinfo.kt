package student

fun main(args:Array<String>){
    var s:Strudent= Strudent("mobarak",1208018)
    println("id is  ${s.id}")
}
class Strudent(var name:String){
    var id:Int=-1
    init {
        println("Student name is $name")
    }
    constructor(n:String,id:Int): this(n){
        this.id=id
    }
}