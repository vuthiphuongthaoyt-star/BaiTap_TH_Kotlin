fun main() {
    println("-Vu Thi Phuong Thao - 2415053122136-")
    // 1. In các số từ 1 đến 10
    println("--- 1. Cac so tu 1 den 10 ---")
    for (i in 1..10) {
        print("$i ")
    }
    println()

    // 2. Tính tổng: 1 + 2 + 3 + ... + 100
    var sum = 0
    for (i in 1..100) {
        sum += i
    }
    println("\n--- 2. Tong tu 1 den 100 ---")
    println("Tong  = $sum")

    // 3. In các số chẵn từ 1 đến 20
    println("\n--- 3. Cac so chan tu 1 den 20 ---")
    for (i in 2..20 step 2) {
        print("$i ")
    }
    println()
}