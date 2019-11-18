fun bodyMassIndex(
    m: Double, //масса тела в килограммах
    h: Double // рост в метрах
): Double {
    val Ind = m / (h * h)
    return Ind
}
val index = bodyMassIndex(80.0,1.85)

val verdict = when {
    index in 0.0..16.00 -> println("Выраженный дефицит массы тела")
    index in 16.0..18.5 -> println("Недостаточная (дефицит) масса тела")
    index in 18.5..24.99 -> println("Норма")
    index in 25.0..30.0 -> println("Избыточная масса тела (предожирение")
    index in 30.0..35.0 -> println("Ожирение")
    index in 40.0..40.0 -> println("Ожирение резкое")
    index > 40.0 -> println("Очень резкое ожирение")
    else -> println("ошибка")
}

