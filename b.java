public class Balancedd {
    public static String isBalanced(String inputStr) {
        int balanceCounter = 0;
        char[] brackets = {'(', ')', '[', ']', '{', '}'};

        for (char currentChar : inputStr.toCharArray()) {
            if (currentChar == brackets[0] || currentChar == brackets[2] || currentChar == brackets[4]) {
                balanceCounter++;
            } else if (currentChar == brackets[1] || currentChar == brackets[3] || currentChar == brackets[5]) {
                balanceCounter--;
                if (balanceCounter < 0) {
                    return "Unbalanced";
                }
            }
        }

        return balanceCounter == 0 ? "Balanced" : "Unbalanced";
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("[[]]]"));  
        System.out.println(isBalanced("[[[]]]"));  
        System.out.println(isBalanced("[[]["));   
    }

}
