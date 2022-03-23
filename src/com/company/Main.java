package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] student = {"Hùng Nguyễn", "Quốc Anh", "Phong Tạ", "Phong Âu", "Đức Thương"};
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhập tên đi b ei !!!");
        String input_student = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < student.length; i++) {
            if (student[i].equals(input_student)) {
                System.out.println("Vị trí học viên trong danh sách  " + input_student + " là : " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Học viên " + input_student + " không có trong danh sách");
        }
    }
}
