package gameplay.geometry

class Angle(val value: Double) {
    private val degreeValue: Double
        get() = Math.toDegrees(value)

    fun add(a: Angle): Angle {
        return Angle(value + a.value)
    }
}
