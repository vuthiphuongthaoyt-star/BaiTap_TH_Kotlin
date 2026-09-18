import kotlin.math.max

fun main() {
    val math = 8.0
    val programming = 9.0
    val database = 7.5

    // 1. Tính tổng điểm
    val totalScore = math + programming + database

    // 2. Tính điểm trung bình (GPA)
    val gpa = totalScore / 3

    // 3. Tìm điểm cao nhất
    val maxScore = max(math, max(programming, database))

    // 4. Kiểm tra điều kiện đạt
    val isPassed = gpa >= 5.0

    // In kết quả ra màn hình
    println("Vu Thi Phuong Thao - 2415053122136")
    println("--- KET QUA HOC TAP ---")
    println("Diem toan: $math")
    println("Diem lap trinh: $programming")
    println("Diem co so du lieu: $database")
    println("-----------------------")
    println("• Tong diem : $totalScore")
    println("• Diem trung binh  (GPA): ${String.format("%.2f", gpa)}")
    println("• Diem cao nhat : $maxScore")
 println("• Sinh vien co dat duoc khong? ${if (isPassed) "Co (Dat)" else "Khong (Truot)"}")
}