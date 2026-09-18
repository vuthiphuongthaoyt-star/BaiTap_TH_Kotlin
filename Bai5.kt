fun main() {
    val gpaList = listOf(9.2, 8.5, 7.8, 6.0, 3.5)
     println("=Vu Thi Phuong Thao - 2415053122136=")
    println("=== KET QUA PHAN LOAI GPA ===")
    for (gpa in gpaList) {
        val rank = when {
            gpa >= 8.5 -> "Excellent"
            gpa >= 7.0 -> "Good"
            gpa >= 5.0 -> "Pass"
            else -> "Fail"
        }
        println("GPA: $gpa -> $rank")
    }
}