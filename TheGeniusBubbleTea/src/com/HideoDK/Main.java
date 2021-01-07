package com.HideoDK;

import java.util.Scanner;

public class Main {
    
    private static String menu, menu1 = "", menu2 = "", menu3 = "", menu4 = "", menu5 = "";
    private static String menuInput1 = "", menuInput2 = "", menuInput3 = "", menuInput4 = "", menuInput5 = "";
    private static String[] M_Option = new String[] { "\nInvalid Menu, Please Try Again", "Please press Enter to continue...", "Your Choice is: " };
    private static String[] M_FavoredTea = new String[] { "Green Tea", "Jasmine Green Tea", "Jasmine Honey Green Tea", "Jasmine Honey Lemon Green Tea", "Apple Green Tea", "Melon Green Tea",
            "Lychee Green Tea", "Matcha Green Tea", "Black Tea", "Honey Green Tea" };
    private static String[] M_MilkTea = new String[] { "Milk Tea", "Green Tea", "Thai Tea", "Caramel Milk Tea", "Green Tea Macchiato", "Matcha Macchiato" };
    private static String[] M_Latte = { "Black Tea Latte", "Green Tea Latte", "Matcha Latte", "Chocolate Milk" };
    private static String[] M_FruitSoda = new String[] { "Strawberry Soda", "Kiwi Soda", "Apple Soda", "Blueberry Soda", "Plum Soda", "Melon Soda", "Lychee Soda", "Passion Fruit Soda",
            "Mixed Fruit Soda", "Mango Soda" };
    private static String[] M_Yogurt = new String[] { "Yogurt Green Tea", "Passion Fruit Yogurt Green Tea", "Apple Yogurt Green Tea", "Strawberry Yogurt Green Tea", "Blueberry Yogurt Green Tea",
            "Plum Yogurt Green Tea" };
    private static String[] M_Topping = new String[] { "Bubble", "Glass Jelly", "Golden Bubble", "Pudding Glass Jelly", "Jelly Fruit", "Aloe Vera", "Egg Pudding", "Chocolate Pudding",
            "Red Bean", "Brown Sugar"};
    private static String[] CupsSize = new String[] { "Size S", "Size M", "Size L" };
    private static String[] Sweetness = new String[] { "More Sugar", "Full Sugar", "Less Sugar", "Half Sugar", "Quarter Sugar", "No Sugar" };
    static Scanner sc = new Scanner(System.in);
    
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
    private static void MenuSelector() {
        System.out.print("Please Select the menu\n" +
                "1 : Favored Tea\n" +
                "2 : Milk Tea\n" +
                "3 : Latte\n" +
                "4 : Fruit Soda\n" +
                "5 : Yogurt\n" +
                M_Option[2]);
        switch (Integer.parseInt(GetInput()))
        {
            case 1:
            {
                menu = "Favored Tea";
                {
                    System.out.println("\n" + M_Option[2] + menu);
                    System.out.print(M_Option[1]); //กดปุ่ม Enter เพื่อดำเนินการต่อ
                    sc.next();
                    System.console().flush();
                }
                /*menuInput1 = FavoredTea(menu1); // ส่ง Menu ไป Method FavoredTea และกลับรับค่ามาเก็บที่ MenuInput 1*/
                break;
            }
            case 2:
            {
                menu = "Milk Tea";
                {
                    System.out.println("\n" + M_Option[2] + menu);
                    System.out.print(M_Option[1]); //กดปุ่ม Enter เพื่อดำเนินการต่อ
                    sc.next();
                    System.console().flush();
                }
                /*menuInput2 = MilkTea(menu2); // ส่ง Menu ไป Method MilkTea และกลับรับค่ามาเก็บที่ MenuInput 2*/
                break;
            }
            case 3:
            {
                menu = "Latte";
                {
                    System.out.println("\n" + M_Option[2] + menu);
                    System.out.print(M_Option[1]); //กดปุ่ม Enter เพื่อดำเนินการต่อ
                    sc.next();
                    System.console().flush();
                }
                /*menuInput3 = Latte(menu3); // ส่ง Menu ไป Method Latte และกลับรับค่ามาเก็บที่ MenuInput 3*/
                break;
            }
            case 4:
            {
                menu = "Fruit Soda";
                {
                    System.out.println("\n" + M_Option[2] + menu);
                    System.out.print(M_Option[1]); //กดปุ่ม Enter เพื่อดำเนินการต่อ
                    sc.next();
                    System.console().flush();
                }
                /*menuInput4 = FruitSoda(menu4); // ส่ง Menu ไป Method FFruitSoda และกลับรับค่ามาเก็บที่ MenuInput 4*/
                break;
            }
            case 5:
            {
                menu = "Yogurt";
                {
                    System.out.println("\n" + M_Option[2] + menu);
                    System.out.print(M_Option[1]); //กดปุ่ม Enter เพื่อดำเนินการต่อ
                    sc.next();
                    System.console().flush();
                }
                /*menuInput5 = Yogurt(menu5); // ส่ง Menu ไป Method Yogurt และกลับรับค่ามาเก็บที่ MenuInput 5*/
                break;
            }
            default:
            {
                System.out.println(M_Option[0]);
                System.out.print(M_Option[1]); //กดปุ่ม Enter เพื่อดำเนินการต่อ
                sc.next();
                System.console().flush();
                main(M_Option);
                break;
            }
        }
    }
    private static String GetInput(){
        return sc.nextLine();
    }
}
