package dev.krios2146

/**
 * Abstract class for the living entities of the simulation
 *
 * Provides an abstract `makeMove` function that each derived class must override to allow the creature to walk on a map
 *
 * @property speed represents the speed at which the creature walks on a map
 * @property health represents the amount of damage the creature can take before dying
 */
abstract class Creature : Entity() {
    val speed: Int = 1
    val health: Int = 100

    abstract fun makeMove()
}