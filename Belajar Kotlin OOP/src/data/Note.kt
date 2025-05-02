package data

// 25. Getter dan Setter

class Note(title: String) {
    var title: String = title
        get() = field
        set(value) {
            if (value.isNotBlank()) {
                field = value
            }
        }
}

fun main() {
    val note = Note("Note")
    note.title = "Note Title"
    println(note.title)
}
