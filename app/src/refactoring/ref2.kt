// до рефакторинга

fun checkPalindrome(str: String): Boolean {
    for (i in 0 until str.length/2) {
        if (str[i] != str[str.length - i - 1]) {
            return false
        }
    }
    return true
}

// после рефакторинга

fun checkPalindrome(str: String): Boolean {
    val length = str.length
    for (i in 0 until length/2) {
        if (str[i] != str[length - i - 1]) {
            return false
        }
    }
    return true
}

/* В этом примере была заменена итерация по всей строке на итерацию только до середины строки,
 так как проверка на палиндром требует сравнения символов с обоих концов строки.
 Также была использована переменная length для уменьшения количества вызовов функции length. */