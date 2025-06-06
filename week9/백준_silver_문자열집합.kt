package week9

private val br = System.`in`.bufferedReader()

fun main() = with(System.out.bufferedWriter()) {
    val (N, M) = br.readLine().split(" ").map { it.toInt() }
    val S = Array(N) { br.readLine() }.toSet()
    var ans = 0
    repeat(M) {
        if(br.readLine() in S) ans++
    }
    write("$ans")
    close()
}
