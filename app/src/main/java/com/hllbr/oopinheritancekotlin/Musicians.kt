package com.hllbr.oopinheritancekotlin

open class Musicians(name:String, instrument:String, age:Int) {
    var name:String? = null
        private set
        get
    var instrument:String? = null
        private set
        get
    var age : Int? = null
        private set
        get
    val bandle :String = "Sivas-58"
    fun returnBandle(password:String) : String{
        if(password== "hllbr"){
            return bandle
        }else{
            return "Wrong Password!"
        }
    }
}