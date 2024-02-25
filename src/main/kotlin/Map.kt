package dev.krios2146

/**
 * Represents the map of the simulation.
 *
 * Contains [entities][Entity] that placed on their respective [coordinates][Coordinates]
 */
class Map {
    private val map = HashMap<Coordinates, Entity>()

    /**
     * Adds the entity on the specified coordinates
     *
     * @param coordinates the coordinates on which entity should be added
     * @param entity the entity that should be added by specified coordinates
     */
    fun add(coordinates: Coordinates, entity: Entity) {
        map[coordinates] = entity
    }

    /**
     * Remove the entity from the specified coordinates
     *
     * @param coordinates the coordinates to remove entity from
     */
    fun remove(coordinates: Coordinates) {
        map.remove(coordinates)
    }

    /**
     * Checks if the specified coordinates on the map don't contain an entity
     *
     * @param coordinates the coordinates to check
     * @return `true` if the map has no entity on the specified coordinates, `false` otherwise
     */
    fun isEmpty(coordinates: Coordinates): Boolean {
        return map.contains(coordinates)
    }
}