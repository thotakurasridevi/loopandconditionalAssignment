import java.util.Scanner;
 class SmallestLargest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int sum;
        int average;
        int product;
        int largest;

        System.out.print("Enter First Integer: ");
        num1 = input.nextInt();

        System.out.print("Enter Second Integer: ");
        num2 = input.nextInt();

        System.out.print("Enter Third Integer: ");
        num3 = input.nextInt();

        sum = num1 + num2 + num3;
        average = sum / 3;
        product = num1 * num2 * num3;


        if (largest =num1 > num2 & num2 > num3)

        System.out.println(sum);

        System.out.println(average);

        System.out.println(product);

        System.out.println("The biggest number is " + largest);
    }
}

