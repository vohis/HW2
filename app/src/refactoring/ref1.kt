// до рефакторинга

fun findMax(list: List<Int>): Int {
    var max = Int.MIN_VALUE
    for (i in list.indices) {
        if (list[i] > max) {
            max = list[i]
        }
    }
    return max
}

// после рефакторинга

fun findMax(list: List<Int>): Int {
    return list.maxOrNull() ?: Int.MIN_VALUE
}

/* В этом примере была заменена циклическая конструкция на функцию maxOrNull(),
которая уже есть в стандартной библиотеке Kotlin для работы с коллекциями.
Также был добавлен оператор ?:, чтобы вернуть Int.MIN_VALUE, если список пустой.
Это делает код более лаконичным и безопасным. */