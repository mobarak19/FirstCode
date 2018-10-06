package fibbonacchi

import java.math.BigInteger

fun main(agrs:Array<String>){


    println(fibonacchi(100, BigInteger("1"), BigInteger("0")).bitLength())
}

tailrec fun fibonacchi(n:Int,a:BigInteger,b:BigInteger):BigInteger{
    if(n==0){
        return b

    }else{
        return fibonacchi(n-1,a+b,a)
    }
}