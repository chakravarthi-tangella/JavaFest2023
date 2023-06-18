public class AsciiCode {
    public static void main(String[] args) {
        // Loop from 'A' to 'Z'
        for (char c = 'A'; c <= 'Z'; c++) {
            int asciiValue = (int) c;
            System.out.println("Ascii value for " + c + " - " + asciiValue);
        }

        // Loop from 'a' to 'z'
        for (char c = 'a'; c <= 'z'; c++) {
            int asciiValue = (int) c;
            System.out.println("Ascii value for " + c + " - " + asciiValue);
        }
    }
}

