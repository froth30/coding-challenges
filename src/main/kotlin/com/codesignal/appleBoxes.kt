package com.codesignal

fun f(x: Int): Int = if (x % 2 < 1) x*x else -x*x

fun appleBoxes(k: Int): Int = (1..k).map { i -> f(i) }.sum()
