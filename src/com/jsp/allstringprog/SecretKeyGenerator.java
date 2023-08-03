package com.jsp.allstringprog;

public class SecretKeyGenerator {
    public static void main(String[] args) {
        String input1 = "9880127431";
        String input2 = "johnson";

        String secretKey = generateSecretKey(input1, input2);
        System.out.println("Secret Key: " + secretKey);
    }

    public static String generateSecretKey(String input1, String input2) {
        StringBuilder secretKey = new StringBuilder();
        int input1Index = 0;
        int input2Index = input2.length() - 1;
        boolean isEven = true;

        while (input1Index < input1.length() && input2Index >= 0) {
            int sum = 0;
            int num = Character.getNumericValue(input1.charAt(input1Index));

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            if (isEven) {
                while (sum % 2 != 0) {
                    sum++;
                }
                secretKey.append(sum);
                secretKey.append(input2.charAt(input2Index));
                isEven = false;
            } else {
                while (sum % 2 != 1) {
                    sum++;
                }
                secretKey.append(sum);
                secretKey.append(input2.charAt(input2Index));
                isEven = true;
            }

            input1Index++;
            input2Index--;
        }

        return secretKey.toString();
    }
}

