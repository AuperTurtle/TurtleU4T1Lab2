public class WhileLoopFun {

    public WhileLoopFun() { }

    public void printDigits(int number) {
        String numString = String.valueOf(number);
        String printDigits = "";
        while (numString.length() > 0) {
            printDigits += numString.substring(numString.length() - 1);
            numString = numString.substring(0,numString.length() - 1);
            if (numString.length() >= 1) {
                printDigits += "\n";
            }
        }
        System.out.println(printDigits);
    }

    public int countLetter(String word, String letter) {
        int numOfMatches = 0;
        while (word.indexOf(letter) != -1) {
            word = word.substring(word.indexOf(letter) + 1);
            numOfMatches++;
        }
        return numOfMatches;
    }

    public int maxDoubles(int number, int threshold) {
        int maxDoubles = 0;
        while (number * 2 <= threshold) {
            number *= 2;
            maxDoubles ++;
        }
        return maxDoubles;
    }

    public boolean isPrime(int number) {
        int checkFactor = number;
        if (number == 1) {
            return false;
        }
        while (checkFactor > 1) {
            if (number % checkFactor == 0 && number != checkFactor) {
                return false;
            }
            checkFactor--;
        }
        return true;
    }
}
