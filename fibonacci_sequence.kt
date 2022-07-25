fun main() {
    println("\ntype length of fibonacci sequence that you prefer (integer): ")
    val lengthNum: Int = readLine()!!.toInt() - 1
    fibonacciSequence(lengthNum)
}

// gets an empty list and fill's the list with the fibonacci sequence
// the length of the list is equal with the length that user types when program starts
// if the user give's a number <=1 its gonna get the list with just the 1 inside
// or string instead of integer its gonna get an error back
// otherwise they will get a filled Fibonacci list of their typed size
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
