package com.HideoDK;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static String[] M_Option = new String[] { "\nInvalid Menu, Please Try Again", "Please press Enter to continue...", "Your Choice is: " };
    public static void main(String[] args) {
        DisplayWelcome();
        MenuSelector();
    }
    private static void DisplayWelcome(){
        System.out.print("==================================================================\n" +
                "|                                                                 |\n" +
                "|                                                                 |\n" +
                "|                 Welcome to The Genius Bubble Tea                |\n" +
                "|                                                                 |\n" +
                "|                                                                 |\n" +
                "==================================================================\n");
    }
    private static void MenuSelector(){
        System.out.println("Please Select the menu\n" +
                "1 : Favored Tea\n" +
                "2 : Milk Tea\n" +
                "3 : Latte\n" +
                "4 : Fruit Soda\n" +
                "5 : Yogurt\n" +
                M_Option[2]);

        /*switch (sc.nextInt())
        {
            case 1:
            {
                Menu = "Favored Tea";
                {
                    Console.WriteLine("\n" + M_Option[2] + Menu);
                    Console.Write(M_Option[1]); //กดปุ่ม Enter เพื่อดำเนินการต่อ
                    Console.ReadKey();
                    Console.Clear();
                }
                MenuInput1 = FavoredTea(Menu1); // ส่ง Menu ไป Method FavoredTea และกลับรับค่ามาเก็บที่ MenuInput 1
                break;
            }
            case 2:
            {
                Menu = "Milk Tea";
                {
                    Console.WriteLine("\n" + M_Option[2] + Menu);
                    Console.Write(M_Option[1]); //กดปุ่ม Enter เพื่อดำเนินการต่อ
                    Console.ReadKey();
                    Console.Clear();
                }
                MenuInput2 = MilkTea(Menu2); // ส่ง Menu ไป Method MilkTea และกลับรับค่ามาเก็บที่ MenuInput 2
                break;
            }
            case 3:
            {
                Menu = "Latte";
                {
                    Console.WriteLine("\n" + M_Option[2] + Menu);
                    Console.Write(M_Option[1]); //กดปุ่ม Enter เพื่อดำเนินการต่อ
                    Console.ReadKey();
                    Console.Clear();
                }
                MenuInput3 = Latte(Menu3); // ส่ง Menu ไป Method Latte และกลับรับค่ามาเก็บที่ MenuInput 3
                break;
            }
            case 4:
            {
                Menu = "Fruit Soda";
                {
                    Console.WriteLine("\n" + M_Option[2] + Menu);
                    Console.Write(M_Option[1]); //กดปุ่ม Enter เพื่อดำเนินการต่อ
                    Console.ReadKey();
                    Console.Clear();
                }
                MenuInput4 = FruitSoda(Menu4); // ส่ง Menu ไป Method FFruitSoda และกลับรับค่ามาเก็บที่ MenuInput 4
                break;
            }
            case 5:
            {
                Menu = "Yogurt";
                {
                    Console.WriteLine("\n" + M_Option[2] + Menu);
                    Console.Write(M_Option[1]); //กดปุ่ม Enter เพื่อดำเนินการต่อ
                    Console.ReadKey();
                    Console.Clear();
                }
                MenuInput5 = Yogurt(Menu5); // ส่ง Menu ไป Method Yogurt และกลับรับค่ามาเก็บที่ MenuInput 5
                break;
            }
            default:
            {
                Console.WriteLine(M_Option[0]);
                Console.Write(M_Option[1]); //กดปุ่ม Enter เพื่อดำเนินการต่อ
                Console.ReadKey();
                Console.Clear();

                Main();
                break;
            }
        } // รับค่าการเลือกประเภทเครื่องดื่ม*/
    private static String GetInput(){
        return sc.nextLine();
    }
}
