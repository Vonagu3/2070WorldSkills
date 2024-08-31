package com.example.worldskills2070

data class User(
    val id: Long,
    val name: String
)

class Ui {
    private var currentUser: User? = null

    fun renderUser(newUser: User) {
        if (currentUser?.id != newUser.id) {
            println("Render new id: ${newUser.id}")
        }
        if (currentUser?.name != newUser.name) {
            println("Render new name: ${newUser.name}")
        }
        currentUser = newUser
    }
}

fun main() {
    val ui = Ui()

    val user = User(id = 1, name = "Вася")
    ui.renderUser(user)

//    user.name = "Петя"
    val newUser = user.copy(name = "Петя")
    ui.renderUser(newUser)
}