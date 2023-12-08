import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        String user = null;
        int password = 0;
        int count = 0;
        while (count <= 3){
            System.out.println("Enter user : ");
            user = input.nextLine();
            System.out.println("Enter password : ");
            password = input.nextInt();
            input.nextLine();
            if (user == "admin" || password == 123456){
                while (choice != 0){
                    System.out.println("1. Print the rectangle");
                    System.out.println("2. Print the square triangle");
                    System.out.println("3. Print isosceles triangle");
                    System.out.println("4. Exit");

                    choice = input.nextInt();

                    switch (choice){
                        case 1:
                            int widthRec, heightRec;
                            System.out.println("Enter the width");
                            widthRec = input.nextInt();
                            System.out.println("Enter the height");
                            heightRec = input.nextInt();
                            for (int i = 0; i < widthRec; i++) {
                                for (int j = 0; j < heightRec; j++) {
                                    System.out.print(" * ");
                                }
                                System.out.println();
                            }
                            break;
                        case 2:
                            int widthTri, heightTri;
                            System.out.println("Enter the width");
                            widthTri = input.nextInt();
                            System.out.println("Enter the height");
                            heightTri = input.nextInt();
                            for (int i = heightTri; i < widthTri; i++) {
                                for (int j = 0; j < i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                        case 3:
                            int width1;
                            System.out.println("Enter the width");
                            width1 = input.nextInt();
                            for (int i = 0; i < width1; i++) {
                                for (int j = 0; j < i; j++) {
                                    System.out.print(" ");
                                }
                                for (int k = width1; k > i; k--) {
                                    System.out.print(" * ");
                                }
                                System.out.println();
                            }
                            break;
                    }
                }
            } else {
                System.out.println("Please enter again !");
                count++;
            }
            if (count == 3){
                System.out.println("Login failed !");
                break;
            }

        }

    }
}
