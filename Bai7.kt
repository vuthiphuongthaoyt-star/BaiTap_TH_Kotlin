fun main() {
    // Khởi tạo danh sách
    val students = mutableListOf<String>()

    // 1. Thêm 5 sinh viên
    students.add("Nguyen Van A")
    students.add("Tran Thi B")
    students.add("Le Van C")
    students.add("Pham Van D")
    students.add("Hoang Thi E")
    println("Vu Thi Phuong Thao - 2415053122136")
    // 2. In tất cả sinh viên
    println("--- 2. Danh sach sinh vien ban dau  ---")
    for (student in students) {
        println("$student")
    }

    // 3. Kiểm tra một sinh viên có tồn tại
    val searchName = "Le Van C"
    println("\n--- 3. Kiem tra su ton tai ---")
    if (students.contains(searchName)) {
        println("Sinh viên '$searchName' Co trong danh sach.")
    } else {
        println("Sinh viên '$searchName' Khong co trong danh sach.")
    }

    // 4. Xóa một sinh viên
    val removeName = "Pham Van D"
    students.remove(removeName)
    println("\n--- 4. Xoa sinh viên ---")
    println("Da xoa sinh viên: '$removeName'")

    // 5. In số lượng sinh viên còn lại
    println("\n--- 5. Ket qua ---")
    println("So luong sinh vien con lai: ${students.size}")
    println("Danh sach hien tai: $students")
}