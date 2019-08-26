package com.codesignal

fun regularBracketSequence1(s: String): Boolean {
    var d = 0
    for (c in s) {
        d += 81 - c.toInt() * 2
        if (d < 0)
            return false
    }

    return d < 1
}
