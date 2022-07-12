fun main() {
    println("type length of fibonacci sequence that you prefer (integer): ")
    val lengthNum: Int = readLine()!!.toInt() - 1
    fibonacciSequence(lengthNum)
}

fun fibonacciSequence(lengthNum: Int) {
    val fibList: MutableList<Int> = mutableListOf(1)
    for (num in 1..lengthNum) fibList.add(num)
    fibList.forEach { num->
        if (num >= 3)
            if (num != fibList[num - 1] + fibList[num - 2]) {
                val newNum: Int = fibList[num - 1] + fibList[num - 2]
                fibList[num] = newNum
            }
    }
    println(fibList)
}