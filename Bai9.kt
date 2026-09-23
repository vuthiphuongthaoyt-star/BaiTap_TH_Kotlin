// Vũ Thị Phương Thảo_2415053122136


data class Course(
    val id: String,
    val title: String,
    val credit: Int
)

data class Student(
    val id: Int,
    val fullName: String,
    val gpa: Float
)


fun isPrime(n: Int): Boolean {
    if (n < 2) return false
    for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) return false
    }
    return true
}


fun findMinMax(numbers: List<Int>): Pair<Int?, Int?> {
    if (numbers.isEmpty()) return Pair(null, null)
    return Pair(numbers.minOrNull(), numbers.maxOrNull())
}


fun filterCoursesByCredit(courses: List<Course>, minCredit: Int): List<Course> {
    return courses.filter { it.credit >= minCredit }
}


fun getTop3Students(studentScores: Map<Int, Double>): List<Map.Entry<Int, Double>> {
    return studentScores.entries
        .sortedByDescending { it.value }
        .take(3)
}


fun runStudentManagementMenu() {
    val studentList = mutableListOf<Student>()
    
   
    studentList.add(Student(1, "Vu Thi Phuong Thao", 3.8f))
    studentList.add(Student(2, "Nguyen Van A", 3.2f))
    
    while (true) {
        println("\n=== HE THONG QUAN LY SINH VIEN  ===")
        println("1. Xem danh sach sinh vien")
        println("2. Them sinh vien moi")
        println("3. Tim kiem sinh viên theo ID")
        println("0. Thoat menu")
        print("Chon chuc nang  (0-3): ")

        when (readlnOrNull()?.toIntOrNull()) {
            1 -> {
                println("\n--- DANH SACH SINH VIÊN ---")
                if (studentList.isEmpty()) {
                    println("Danh sach trong!")
                } else {
                    studentList.forEach { println("ID: ${it.id} | Ho ten : ${it.fullName} | GPA: ${it.gpa}") }
                }
            }
            2 -> {
                println("\n---THEM SINH VIEN MOI---")
                print("Nhap ID: ")
                val id = readlnOrNull()?.toIntOrNull() ?: 0
                print("Nhap ho ten: ")
                val name = readlnOrNull() ?: "Chua nhap ten sinh vien "
                print("Nhap GPA: ")
                val gpa = readlnOrNull()?.toFloatOrNull() ?: 0.0f

                studentList.add(Student(id, name, gpa))
                println("=> Them sinh vien thanh cong ")
            }
            3 -> {
                print("\nNhap ID sinh vien can tim: ")
                val searchId = readlnOrNull()?.toIntOrNull()
                val found = studentList.find { it.id == searchId }
                if (found != null) {
                    println("=> Tim thay: ID: ${found.id} | Ho ten: ${found.fullName} | GPA: ${found.gpa}")
                } else {
                    println("=> Khong tim thay sinh vien co ID = $searchId")
                }
            }
            0 -> {
                println("Đa thoat quan ly menu.")
                break
            }
            else -> println("Lua chon khong hop le, vui long chon lai!")
        }
    }
}

fun main() {
    println("==== 1. KIEM TRA SO NGUYEN TO ====")
    val number = 17
    println("So $number co phai so nguyen to? ${isPrime(number)}")

    println("\n==== 2. TIM MAX/MIN TRONG LIST ====")
    val numbers = listOf(15, 3, 42, 8, 99, 23)
    val (min, max) = findMinMax(numbers)
    println("Danh sach: $numbers")
    println("Min: $min | Max: $max")

    println("\n==== 3. LOC COURSE THEO CREDIT ====")
    val courses = listOf(
        Course("MOB101", "Lap trinh Kotlin", 3),
        Course("DAT102", "Co so du lieu", 4),
        Course("ENG101", "Tieng Anh chuyen nganh", 2)
    )
    val filtered = filterCoursesByCredit(courses, minCredit = 3)
    println("Cac khoa hoc tu 3 tin chi tro len:")
    filtered.forEach { println("- ${it.title} (${it.credit} tin chi)") }

    println("\n==== 4. TOP 3 SINH VIEN DIEM CAO NHAT ====")
    val scoresMap = mapOf(
        101 to 8.5,
        102 to 9.2,
        103 to 7.8,
        104 to 9.6,
        105 to 8.9
    )
    val top3 = getTop3Students(scoresMap)
    println("Top 3 sinh vien có điem cao nhat:")
    top3.forEachIndexed { index, entry ->
        println("${index + 1}. Ma SV: ${entry.key} - Diem: ${entry.value}")
    }

    println("\n==== 5. MENU CONSOLE QUAN LY SINH VIEN ====")
    runStudentManagementMenu()
}