package data

import java.util.*


class BigNote(private val title: String) {
    val bigTitle: String 
    get() = title.uppercase(Locale.getDefault())
}

fun main() {
    val note = BigNote("Note")
    println(note.bigTitle)
}