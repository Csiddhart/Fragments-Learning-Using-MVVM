package com.example.appoftheday.concepts

object ConceptMutable {

    //Immutable --> it's size can't be changed
    //Mutable --> it's size can be changed

    //val --> here using this means u can't change the inside of the element
    //var --> here using this means u can change the inside of the element (be it normal declare or list declare --> same for both)

    @JvmStatic
    fun main(args: Array<String>) {
//        val no:Int=2  //constant  -->  Immutable(can't be changed)
//        no=1//(here it can't be changed)
//
//        var no2:Int=3 //variable  -->  Mutable(can be changed)
//        no2=7 //(here it can be changed)


//        //Mutable list
//        val mutableList= mutableListOf(1,2,3)  //this will help in creating mutable list
//        println(mutableList)
//        mutableList[0]=4   //over-writing the first element of the list
//        println(mutableList)
//        mutableList.add(5)  //this will add new element and thus size will change
//        println(mutableList)

        /* * //IMMutable list
        val immutableList= listOf(1,2,3)  //this will help to create immutable list
        println(immutableList)
        immutableList[0]=4   //over-writing the first element of the list --> that also not possible
        println(immutableList)
        immutableList.add(5)  //this will add new element and thus size will change  --> that also not possible
        println(immutableList)
        * */

    }

}