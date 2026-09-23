// Phần 1: Khai báo Data Class
data class Student(
    val id: Int,
    val fullName: String,
    val email: String?,
    val gpa: Float
)

// Phần 2: Xử lý danh sách và Null Safety
fun main() {
    // Tạo danh sách sinh viên
    val students = listOf(
        Student(id = 1, fullName = "Nguyễn Văn A", email = "a@gmail.com", gpa = 3.2f),
        Student(id = 2, fullName = "Trần Thị B", email = null, gpa = 3.6f),
        Student(id = 3, fullName = "Lê Văn C", email = "c@gmail.com", gpa = 2.8f)
    )

    // Duyệt danh sách và in thông tin
    for (student in students) {
        // Xử lý null safety cho email bằng toán tử Elvis ?:
        val displayEmail = student.email ?: "Chưa cập nhật"

        // Xử lý logic học lực bằng if-expression
        val academicStatus = if (student.gpa >= 3.0f) "Đạt" else "Cần cố gắng"

        // In thông tin theo định dạng yêu cầu
        println("SV: ${student.fullName} - Email: $displayEmail - Học lực: $academicStatus")
    }
}