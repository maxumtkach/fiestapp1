var discount: Int = 0   //процент с продаж
fun calculate1(
    total: Int,  // общее
    amount: Int // текущее

): Int {
    toDisc(total, amount)
    return discount
}

val calc = calculate1(3000, 800)
val calc1 = calculate1(30000, 10000)

fun calculateFee(
    total: Int,
    amount: Int,
    exclusive: Boolean
): Int {
    return if (!exclusive) {
        toDisc(total, amount)
        discount
    } else {
        val discountExc: Int = discount / 100 * 5
        when {
            total in 1..999 -> discount -= discountExc
            total in 1001..10000 -> discount -= discountExc
            total in 10001..50000 -> discount = discountExc
            total > 50001 -> discount = discountExc
        }
        discount
    }
}

private fun toDisc(total: Int, amount: Int) {
    when {
        total in 1..999 -> discount = amount / 100 * 25
        total in 1001..10000 -> discount = amount / 100 * 20
        total in 10001..50000 -> discount = amount / 100 * 15
        total > 50001 -> discount = amount / 100 * 10
    }
}

val fee = calculateFee(200, 800, true)
val fee1 = calculateFee(200, 800, false)