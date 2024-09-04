fun main() {
    val amount = 150
    var commission = amount * 0.0075

    if (commission > 35) {
        println("Комиссия составляет $commission руб")
    } else {
        println("Комиссия составляет 35 руб")
    }
}
