package base

data class Read(var baseCharge: Int, var taxableCharge: Int)

fun base(aReading: Read): Int {
    return 0
}

fun taxableCharge(aReading: Read): Int {
    return 0
}

fun enrichReading(argReading: Read): Read {
    var aReading = cloneDeep(argReading)
    aReading.baseCharge = base(aReading)
    aReading.taxableCharge = taxableCharge(aReading)
    return aReading
}

fun cloneDeep(argReading: Read): Read {
    return argReading
}
