package animal

fun main(args:Array<String>){

    var p:program= program()

    var myLambda:(Int)->Unit ={s:Int-> println("Sum is "+s)
        println("Sum is "+s)
        println("Sum is "+s)
        println("Sum is "+s)
    }
    p.addtownumber(5,5,myLambda)

}


class program{


    fun addtownumber(a:Int,b:Int,action:(Int)->Unit){

        var sum:Int=a+b
        action(sum)
    }


    fun addtownumber(a:Int,b:Int,action:MyInterface){

        var sum:Int=a+b
        action.sum(sum)
        println(sum)
    }


}
interface MyInterface{
    fun sum(sum:Int)
}