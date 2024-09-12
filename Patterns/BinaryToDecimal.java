import java.util.Scanner;
 class BinaryToDecimal 
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryNum = sc.next();
        int count = binaryNum.length();
        int decimalNum = 0;
        int power = 1;
        for (int i =count - 1; i >= 0; i--) 
        {
            char digit = binaryNum.charAt(i);
            if (digit == '1') 
            {
                decimalNum += power;
            }
            power *= 2;
        }
        System.out.println("Decimal value of "+binaryNum+ " is " + decimalNum);
        sc.close();
    }
}
