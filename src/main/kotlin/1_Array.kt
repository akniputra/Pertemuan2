fun main(args: Array<String>) {

//Array adalah koleksi data yang sejenis untuk membuat array sebuah array //
    var arrA = arrayOf<Int>()
    arrA += 34
    println(arrA[0])
    var arrB = arrayOf<Int>()
    for (i in 1..10) {
        arrB += i
    }
    for (i in arrB) {
        print("$i ")
    }
}