import java.util.Arrays

fun main(args: Array<String>) {
    val integersArray = arrayOf(3, 7, 9, 34, 18, 5, 35, 16, 88, 24, 65, 4)
    indexOfMax(integersArray)
}

fun indexOfMax(numbersArray: Array<Int>) {
    var maxNumber: Int = 0
    val maxIndex = numbersArray.indexOf(numbersArray.max())
    
    for (element in numbersArray) {
        if (element > maxNumber) {
            maxNumber = element
        }
    }
	println("The largest element of an array is $maxNumber at index $maxIndex.")
}