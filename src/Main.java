public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221)); // true
        System.out.println(isPalindrome(707)); // true
        System.out.println(isPalindrome(11212)); // false

        System.out.println(isPerfectNumber(6)); // true
        System.out.println(isPerfectNumber(28)); // true
        System.out.println(isPerfectNumber(5)); // false
        System.out.println(isPerfectNumber(-1)); // false

        System.out.println(numberToWords(123)); // One Two Three
        System.out.println(numberToWords(1010)); // One Zero One Zero
        System.out.println(numberToWords(-12)); // Invalid Value

    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reverseNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reverseNumber = reverseNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reverseNumber;
    }

    public static boolean isPerfectNumber(int number) {
        if (number <= 0) {
            return false;
        }

        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) sum += i;
        }

        return sum == number;
    }

    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }

        String[] digitWords = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        String numberString = String.valueOf(number);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numberString.length(); i++) {
            int digit = Character.getNumericValue(numberString.charAt(i));
            result.append(digitWords[digit]);
            if (i != numberString.length() - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}
