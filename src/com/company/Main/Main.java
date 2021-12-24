package com.company.Main;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        String load_animation = """
      
Loading…
█▒▒▒▒▒▒▒▒▒
10%
███▒▒▒▒▒▒▒
30%
█████▒▒▒▒▒
50%
███████▒▒▒
100%
██████████
""";
        String message = """
      
      -welcome-
      Terminal-Based calculator
      build: 1.0
      
      Choose your operation:
      
     ---------------------
     | add(+)---- 1      |
     | subtract(-)---- 2 |
     | divide(/)---- 3   |
     | multiply(*)---- 4 |
     |                   |
     ---------------------     
     """;

        System.out.println(load_animation);
        System.out.println(message);

        Scanner myObj = new Scanner(System.in);
        int operation;

        System.out.println("""
      
        |
        V
        """);
        operation = myObj.nextInt();





        if (operation == 1){
            System.out.println("choose the numbers you will use");
            Scanner myObj2 = new Scanner(System.in);
            int num1;
            num1 = myObj2.nextInt();

            Scanner myObj3 = new Scanner(System.in);
            int num2;
            num2 = myObj3.nextInt();


            System.out.println("""
        
Please Wait...
█▒▒▒▒▒▒▒▒▒
10%
███▒▒▒▒▒▒▒
30%
█████▒▒▒▒▒
50%
███████▒▒▒
100%
██████████""");

            int add = num1 + num2;
            System.out.println( """
        
        |
        V
        """ + add);
        }
        else if (operation == 2){
            System.out.println("choose the numbers you will use");
            Scanner myObj2 = new Scanner(System.in);
            int num1;
            num1 = myObj2.nextInt();

            Scanner myObj3 = new Scanner(System.in);
            int num2;
            num2 = myObj3.nextInt();


            System.out.println("""
        
Please Wait...
█▒▒▒▒▒▒▒▒▒
10%
███▒▒▒▒▒▒▒
30%
█████▒▒▒▒▒
50%
███████▒▒▒
100%
██████████""");

            int subtract = num1 - num2;
            System.out.println( """
        
        |
        V
        """ + subtract);



        }



        else if (operation == 3){
            System.out.println("choose the numbers you will use");
            Scanner myObj2 = new Scanner(System.in);
            int num1;
            num1 = myObj2.nextInt();

            Scanner myObj3 = new Scanner(System.in);
            int num2;
            num2 = myObj3.nextInt();



            System.out.println("""
        
Please Wait...
█▒▒▒▒▒▒▒▒▒
10%
███▒▒▒▒▒▒▒
30%
█████▒▒▒▒▒
50%
███████▒▒▒
100%
██████████""");

            int divide = num1 / num2;
            System.out.println( """
        
        |
        V
        """ + divide);
        }


        else if (operation == 4){
            System.out.println("choose the numbers you will use");
            Scanner myObj2 = new Scanner(System.in);
            int num1;
            num1 = myObj2.nextInt();

            Scanner myObj3 = new Scanner(System.in);
            int num2;
            num2 = myObj3.nextInt();


            System.out.println("""
        
Please Wait...
█▒▒▒▒▒▒▒▒▒
10%
███▒▒▒▒▒▒▒
30%
█████▒▒▒▒▒
50%
███████▒▒▒
100%
██████████""");

            int multiply = num1 * num2;
            System.out.println( """
        
        |
        V
        """ + multiply);
        }


        else if (operation > 4){
            System.out.println("You entered an incorrect operation!");

        }













    }
}