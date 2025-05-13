using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace src.bai2
{

public class DemPhanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("Nhập phần tử cần đếm và tìm vị trí: ");
        int x = scanner.nextInt();
        int count = 0;
        List<Integer> positions = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                count++;
                positions.add(i);
            }
        }
        System.out.println("Phần tử " + x + " xuất hiện " + count + " lần.");

        if (count > 0) {
            System.out.print("Vị trí xuất hiện: ");
            positions.forEach(pos -> System.out.print(pos + " "));
        } else {
            System.out.println("Phần tử không tồn tại trong mảng.");
        }

        scanner.close();
    }
}
}

