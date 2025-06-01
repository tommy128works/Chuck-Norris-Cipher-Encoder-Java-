public class TextUI {




    public TextUI() {

    }

    public void printWithSpaces(String text) {
        for (char c : text.toCharArray()) {
            System.out.print(c + " ");
        }
    }

    public void printToBinary(String text) {
        System.out.println("The result:");
        for (char c : text.toCharArray()) {
            System.out.print(c + " = ");
            String binary = Integer.toBinaryString(c);
            String paddedBinary = String.format("%7s", binary).replace(' ', '0');
            System.out.println(paddedBinary);
        }
    }



}
