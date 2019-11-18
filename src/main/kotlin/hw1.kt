fun calculate1(
    total: Int
) {
    var discount: Int =0
    when {
        total in 1..999 -> discount = total / 100 * 30
        total in 1001..10000 -> discount = total / 100 * 25
        total in 10001..50000 -> discount = total / 100 * 20
        total > 50001 -> discount = total / 100 * 15
        else -> println("Слишком маленькая сумма")
    }
    println("discount=$discount")
}

fun calculateFee(
    total: Int,
    amount: Int,
    exclusive: Boolean
) {
    if (exclusive) {
        var discount: Int = 0
        when {
            total in 1..999 -> discount = amount / 100 * 25
            total in 1001..10000 -> discount = total / 100 * 20
            total in 10001..50000 -> discount = total / 100 * 15
            total > 50001 -> discount = total / 100 * 10
            else -> println("Слишком маленькая сумма")
        }
        println("discount=$discount")
    } else {
        var discount: Int = 0
        when {
            total in 1..999 -> discount = amount / 100 * 30
            total in 1001..10000 -> discount = total / 100 * 25
            total in 10001..50000 -> discount = total / 100 * 20
            total > 50001 -> discount = total / 100 * 15
    else -> println("Слишком маленькая сумма")
}
println("discount=$discount")
}
}

val fee = calculateFee(200, 1000, true)
val fee1 = calculateFee(200, 1000, false)