// до рефакторинга

fun main() {
    val words = listOf("hello", "world", "kotlin", "programming")
    val filteredWords = mutableListOf<String>()

    for (word in words) {
        if (word.length > 5) {
            filteredWords.add(word.capitalize())
        }
    }

    println(filteredWords)
}

// после рефакторинга

fun main() {
    val words = listOf("hello", "world", "kotlin", "programming")

    val filteredWords = words.filter { it.length > 5 }
        .map { it.capitalize() }

    println(filteredWords)
}

/* В примере был использован метод filter вместо цикла for для фильтрации
списка слов. Также была использована лямбда-функция в качестве аргумента
для метода filter, чтобы определить условие фильтрации. Это позволило
избежать написания отдельной функции для фильтрации списка
 */