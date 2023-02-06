public class Rot13 {

    public static void main(String[] args) {

        solution("UryybJbeyq");

    }

    public static String solution(String text) {

        char[] charText = text.toCharArray();

        String result = "";

        for (char c : charText) {
            int ascii = (int) c;
            if ((ascii >= 65 && ascii <= 77) || (ascii >= 97 && ascii <= 109)) {
                ascii += 13;
            } else if ((ascii >= 78 && ascii <= 90) || (ascii >= 110 && ascii <= 122)) {
                ascii -= 13;
            }
            result = result + Character.toString((char) ascii);

            System.out.println("Char: " + c + " --ASCII: " + ascii);
        }

        System.out.println("\n\nResult: " + result);

        return result;

    }

}

/*
 * How can you tell an extrovert from an introvert at NSA?
 * Va gur ryringbef, gur rkgebireg ybbxf ng gur BGURE thl'f fubrf.
 * 
 * I found this joke on USENET, but the punchline is scrambled. Maybe you can
 * decipher it?
 * According to Wikipedia, ROT13 is frequently used to obfuscate jokes on
 * USENET.
 * 
 * For this task you're only supposed to substitute characters. Not spaces,
 * punctuation, numbers, etc.
 * 
 * Test examples:
 * 
 * "EBG13 rknzcyr." -> "ROT13 example."
 * 
 * "This is my first ROT13 excercise!" -> "Guvf vf zl svefg EBG13 rkprepvfr!"
 * 
 */