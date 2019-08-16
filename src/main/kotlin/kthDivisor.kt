fun kthDivisor(n: Int, k: Int): Int {
    val d = (1..n).filter { n % it < 1 }

    return if (d.size < k) -1 else d[k - 1]
}
