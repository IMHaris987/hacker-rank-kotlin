import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun plusMinus(arr: Array<Int>): Unit {
    
    var n = arr.size
    
    var count_posetive = 0
    var count_negative = 0
    var count_zeros = 0
    
    for (i in arr) {
        if (i > 0) {
            count_posetive++
        } else if (i < 0) {
            count_negative++
        } else if (i == 0) {
            count_zeros++
        }
    }   
    val posetive_ratio = count_posetive.toDouble() / n
    val negative_ratio = count_negative.toDouble() / n
    val zeros_ratio = count_zeros.toDouble() / n
    println(posetive_ratio)
    println(negative_ratio)
    println(zeros_ratio)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    plusMinus(arr)
}
