package base

data class Station(var readings: List<Int>)

fun readingsOutsideRange_smellcode(station: Station, min: Int, max: Int): List<Int> {
    return station.readings.filter { it < min || it > max }
}

fun readingsOutsideRange(station: Station, rang: Rang): List<Int> {
    return station.readings.filter { it < rang.min || it > rang.max }
}

data class Rang(var min: Int, var max: Int)