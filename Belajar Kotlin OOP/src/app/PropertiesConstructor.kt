package app

import data.User

fun main(){
    
    val user = User("username", "password", "email")
    
    println(user.username)
    println(user.password)
    println(user.email)
    println("====================")
}