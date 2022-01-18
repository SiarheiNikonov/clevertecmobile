package task2.animals

import task2.animals.interfaces.Flyable
import task2.animals.interfaces.Walkable

class Peacock(name: String) : Animal(name), Walkable, Flyable {
    override fun fly() {
        state = LifecycleState.FLY
        println("${this.name} is trying to fly.")
    }

    override fun walk() {
        state = LifecycleState.WALK
        println("${this.name} is walking. What an amazing bird!")
    }

    override fun meetTheWorld() {
        state = LifecycleState.BE_BORN
        println("$name hatched from an egg")
    }
}