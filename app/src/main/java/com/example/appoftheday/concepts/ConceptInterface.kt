package com.example.appoftheday.concepts

object ConceptInterface {
    @JvmStatic
    fun main(args: Array<String>) {
        val carObject = Car(5)
        carObject.fly()//car shouldn't be flying
        val planeObject =Aeroplane(2)
        planeObject.move()//plane shouldn't be moving

        //Inheritance is inheriting more features than required
    }
}

interface  Vehicle {

    fun fly(){  //curly braces ones are optional

    }

    fun move(){  //curly braces ones are optional

    }

    fun chalo()  //this one is mandatory

}

//now multiple interfaces
interface bird{
    fun ooro()//mandatory one
}



class Car(var position: Int): Vehicle {
    override fun chalo() {
        TODO("Not yet implemented")
    }
    override fun move(){

    }
}

class Aeroplane(var position: Int):Vehicle,bird{
    override fun chalo() {
        TODO("Not yet implemented")
    }

    override fun ooro() {
        TODO("Not yet implemented")
    }
    override fun fly(){

    }
}

interface Operation {
    //2 parameters and one return type Int
    fun perform(a:Int,b:Int):Int  //mandatory fun
}

class Multiply:Operation{
    override fun perform(a: Int, b: Int): Int {
        return a*b
    }
}

fun cal(op:Operation,a:Int,b:Int):Int{
    return op.perform(a,b)
}

//lambda implementation
val multiply:(Int,Int)->Int={
    a,b->a*b
}

fun main(){
    val mul=Multiply()
    val result = cal(mul,2,3)
    val res= multiply(3,5)
    println(result)
    print(res)
}