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
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun timeConversion(s: String): String {
    var hour = s.substring(0,2)
    var minute = s.substring(3,5)
    var second = s.substring(6,8)
    var period = s.substring(8,10)
    var hourInt = hour.toInt()
    
    if (period == "PM") {
        if (hourInt != 12) {
            hourInt += 12
        }
    } else if (period == "AM") {
        if (hourInt == 12) {
            hourInt = 0
        }
    }
    return "%02d:%s:%s".format(hourInt, minute, second)
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}
